public class Moto implements Automovel {

    @Override
    public void virarDireita() {
        System.out.println("Moto virou a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Moto virou a esqueda");

    }

    @Override
    public void acelerar() {
        System.out.println("Moto virou acelerou");
    }

}
