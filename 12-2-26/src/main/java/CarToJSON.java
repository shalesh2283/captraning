import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

public class CarToJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Car car = new Car("Toyota", "Camry", 2022);
        String json = mapper.writeValueAsString(car);
        System.out.println(json);
    }
}
