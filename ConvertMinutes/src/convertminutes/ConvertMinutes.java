
package convertminutes;

import java.util.Scanner;


public class ConvertMinutes {

    
    public static void main(String[] args) {
      
        Scanner scanner= new Scanner(System.in);
                
        System.out.println("enter seconds ");
        int tseconds = scanner.nextInt();
        
        int hour =tseconds/3600;
        int remainingsec = tseconds%3600;
        
        int minuites= remainingsec/60;
        int seconds = remainingsec%60;
        
        System.out.println(tseconds + " hour:"+ hour+ " minute:"+minuites+ " seconds:"+seconds );
        
/*      2nd way
*        int tempSec= tseconds/60;
*        int minutes = tempSec%60;
*        int hour = tempSec/60;
*        System.out.println(tseconds+ " hour:"+ hour+ " minute:"+ minutes+ " seconds:" +seconds);
*/
    }
    
}
