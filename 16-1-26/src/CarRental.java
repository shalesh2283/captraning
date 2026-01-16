public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    public double calculateCost() {
        return rentalDays * 1000;
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Amit", "Swift", 3);
        System.out.println(c.calculateCost());
    }
}
