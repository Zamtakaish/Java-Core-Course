package multithreading;

class Task1 extends Thread{
    public void run(){

        System.out.println("\nTask 1 is started.");

        for(int i = 101; i <= 199; i++){
            System.out.println(i + " ");
        }

        Thread.yield();

        System.out.println("\nTask 1 is done.");
    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("\nTask 2 is started.");

        for(int i = 201; i <= 299; i++){
            System.out.println(i + " ");
        }

        System.out.println("\nTask 2 is done.");
    }
}

public class ThreadBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
        //Task1
        System.out.println("\nTask 1 is kicked off.");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();


        //Task2
        System.out.println("\nTask 2 is kicked off.");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        //Task3

        //weait for task 1 to complere
        task1.join();
        task2Thread.join();

        System.out.println("\nTask 3 is kicked off.");
        for(int i = 301; i <= 399; i++){
            System.out.println(i + " ");
        }

        System.out.println("\nTask 3 is done.");
        System.out.println("\nJob's done!");
    }
}
