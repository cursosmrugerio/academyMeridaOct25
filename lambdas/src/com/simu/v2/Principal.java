package com.simu.v2;

import java.util.List;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        //Consumer x = (z)->{ System.out::println; };
        //Consumer x = System.out::println; //CORRECTA
        //var x = ((Consumer)System.out::println);

        //Consumer x = (m)->{ };
        Consumer x = (Object msg)->{System.out.println(msg);};
        List.of(args).forEach(x);

        System.out.println("End Program");

    }
}
