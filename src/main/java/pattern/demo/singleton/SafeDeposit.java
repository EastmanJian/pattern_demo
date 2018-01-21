package pattern.demo.singleton;

public class SafeDeposit {
    private static SafeDeposit singleton;
    private int code;

    public static SafeDeposit getInstance(int code) {
        if (singleton == null) {
            try {
                Thread.sleep(500); //add delay for easier simulate multi-thread case
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new SafeDeposit(code);
        }
        return singleton;
    }

    private SafeDeposit(int c) {
        code = c;
    }

    int getCode() {
        return code;
    }
}