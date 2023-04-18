
public class ContaBancaria {
    private int numConta;
    private boolean ativa;
    private double saldo;

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {

        if (numConta > 0) {
            this.numConta = numConta;
        }

    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

    public void sacar(double valor) {

        if (this.saldo <= 0) {
            return;
        }

        if (valor <= 0) {
            return;
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            return;
        }

        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
