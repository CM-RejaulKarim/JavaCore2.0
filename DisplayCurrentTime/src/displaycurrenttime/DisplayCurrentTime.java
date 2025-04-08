
package displaycurrenttime;


public class DisplayCurrentTime {

   
    public static void main(String[] args) {
        
        long time = System.currentTimeMillis();
        
        long tSecond = time/1000;
        
         long thour =tSecond/3600;
        long remainingsec = tSecond%3600;
        
        long minuites= remainingsec/60;
        long seconds = remainingsec%60;
        
        long hour= ((thour+6)%24)%12;
        
        System.out.println(hour+" hour, "+ minuites+" minutes, "+ seconds+" seconds");
        System.out.println("Expression null");
     
    }
    
}
