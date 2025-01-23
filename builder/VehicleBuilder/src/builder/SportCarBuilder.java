package builder;

import model.SportCar;

public class SportCarBuilder extends VehicleBuilder{
    
    private Float topSpeed;

    public SportCarBuilder topSpeed(Float topSpeed){
        this.topSpeed = topSpeed;
        return this;
    }

    @Override
    public SportCar build() {
        return new SportCar(this.getPlate(), this.getModel(), this.getYear(), this.topSpeed);
    }
}
