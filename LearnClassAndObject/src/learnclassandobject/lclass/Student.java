package learnclassandobject.lclass;

public class Student {

    private int id;
    private String name;
    private String address;
    private String email;
    private String contact;
    private int lateCount;
    private int absentCount;

    public Student() {
    }

    public Student(int id, String name, String address, String email, String contact, int late, int absent) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.lateCount = late;
        this.absentCount = absent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 6 && name.length() <= 20) {
            this.name = name;
        } else {
            System.out.println("Name must be 6 to 20 Character");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getLate() {
        return lateCount;
    }

    public void setLate(int late) {
        this.lateCount = late;
    }

    public int getAbsent() {
        return absentCount;
    }

    public void setAbsent(int absent) {
        this.absentCount = absent;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", contact=" + contact + ", late=" + lateCount + ", absent=" + absentCount + '}';
    }


    public void stuSummery(int id, String name, String contact){
        
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

}
