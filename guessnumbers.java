import java.util.Scanner;

/**
 * guessnumbers2 34
 */
public class guessnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 5;
        int finals = 0;
        boolean playAgain = true;
        System.out.println(" Welcome to Numbers Game Magic!");
        System.out.println("Hey you have " + chances + " chances to win it");
        while (playAgain) {
            int random = getrandomNumbers(0, 100);
            boolean guess = false;
            for (int i = 0; i <= chances; i++) {
                System.out.println("chance" + (i + 1) + "Enter your guess :");
                int player = sc.nextInt();
                if (player == random) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won!");
                    break;
                } else if (player > random) {
                    System.out.println(" Too High from Guess!");
                } else {
                    System.out.println("Too Low from Guess");
                }
            }
            if (guess = false) {
                System.out.println(" Sorry You Lost The chances number is " + random);

            }
            System.out.println("Want To play Again(y/n)");
            String round = sc.next();
            playAgain = round.equalsIgnoreCase("y");
        }
        System.out.println("Game Over , Hope you Enjoyed");
        System.out.println("score is " + finals);
    }

    public static int getrandomNumbers(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}