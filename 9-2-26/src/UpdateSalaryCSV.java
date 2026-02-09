import java.io.*;

public class UpdateSalaryCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        FileWriter fw = new FileWriter("updated_employees.csv");

        String line = br.readLine();
        fw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[2].equalsIgnoreCase("IT")) {
                double salary = Double.parseDouble(data[3]);
                salary = salary * 1.10;
                data[3] = String.valueOf((int) salary);
            }
            fw.write(String.join(",", data) + "\n");
        }

        br.close();
        fw.close();
    }
}
