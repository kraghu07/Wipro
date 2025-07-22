package Day3;

class Employee {
    private String name;
    private double salary;

    // Getter and Setter
    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Narayana");
        emp.setSalary(7000000);
        emp.display();
    }
}
