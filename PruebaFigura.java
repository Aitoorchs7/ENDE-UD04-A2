package figuras;
// modificacion rama master, nuevo mensaje implementadi en el codigo
import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            opcion = mostrarMenu(teclado);

            if (opcion != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduzca lado 1 del triángulo: ");
                        double l1 = teclado.nextDouble();
                        System.out.print("Introduzca lado 2 del triángulo: ");
                        double l2 = teclado.nextDouble();
                        System.out.print("Introduzca lado 3 del triángulo: ");
                        double l3 = teclado.nextDouble();
                        Triangulo t = new Triangulo(x, y, Color.red, l1, l2, l3);
                        System.out.println("Perimetro: " + t.perimetro() + " | Area: " + t.area());
                        break;
                    case 2:
                        System.out.print("Introduzca la base del rectangulo: ");
                        double base = teclado.nextDouble();
                        System.out.print("Introduzca la altura del rectangulo: ");
                        double altura = teclado.nextDouble();
                        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
                        System.out.println("Perimetro: " + r.perimetro() + " | Area: " + r.area());
                        break;
                    case 3:
                        System.out.print("Introduzca el lado del cuadrado: ");
                        double lado = teclado.nextDouble();
                        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
                        System.out.println("Perimetro: " + c.perimetro() + " | Area: " + c.area());
                        break;
                }
            }
        } while (opcion != 4);

        teclado.close();
        System.out.println("Programa finalizado.");
    }

    public static int mostrarMenu(Scanner teclado) {
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Triangulo");
            System.out.println("2) Rectangulo");
            System.out.println("3) Cuadrado");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opcion (1-4): ");
            opcion = teclado.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Error: numero fuera de rango.");
            }
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
}