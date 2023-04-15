public class Aplicacao {
    public static void main(String[] args) {
        // Automovel a = new Automovel();

        // try {
        // a.acelerar(100);
        // a.acelerar(90);

        // } catch (AcimaVelocidadeMaximaException e) {
        // e.printStackTrace();
        // }

        Pista p = new Pista();
        try {
            p.iniciar();

        } catch (PistaException e) {
            e.printStackTrace();
        }

    }
}
