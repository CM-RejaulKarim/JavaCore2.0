package inputvalin2darray;

import java.util.Arrays;
import java.util.Scanner;

public class InputValIn2DArray {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Rows");
        int uRow = s.nextInt();

        System.out.println("Enter Columns");
        int uCol = s.nextInt();

        int[][] myArray = new int[uRow][uCol];

        for (int row = 0; row < myArray.length; row++) {

            for (int col = 0; col < myArray[row].length; col++) {

                System.out.println("Enter Value for ");
                myArray[row][col] = s.nextInt();

            }

        }
//        10 50 30
//        11 40 60
//        12 33 22

        for (int row = 0; row < myArray.length; row++) {

            for (int col = 0; col < myArray[row].length; col++) {

                System.out.print(myArray[row][col] + "\t");

            }
            System.out.println("\n");
        }
sum2dArray(myArray);
//        System.out.println(Arrays.deepToString(myArray));
    }

    public static int sum2dArray(int myArray[][]) {

        int result = 0;

        for (int row = 0; row < myArray.length; row++) {

            for (int col = 0; col < myArray[row].length; col++) {
                result += myArray[row][col];

            }

        }
        return result;

    }

}
