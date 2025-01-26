import decorator.ChocolateDecorator;
import decorator.MilkDecorator;
import decorator.SugarDecorator;
import model.Coffee;
import model.ExpressoCoffee;
import model.SimpleCoffee;

public class App {
    public static void main(String[] args) throws Exception {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());

        System.out.println(coffee.getDescription() + " | Cost: " + coffee.getCost());
        
        coffee = new SugarDecorator(coffee);
        
        System.out.println(coffee.getDescription() + " | Cost: " + coffee.getCost());
        
        Coffee coffee_w_chocolate = new ChocolateDecorator(new MilkDecorator(new ExpressoCoffee()));

        System.out.println(coffee_w_chocolate.getDescription() + " | Cost: " + coffee_w_chocolate.getCost());
    }
}
