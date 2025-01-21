package factory;

import model.sofa.Sofa;
import model.table.Table;

public interface FurnitureFactory {

    public Sofa buySofa();
    public Table buyTable();
}
