
package learnclassandobject;

import learnclassandobject.lclass.Student;
import learnclassandobject.practiseclass.circle.Circle;
import learnclassandobject.sclass.StudentStatus;


public class LearnClassAndObject {

    
    public static void main(String[] args) {
        
        Student reja = new Student(1287759, "Rejaul", "Shankar", "cmrejaulkarim@gmail.com", "01768196876", 1, 1);
        Student atik = new Student();
        Student rejaul = new Student();
        
        atik.aboutStu(45628, "atik");
        rejaul.stuSummery(5646, "reja64", "567");
        
        
        
        
        System.out.println(reja);
        System.out.println(rejaul);
        System.out.println(atik);
//        Circle c = new Circle(5);
//        
//        System.out.println(c.getArea());
//        System.out.println(c.getPerimeter());
//        
//        c.setRadius(4);
//        
//         System.out.println(c.getArea());
//        System.out.println(c.getPerimeter());
//        
//        
//        StudentStatus re = new StudentStatus("Reja", 50);
//        StudentStatus at = new StudentStatus("Atik", 30);
//        StudentStatus im = new StudentStatus("Imran", 90);
//        
//        System.out.println("\n"+re.getResult());
//        System.out.println(at.getResult());
//        System.out.println(im.getResult());
       
    }
    
}
