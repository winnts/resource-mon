package Resources;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetTotalSystemMem {
    public static String getTotalSystemMem () {
        com.sun.management.OperatingSystemMXBean system =
                (com.sun.management.OperatingSystemMXBean) ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        Long mem = system.getTotalPhysicalMemorySize();
        return mem.toString();
    }
}
