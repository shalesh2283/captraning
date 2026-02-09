import java.io.*;

public class WriteEmployeeCSV {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("employees.csv");
        fw.write("ID,Name,Department,Salary\n");
        fw.write("1,Amit,IT,60000\n");
        fw.write("2,Rahul,HR,45000\n");
        fw.write("3,Neha,Finance,55000\n");
        fw.write("4,Priya,IT,65000\n");
        fw.write("5,Suman,Admin,40000\n");
        fw.close();
    }
}
