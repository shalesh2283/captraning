package level2;

import java.util.Scanner;

public class Q10 {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        status = determineBMIStatus(data);
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight=" + data[i][0] +
                    " kg, Height=" + data[i][1] + " cm, BMI=" + String.format("%.2f", data[i][2]) +
                    ", Status=" + status[i]);
        }

    }
}
