package model;

public class Vehicle {

    private String plate;
    private String model;
    private String year;

    protected Vehicle(String plate, String model, String year){
        this.plate = plate;
        this.model = model;
        this.year = year;
    }

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
