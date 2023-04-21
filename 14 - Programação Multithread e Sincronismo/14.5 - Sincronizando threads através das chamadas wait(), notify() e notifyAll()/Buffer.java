import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> fila = new LinkedList<>();
    private static final int MAX = 40;

    public synchronized void produzir(int n) {
        while (fila.size() == MAX) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }

        }
        fila.offer(n);

        notifyAll();
        imprimir();
    }

    public int consumir() {
        synchronized (this) {

            while (fila.size() <= 39) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                }

            }

            int n = fila.poll();

            notifyAll();
            imprimir();
            return n;
        }

    }

    private void imprimir() {
        System.out.print("=> ");
        for (Integer n : fila) {
            System.out.print(" " + n);

        }
        System.out.println();
    }

}
