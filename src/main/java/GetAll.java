import java.io.IOException;
import java.util.Timer;

/**
 * Created by Andrey.Dyachenko on 17.09.16.
 */
public class GetAll {
    public static void main(String[] args) {
        try {
            for(int i = 0; i< 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }
                System.out.println(GetCPU.getCPU("firefox") + " " + GetMem.getMem("firefox") + " " + GetSystemCPU
                        .getSystemCPU() + "  " + GetSystemMem.getSystemMem());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
