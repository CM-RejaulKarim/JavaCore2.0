package logicaltest;

import java.util.Arrays;
import java.util.Scanner;

public class LogicalTest {

    static Scanner s= new Scanner(System.in);
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter limit");
        int size = s.nextInt();
//        int[] numbers = new int[size];
//
////        int maxNum =0;
////        int minNum = 999999999;
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter number " + (i + 1));
//            int uInput = s.nextInt();
//            numbers[i] = uInput;
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        int maxNum = numbers[0];
//        int minNum = numbers[0];
//
//        for (int number : numbers) {
//
//            if (number > maxNum) {
//                maxNum = number;
//            }
//            if (number < minNum) {
//                minNum = number;
//            }
//        }
//        System.out.println("Max Number is " + maxNum);
//        System.out.println("Min Number is " + minNum);
        

    }
    
    
    public static int countMaxMin(int numbers){
        
        int result =0;
        
        
        
        return result;
        
    }
    
    
    public static void findMaxMinNumber(int size) {
        
        int[] numbers = new int[size];

//        int maxNum =0;
//        int minNum = 999999999;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1));
            int uInput = s.nextInt();
            numbers[i] = uInput;
        }
        System.out.println(Arrays.toString(numbers));

        int maxNum = numbers[0];
        int minNum = numbers[0];

        for (int number : numbers) {

            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.println("Max Number is " + maxNum);
        System.out.println("Min Number is " + minNum);
        
    }

}
