
package testminmaxof5;

import java.util.Arrays;
import java.util.Scanner;


public class TestMinMaxOf5 {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Your Limit ");
        int size = s.nextInt();
        
        int[] myArr = new int[size];
        
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Enter Value For "+(i+1));
            int inp = s.nextInt();
            myArr[i] = inp;
        }
        System.out.println("Your Numbers: "+ Arrays.toString(myArr));
        
        int maxNum = myArr[0];
        int minNum = myArr[0];
        
        for (int num : myArr) {
            
            if (num > maxNum) {
                maxNum =num;
            }
            
            if (num < minNum) {
                minNum =num;
            }
        }
        System.out.println("Max Number is: "+maxNum);
        System.out.println("Min Number is: "+minNum);
    }
    
}
