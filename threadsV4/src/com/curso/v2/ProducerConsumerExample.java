package com.curso.v2;

import java.util.LinkedList;
import java.util.Queue;

class Pato{
    static Queue<Integer> queue = new LinkedList<>();
} //VAMOS A OBTENER EL MONITOR

public class ProducerConsumerExample {

    int capacity; //Capacidad de la cola

    public ProducerConsumerExample(int capacity) {
        this.capacity = capacity;
    }

   public void produce(int value) throws InterruptedException {
        synchronized (Pato.class) {
            //SOLO PUEDE ENTRAR UN THREAD
            while (Pato.queue.size() == capacity) {
                System.out.println("LA COLA ESTA A SU CAPACIDAD");
                Pato.class.wait(); //Espera hasta que haya espacio en la cola.
            }
            System.out.println("Produced: " + value);
            Pato.queue.add(value); //Agrega entero a la cola.
            Pato.class.notify(); //Notifica al Consumer que un elemento ha sido producido.
            //Notifica al metodo (o bloque) synchronized que tenga el mismo monitor (candado)
            //Se puede dar porque el Consumer este en estado de wait() porque no hay
            // elementos en la cola
        }
    }

    public int consume() throws InterruptedException {
        synchronized (Pato.class) {
            //SOLO PUEDE ENTRAR UN THREAD
            while (Pato.queue.isEmpty()) {
                System.out.println("LA COLA ESTA VACIA");
                Pato.class.wait(); //Espera hasta que haya elementos en la cola que consumir.
            }
            int value = Pato.queue.poll();
            System.out.println("Consumed: " + value);
            Pato.class.notify();
            return value;
        }
    }

    public static void main(String[] args) {

        System.out.println("V2");
        //Este objeto es de donde los metodos synchronized toman el monitor
        ProducerConsumerExample pc = new ProducerConsumerExample(5);

        Thread producerThread = new Thread( () -> {
            try {
                for (int i=0; i<10; i++) {
                    pc.produce(i); //Producir del 0 al 9
                    //Thread.sleep(400);
                }
            }catch(InterruptedException e) {
            }
        } );

        Thread consumerThread = new Thread( () -> {
            try {
                for (int i=0; i<10; i++) {
                    int value = pc.consume(); //Consumir del 0 al 9
                    //Thread.sleep(100); //Consumer tarda el doble del tiempo que el Producer
                }
            }catch(InterruptedException e) {
            }
        });

        consumerThread.start();
        producerThread.start();

    }

}
