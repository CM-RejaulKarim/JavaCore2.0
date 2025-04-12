/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;

public class LearnMethodOverloading {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter how Many Times You Want to Sum. ");
        int inp = s.nextInt();

        int[] myArray = new int[inp];

        //int uInput=0;
        for (int i = 0; i < inp; i++) {
            System.out.println("Enter a number");
            int uInput = s.nextInt();
            myArray[i] = uInput;
        }
        sum(myArray);

    }

    public static int sum() {
        return 10 + 20;
    }

    public static int sum(int a) {
        return a + 20;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void sum(int... a) {
        long sum = 0;

        for (int i : a) {
            sum += i;
        }

        System.out.println("All Enterd Numbers: " + Arrays.toString(a));
        System.out.println("Sum is: " + sum);
    }

}
