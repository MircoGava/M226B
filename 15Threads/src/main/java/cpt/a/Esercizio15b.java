package cpt.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Esercizio15b {

    public static void main(String[] args) throws InterruptedException {
        int n = 4;
        ExecutorService exec = Executors.newFixedThreadPool(n);
        BankAccount account = new BankAccount(100.0);

        exec.submit(() -> {
            try {
                System.out.println("Conto iniziale: " + account.getConto());
            } catch ( Exception e ) {
                throw new RuntimeException(e);
            }
            try {
                System.out.println("Deposito 100 fr, conto: " + account.deposita(100.0));
            } catch ( Exception e ) {
                throw new RuntimeException(e);
            }
            try {
                System.out.println("Prelievo 150 fr, conto: " + account.preleva(150.0));
            } catch ( Exception e ) {
                throw new RuntimeException(e);
            }
        });
        exec.shutdown();
        exec.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Conto finale: " + account.getConto());
    }

    private static class  BankAccount {
        private double conto;

        public BankAccount(double conto) {
            this.conto = conto;
        }

        public double deposita(double quantita) {
            this.conto += quantita;
            return this.conto;

        }

        public double preleva(double quantita) {
            if(this.conto >= quantita) {
                this.conto -= quantita;
            }
            return this.conto;
        }

        public double getConto(){
            return this.conto;
        }
    }
}
