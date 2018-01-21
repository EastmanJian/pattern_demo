package pattern.demo.singleton;

public class BeSafe {
    public static void main(String[] args) {
//        SafeDeposit sd = new SafeDeposit(); //compile error 1
        SafeDeposit sd1 = SafeDeposit.getInstance(30); //this one is correct
//        SafeDeposit sd2 = new SafeDeposit(30); //compile error 2
        System.out.println("code=" + sd1.getCode());
    }
}

/*
Compile output:
Error 1:constructor SafeDeposit in class SafeDeposit cannot be applied to given types;
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Error 2: SafeDeposit(int) has private access in SafeDeposit

*/