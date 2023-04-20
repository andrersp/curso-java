public class Aplicacao {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaBancaria = new ContaBancaria();

        Pessoa p1, p2 = new Pessoa(contaBancaria);
        p1 = new Pessoa(contaBancaria);
        p2 = new Pessoa(contaBancaria);

        Thread t1, t2;
        t1 = new Thread(p1);
        t2 = new Thread(p2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Saldo: " + contaBancaria.getSaldo());
    }
}
