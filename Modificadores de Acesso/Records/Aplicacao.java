public class Aplicacao {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(6);

        System.out.println(q1.calcularArea());
        System.out.println(q1);

        Quadrado q2 = new Quadrado(6);

        System.out.println(q2.calcularArea());
        System.out.println(q2);

        System.out.println(q1.equals(q2));

        Retangulo r = new Retangulo();

        System.err.println(r.calcularArea());
        System.out.println(r.largura());

        Retangulo r2 = Retangulo.create(50.0);

        System.out.println(r2.calcularArea());
        System.out.println(r2);
    }
}
