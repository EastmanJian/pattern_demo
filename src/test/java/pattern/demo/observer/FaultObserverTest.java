package pattern.demo.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FaultObserverTest {
    @Test
    public void testObserver() throws Exception {
        FaultMessageGenerator fmg = new FaultMessageGenerator();
        new FaultLogger(fmg);
        new FaultPager(fmg);
        fmg.faultOccurred(72,"Lost customer data: Peters, V.");
    }

}