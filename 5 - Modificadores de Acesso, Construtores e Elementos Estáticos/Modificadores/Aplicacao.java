public class Aplicacao {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();

        c.setAtiva(true);
        c.setNumConta(5468);
        c.depositar(5000);

        c.sacar(30);

        System.out.println(c.getSaldo());

    }
}
