import java.awt.*;

public abstract class FiguraGrafica {

    protected Color color;
    protected Boolean bordeado;

    protected abstract Boolean contienePunto(Punto p);

    protected abstract Double area();


    public Color getColor() {
        return color;
    }

    public Boolean esBordeado() {
        return bordeado;
    }
}
