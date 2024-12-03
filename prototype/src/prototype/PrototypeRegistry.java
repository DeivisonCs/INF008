package prototype;

import java.util.HashMap;
import java.util.Map;

import model.Bus;
import model.Car;
import model.Vehicle;

public class PrototypeRegistry {
    private Map<String, Vehicle> vehicleOptions = new HashMap<>();

    public PrototypeRegistry(){
        Car car = new Car();

        car.setBrand("Buggati");
        car.setColor("Blue");
        car.setModel("Chiron");
        car.setTopSpeed(261);
        
        Bus bus = new Bus();
        
        bus.setBrand("Mercedes");
        bus.setColor("White");
        bus.setModel("Setra");
        bus.setDoors(2);

        this.vehicleOptions.put("Buggati", car);
        this.vehicleOptions.put("Mercedes", bus);
    }

    public void addVehicle(String name, Vehicle vehicle){
        this.vehicleOptions.put(name, vehicle);
    }

    public Vehicle getVehicle(String vehicle){
        return this.vehicleOptions.get(vehicle);
    }
}
