package pattern.demo.observer;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * The subject (observable) class
 */
public class FaultMessageGenerator {
    private ArrayList listeners = new ArrayList();

    public void addFaultListener(FaultListener listener) {
        listeners.add(listener);
    }

    public void faultOccurred(int faultType, String faultMsg) {
        Iterator listenersI = listeners.iterator();
        while (listenersI.hasNext()) {
            FaultListener fl = (FaultListener) listenersI.next();
            fl.handleFault(faultType, faultMsg);
        }
    }

    public void removeFaultListener(FaultListener listener) {
        listeners.remove(listener);
    }
}