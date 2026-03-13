package figuras;

import java.awt.Color;

public class Triangulo extends Figura {
    private double lado1, lado2, lado3;

    public Triangulo(double x, double y, Color color, double l1, double l2, double l3) {
        super(x, y, color);
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    @Override
    public double perimetro() { return lado1 + lado2 + lado3; }

    @Override
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}