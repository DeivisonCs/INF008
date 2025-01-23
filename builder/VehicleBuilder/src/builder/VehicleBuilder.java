package builder;

import model.Vehicle;

public abstract class VehicleBuilder {
    private String plate;
    private String model;
    private String year;

    public VehicleBuilder plate(String plate){
        this.plate = plate;
        return this;
    }
    public VehicleBuilder model(String model){
        this.model = model;
        return this;
    }
    public VehicleBuilder year(String year){
        this.year = year;
        return this;
    }

    public abstract Vehicle build();
    
    public String getPlate() {
        return plate;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
}
