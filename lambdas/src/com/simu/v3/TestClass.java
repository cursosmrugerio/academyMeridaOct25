package com.simu.v3;

import java.util.List;
import java.util.function.Function;

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
    public static void main(String[] args) {
        Carnivore tiger1 = l -> l.size()*200;
        Function<List<String>,Integer>
                  tiger2 = l -> l.size()*200;
    }
}
