package com.curso.v0;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

    int capacity; //Capacidad de la cola
    Queue<Integer> queue = new LinkedList<>();

    public ProducerConsumerExample(int capacity) {
        this.capacity = capacity;
    }

    //¿De que Objeto obtenemos el monitor (candado)???
    //Al ser un Method Instance
    //entonces lo obtenemos de la instancia ProducerConsumerExample
    public synchronized void produce(int value) throws InterruptedException {
        //SOLO PUEDE ENTRAR UN THREAD
        while (queue.size()==capacity) {
            System.out.println("LA COLA ESTA A SU CAPACIDAD");
            wait(); //Espera hasta que haya espacio en la cola.
        }
        System.out.println("Produced: "+ value);
        queue.add(value); //Agrega entero a la cola.
        notify(); //Notifica al Consumer que un elemento ha sido producido.
        //Notifica al metodo (o bloque) synchronized que tenga el mismo monitor (candado)
        //Se puede dar porque el Consumer este en estado de wait() porque no hay
        // elementos en la cola
    }

    //¿De que Objeto obtenemos el monitor (candado)???
    //Al ser un Method Instance
    //entonces lo obtenemos de la instancia ProducerConsumerExample
    public synchronized int consume() throws InterruptedException {
        //SOLO PUEDE ENTRAR UN THREAD
        while (queue.isEmpty()) {
            System.out.println("LA COLA ESTA VACIA");
            wait(); //Espera hasta que haya elementos en la cola que consumir.
        }
        int value = queue.poll();
        System.out.println("Consumed: "+ value);
        notify();
        return value;
    }

    public static void main(String[] args) {

        //Este objeto es de donde los metodos synchronized toman el monitor
        ProducerConsumerExample pc = new ProducerConsumerExample(5);

        Thread producerThread = new Thread( () -> {
            try {
                for (int i=0; i<10; i++) {
                    pc.produce(i); //Producir del 0 al 9
                    Thread.sleep(400);
                }
            }catch(InterruptedException e) {
            }
        } );

        Thread consumerThread = new Thread( () -> {
            try {
                for (int i=0; i<10; i++) {
                    int value = pc.consume(); //Consumir del 0 al 9
                    Thread.sleep(100); //Consumer tarda el doble del tiempo que el Producer
                }
            }catch(InterruptedException e) {
            }
        });

        consumerThread.start();
        producerThread.start();


    }

}
