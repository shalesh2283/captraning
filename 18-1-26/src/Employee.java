public class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println(totalEmployees);
    }

    public void display(Object obj) {
        if (obj instanceof Employee) {
            System.out.println(name);
            System.out.println(id);
            System.out.println(designation);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 1, "Developer");
        e.display(e);
        displayTotalEmployees();
    }
}
