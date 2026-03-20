package figuras;
import java.awt.Color;
/**
 * Clase que representa un punto en el plano cartesiano.
 * @author Aitor Chicano
 * @version 1.0
 */
public abstract class Figura {
    private Punto centro;
    private Color color;
    /**
     * Constructor de la figura con centro en (x, y) y color especificado
     * @param x coordenada x del centro de la figura 
     * @param y coordenada y del centro de la figura
     * @param color color de la figura
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }
    /**
     * Constructor de la figura con centro en (0, 0)
     * @return coordenada x del centro de la figura
     */
    public double getXCentro() { return centro.getX(); }
    /**
     * Obtiene la coordenada y del centro de la figura
     * @return coordenada y del centro de la figura
     */
    public double getYCentro() { return centro.getY(); }
    /**
     * Obtiene el color de la figura
     * @return color de la figura
     */
    public Color getColor() { return color; }
    /**
     * Modifica la coordenada x del centro de la figura 
     * @param x nueva coordenada x del centro de la figura
     */
    public void setXCentro(double x) { centro.setX(x); }
    /**
     * Modifica la coordenada y del centro de la figura
     * @param y nueva coordenada y del centro de la figura
     */
    public void setYCentro(double y) { centro.setY(y); }
    /**
     * Modifica el color de la figura
     * @param color nuevo color de la figura
     */
    public void setColor(Color color) { this.color = color; }
    /**
     * Calcula el perímetro de la figura
     * @return perímetro de la figura
     */

    public abstract double perimetro();
    /**
     * Calcula el área de la figura
     * @return área de la figura
     */
    public abstract double area();
    /**
     * Compara el área de esta figura con la de otra figura
     * @param otraFigura figura con la que se compara
     * @return 1 si esta figura tiene un área mayor, -1 si tiene un área menor, 0 si son iguales
     */
    public int esMayorQue(Figura otraFigura) {
        int codigo;
        if (this.area() > otraFigura.area()) {
            codigo = 1;
        } else if (this.area() < otraFigura.area()) {
            codigo = -1;
        } else {
            codigo = 0;
        }
        return codigo;
    }
}