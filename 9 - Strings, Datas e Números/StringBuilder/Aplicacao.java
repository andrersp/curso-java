public class Aplicacao {
    public static void main(String[] args) {

        // String s = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            sb.append("x");
        }

        String s = sb.toString();

        System.out.println(s);
        System.out.println("A" + "B" + "C" + "D");

    }
}