import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("ABC");
        l.add("DEF");
        // l.set(0, "GHI"); //Subscreve o elemento
        l.add(0, "GHI");
        // l.add(0, 10); //Da Erro

        String e = l.get(1);
        System.out.println(e);

        for (String s : l) {
            System.out.println(s);
        }

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        Iterator<String> iterator = l.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}