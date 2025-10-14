package com.curso.v0;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Principal {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        //System.out.println(empty.isPresent()); //false

        String name0 = "baeldung";
        Optional<String> opt0 = Optional.of(name0);
        //System.out.println(opt0.isPresent()); //true

        //String name = null;
        //Optional.of(name); //NullPointerException

        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.isPresent()); //false
    }
}
