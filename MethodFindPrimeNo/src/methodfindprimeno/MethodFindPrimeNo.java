package methodfindprimeno;

import java.util.Scanner;

public class MethodFindPrimeNo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = s.nextInt();

        String result0 = positiveNegativeZero(number);
        String result1 = findPrimeNumber(number);
        String result2 = findEvenOrOdd(number);
        String result3 = findFactorialNumber(number);
        String result4 = areaOfCircle(number);

        System.out.println("1._ "+result0);
        System.out.println("2._ "+result2);
        System.out.println("3._ "+result1);
        System.out.println("4._ "+result3);
        System.out.println("5._ "+result4);

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

    public static String areaOfCircle(float inp) {

        double result = Math.PI * Math.pow(inp, 2);

        String calculation = ("If "+inp +" is radius of circle then area is " + result);

        return calculation;
    }
    
    public static String positiveNegativeZero(int number){
    
        String result = "";
            
        if (number > 0) {
            result=(number + " is Positive number.");
        } else if (number < 0) {
            result=(number + " is Negative number.");
        } else {
            result=(number + " is Zero");
        }
        
        return result;
    }
}
