package builder;

import model.SportCar;
import model.Vehicle;

public class SportCarBuilder implements VehicleBuilder{
    private String plate;
    private String model;
    private String year;
    private Float topSpeed;

    public SportCarBuilder topSpeed(Float topSpeed){
        this.topSpeed = topSpeed;
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
        return new SportCar(this.plate, this.model, this.year, this.topSpeed);
    }
}
