package softblue.util;

import java.util.Scanner;

public class ConsoleUtil {
    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return Integer.parseInt(str);

    }
}
