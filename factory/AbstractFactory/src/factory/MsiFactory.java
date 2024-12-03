package factory;

import model.gpu.Gpu;
import model.gpu.MsiGpu;
import model.monitor.Monitor;
import model.monitor.MsiMonitor;

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
