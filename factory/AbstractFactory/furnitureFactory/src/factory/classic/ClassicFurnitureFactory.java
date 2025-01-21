package factory.classic;

import factory.FurnitureFactory;
import model.sofa.ClassicSofa;
import model.sofa.Sofa;
import model.table.ClassicTable;
import model.table.Table;

public class ClassicFurnitureFactory implements FurnitureFactory{

    @Override
    public Sofa buySofa() {
        Sofa classicSofa = new ClassicSofa();
        classicSofa.assemble();

        return classicSofa;
    }
    
    @Override
    public Table buyTable() {
        Table classicTable = new ClassicTable();
        classicTable.assemble();
    
        return classicTable;
    }
}
