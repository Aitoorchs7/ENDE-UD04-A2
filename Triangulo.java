// Triangulo.java
package figuras;
/**
* Clase que representa un triángulo, subclase de Figura.
* El triángulo se define por sus tres lados, y contiene métodos para calcular su perímetro y área.
** @author Aitor Chicano
*@version 1.0
*/
import java.awt.Color;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    /**
     * Constructor del triángulo con centro en (x, y), color y lados especificados
     * @param x
     * @param y
     * @param color
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * Calcula el perímetro del triángulo
     * @return perímetro del triángulo
     */
    public double perimetro() { return lado1 + lado2 + lado3; }
    /**
     * Calcula el área del triángulo
     * @return área del triángulo
     */
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}