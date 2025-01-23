package model;

public class Truck extends Vehicle{
    private Integer axle;

    public Truck(String plate, String model, String year, Integer axle) {
        super(plate, model, year);
        this.axle = axle;
    }

    public Integer getAxle() {
        return axle;
    }
    
    @Override
    public String toString() {
        return "Truck: "
            + "\n\tModel: " + getModel()
            + "\n\tPlate: " + getPlate()
            + "\n\tAxle: " + getAxle()
            + "\n\tYear: " + getYear();
    }

}
