interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId + " " + name + " " + calculateSalary() + " " + department);
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int hours;
    private double rate;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }
}
