package restaurante.factory;

import restaurante.model.Burguer;
import restaurante.model.ChickenBurguer;

public class ChickenBurguerFactory extends Restaurante{

    @Override
    public Burguer makeBurguer() {
        return new ChickenBurguer();
    }

}
