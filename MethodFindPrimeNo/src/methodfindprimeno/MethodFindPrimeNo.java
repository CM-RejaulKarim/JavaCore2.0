package methodfindprimeno;

import java.util.Scanner;

public class MethodFindPrimeNo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = s.nextInt();

        String result = findPrimeNumber(number);

        System.out.println(result);

    }

    public static String findPrimeNumber(int number) {

        String result = "";

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            result = (number + " is Prime Number");
        } else {
            result = (number + " is not Prime Number");
        }
        return result;
    }

}
