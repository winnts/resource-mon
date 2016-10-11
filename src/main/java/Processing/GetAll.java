package Processing;

import Entity.AllResources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetAll {
    public static List<AllResources> getAll(String processName) throws IOException {
        List<AllResources> allResources = new ArrayList<AllResources>();
        allResources.add(new AllResources(GetCPU.getCPU(processName), GetMem.getMem(processName),
                GetSystemCPU.getSystemCPU(), GetFreeSystemMem.getFreeSystemMem(), GetTotalSystemMem.getTotalSystemMem()));
        return allResources;
            }
}
