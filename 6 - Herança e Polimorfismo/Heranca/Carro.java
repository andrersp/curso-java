public class Carro extends Veiculo {

    private boolean quatroPortas;

    public void setQuatroPorta(boolean quatroPortas) {
        this.quatroPortas = quatroPortas;
    }

    public boolean isQuatroPortas() {
        return quatroPortas;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Quatro portas: " + quatroPortas);

    }

}
