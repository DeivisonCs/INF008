package techShop.factory;

import techShop.model.gpu.Gpu;
import techShop.model.monitor.Monitor;

public abstract class Shop {

    // public Gpu orderProduct(){
    //     Gpu gpu = getProduct();
    //     gpu.assemble();
    //     return gpu;
    // }

    // protected abstract Gpu getGpu();
    // protected abstract Monitor getMonitor();

    public Gpu orderGpu(){
        Gpu gpu = getGpu();
        gpu.assemble();
        return gpu;
    }
    
    public Monitor orderMonitor(){
        Monitor monitor = getMonitor();
        monitor.assemble();
        return monitor;
    }

    protected abstract Gpu getGpu();
    protected abstract Monitor getMonitor();
}
