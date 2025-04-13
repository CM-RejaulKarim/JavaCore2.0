package learnsinglearray;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.print.DocFlavor;

public class LearnSingleArray {

    public static void main(String[] args) {

        String[] names = new String[4];
        int[] ages = {20, 21, 25, 26, 23, 80, 52, 42, 55};

        // System.out.println(Arrays.toString(names));
        names[0] = "Atiq";
        names[1] = "Sadiar";
        names[2] = "Yasin";
        names[3] = "Reja";


          System.out.println(Arrays.toString(names));
          System.out.println(Arrays.toString(ages));
        
        //  Task
        
        String[] sNames = new String[5];
        int[] sMarks ={55,65,75,85,95};
        
        sNames[0] = "Atiq";
        sNames[1] = "Sadiar";
        sNames[2] = "Yasin";
        sNames[3] = "Reja";
        sNames[4] = "Imran";
        
        
        for (int i = 0; i < sNames.length; i++) {
            System.out.println("Student's Name is \""+sNames[i]+"\" and Mark's is "+sMarks[i]);
            
        }
        
        
        
        
        
        
        
        
//        System.out.println("Student's Name is "+sNames[0]+" and Mark is "+sMarks[0]);
//        System.out.println("Student's Name is "+sNames[1]+" and Mark is "+sMarks[1]);
//        System.out.println("Student's Name is "+sNames[2]+" and Mark is "+sMarks[2]);
//        System.out.println("Student's Name is "+sNames[3]+" and Mark is "+sMarks[3]);
//        System.out.println("Student's Name is "+sNames[4]+" and Mark is "+sMarks[4]);

    }

}
