import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.math.BigDecimal;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetSystemMem {
    public static String getSystemMem () {
        com.sun.management.OperatingSystemMXBean system =
                (com.sun.management.OperatingSystemMXBean) ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        Long mem = system.getFreePhysicalMemorySize();
        return mem.toString();
    }
}
