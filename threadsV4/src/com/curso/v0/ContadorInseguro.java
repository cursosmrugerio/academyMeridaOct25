package com.curso.v0;

public class ContadorInseguro {
    public volatile static int contador = 0;

    public static void main(String[] args) throws InterruptedException {
        // Hilo 1 incrementa el contador
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                contador++;
            }
        });

        // Hilo 2 incrementa el contador
        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                contador++;
            }
        });

        hilo1.start();
        hilo2.start();

        hilo1.join(); // Espera a que hilo1 termine
        hilo2.join(); // Espera a que hilo2 termine

        System.out.println("Valor final del contador: " + contador);
    }
}
