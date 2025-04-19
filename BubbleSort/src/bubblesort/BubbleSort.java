
package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("Enter Limit");
        int size = s.nextInt();
        
        int[] myArray = new int[size];
        
        System.out.println(Arrays.toString(myArray));
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter Value "+(i+1));
            int userInp = s.nextInt();
            myArray[i] = userInp;
            
        }
        System.out.println("Before Sort: "+Arrays.toString(myArray)+"\n");
        
        for (int i = 0; i < myArray.length-1; i++) {
            
            for (int j = 0; j < myArray.length-i-1; j++) {
                
                if (myArray[j]>myArray[j+1]) {
                    
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp ;
                }
                
            }
            
        }
        System.out.println("After Sort: "+Arrays.toString(myArray));
        
        
        
    }
    
}
