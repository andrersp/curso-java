public class Aplicacao {
    public static void main(String[] args) {

        Contador c = new Contador();
        ContadorNovo c2 = new ContadorNovo();
        Thread t = new Thread(c2);
        c.start();
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}