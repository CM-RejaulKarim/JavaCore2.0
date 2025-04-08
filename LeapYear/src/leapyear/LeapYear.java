package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Year ");
        int year = s.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is Leap Year");
                } else {
                    System.err.println(year + " is not Leap Year");
                }
            } else {
                System.out.println(year + " is Leap Year");
            }
        } else {
            System.err.println(year + " is not Leap Year");
        }
    }

}
