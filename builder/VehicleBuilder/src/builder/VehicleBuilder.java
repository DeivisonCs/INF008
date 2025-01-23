package builder;

import model.Vehicle;

public interface VehicleBuilder {
    public VehicleBuilder plate(String plate);
    public VehicleBuilder model(String model);
    public VehicleBuilder year(String year);
    public Vehicle build();
}
