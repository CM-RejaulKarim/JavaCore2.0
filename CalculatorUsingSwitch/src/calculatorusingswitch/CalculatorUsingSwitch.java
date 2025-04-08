package calculatorusingswitch;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        double n1 = s.nextDouble();

        System.out.println("Enter 2nd Number: ");
        double n2 = s.nextDouble();

        System.out.println("Enter Your choice like as + - * / ");
        String choice = s.next();

        double result = 0;

        switch (choice) {
            case "+":
                result = n1 + n2;

                break;
            case "-":
                result = n1 - n2;

                break;
            case "*":
                result = n1 * n2;

                break;
            case "/":
                result = n1 / n2;

                break;
            default:
                System.out.println("Not a Valid choich");
                ;
        }

        System.out.println("result is" + result);

    }

}
