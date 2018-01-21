package pattern.demo.singleton;

public class SafeDepositSync {
    private static SafeDepositSync singleton;
    private int code;

    public static synchronized SafeDepositSync getInstance(int code) {
        if (singleton == null) {
            try {
                Thread.sleep(500); //add delay for easier simulate multi-thread case
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new SafeDepositSync(code);
        }
        return singleton;
    }

    private SafeDepositSync(int c) {
        code = c;
    }

    int getCode() {
        return code;
    }
}