import builder.SportCarBuilder;
import builder.TruckBuilder;
import builder.VehicleBuilder;
import builder.director.VehicleDirector;
import model.Vehicle;

public class App {
    public void withoutDirector(){
        VehicleBuilder carBuilder = new SportCarBuilder();
        VehicleBuilder truckBuilder = new TruckBuilder();

        Vehicle gtr = ((SportCarBuilder)carBuilder
                        .plate("1")
                        .model("GTR-R35")
                        .year("2015"))
                        .topSpeed((float)299.00)
                        .build();

        Vehicle vm270 = ((TruckBuilder) truckBuilder
                        .plate("AAA1B23")
                        .model("Volvo VM 270")
                        .year("2018"))
                        .axle(6)
                        .build();
        
        System.out.println(gtr.toString());
        System.out.println(vm270.toString());
    }

    public void withDirector(){
        VehicleDirector director = new VehicleDirector();
        VehicleBuilder carBuilder = new SportCarBuilder();
        VehicleBuilder truckBuilder = new TruckBuilder();

        director.makeGtr35(carBuilder);
        director.makeVolvo270(truckBuilder);

        Vehicle gtr = carBuilder.build();
        Vehicle vm270 = truckBuilder.build();

        System.out.println(gtr.toString());
        System.out.println(vm270.toString());
    }

    public static void main(String[] args) throws Exception {
        (new App()).withDirector();
    }
}
