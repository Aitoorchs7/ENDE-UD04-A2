// Rectangulo.java
package figuras;
/**
* Clase que representa un rectángulo, subclase de Figura.
* Contiene atributos para la base y la altura, y métodos para calcular el perímetro y el área del rectángulo.
** @author Aitor Chicano
*@version 1.0
*/
import java.awt.Color;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    /**
     * Constructor del rectángulo con centro en (x, y), color, base y altura especificados      
     * @param x coordenada x del centro del rectángulo
     * @param y coordenada y del centro del rectángulo
     * @param color color del rectángulo
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }
    /**
     * Calcula el perímetro del rectángulo
     * @return perímetro del rectángulo
     */
    public double perimetro() { return 2 * base + 2 * altura; }
    /**
     * Calcula el área del rectángulo
     * @return área del rectángulo
     */
    public double area() { return base * altura; }
}

