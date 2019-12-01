public class SaludadorAntipatico {

    private boolean saludo;

    SaludadorAntipatico() {
        saludo = false;
    }

    public static void main(String[] args) {
        SaludadorAntipatico saludadorAntipatico = new SaludadorAntipatico();
        saludadorAntipatico.saludar();
        saludadorAntipatico.saludar();
    }

    void saludar() {
        if (!saludo) {
            System.out.println("Hallo Welt!");
            saludo = true;
        }
    }
}
