package evenorodd;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int number = s.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even Number.");
        } else {
            System.err.println(number + " is Odd Number.");
        }

    }
}
