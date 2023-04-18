package softblue.numero;

import softblue.util.ConsoleUtil;
import softblue.util.RandonUtil;

public class Jogo {
    public static void main(String[] args) {

        int number = RandonUtil.nextInt(0, 50);

        int guess;

        do {
            System.out.println("Adivinhe o número: ");

            guess = ConsoleUtil.readInt();

            if (guess < number) {
                System.out.println("O valor digitado é menor");
            } else {
                System.out.println("O valor digitado é maior");
            }

        } while (guess != number);

        System.out.println("Acertou miseravi.\nO25 número era: " + number + "\nFim");

    }
}