package factory;

import model.gpu.AsusGpu;
import model.gpu.Gpu;
import model.monitor.AsusMonitor;
import model.monitor.Monitor;

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
