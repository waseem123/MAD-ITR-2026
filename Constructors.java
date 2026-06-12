/**
 * 1. Constructor name is same as the class name
 * 2. Constructor has no return datatype
 * 3. Its always defined in public scope
 * 4. It automatically gets called when object is created.
 * 5. Constructors cannot be inherited
 */

class Employee {
    String empName;
    int empSalary;

    public Employee() {
        System.out.println("CONSTRUCTOR CALLED");
        empName = "Aman";
        empSalary = 25000;
    }

    public Employee(String empName, int empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public void getEmployee() {
        System.out.printf("EMPLOYEE NAME   - %s\n", empName);
        System.out.printf("EMPLOYEE SALARY - %d\n", empSalary);
    }

    public Employee(Employee e){
        empName = e.empName;
        empSalary = e.empSalary;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getEmployee();

        Employee e2 = new Employee("Roger", 30000);
        e2.getEmployee();

        Employee e3 = new Employee("Sam",60000);
        e3.getEmployee();

        Employee e4 = new Employee(e1);
        e4.getEmployee();
    }
}
