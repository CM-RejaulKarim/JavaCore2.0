
package learnclassandobject;

import learnclassandobject.practiseclass.circle.Circle;
import learnclassandobject.sclass.StudentStatus;


public class LearnClassAndObject {

    
    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        
        c.setRadius(4);
        
         System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        
        
        StudentStatus re = new StudentStatus("Reja", 50);
        StudentStatus at = new StudentStatus("Atik", 30);
        StudentStatus im = new StudentStatus("Imran", 90);
        
        System.out.println("\n"+re.getResult());
        System.out.println(at.getResult());
        System.out.println(im.getResult());
       
    }
    
}
