public class Aplicacao {

    public static void main(String[] args) {
        // Veiculo v = new Veiculo();

        System.out.println("Carro");
        Carro c = new Carro();
        c.setMarca("Volks");
        c.setModelo("Gol");
        c.setQuatroPorta(true);
        c.setAno(2008);
        c.imprimirDados();

        // c.buzinar();

        // v.imprimirDados();

        System.out.println("\nMotocicleta");

        Motocicleta m = new Motocicleta();
        m.setMarca("Honda");
        m.setModelo("Titan");
        m.setAno(2006);
        m.imprimirDados();
        // m.empinar();
        // m.buzinar();

        // Caminhao cam = new Caminhao();
        // cam.buzinar();
    }
}
