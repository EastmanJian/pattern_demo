package pattern.demo.singleton;

/**
 * It’s possible for SafeDeposit’s un-synchronized getInstance() method to return more than one instance of the class.
 * To enforce the singleton, we can add synchronized modifier to the getInstance() method.
 */
public class BeSafeMulti extends Thread {
    private int code;

    public BeSafeMulti(int code) {
        this.code = code;
    }

    public void run () {
        SafeDeposit sd = SafeDeposit.getInstance(code);  //SafeDeposit.getInstance() is un-synchronized.
        SafeDepositSync sds = SafeDepositSync.getInstance(code);  //SafeDepositSync.getInstance() is synchronized.
        System.out.println("SafeDeposit instance = " + sd + ", code = " + sd.getCode());
        System.out.println("SafeDepositSync instance = " + sds + ", code = " + sds.getCode());
    }
}

