
package learnmultidimensionalarray;

import java.util.Arrays;


public class LearnMultiDimensionalArray {

   
    public static void main(String[] args) {
       
        int[][] myArray = new int[3][4];
        
        System.out.println(Arrays.deepToString(myArray)+"\n");
        System.out.println("-  -  -  -  -  -  -  -  -  - -  -  -  -  -  - -  -  -  -  -  -"+"\n");
        
        myArray[1][2] = 6;
        myArray[1][3] = 7;
        myArray[1][1] = 8;
        myArray[0][1] = 9;
        myArray[2][1] = 4;
        myArray[1][0] = 5;
        
        
        System.out.println(Arrays.deepToString(myArray)+"\n");
        
        for (int row = 0; row < myArray.length; row++) {
            
            for (int col = 0; col < myArray[row].length; col++) {
                
                System.out.print(myArray[row][col]+" ");
            }
            System.out.println("\n");
        }
        
    }
    
}
