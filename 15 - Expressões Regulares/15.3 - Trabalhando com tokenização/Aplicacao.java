import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
    public static void main(String[] args) throws FileNotFoundException {

        int[][] elementos = new int[4][4];

        Scanner s = new Scanner(new File("dados.txt"));

        Pattern p = Pattern.compile("\\d");

        int j = 0;

        while (s.hasNextLine()) {
            String line = s.nextLine();
            Matcher m = p.matcher(line);

            int i = 0;

            while (m.find()) {
                elementos[i][j] = Integer.parseInt(m.group());
                i++;
            }
            j++;

            // String[] tokens = line.split(",");

            // int j = 0;

            // for (int i = 0; i < tokens.length; i++) {

            // tokens[i] = tokens[i].replace("'", "");

            // elementos[j][i] = Integer.parseInt(tokens[i]);

            // }
            // j++;

        }

        for (int a = 0; a < elementos.length; a++) {
            for (int b = 0; b < elementos[a].length; b++) {
                System.out.print(elementos[a][b] + "\t");

            }

            System.out.println();

        }

    }
}