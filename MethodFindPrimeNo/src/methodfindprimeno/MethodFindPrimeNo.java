package methodfindprimeno;

import java.util.Scanner;

public class MethodFindPrimeNo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = s.nextInt();

        String result1 = findPrimeNumber(number);
        String result2 = findEvenOrOdd(number);
        String result3 = findFactorialNumber(number);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static String findPrimeNumber(int number) {

        String result = "";

        int count = 0;

        if (number <= 0) {
            result = (" Enter More Than Zero(0).");
        } else {

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result = (number + " is Prime Number.");
            } else {
                result = (number + " is not Prime Number.");
            }
        }
        return result;
    }

    public static String findEvenOrOdd(int number) {
        String result = "";

        if (number <= 0) {
            result = (" Enter More Than Zero(0).");
        } else {

            if (number % 2 == 0) {
                result = (number + " is Even Number.");
            } else {
                result = (number + " is Odd Number.");
            }
        }
        return result;
    }

    public static String findFactorialNumber(int input) {
        String result = "";

        int count = 1;
        long factorial = 1;

        if (input < 0) {
            result = (" Enter Positive Number.");
        } else {
            do {
                factorial *= count;
                count++;
            } while (count <= input);
            result = "Factorial of  " + input + " is  " + factorial;
        }

        return result;
    }
    
   public static String areaOfCircle(float inp){
   
     String result = "";
     
       
     return result;
   }

}
