public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws Exception {

        if (valor <= 0) {
            throw new Exception("O valor para saque é negativo");
        }
        if (saldo - valor < 0) {
            throw new Exception("Saldo insuficiente");

        }

        this.saldo -= valor;

    }

    public double getSaldo() {
        return saldo;
    }
}
