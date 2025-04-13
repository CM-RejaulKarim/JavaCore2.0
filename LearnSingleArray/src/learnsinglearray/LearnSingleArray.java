
package learnsinglearray;

import java.lang.reflect.Array;
import java.util.Arrays;


public class LearnSingleArray {

    
    public static void main(String[] args) {
       
      String[] names = new String[4];
      int[] ages = {20,21,25,26,23,80,52,42,55};
      
        System.out.println(Arrays.toString(names));
        
        names[0]= "Atiq";
        names[1]= "Sadiar";
        names[2]= "Yasin";
        names[3]= "Reja";
//        names[4]= "new";
        
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ages));
       
    }
    
}
