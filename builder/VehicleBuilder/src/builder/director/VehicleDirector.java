package builder.director;

import builder.SportCarBuilder;
import builder.TruckBuilder;
import builder.VehicleBuilder;

public class VehicleDirector {
    public void makeGtr35(VehicleBuilder builder){
        ((SportCarBuilder)
                builder
                .plate("1")
                .model("GTR-R35")
                .year("2015"))
                .topSpeed((float)299.00);
    }

    public void makeVolvo270(VehicleBuilder builder){
        ((TruckBuilder) 
                builder
                .plate("AAA1B23")
                .model("Volvo VM 270")
                .year("2018"))
                .axle(6);
    }
}
