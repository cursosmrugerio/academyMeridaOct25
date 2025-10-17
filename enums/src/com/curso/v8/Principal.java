package com.curso.v8;

public class Principal {
    enum Card{
        HEART,
        SPADE,
        DIAMOND,
        CLUB
    }
    public static void main(String[] args) {
        for(Card c : Card.values()){
            System.out.print(c+" ");
        }
    }
}
