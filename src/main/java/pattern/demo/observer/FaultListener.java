package pattern.demo.observer;

/**
 * Observer interface
 */
public interface FaultListener {
    void handleFault(int faultType, String faultMsg);
}