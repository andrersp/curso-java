

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "José";

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";

        p1.receber(5);
        
        p1.dar(2, p2);
        System.out.println(p1.nome + " Tem " + p1.numFigurinhas + " Figurinhas");
        System.out.println(p2.nome + " Tem " + p2.numFigurinhas + " Figurinhas");

        // p1.receber(5);
        
        p1.dar(2, p2);
        System.out.println(p1.nome + " Tem " + p1.numFigurinhas + " Figurinhas");
        System.out.println(p2.nome + " Tem " + p2.numFigurinhas + " Figurinhas");
    }
}
