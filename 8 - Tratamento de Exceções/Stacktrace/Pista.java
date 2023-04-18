public class Pista {

    public void iniciar() throws PistaException {

        Automovel a = new Automovel();

        try {
            a.acelerar(90);
            a.acelerar(100);
        } catch (AcimaVelocidadeMaximaException e) {
            throw new PistaException("Problema na pista", e);
        }
    }

}
