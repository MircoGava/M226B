package cpt.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Esercizio15a {

    private static ExecutorService Executor = Executors.newCachedThreadPool();

    private static void simulateBigFileDownload() throws InterruptedException
    {
        System.out.println("Simulating Big File Download");
        Thread.sleep(4000);
        System.out.println("Ended Big File Download");
    }


    private static void timeCounter() throws InterruptedException{
        for(int i = 1; i<7; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        simulateBigFileDownload();
        timeCounter();

        Executor.submit(() -> {
            try {
                simulateBigFileDownload();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                timeCounter();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Executor.shutdown();

    }
}
