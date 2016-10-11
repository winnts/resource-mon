package Resources;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetFreeSystemMem {
    public static String getFreeSystemMem () {
        com.sun.management.OperatingSystemMXBean system =
                (com.sun.management.OperatingSystemMXBean) ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        Long mem = system.getFreePhysicalMemorySize();
        return mem.toString();
    }
}
