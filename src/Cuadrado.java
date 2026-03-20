package figuras;
/**
* Clase que representa un cuadrado, subclase de Rectángulo.
* El cuadrado se define por su lado, que es igual a la base y la altura del rectángulo.
** @author Aitor Chicano
*@version 1.0
*/
import java.awt.Color;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}