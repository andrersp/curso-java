public class ValorNegativoException extends Exception {

    double valor;

    public ValorNegativoException(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
