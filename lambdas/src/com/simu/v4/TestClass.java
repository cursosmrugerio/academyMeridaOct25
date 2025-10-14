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
        Tiger t = new Tiger();

        //METHOD REFERENCE:  Object::methodInstancia
        Carnivore c1 = (List<String> foods) -> foods.size() * 200;
        process(fnames, c1);
        process(fnames, t);

        //TAREA****
        process(fnames, t::eat);

        //METHOD REFERENCE: Object::methodInstancia
        process(fnames, t::calories);
        //METHOD REFERENCE:  Class::methodStatic
        process(fnames, TestClass::size);
        //METHOD REFERENCE:  Class::methodStatic
        //process(fnames, Carnivore::calories); //NO COMPILE
        //METHOD REFERENCE:  Class::methodInstancia
        //process(fnames, Tiger::eat); //NO COMPILE

    }
}
