
package testbubblesort;

import java.util.Arrays;
import java.util.Scanner;


public class TestBubbleSort {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Limit ");
        int size = s.nextInt();
        
        int[] myArr = new int[size];
        
        for (int index = 0; index < myArr.length; index++) {
            System.out.println("Enter Value "+(index+1));
            int inp = s.nextInt();
            myArr[index] = inp;
        }
        System.out.println("Before Bubble Sort "+ Arrays.toString(myArr));
        
        for (int i = 0; i < myArr.length-1; i++) {
            for (int j = 0; j < myArr.length-i-1; j++) {
                if (myArr[j] > myArr[j+1]) {
                    
                    int temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
                
            }
        }
        System.out.println("After Bubble Sort "+Arrays.toString(myArr));
    }
    
}
