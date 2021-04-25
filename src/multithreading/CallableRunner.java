package multithreading;

import java.util.concurrent.*;

//Task: return value from thread.

class  CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //Future is a promise.
        Future<String> welcomeFuture = executorService.submit(new CallableTask("CallableTask"));

        System.out.println("CallableTask executed.");

        //The variable gets a returning value from promise.
        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);

        System.out.println("Main Completed.");

        executorService.shutdown();

    }
}
