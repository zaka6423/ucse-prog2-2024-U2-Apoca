package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_3 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> generateAndSleep());
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> generateAndSleep());
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> generateAndSleep());
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> generateAndSleep());

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3, future4);

        try {
            combinedFuture.get();

            int result = future1.get() + future2.get() + future3.get() + future4.get();

            System.out.println("La suma de los valores es: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static int generateAndSleep() {
        int randomValue = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(randomValue);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return randomValue;
    }
}
