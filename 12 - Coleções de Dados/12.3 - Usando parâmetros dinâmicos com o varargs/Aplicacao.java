public class Aplicacao {
    public static void main(String[] args) {

        String[] valores = { "Andre", "Luis", "Java" };
        imprimir(valores);

    }

    public static void imprimir(String... textos) {

        for (String s : textos) {
            System.out.println(s);

        }

    }
}