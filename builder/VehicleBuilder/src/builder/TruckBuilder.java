package builder;

import model.Truck;

public class TruckBuilder extends VehicleBuilder{
    private Integer axle;

    public TruckBuilder axle(Integer axle) {
        this.axle = axle;
        return this;
    }

    @Override
    public Truck build() {
        return new Truck(this.getPlate(), this.getModel(), this.getYear(), this.axle);
    }

}
