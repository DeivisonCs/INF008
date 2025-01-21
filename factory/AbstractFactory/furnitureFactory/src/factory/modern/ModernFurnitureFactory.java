package factory.modern;

import factory.FurnitureFactory;
import model.sofa.ModernSofa;
import model.sofa.Sofa;
import model.table.ModernTable;
import model.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Sofa buySofa() {
        Sofa modernSofa = new ModernSofa();
        modernSofa.assemble();

        return modernSofa;
    }
    
    @Override
    public Table buyTable() {
        Table modernTable = new ModernTable();
        modernTable.assemble();
    
        return modernTable;
    }
    
}
