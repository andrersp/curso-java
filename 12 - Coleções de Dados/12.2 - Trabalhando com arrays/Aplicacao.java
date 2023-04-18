public class Aplicacao {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[1] = 6;
        array[4] = 7;

        String[] arrayString = new String[7];
        arrayString[0] = "Andre";
        arrayString[1] = "Luis";

        Object[] arrayObj = new Object[7];
        arrayObj[0] = "a";
        arrayObj[1] = new Object();
        arrayObj[2] = new int[3];
        arrayObj[3] = 10;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i : array) {
            System.out.println(i);
        }

        for (String s : arrayString) {

            if (s != null) {
                System.out.println(s);

            }

        }

        for (int i = 0; i < arrayObj.length; i++) {

            Object obj = arrayObj[i];

            if (obj instanceof String) {
                String val = (String) obj;
                System.out.println("String: " + val);
            }

            if (obj instanceof Integer) {
                Integer val = (int) obj;

                System.out.println("Inteiro: " + val);
            }

        }

    }

}