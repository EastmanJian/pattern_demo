package pattern.demo.observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Paging observer
 */
public class FaultPager implements FaultListener {
    private static Logger logger = Logger.getLogger("");

    public FaultPager(FaultMessageGenerator fmg) {
        fmg.addFaultListener(this);
    }

    public void handleFault(int faultType, String faultMsg) {
        System.out.println("Paging user: [" + Level.WARNING + "] A " + faultType + " occurred: " + faultMsg);
    }
}