package practisemaxminusingarray;

import java.util.Arrays;
import java.util.Scanner;

public class PractiseMaxMinUsingArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter limit ");
        int size = s.nextInt();

        int[] myArrays = new int[size];

        for (int i = 0; i < myArrays.length; i++) {
            System.out.println("Enter " + (i + 1)+counter(i)+" Value");
            int uInp = s.nextInt();
            myArrays[i] = uInp;

        }
        System.out.println("Total Numbers Are: " + Arrays.toString(myArrays));

        int maxVal = myArrays[0];
        int minVal = myArrays[0];

        for (int number : myArrays) {
            if (number > maxVal) {
                maxVal = number;
            }

            if (number < minVal) {
                minVal = number;
            }

        }
        System.out.println("Max Value is: "+maxVal);
        System.out.println("Min Value is: "+minVal);
    }
    
    
    public static String counter(int index){
        
      String  reslt = "";
        switch (index+1) {
            case 1:
                reslt = "st";
                break;
            case 2:
                reslt = "nd";
                break;
            case 3:
                reslt = "rd";
                break;
            default:
                reslt = "th";
        }
        return reslt;
    }

}
