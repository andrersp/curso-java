public class ContaBancaria {
    private double saldo = 1000;

    // private final Object monitor = new Object();

    public synchronized void sacar(double valor) {
        // synchronized (this) {
        this.saldo -= valor;
        // }

    }

    public synchronized void depositar(double valor) {
        // synchronized (this) {
        this.saldo += valor;
        // }

    }

    public double getSaldo() {
        return saldo;
    }
}