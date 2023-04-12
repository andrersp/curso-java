public class Aplicacao {
    public static void main(String[] args) {

        // Matematica m = new Matematica();

        int soma = Matematica.somar(10, 20);
        int sub = Matematica.subtrair(10, 20);

        System.out.println(soma);
        System.out.println(sub);

        // Contador c1 = new Contador();
        // Contador c2 = new Contador();
        // Contador c3 = new Contador();
        System.out.println(Contador.valor);

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        System.out.println(Contador.getValor());

        double media = Constantes.MEDIA_DA_PROVA;

        System.out.println(media);

    }
}