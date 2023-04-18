import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class Aplicacao {
    public static void main(String[] args) {

        double d = 1145.4;

        NumberFormat nf1 = NumberFormat.getInstance();
        String s1 = nf1.format(d);
        System.out.println(s1);

        java.util.Locale l = new java.util.Locale("en", "US");

        NumberFormat nf2 = NumberFormat.getInstance(l);
        String s2 = nf2.format(d);
        System.out.println(s2);

        NumberFormat nf3 = NumberFormat.getCurrencyInstance();
        String s3 = nf3.format(d);
        System.out.println(s3);

        java.util.Locale l2 = new java.util.Locale("en", "US");

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(l2);
        String s4 = nf4.format(d);
        System.out.println(s4);

        DecimalFormat df1 = new DecimalFormat("00,000.000");
        df1.setGroupingUsed(true);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('-');
        df1.setDecimalFormatSymbols(dfs);

        String s5 = df1.format(d);
        System.out.println(s5);

    }
}