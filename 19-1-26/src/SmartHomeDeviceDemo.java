class Device {
    int deviceId;
    boolean status;
    Device(int i,boolean s){
        deviceId=i; status=s;
    }
}

class Thermostat extends Device {
    int temperature;
    Thermostat(int i,boolean s,int t){
        super(i,s); temperature=t;
    }
    void displayStatus(){
        System.out.println(deviceId+" "+status+" "+temperature);
    }
}

public class SmartHomeDeviceDemo {
    public static void main(String[] args){
        Thermostat t=new Thermostat(101,true,25);
        t.displayStatus();
    }
}
