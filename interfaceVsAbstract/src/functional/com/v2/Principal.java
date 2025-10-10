package functional.com.v2;

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

        System.out.println("EDAD NO MAYOR 21***");
        show(emps, Predicado.negateStatic(z -> z.getEdad()>21));
    }

    private static void show(List<Empleado> emps, Predicado<Empleado> pre) {
        for (Empleado emp : emps) {
            if (pre.probar(emp)) //EJECUTA LAMBDA
                System.out.println(emp);
        }
    }
}
