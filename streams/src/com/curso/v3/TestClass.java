package com.curso.v3;

import java.util.function.BiFunction;
import java.util.function.Function;

class TestClass {
    //double defaultrate = 0.10;
    public double process(double payment, int rate) {
        double defaultrate = 0.10; //Variable Local
        //if (rate > 10) defaultrate = rate; //NO ES EFECTIVE FINAL

        class Implement { //CLASE ANIDADA LOCAL
            public int apply(double data) {
                //Function<Integer, Integer> f = x -> x + (int) (x * defaultrate);  //3
                //Function<Integer, Integer> f = x -> x + (int) (x * rate);
                //return f.apply((int) data);

                BiFunction<Integer, Double, Integer> f = (m, n) -> m + (int)(n*m);
                return f.apply((int)data, defaultrate);
            }
        }

        Implement i = new Implement();
        return i.apply(payment);
    }
}