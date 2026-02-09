import java.io.*;
import java.util.*;

public class SearchEmployeeCSV {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String search = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[1].equalsIgnoreCase(search)) {
                System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
            }
        }
        br.close();
    }
}
