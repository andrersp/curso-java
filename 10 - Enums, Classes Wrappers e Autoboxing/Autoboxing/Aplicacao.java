public class Aplicacao {
    public static void main(String[] args) {

        Handler h = new Handler();

        // int i = 10;
        // Integer i = Integer.valueOf("10");

        // h.setObj(i);

        // Integer i2 = (Integer) h.getObj();
        // int i3 = i2.intValue();

        // System.out.println(i3);

        // int i = 10;

        // h.setObj(i);
        // int i2 = (int) h.getObj();

        // System.out.println(i2);

        // double d = somar(4, 5);
        // System.out.println(d);

        // Double d1 = Double.valueOf("5");
        // Double d2 = Double.valueOf("4");

        // double d = somar(d1.doubleValue(), d2.doubleValue());

        // Double d1 = 5.0;
        // Double d2 = 4.0;
        // Double d = somar(d1, d2);
        // System.out.println(d);

        // Integer i = Integer.valueOf(5);

        // int i2 = i.intValue();

        // i2++;

        // i = Integer.valueOf(i2);
        // System.out.println(i);

        Integer i = 5;
        i++;
        System.out.println(i);

    }

    private static double somar(double d1, double d2) {
        return d1 + d2;
    }
}
