package Processing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetMem {
    public static String getMem(String process) throws IOException {
        List<String> processMem = new ArrayList<String>();
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec("ps -o rss -C " + process);
        BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(proc.getInputStream()));
        String s;
        while ((s = stdInput.readLine()) != null) {
            processMem.add(s);
        }
        if (processMem.size() < 2){processMem.add("-1");};
        return processMem.get(1);
    }
}