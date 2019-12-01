public class Punto {

    private Double x = 0.0;
    private Double y = 0.0;

    Punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    Punto() {

    }

    public static void main(String[] args) {
        Punto p = new Punto();
        System.out.println(p);
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.desplazar(2.5, 3.5);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.distanciaEuclidea(new Punto(2.8, 3.5)));
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void desplazar(Double x, Double y) {
        setX(x);
        setY(y);
    }

    public Double distanciaEuclidea(Punto punto) {
        double deltaX = y - punto.getY();
        double deltaY = x - punto.getX();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public Double distanciaEuclideaAlOrigen() {
        return this.distanciaEuclidea(new Punto());
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Boolean equals(Punto p) {
        return p.getX().equals(x) && p.getY().equals(y);
    }
}
