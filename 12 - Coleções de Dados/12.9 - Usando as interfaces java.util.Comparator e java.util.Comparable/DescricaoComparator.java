import java.util.Comparator;

public class DescricaoComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto obj1, Produto obj2) {

        if (obj1.getDescricao().equals(obj2.getDescricao())) {
            if (obj1.getId() > obj2.getId()) {
                return 1;
            } else {
                return -1;
            }

        }

        if (obj1.getDescricao().compareTo(obj2.getDescricao()) > 0) {
            return 1;
        }

        return -1;

    }

}
