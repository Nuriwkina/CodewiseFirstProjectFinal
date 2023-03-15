package homeAssignmentNew;

public class Employee {
    private String name;
    private int employeeld;
    private double salary;

    public Employee(String name, int employeeld, double employeesSalary) {
        this.name = name;
        this.employeeld = employeeld;
        this.salary = employeesSalary;


    }

    public String getNAme() {
        return this.name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void annualSalary() {
double mouths = this.salary * 40 * 4;
double year = mouths * 12;
        System.out.println("Annual salary is: " + year);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kate", 345243651, 50);
        emp.annualSalary();
    }

}
