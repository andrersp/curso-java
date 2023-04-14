public class Banco {

    public void realizarOperacao() throws Exception {
        ContaBancaria c = new ContaBancaria(1000);

        c.sacar(-200);
        System.out.println("Saque realizado com sucesso!");

        System.out.println(c.getSaldo());

    }

}
