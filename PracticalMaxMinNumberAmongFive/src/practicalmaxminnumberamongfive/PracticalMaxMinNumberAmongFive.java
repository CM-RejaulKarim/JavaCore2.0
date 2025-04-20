package practicalmaxminnumberamongfive;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalMaxMinNumberAmongFive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size");
        int size = s.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Enter Value " + (i + 1));
            int uInp = s.nextInt();
            myArray[i] = uInp;

        }
        System.out.println("All Numbers " + Arrays.toString(myArray));

        int maxVal = myArray[0];
        int minVal = myArray[0];

        for (int i : myArray) {
            if (i > maxVal) {
                maxVal = i;
            }
            if (i < minVal) {
                minVal = i;
            }

        }
        System.out.println("Max Number is " + maxVal);
        System.out.println("Min Number is " + minVal);

    }

}
