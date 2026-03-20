package figuras;
/**
 * Clase abstracta que representa una figura geométrica.
 * @author Aitor Chicano
 * @version 1.0
 */
import java.awt.Color;

public abstract class Figura {
    private Punto centro;
    private Color color;
    /**
     * Constructor de la figura con centro en (x, y) y color especificado
     * @param x
     * @param y
     * @param color
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }
    /**
     * @return coordenada x del centro de la figura
     */
    public double getXCentro() { return centro.getX(); }
    /**
     * @return coordenada y del centro de la figura
     */
    public double getYCentro() { return centro.getY(); }
    /**
     * @return color de la figura
     */
    public Color getColor() { return color; }
    /**
     * Modifica la coordenada x del centro de la figura 
     * @param x
     */
    public void setXCentro(double x) { centro.setX(x); }
    /**
     * Modifica la coordenada y del centro de la figura
     * @param y
     */
    public void setYCentro(double y) { centro.setY(y); }
    /**
     * Modifica el color de la figura
     * @param color nuevo color de la figura
     */
    public void setColor(Color color) { this.color = color; }
    /**
     * Calcula el perímetro de la figura
     * @return
     */

    public abstract double perimetro();
    /**
     * Calcula el área de la figura
     * @return
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