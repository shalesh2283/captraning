class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int s,String f){
        maxSpeed=s; fuelType=f;
    }
    void displayInfo(){
        System.out.println(maxSpeed+" "+fuelType);
    }
}

class Car extends Vehicle {
    int seats;
    Car(int s,String f,int se){
        super(s,f); seats=se;
    }
}

class Truck extends Vehicle {
    int load;
    Truck(int s,String f,int l){
        super(s,f); load=l;
    }
}

class Motorcycle extends Vehicle {
    boolean gear;
    Motorcycle(int s,String f,boolean g){
        super(s,f); gear=g;
    }
}

public class VehicleTransportDemo {
    public static void main(String[] args){
        Vehicle[] v={
                new Car(180,"Petrol",5),
                new Truck(120,"Diesel",1000),
                new Motorcycle(150,"Petrol",true)
        };
        for(Vehicle x:v) x.displayInfo();
    }
}
