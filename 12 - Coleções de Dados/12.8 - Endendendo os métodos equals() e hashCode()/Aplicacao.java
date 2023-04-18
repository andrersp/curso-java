import java.util.HashSet;
import java.util.Set;

public class Aplicacao {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Produto 1");
        Produto p2 = new Produto(2, "Produto 2");
        Produto p3 = new Produto(3, "Produto 1");
        Produto p4 = new Produto(4, "Produto 1");
        Produto p5 = new Produto(5, "Produto 1");

        Set<Produto> produtos = new HashSet<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        for (Produto p : produtos) {
            System.out.println("=> " + p.getId());
        }
        System.out.println("p1 => " + produtos.contains(p1));
        System.out.println("p2 => " + produtos.contains(p2));
        System.out.println("p3 => " + produtos.contains(p3));
        System.out.println("p4 => " + produtos.contains(p4));
        System.out.println("p5 => " + produtos.contains(p4));

    }
}
