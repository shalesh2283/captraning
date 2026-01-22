import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            System.out.println(" Department: " + d.deptName);
            for (Employee e : d.employees) {
                System.out.println("  Employee: " + e.name);
            }
        }
    }
}

public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");

        Department it = new Department("IT");
        it.addEmployee("Amit");
        it.addEmployee("Neha");

        Department hr = new Department("HR");
        hr.addEmployee("Sonal");

        company.addDepartment(it);
        company.addDepartment(hr);

        company.displayCompanyDetails();
    }
}
