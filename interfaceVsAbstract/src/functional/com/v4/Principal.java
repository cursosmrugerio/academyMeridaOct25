package functional.com.v4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Predicate");
        Empleado emp1 = new Empleado("Patrobas",100,20);
        Empleado emp2 = new Empleado("Aristobulo",200,28);
        Empleado emp3 = new Empleado("Andronico",40,22);
        Empleado emp4 = new Empleado("Erasto",80,21);
        Empleado emp5 = new Empleado("Epeneto",150,18);
        List<Empleado> emps = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
        //DEFINICION LAMBDA
        Predicate<Empleado> pre0 = e -> e.getSueldo()>100;
        Predicate<Empleado> pre1 = z -> z.getEdad()>21;
        Predicate<Empleado> pre2 = pre0.and(pre1);
                                   //Predicado.andStatic(pre0, pre1);
        //pre2 genera la siguiente lambda;
        Predicate<Empleado> pre3 = x -> ( x.getSueldo()>100 && x.getEdad()>21 );

        System.out.println("***SUELDO MAYOR 100 & EDAD MAYOR 21***");
        show(emps, pre2);
        System.out.println("***SUELDO MAYOR 100 & EDAD MAYOR 21***");
        show(emps, x -> ( x.getSueldo()>100 && x.getEdad()>21 ));
        // Empleado{nombre='Aristobulo', sueldo=200.0, edad=28}
        System.out.println("***SUELDO MAYOR 100 || EDAD MAYOR 21***");
        show(emps, pre0.or(pre1));
        System.out.println("EDAD NO MAYOR 21***");
        show(emps, pre1.negate());
    }


    private static void show(List<Empleado> emps, Predicate<Empleado> pre) {
        for (Empleado emp : emps) {
            if (pre.test(emp)) //EJECUTA LAMBDA
                System.out.println(emp);
        }
    }
}
