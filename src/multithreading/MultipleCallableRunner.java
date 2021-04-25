package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableTask> listOfTasks = List.of(new CallableTask("Thread1"),new CallableTask("Thread2"),new CallableTask("Thread3"),new CallableTask("Thread4"));
        Future<String> welcomeFuture = executorService.submit(new CallableTask("CallableTask"));

        List<Future<String>> results = executorService.invokeAll(listOfTasks);

        for(Future<String> result: results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
