public class Aplicacao {
    public static void main(String[] args) {
        ResultadoBhaskara r = new ResultadoBhaskara();

        // double a = 1.0;
        // double b = 3;
        // double c = -4;
        double a = 1.0;
        double b = 2.0;
        double c = 16.0;

        Matematica.cacularBhaskara(a, b, c, r);

        System.out.println("R1 : " + r.getR1());
        System.out.println("R2 : " + r.getR2());

    }
}
