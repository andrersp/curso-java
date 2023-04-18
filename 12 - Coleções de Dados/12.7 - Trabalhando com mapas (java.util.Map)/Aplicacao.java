import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Aplicacao {
    public static void main(String[] args) {

        // Map<Integer, Produto> map = new HashMap<>();
        // Map<Integer, Produto> map = new LinkedHashMap<>();
        Map<Integer, Produto> map = new TreeMap<>();

        Produto p1 = new Produto(1, "Descricao 1");
        Produto p2 = new Produto(20, "Descricao 2");
        Produto p3 = new Produto(1, "Descricao 3");
        Produto p4 = new Produto(1, "Descricao 4");

        map.put(1, p1);
        map.put(20, p2);
        map.put(3, p3);
        map.put(4, p4);

        // Produto p = map.get(1);
        // System.out.println(p);

        Set<Integer> key = map.keySet();
        for (Integer k : key) {
            System.out.println(k);
        }

        Collection<Produto> values = map.values();
        for (Produto p : values) {
            System.out.println(p);
        }

        Set<Entry<Integer, Produto>> entries = map.entrySet();

        for (Entry<Integer, Produto> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());

        }

    }
}