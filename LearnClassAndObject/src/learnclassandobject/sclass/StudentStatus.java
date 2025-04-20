
package learnclassandobject.sclass;


public class StudentStatus {
    
    String name;
    String email;
    double marks;

    public StudentStatus() {
    }

    public StudentStatus(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public StudentStatus(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getResult(){
    
        if (marks >=33) {
            return name+" Pass "+marks;
        }
        else{
        return name+" Fail "+marks;
        }
    }
    public double getMarks(){
    return marks;
    }
    public void setMarks(double marks){
    this.marks = marks;
    }
    
}
