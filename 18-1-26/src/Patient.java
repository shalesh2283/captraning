public class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println(totalPatients);
    }

    public void display(Object obj) {
        if (obj instanceof Patient) {
            System.out.println(name);
            System.out.println(age);
            System.out.println(ailment);
            System.out.println(patientID);
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient("Ravi", 30, "Fever", 301);
        p.display(p);
        getTotalPatients();
    }
}
