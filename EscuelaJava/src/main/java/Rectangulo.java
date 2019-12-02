import java.awt.*;

public class Rectangulo extends FiguraGrafica {

    private Punto esquinaSuperiorDer;
    private Punto esquinaInferiorIzq;

    public Rectangulo(Punto esquinaInferiorIzq, Punto esquinaSuperiorDer, Color color, Boolean bordeado) {
        this.esquinaInferiorIzq = esquinaInferiorIzq;
        this.esquinaSuperiorDer = esquinaSuperiorDer;
        this.color = color;
        this.bordeado = bordeado;
    }

    @Override
    protected Boolean contienePunto(Punto p) {
        return new Recta(esquinaInferiorIzq, esquinaSuperiorDer).esPunto(p);
    }

    @Override
    protected Double area() {
        return altura() * ancho();
    }

    private Double altura() {
        return esquinaSuperiorDer.getY() - esquinaInferiorIzq.getY();
    }

    private Double ancho() {
        return esquinaSuperiorDer.getX() - esquinaInferiorIzq.getX();
    }
}
