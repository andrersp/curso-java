public class Ferrari implements Carro, ItemCaro {

    @Override
    public void virarDireita() {
        System.out.println("Ferrari virou a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Ferrari virou a esquerda");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerou");
    }

    @Override
    public void abrirPorta() {
        System.out.println("Carro abriu a porta");
    }

    @Override
    public double getPreco() {
        return 5000.00;
    }

}
