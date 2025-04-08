package positivenegativezero;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = s.nextInt();

        if (number > 0) {
            System.out.println(number + " is Positive number.");
        } else if (number < 0) {
            System.err.println(number + " is Negative number.");
        } else {
            System.out.println(number + " is Zero");
        }

    }
}
