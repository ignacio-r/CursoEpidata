package Geometria;

public class Recta {

    private Punto punto;
    private Double pendiente;

    Recta(Punto punto, Punto otro) {
        this.punto = punto;
        pendiente = (otro.getY() - punto.getY()) / (otro.getX() - punto.getX());
    }

    Recta(Double pendiente, Punto punto) {
        this.punto = punto;
        this.pendiente = pendiente;
    }

    Double pendiente() {
        return pendiente;
    }

    public Boolean esPunto(Punto p) {
        return pendiente().equals((p.getY() - punto.getY()) / (p.getX() - punto.getX()));
    }

    public Boolean esPunto(Double x, Double y) {
        return esPunto(new Punto(x, y));
    }

    public Boolean equals(Recta recta) {
        return esPunto(recta.punto()) && pendiente().equals(recta.pendiente());
    }

    private Punto punto() {
        return punto;
    }
}
