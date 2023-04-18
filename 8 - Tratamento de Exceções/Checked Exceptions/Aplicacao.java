public class Aplicacao {
    public static void main(String[] args) {

        Banco banco = new Banco();

        try {
            banco.realizarOperacao();
        } catch (BancoException e) {

            System.out.printf("Ocorreu um erro: %s\n",
                    e.getMessage());
            System.out.println(e.getCause());

        }
        // } catch (Exception e) {
        // System.out.println("Ocorreu um erro");
        // }

    }
}