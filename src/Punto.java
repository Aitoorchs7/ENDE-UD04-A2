package figuras;
/**
*Clase que representa un punto con cordenadas x e y, 
*con métodos para obtener y modificar sus coordenadas, calcular la distancia a otro punto,
*obtener el punto simétrico respecto al eje y, comparar con otro punto y obtener una representación en cadena del punto.
** @author Aitor Chicano
*@version 1.0
*/
public class Punto {
    private double x;
    private double y;

    /**
     * Constructor con puntos definidos
     */
    public Punto() {
        x = 0;
        y = 0;
    }
    /**
    * Constructor con puntos definidos por el usuario
    * @param x coordenada x del punto
    * @param y coordenada y del punto
    */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Constructor de copia
     * @param p punto a copiar
    */
    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }
    /**
     * Obtiene la coordenada x del punto
     * @return coordenada x
     */
    public double getX() { return x; }
    /**
     * Obtiene la coordenada y del punto
     * @return coordenada y
     */
    public double getY() { return y; }
    /**
    * Modifica la coordenada x del punto
    * @param x nueva coordenada x
    */
    public void setX(double x) { this.x = x; }
    /**
     * Modifica la coordenada y del punto
     * @param y nueva coordenada y
     */
    public void setY(double y) { this.y = y; }
    
    /** 
     * Calcula la distancia desde este punto hasta otro
     * @param p punto de destino
     * @return distancia entre los puntos
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
    /** 
     * Obtiene el punto simétrico respecto al eje y
     * @return nuevo punto simétrico
     */
    public Punto simetrico() {
        return new Punto(this.x * -1, this.y);
    }
    /**
     * Compara este punto con otro para determinar si son iguales
     * @param p punto con el que se compara
     * @return true si los puntos son iguales, false en caso contrario
     */
    public boolean compara(Punto p) {
        return p.x == x && p.y == y;
    }
    /**
     * Devuelve una representación en cadena del punto
     * @return cadena con las coordenadas del punto
     */
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}