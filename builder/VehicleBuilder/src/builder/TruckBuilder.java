package builder;

import model.Truck;
import model.Vehicle;

public class TruckBuilder implements VehicleBuilder{
    private String plate;
    private String model;
    private String year;
    private Integer axle;

    public VehicleBuilder axle(Integer axle) {
        this.axle = axle;
        return this;
    }

    @Override
    public VehicleBuilder plate(String plate) {
        this.plate = plate;
        return this;
    }

    @Override
    public VehicleBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public VehicleBuilder year(String year) {
        this.year = year;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Truck(this.plate, this.model, this.year, this.axle);
    }

}
