package singlearrayusingscanner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SingleArrayUsingScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Limit");
        int l = s.nextInt();

        String[] myName = new String[l];
        int[] marks = new int[l];

        //int uInput=0;
        for (int i = 0; i < myName.length; i++) {
            System.out.println("Enter a Name");
            String uName = s.next();
            myName[i] = uName;

            System.out.println("Enter a Mark");
            int uMark = s.nextInt();
            marks[i] = uMark;

        }
        for (int i = 0; i < myName.length; i++) {
            System.out.println("Student's Name is \"" + myName[i] + "\" and Mark is " + marks[i]);
            //System.out.println(myName[i]+marks[i]);
        }
        System.out.println(Arrays.toString(myName));
        System.out.println(Arrays.toString(marks));
    }

}
