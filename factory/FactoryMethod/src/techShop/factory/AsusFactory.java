package techShop.factory;

import techShop.model.gpu.AsusGpu;
import techShop.model.gpu.Gpu;
import techShop.model.monitor.AsusMonitor;
import techShop.model.monitor.Monitor;

public class AsusFactory extends Shop{

    @Override
    protected Gpu getGpu() {
        return new AsusGpu();
    }

    @Override
    protected Monitor getMonitor() {
        return new AsusMonitor();
    }
    
}
