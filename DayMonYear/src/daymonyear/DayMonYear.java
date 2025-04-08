
package daymonyear;

import java.util.Scanner;


public class DayMonYear {

    
    public static void main(String[] args) {
         
         Scanner s = new Scanner(System.in);

        System.err.println("Enter a Year ");
        int year = s.nextInt();
        
        System.err.println("Enter a month ");
        int month =s.nextInt();
        
        System.err.println("Enter Date ");
        String date = s.next();
        
        String mon= "";
        
        switch (month) {
            case 1:
                mon = "JAN";
                break;
            case 2:
                mon = "FEB";
                break;
            case 3:
                mon = "MAR";
                break;
            case 4:
                mon = "APR";
                break;
            case 5:
                mon = "MAY";
                break;
            case 6:
                mon = "JUN";
                break;
            case 7:
                mon = "JUL";
                break;
            case 8:
                mon = "AUG";
                break;
            case 9:
                mon = "SEP";
                break;
            case 10:
                mon = "OCT";
                break;
            case 11:
                mon = "NOV";
                break;
            case 12:
                mon = "DEC";
                break;
            default:
                System.out.println("Not a Month");
        }
        //2nd switch
        
        
        
        
        
        
        System.out.println("Output: "+mon +" "+ date+", "+year);
        
        
    //    System.out.println(message.concat(" Programmer"));
      
        //      System.out.println("sub string "+message.substring(2));
    }
    
}
