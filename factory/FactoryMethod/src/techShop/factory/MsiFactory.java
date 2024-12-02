package techShop.factory;

import techShop.model.gpu.Gpu;
import techShop.model.gpu.MsiGpu;
import techShop.model.monitor.Monitor;
import techShop.model.monitor.MsiMonitor;

public class MsiFactory extends Shop{

    @Override
    protected Gpu getGpu() {
        return new MsiGpu();
    }

    @Override
    protected Monitor getMonitor() {
        return new MsiMonitor();
    }

}
