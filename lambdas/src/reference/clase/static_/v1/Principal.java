package reference.clase.static_.v1;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Empleado {
    private String name;
    private double salary;
    static private int contador;
    Empleado(String name, double salary) {
        this.name = name;
        this.salary = salary;
        contador++;
    }
    static int getContador() {
        return contador;
    }
    static double incrementSalary(Empleado empleado) {
        return empleado.salary * 1.50;
    }
}

public class Principal {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Erasto",100);
        Empleado emp2 = new Empleado("Filologo",110);
        Empleado emp3 = new Empleado("Trifosa",150);

        System.out.println("OOP: "+Empleado.getContador()); //3
        System.out.println("OOP Trifosa Sueldo Inc: "+Empleado.incrementSalary(emp3));

        //NO TE PASO NADA -> REGRESA UN int
        Supplier<Integer> sup = () -> Empleado.getContador();
        System.out.println("Functional: "+sup.get()); //3
        //TE PASO UN Empleado -> REGRESA UN double
        Function<Empleado,Double> fun = x -> Empleado.incrementSalary(x);
        System.out.println("Functional Trifosa Sueldo Inc: "+fun.apply(emp3));

        Supplier<Integer> supMR = Empleado::getContador;
        System.out.println("Functional Method Reference: "+supMR.get()); //3
        Function<Empleado,Double> funMR = Empleado::incrementSalary;
        System.out.println("Functional Method Reference Trifosa Sueldo Inc: "+funMR.apply(emp3));

        double d = Math.cos(10.0);
        System.out.println(d);
        Function<Double,Double> funCos = y -> Math.cos(y);
        funCos = Math::cos;
        System.out.println(funCos.apply(10.0));
        UnaryOperator<Double> unaryOpe = x -> Math.cos(x);
        unaryOpe = Math::cos;
        System.out.println(unaryOpe.apply(10.0));

    }
}
