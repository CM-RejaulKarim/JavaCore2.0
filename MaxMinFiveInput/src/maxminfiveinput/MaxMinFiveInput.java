package maxminfiveinput;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFiveInput {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your Limit. ");
        int size = s.nextInt();

        evenOdd(size); // Method Even Odd call.
        primeNum(size); // Method Prime number call.

        System.out.println("\n");

        int[] numbers = new int[size];

        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Enter Value " + (index + 1));
            int inp = s.nextInt();
            numbers[index] = inp;

        }
        System.out.println("Your All Input" + Arrays.toString(numbers));

        int maxNum = numbers[0];
        int minNum = numbers[0];

        for (int number : numbers) {

            if (number > maxNum) {
                maxNum = number;
            }

            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.println("The Max Number Is: " + maxNum);
        System.out.println("The Min Number Is: " + minNum);

    }

    public static void evenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even Number.");
        } else {
            System.out.println(number + " is Odd Number.");
        }

    }

    public static void primeNum(int number) {
        
        int count = 0;
        
        for (int i = 1; i < number; i++) {
            
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number+" is Prime Number.");
        }
        else{
        System.out.println(number+" is not Prime Number.");
        }

    }

}
