import java.util.Random;
import java.util.Scanner;

public class DieRoller {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String answer;

        do {

            int roll = 0;

            System.out.println("\nRolling three dice until we get a triple!\n");

            System.out.printf("%-6s %-6s %-6s %-6s %-6s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");

            System.out.println("------------------------------------------");

            int die1;
            int die2;
            int die3;

            do {

                roll++;


                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("%-6d %-6d %-6d %-6d %-6d%n",
                        roll, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("\nYou rolled a triple!");

            System.out.print("\nWould you like to play again? (yes/no): ");

            answer = input.nextLine();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing!");

        input.close();
    }
}