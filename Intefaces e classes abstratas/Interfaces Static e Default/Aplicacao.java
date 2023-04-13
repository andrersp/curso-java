public class Aplicacao {
    public static void main(String[] args) {

        Ferrari f = new Ferrari();
        Porche p = new Porche();
        f.derrapar();
        p.derrapar();

        int velocidade = Automovel.getVelocidadeMaxima();
        System.out.println(velocidade);

    }
}