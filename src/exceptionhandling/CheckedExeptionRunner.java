package exceptionhandling;

public class CheckedExeptionRunner {
    public static void main(String[] args) {
        try{
            someOtherMethod1();
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        someOtherMethod2();
    }

    private static void someOtherMethod2() throws RuntimeException {
    }

    private static void someOtherMethod1() throws InterruptedException {
        Thread.sleep(2000);
    }
}
