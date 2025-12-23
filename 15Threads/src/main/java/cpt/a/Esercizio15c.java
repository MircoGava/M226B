package cpt.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;


public class Esercizio15c {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();

        AtomicReference<Double> balance = new AtomicReference<>(500.0);
        AtomicReference<Double> deposita = new AtomicReference<>(50.0);
        AtomicReference<Double> preleva = new AtomicReference<>(100.0);

        BankAccount conto = new BankAccount(balance);

        exec.submit(() -> {
            try {
                conto.deposita(deposita);
            } catch ( Exception e ) {
                throw new RuntimeException(e);
            }
            try {
               conto.preleva(preleva);
            } catch ( Exception e ) {
                throw new RuntimeException(e);
            }
        });
        exec.shutdown();
        exec.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Conto iniziale: " + conto.getConto());

    }

    private static class  BankAccount {
        private AtomicReference<Double> conto;
        ExecutorService exec = Executors.newFixedThreadPool(4);

        public BankAccount(AtomicReference<Double> conto) {
            this.conto = conto;
        }

        public void deposita(AtomicReference<Double> quantita) {
           this.conto.set(conto.get() + quantita.get());
        }

        public void preleva(AtomicReference<Double> quantita) {
            if (this.conto.get() > quantita.get() ) {
                this.conto.set(conto.get() - quantita.get());
            }
        }

        public AtomicReference<Double> getConto(){
            return this.conto;
        }

    }
}
