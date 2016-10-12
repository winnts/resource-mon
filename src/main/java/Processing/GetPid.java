package Processing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Andrey.Dyachenko on 12.10.16.
 */
public class GetPid {
    public static String getPid (String process) throws IOException{
        Runtime rt = Runtime.getRuntime();
        String[] cmd = {"/bin/bash", "-c", "pidof '"+process+"'"};
        Process procPid = rt.exec(cmd);
        BufferedReader stdInputPid = new BufferedReader(new
                InputStreamReader(procPid.getInputStream()));
        String sPid;
        sPid = stdInputPid.readLine();
        if (sPid == null) {sPid = "55555555";}
        return sPid;
    }
}
