package testprimenumber;

import java.util.Scanner;

public class TestPrimeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Positive Number ");
        int inp = s.nextInt();

        int count = 0;

        for (int index = 1; index <= inp; index++) {

            if (inp % index == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(inp + " is prime Number");
        } else {
            System.out.println(inp + " is not prime Number");

        }
    }

}
