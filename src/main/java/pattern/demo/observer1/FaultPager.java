package pattern.demo.observer1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FaultPager implements FaultListener {
    private static Logger logger = Logger.getLogger("");
    public void handleFault(int faultType, String faultMsg) {
        System.out.println("Paging user: [" + Level.WARNING + "] A " + faultType + " occurred: " + faultMsg);
    }
}