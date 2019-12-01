public class Recta {

    private Punto punto;
    private Punto otro;

    Recta(Punto punto, Punto otro) {
        this.punto = punto;
        this.otro = otro;
    }

    Double pendiente() {
        return (otro.getY() - punto.getY()) / (otro.getX() - punto.getX());
    }

    public String toString() {
        return punto.toString() + " , " + otro.toString();
    }

    public Boolean esPunto(Punto p) {
        return pendiente().equals((p.getY() - punto.getY()) / (p.getX() - punto.getX()));
    }
}
