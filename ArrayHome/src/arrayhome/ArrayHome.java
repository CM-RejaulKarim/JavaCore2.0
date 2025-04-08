package arrayhome;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayHome {
    
    public static void main(String[] args) {
        
        int[] nums = new int[9];
        
        nums[1] = 10;
        nums[2] = 190;
        nums[3] = 130;
        nums[4] = 180;
        nums[5] = 150;
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

//        2nd way
        int[] numbers = {19, 28, 37, 46, 55};
        
        System.out.println("declare Array "+Arrays.toString(numbers));
        
//        multi Dimensional Array

        int[][] number = {{19, 28},{ 37, 46, 55}};
        
        System.out.println("multi Dimensional Array "+Arrays.deepToString(number));
        
    }
    
}
