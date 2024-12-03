package model;

public class Bus extends Vehicle{
    private Integer doors;

    public Bus() {}

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public void start() {
        System.out.println("Startin " + this.getModel());
    }

    @Override
    public Bus getClone() {
       return new Bus(this);
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    
}
