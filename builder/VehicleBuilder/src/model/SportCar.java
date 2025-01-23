package model;

public class SportCar extends Vehicle{

    private Float topSpeed;

    public SportCar(String plate, String model, String year, Float topSpeed){
        super(plate, model, year);
        this.topSpeed = topSpeed;
    }

    public Float getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar: "
            + "\n\tModel: " + getModel()
            + "\n\tPlate: " + getPlate()
            + "\n\tTopSpeed: " + getTopSpeed()
            + "\n\tYear: " + getYear();
    }
}
