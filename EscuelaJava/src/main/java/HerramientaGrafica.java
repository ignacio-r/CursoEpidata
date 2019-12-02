import java.awt.*;

public class HerramientaGrafica {


    public Circulo circulo(double radio, Punto centro, Color color, Boolean bordeado) {
        return new Circulo(radio, centro, color, bordeado);
    }

    public Rectangulo rectangulo(Punto esquinaInferiorIzq, Punto esquinaSuperiorDer, Color color, Boolean bordeado) {
        return new Rectangulo(esquinaInferiorIzq, esquinaSuperiorDer, color, bordeado);
    }
}
