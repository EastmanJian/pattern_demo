package pattern.demo.observer1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FaultObserver1Test {
    @Test
    public void testObserver1() throws Exception {
        FaultMessageGenerator fmg = new FaultMessageGenerator();
        fmg.addFaultListener(new FaultLogger());
        fmg.addFaultListener(new FaultPager());
        fmg.faultOccurred(72,"Lost customer data: Peters, V.");
    }

}