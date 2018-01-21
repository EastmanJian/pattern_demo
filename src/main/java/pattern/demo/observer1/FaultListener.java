package pattern.demo.observer1;

/**
 * Observer interface
 */
public interface FaultListener {
    void handleFault(int faultType, String faultMsg);
}