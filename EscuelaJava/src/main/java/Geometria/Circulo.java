package Geometria;

import java.awt.*;

public class Circulo extends FiguraGrafica {

    private Punto center;
    private double radio;

    public Circulo(double radio, Punto center, Color color, Boolean bordeado) {
        this.radio = radio;
        this.center = center;
        this.color = color;
        this.bordeado = bordeado;
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCenter() {
        return center;
    }

    @Override
    protected Boolean contienePunto(Punto p) {
        double distance;
        // using the distance formula to calculate the distance
        // from the point given from the user and point where circle is centered

        /**
         * distance formula
         *  d = √ ( x2 - x1 )^2 + (y2 - y1 )^2
         */

        distance = getDistance(p);
        return distance < radio;
    }

    private double getDistance(Punto p) {
        return Math.pow(p.getX() - center.getX(), 2) + Math.pow(p.getY() - center.getY(), 2);
    }

    @Override
    protected Double area() {
        return radio * radio * Math.PI;
    }
}
