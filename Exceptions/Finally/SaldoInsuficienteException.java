public class SaldoInsuficienteException extends Exception {
    double valor, saldo;

    public SaldoInsuficienteException(double valor, double saldo) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getValor() {
        return valor;
    }

}
