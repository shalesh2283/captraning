interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) {
        super(num, rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) {
        super(num, rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}
