package com.simu.v4;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Carnivore {
    default int calories(List<String> food){
        return food.size() * 100;
    }
    int eat(List<String> foods);
}
class Tiger implements Carnivore {
    public int eat(List<String> foods){
        System.out.println("Eating " + foods);
        return foods.size() * 200;
    }
}
public class TestClass {
    public static int size(List<String> names){
        return names.size() * 2;
    }
    public static void process(List<String> names, Carnivore c){
        c.eat(names);
    }
    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger t = new Tiger(); //Tiger IS-A Carnivore

        //TAREA****
        Carnivore carnivore = lista -> t.eat(lista); //LAMBDA
        process(fnames,carnivore);
        carnivore = t::eat; //METHOD REFERENCE
        process(fnames,carnivore);
        process(fnames, t);

        //TIGER VERSION LAMBDA
        Carnivore c = (List<String> foods) -> foods.size() * 200;
        process(fnames, c);

        //METHOD REFERENCE: Object::methodInstancia
        c = lista -> t.calories(lista);
        process(fnames, t::calories);
        //METHOD REFERENCE:  Class::methodStatic
        c = lista -> TestClass.size(lista);
        process(fnames, TestClass::size);
        //METHOD REFERENCE:  Class::methodStatic
        //process(fnames, Carnivore::calories); //NO COMPILE
        //METHOD REFERENCE:  Class::methodInstancia
        //process(fnames, Tiger::eat); //NO COMPILE

    }
}
