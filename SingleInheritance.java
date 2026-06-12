class Person {
    String name;
    String city;

    public void setPerson(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void getPerson() {
        System.out.println("NAME - " + name);
        System.out.println("CITY - " + city);
    }
}

class Student extends Person {
    int rollNo;
    String std;

    public void setStudent(int rollNo, String std) {
        this.rollNo = rollNo;
        this.std = std;
    }

    public void getStudent() {
        System.out.println("ROLL NO - "+rollNo);
        System.out.println("STD - "+std);
        
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.setPerson("Sam", "Mumbai");
        s.setStudent(101,"5th");
        s.getPerson();
        s.getStudent();

    }
}