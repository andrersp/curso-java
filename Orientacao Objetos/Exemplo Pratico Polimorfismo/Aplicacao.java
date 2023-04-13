public class Aplicacao {
    public static void main(String[] args) {

        Preparador preparador = new Preparador();

        LeiteQuente leite = new LeiteQuente();
        Refrigerante refri = new Refrigerante();

        System.out.println("Preparando o " + leite.getNome());
        preparador.prepararBebida(leite);

        System.out.println("\nPreparando o " + refri.getNome());
        preparador.prepararBebida(refri);

    }
}