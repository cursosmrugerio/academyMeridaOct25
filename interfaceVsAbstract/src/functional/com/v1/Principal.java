package functional.com.v1;

import java.util.Arrays;
import java.util.List;
public class Principal {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Patrobas",100,20);
        Empleado emp2 = new Empleado("Aristobulo",200,28);
        Empleado emp3 = new Empleado("Andronico",40,22);
        Empleado emp4 = new Empleado("Erasto",80,21);
        Empleado emp5 = new Empleado("Epeneto",150,18);
        List<Empleado> emps = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
        //DEFINICION LAMBDA
        Predicado<Empleado> pre0 = e -> e.getSueldo()>100;
        Predicado<Empleado> pre1 = z -> z.getEdad()>21;
        Predicado<Empleado> pre2 = Predicado.andStatic(pre0, pre1);
        //pre2 genera la siguiente lambda;
        Predicado<Empleado> pre3 = x -> ( x.getSueldo()>100 && x.getEdad()>21 );

        System.out.println("***SUELDO MAYOR 100 & EDAD MAYOR 21***");
        show(emps, pre2);
        System.out.println("***SUELDO MAYOR 100 & EDAD MAYOR 21***");
        show(emps, pre3);
        System.out.println("***SUELDO MAYOR 100 & EDAD MAYOR 21***");
        show(emps, x -> ( x.getSueldo()>100 && x.getEdad()>21 ));
        // Empleado{nombre='Aristobulo', sueldo=200.0, edad=28}
        System.out.println("***SUELDO MAYOR 100 || EDAD MAYOR 21***");
        show(emps, Predicado.orStatic(pre0, pre1));
        System.out.println("EDAD NO MAYOR 21***");
        show(emps, Predicado.negateStatic(pre1));
    }

    private static void show(List<Empleado> emps, Predicado<Empleado> pre) {
        for (Empleado emp : emps) {
            if (pre.probar(emp)) //EJECUTA LAMBDA
                System.out.println(emp);
        }
    }
}
