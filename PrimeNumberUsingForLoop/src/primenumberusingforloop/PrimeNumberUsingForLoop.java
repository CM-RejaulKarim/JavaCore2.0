package primenumberusingforloop;

import java.util.Scanner;

public class PrimeNumberUsingForLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number ");
        int num = s.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is not Prime Number");
        }

    }

}
