package guessthenumberthreetimes;

import java.util.Scanner;

public class GuessTheNumberThreeTimes {

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 10);
        // System.out.println(rand);

        Scanner s = new Scanner(System.in);

        int count = 0;
        boolean totalTry = false;

        while (count < 3) {

            System.out.println("Guess a Number: ");
            int inp = s.nextInt();

            if (inp == rand) {
                System.out.println("you Win.");
                totalTry = true;
                break;
            } else if (inp < rand) {
                System.out.println("You Guess Lower Number.");

            } else if (inp > rand) {
                System.out.println("You Guess Higher Number.");

            }
            count++;

        }
        if (!totalTry) {
            System.err.println("Wrong Guess, TRy Again");
            //  System.out.println("Good Luck");
        }

        s.close();

    }

}
