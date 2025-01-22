package model;

public class Car extends Vehicle{
    private Integer topSpeed;

    public Car() {}

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public void start() {
        System.out.println("Startin " + this.getModel());
    }

    @Override
    public Car getClone() {
       return new Car(this);
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }
    
}
