package practicalprimenumber;

import java.util.Scanner;

public class PracticalPrimeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int inp = s.nextInt();

        int count = 0;

        for (int i = 1; i <= inp; i++) {
            if (inp % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println(inp + " is a Prime Number");
        } else {
            System.out.println(inp + " is not a Prime  Number");
        }

    }

}
