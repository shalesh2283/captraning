import java.io.*;
import java.util.*;

public class SortEmployeeBySalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        List<String[]> list = new ArrayList<>();
        String line = br.readLine();

        while ((line = br.readLine()) != null) {
            list.add(line.split(","));
        }
        br.close();

        list.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(String.join(",", list.get(i)));
        }
    }
}
