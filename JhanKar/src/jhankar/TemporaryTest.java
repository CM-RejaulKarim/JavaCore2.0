package jhankar;

import java.util.Scanner;

public class TemporaryTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a date");
        int day = s.nextInt();

        System.out.println("Enter Month");
        int mon = s.nextInt();

        System.out.println("Enter Year");
        int year = s.nextInt();

        String result = dayMonYear(day, mon, year);

        System.out.println(result);

    }

    public static String dayMonYear(int day, int mon, int year) {

        String dayAft = "";
        String monAft = "";
        String yearAft = "";
        String result = dayAft + monAft + yearAft;

        if (day > 31) {
            dayAft = "Invalid Date.";
        } else {
            dayAft = day + "";
        }

        switch (mon) {
            case 1:
                monAft = "January";

                break;
            case 2:
                monAft = "February";

                break;
            case 3:
                monAft = "March";

                break;
            case 4:
                monAft = "April";

                break;
            case 5:
                monAft = "May";

                break;
            case 6:
                monAft = "June";

                break;
            case 7:
                monAft = "July";

                break;
            case 8:
                monAft = "August";

                break;
            case 9:
                monAft = "September";

                break;
            case 10:
                monAft = "October";

                break;
            case 11:
                monAft = "November";

                break;
            case 12:
                monAft = "December";

                break;
            default:
                monAft = "Invalid";
        }

//        if (year < 2025) {
//            yearAft = "you are going to future";
//        } else {
//            yearAft = year + "";
//        }

        return result;
    }

    public static long doContinue(int input) {
        int count = 1;

        while (count < input) {
            if (count >= input) {
                count++;
                break;
            } else {
                System.out.println(count);
                count++;
            }
        }
        return count;
    }

}
