package model;

public abstract class Vehicle {

    private String plate;
    private String model;
    private String year;

    public Vehicle(String plate, String model, String year){
        this.plate = plate;
        this.model = model;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }
    // public void setPlate(String plate) {
    //     this.plate = plate;
    // }
    public String getModel() {
        return model;
    }
    // public void setModel(String model) {
    //     this.model = model;
    // }
    public String getYear() {
        return year;
    }
    // public void setYear(String year) {
    //     this.year = year;
    // }
}
