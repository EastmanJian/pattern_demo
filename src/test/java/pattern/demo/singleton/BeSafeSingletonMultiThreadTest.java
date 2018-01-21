package pattern.demo.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeSafeSingletonMultiThreadTest {
    @Test
    public void testSingleton() throws Exception {
        Thread t1 = new BeSafeMulti(10);
        Thread t2 = new BeSafeMulti(20);
        t1.start();
        t2.start();

        //end the test until thread t1 and t2 are ended.
        t1.join();
        t2.join();
    }
}

/* sample output ->
SafeDeposit instance = pattern.demo.singleton.SafeDeposit@324bc6ce, code = 20
SafeDeposit instance = pattern.demo.singleton.SafeDeposit@6f0f4e10, code = 10
SafeDepositSync instance = pattern.demo.singleton.SafeDepositSync@3c8c2ef7, code = 10
SafeDepositSync instance = pattern.demo.singleton.SafeDepositSync@3c8c2ef7, code = 10
*/

