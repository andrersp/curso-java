public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, ValorNegativoException {
        if (valor < 0) {

            throw new ValorNegativoException(valor);

        }

        if (saldo - valor < 0) {
            throw new SaldoInsuficienteException(valor, this.saldo);
        }

        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}