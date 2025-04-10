package jhankar;

import java.util.Scanner;

public class TemporaryTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = s.nextInt();

        long counter = doContinue(n);

        System.out.println(counter);

    }

    public static long doContinue(int input) {
        int count = 1;

        while (count < input) {
            if (count >= input) {
                count++;
                break;
            } else {
                System.out.println(count);
                count++;
            }
        }
        return count;
    }

}
