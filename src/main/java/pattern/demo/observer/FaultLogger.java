package pattern.demo.observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logging observer
 */
public class FaultLogger implements FaultListener{
    private static Logger logger = Logger.getLogger("");
    public FaultLogger(FaultMessageGenerator fmg) {  //FaultMessageGenerator can be decoupled from FaultLogger
        fmg.addFaultListener(this);
    }
    public void handleFault(int faultType, String faultMsg) {
        logger.log(Level.WARNING, "A " + faultType + " occurred: " + faultMsg);
    }
}