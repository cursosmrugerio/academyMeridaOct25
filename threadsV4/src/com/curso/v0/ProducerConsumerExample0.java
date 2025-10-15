package com.curso.v0;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProducerConsumerExample0 {

    int capacity; //Capacidad de la cola

    List<Integer> lista = new LinkedList<>(); //Lista Entrelazada
    Deque<Integer> pila = new LinkedList<>(); //Pila LIFO (Stack)
    Queue<Integer> queue = new LinkedList<>(); //Cola FIFO (Queue)

}
