import model.Car;
import model.Vehicle;
import prototype.PrototypeRegistry;

public class App {

    public void run1(){
        Car buggati = new Car();
        buggati.setBrand("Buggati");
        buggati.setColor("Blue");
        buggati.setModel("Chiron");
        buggati.setTopSpeed(261);

        Car buggatiClone = buggati.getClone();

        System.out.println("Original: " + buggati.getColor());
        System.out.println("Clone: " + buggatiClone.getColor());
        
        buggatiClone.setColor("Dark Red");

        System.out.println("Original: " + buggati.getColor());
        System.out.println("Clone: " + buggatiClone.getColor());
    }

    public void run2(){
        PrototypeRegistry vehicleRegistry = new PrototypeRegistry();
        Vehicle mercedes = vehicleRegistry.getVehicle("Mercedes");
        Vehicle buggati = vehicleRegistry.getVehicle("Buggati");

        mercedes.start();
        buggati.start();
    }

    public void run3(){
        PrototypeRegistry vehicleRegistry = new PrototypeRegistry();

        Car gtr = new Car();
        gtr.setBrand("Nissan");
        gtr.setModel("R34");
        gtr.setColor("Grey");
        gtr.setTopSpeed(161);

        vehicleRegistry.addVehicle("R34", gtr);

        Vehicle r34 = vehicleRegistry.getVehicle("R34");
        Vehicle r34Tunned = (Car) r34.getClone();

        System.out.println("Original: " + ((Car) r34).getTopSpeed());
        System.out.println("Tunned: " + ((Car) r34Tunned).getTopSpeed());

        ((Car) r34Tunned).setTopSpeed(251);

        System.out.println("Original: " + ((Car) r34).getTopSpeed());
        System.out.println("Tunned: " + ((Car) r34Tunned).getTopSpeed());

    }
    public static void main(String[] args) throws Exception {
        (new App()).run3();
    }
}
