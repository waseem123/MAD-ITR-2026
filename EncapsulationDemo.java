import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private int empSalary;
    private int empWorkingDays;

    public Employee() {
    }

    public Employee(int empId, String empName, int empSalary, int empWorkingDays) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.empWorkingDays = empWorkingDays;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpWorkingDays(int empWorkingDays) {
        this.empWorkingDays = empWorkingDays;
    }

    public int getEmpWorkingDays() {
        return this.empWorkingDays;
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpId(101);
        e1.setEmpName("Alice");
        e1.setEmpSalary(55000);
        e1.setEmpWorkingDays(20);

        System.out.println("EMPLOYEE ID           - " + e1.getEmpId());
        System.out.println("EMPLOYEE NAME         - " + e1.getEmpName());
        System.out.println("EMPLOYEE SALARY       - " + e1.getEmpSalary());
        System.out.println("EMPLOYEE WORKING DAYS - " + e1.getEmpWorkingDays());

        Employee e2 = new Employee();
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER EMPLOYEE ID - ");
        int id = s.nextInt();
        e2.setEmpId(id);
        System.out.println("ENTER EMPLOYEE NAME - ");
        e2.setEmpName(s.next());
        System.out.println("ENTER EMPLOYEE SALARY - ");
        e2.setEmpSalary(s.nextInt());
        System.out.println("ENTER EMPLOYEE WORKING DAYS - ");
        e2.setEmpWorkingDays(s.nextInt());

        System.out.println("EMPLOYEE ID           - " + e2.getEmpId());
        System.out.println("EMPLOYEE NAME         - " + e2.getEmpName());
        System.out.println("EMPLOYEE SALARY       - " + e2.getEmpSalary());
        System.out.println("EMPLOYEE WORKING DAYS - " + e2.getEmpWorkingDays());

        Employee e3 = new Employee(103, "Alex", 25000, 21);
        Employee e4 = new Employee(104, "Alexa", 28000, 29);
        Employee e5 = new Employee(105, "Gemini", 29000, 20);

        Employee[] emp = { e1, e2, e3, e4, e5 };
        for (int i = 0; i < emp.length; i++) {
            System.out.println("EMPLOYEE ID           - " + emp[i].getEmpId());
            System.out.println("EMPLOYEE NAME         - " + emp[i].getEmpName());
            System.out.println("EMPLOYEE SALARY       - " + emp[i].getEmpSalary());
            System.out.println("EMPLOYEE WORKING DAYS - " + emp[i].getEmpWorkingDays());
            System.out.println("___________________________________________");
        }

        System.out.println("OUTPUT USING FOR-EACH LOOP");
        for(Employee e:emp){
            System.out.println(e.getEmpId());
            System.out.println(e.getEmpName());
            System.out.println(e.getEmpSalary());
            System.out.println(e.getEmpWorkingDays());
        }
    }
}