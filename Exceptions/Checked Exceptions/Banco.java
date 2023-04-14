public class Banco {

    public void realizarOperacao() throws BancoException {
        ContaBancaria c = new ContaBancaria(1000);

        try {
            c.sacar(-1500);
            System.out.println("Saque realizado com sucesso!");

            System.out.println(c.getSaldo());
        } catch (ValorNegativoException e) {
            // System.out.println("Voce tentou sacar um valor negativo: " + e.getValor());
            throw new BancoException("Erro de saque valor negativo", e);
        } catch (SaldoInsuficienteException e) {
            throw new BancoException("Erro de saque saldo insuficiente", e);

        }

        // c.sacar(-200);
        // System.out.println("Saque realizado com sucesso!");

        // System.out.println(c.getSaldo());

    }

}
