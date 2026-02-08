import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Amit", "IT", 50000));
        list.add(new Employee(2, "Ravi", "HR", 40000));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.out.println("Write error");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"))) {
            List<Employee> empList = (List<Employee>) ois.readObject();
            for (Employee e : empList) {
                System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Read error");
        }
    }
}
