import java.util.Scanner;

class Student {
    int rollNo;
    String studName;
    int marks;

    public void setData() {
        Scanner s = new Scanner(System.in);
        rollNo = s.nextInt();
        studName = s.next();
        marks = s.nextInt();
    }

    public void getData() {
        System.out.println("ROLL NO - " + rollNo);
        System.out.println("NAME    - " + studName);
        System.out.println("MARKS   - " + marks);
    }
}

class ClassesAndObject {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s2;
        s1.setData();
        s2.setData();
        s3.setData();
        System.out.println("------------------");
        s1.getData();
        System.out.println("------------------");
        s2.getData();
        s3.getData();
    }
}