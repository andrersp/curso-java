import java.io.IOException;
import java.io.PrintWriter;

public class Aplicacao {
    public static void main(String[] args) throws IOException {

        String s = "texto para ser gravado no arquivo\nNova Linha";

        // try (OutputStream os = new FileOutputStream("saida.txt")) {

        // String s = "texto para ser gravado no arquivo";

        // byte[] buffer = s.getBytes();

        // os.write(buffer);

        // }

        // try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt")))
        // {
        // writer.write(s);

        // }

        try (PrintWriter pw = new PrintWriter("saida.txt")) {
            pw.println(s);

        }

    }
}