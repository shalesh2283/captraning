public class Vehicle {
    static double registrationFee = 500;

    String ownerName;
    String vehicleType;
    final int registrationNumber;

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void display(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println(ownerName);
            System.out.println(vehicleType);
            System.out.println(registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Suresh", "Car", 9001);
        updateRegistrationFee(700);
        v.display(v);
    }
}
