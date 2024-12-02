package restaurante.factory;

import restaurante.model.Burguer;
import restaurante.model.MeatBurguer;

public class MeatBurguerFactory extends Restaurante {

    @Override
    public Burguer makeBurguer() {
        return new MeatBurguer();
    }

}
