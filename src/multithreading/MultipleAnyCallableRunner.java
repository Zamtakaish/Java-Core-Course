package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableTask> listOfTasks = List.of(new CallableTask("Thread1"),new CallableTask("Thread2"),new CallableTask("Thread3"),new CallableTask("Thread4"));
        Future<String> welcomeFuture = executorService.submit(new CallableTask("CallableTask"));

        String result = executorService.invokeAny(listOfTasks);

            System.out.println(result);

        executorService.shutdown();
    }
}
