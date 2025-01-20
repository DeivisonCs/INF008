package restaurante.factory;

import restaurante.model.Burguer;

public abstract class Restaurante {
    public Burguer orderBurguer(){
        Burguer burguer = makeBurguer();
        burguer.prepare();

        return burguer;
    }

    protected abstract Burguer makeBurguer();
}
