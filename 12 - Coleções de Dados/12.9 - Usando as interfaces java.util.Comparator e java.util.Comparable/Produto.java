public class Produto implements Comparable<Produto> {

    private int id;
    private String descricao;
    private double preco;

    public Produto(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return id + ", " + descricao + ", " + preco;
    }

    // @Override
    // public boolean equals(Object obj) {

    // if (obj == null) {
    // return false;
    // }

    // if (!(obj instanceof Produto)) {
    // return false;
    // }
    // Produto other = (Produto) obj;

    // if (this.id == other.id) {
    // return true;
    // }
    // return false;

    // }

    @Override
    public int compareTo(Produto o) {
        if (this.preco > o.preco) {
            return 1;
        } else if (this.preco < o.preco) {
            return -1;
        }
        return 0;
    }
}