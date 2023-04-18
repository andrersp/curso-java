public class Main {
    public static void main(String[] args) throws Exception {

        ContaBancaria c = new ContaBancaria(500);
        try {
            c.sacar(750);
            System.out.println("Saque realizado com sucesso");

            // } catch (SaldoInsuficienteException e) {
            // System.out.println("Erro saldo insuficiente");

            // } catch (ValorNegativoException e) {
            // System.out.println("Valor Negativo");

        } finally {
            System.out.println(c.getSaldo());
        }
    }
}
