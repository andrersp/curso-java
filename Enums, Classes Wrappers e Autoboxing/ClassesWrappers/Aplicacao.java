public class Aplicacao {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(20);
        imprimir(i);

        Double d = Double.valueOf(23.5);
        imprimir(d);

        int i2 = i.intValue();
        System.out.println(i2);

        double d2 = d.doubleValue();
        System.out.println(d2);

        Integer i3 = Integer.valueOf("2");
        Double d3 = Double.valueOf("20.3");

        int i4 = Integer.parseInt("20");
        double d4 = Double.parseDouble("20.3");

        String bin = "0111";

        int i5 = Integer.parseInt(bin, 2);
        System.out.println(i5);

        String bin2 = Integer.toBinaryString(7);
        System.out.println(bin2);

        imprimir(100);

    }

    private static void imprimir(Object obj) {
        System.out.println(obj);
    }
}