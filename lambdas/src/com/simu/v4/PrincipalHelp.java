package com.simu.v4;
import java.util.function.Predicate;

class PredicateImpl implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.contains("x");
    }
}
public class PrincipalHelp {
    public static void process(String cadena, Predicate<String> pre){
        boolean b = pre.test(cadena);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Predicate<String> p = new PredicateImpl();
        process("Javax",p);

        Predicate<String> pre =
                cadena -> p.test(cadena); //Variable 'pre' initializer 'texto -> p.test(texto)' is redundant
        process("Java",pre);

        //Method reference can be replaced with qualifier
        process("Javax",p::test);
    }
}
