package figuras;
import java.util.Scanner;
import java.awt.Color;
/**
 * Clase de prueba para crear figuras geométricas (triángulo, rectángulo y cuadrado) y calcular su perímetro y área.
 * Muestra un menú para seleccionar el tipo de figura, solicita las coordenadas del centro y las dimensiones necesarias, y luego muestra el perímetro y el área de la figura creada.
 * @author Aitor Chicano    
 * @version 1.0
 * @see Figura abstracta que define las propiedades y métodos comunes de las figuras geométricas
 * @see Triangulo clase que representa un triángulo, subclase de Figura
 * @see Rectangulo clase que representa un rectángulo, subclase de Figura
 * @see Cuadrado  clase que representa un cuadrado, subclase de Rectángulo
 */
public class PruebaFigura {
    private static int opcion;
    private static Scanner teclado = new Scanner(System.in);
    private static final String MSG_PERIMETRO = "El perimetro es ";
    private static final String MSG_AREA = "El area es ";
    private static final String INTRO_COORD_X = "Introduzca la coordenada x del centro: ";
    private static final String INTRO_COORD_Y = "Introduzca la coordenada y del centro: ";
    /**
     * Método principal que muestra un menú para seleccionar el tipo de figura, solicita las coordenadas del centro 
     * y las dimensiones necesarias, y luego muestra el perímetro y el área de la figura creada.
     * @param args argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        do {
            opcion = mostrarMenu();
            if (opcion != 4) {
                System.out.print(INTRO_COORD_X);
                double x = teclado.nextDouble();
                System.out.print(INTRO_COORD_Y);
                double y = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        procesarTriangulo(x, y);
                        break;
                    case 2:
                        procesarRectangulo(x, y);
                        break;
                    case 3:
                        procesarCuadrado(x, y);
                        break;
                }
            }
        } while (opcion != 4);
        teclado.close();
    }
    /**
     * Solicita los lados del triángulo al usuario, crea un objeto Triangulo con las coordenadas y el color rojo,
     * y luego imprime el perímetro y el área del triángulo.    
     * @param x coordenada x del centro del triángulo
     * @param y coordenada y del centro del triángulo
     */
    private static void procesarTriangulo(double x, double y) {
        System.out.print("Introduzca el lado 1 del triangulo: ");
        double l1 = teclado.nextDouble();
        System.out.print("Introduzca el lado 2 del triangulo: ");
        double l2 = teclado.nextDouble();
        System.out.print("Introduzca el lado 3 del triangulo: ");
        double l3 = teclado.nextDouble();
        Triangulo t = new Triangulo(x, y, Color.red, l1, l2, l3);
        imprimirResultados(t);
    }
    /**
     * Solicita la base y la altura del rectángulo al usuario, crea un objeto Rectangulo con las coordenadas y el color rojo,
     * y luego imprime el perímetro y el área del rectángulo.
     * @param x coordenada x del centro del rectángulo
     * @param y coordenada y del centro del rectángulo
     */
    private static void procesarRectangulo(double x, double y) {
        System.out.print("Introduzca la base del rectangulo: ");
        double b = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectangulo: ");
        double a = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, Color.red, b, a);
        imprimirResultados(r);
    }
    /**
     * Solicita el lado del cuadrado al usuario, crea un objeto Cuadrado con las coordenadas y el color rojo,
     * y luego imprime el perímetro y el área del cuadrado.
     * @param x coordenada x del centro del cuadrado
     * @param y coordenada y del centro del cuadrado
     */
    private static void procesarCuadrado(double x, double y) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double l = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, l);
        imprimirResultados(c);
    }
    /**
     * Imprime el perímetro y el área de la figura dada.
     * @param f figura de la cual se imprimirán el perímetro y el área     
     */
    private static void imprimirResultados(Figura f) {
        System.out.println(MSG_PERIMETRO + f.perimetro());
        System.out.println(MSG_AREA + f.area());
    }
    /**
     * Muestra un menú para seleccionar el tipo de figura a crear, y valida que la opción introducida sea entre 1 y 4.
     * @return la opción seleccionada por el usuario
     */
    public static int mostrarMenu() {
        int op;
        System.out.println("1) Triangulo");
        System.out.println("2) Rectangulo");
        System.out.println("3) Cuadrado");
        System.out.println("4) Salir");
        do {
            System.out.print("Introduzca una opcion (1-4): ");
            op = teclado.nextInt();
            if (op < 1 || op > 4) {
                System.out.println("Debe introducir un numero entre 1 y 4");
            }
        } while (op < 1 || op > 4);
        return op;
    }
}