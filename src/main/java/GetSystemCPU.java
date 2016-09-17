import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.math.BigDecimal;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetSystemCPU {
    public static String getSystemCPU () {
        com.sun.management.OperatingSystemMXBean system =
                (com.sun.management.OperatingSystemMXBean) ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        Double cpu = system.getSystemCpuLoad()*100;
        Double truncatedCPU = new BigDecimal(cpu)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
        return truncatedCPU.toString();
    }
}
