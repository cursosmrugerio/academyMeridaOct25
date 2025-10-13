package reference.clase.static_.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

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
    double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + ", salary=" + salary + '}';
    }
}

public class Principal {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Erasto",100);
        Empleado emp2 = new Empleado("Filologo",110);
        Empleado emp3 = new Empleado("Trifosa",150);
        List<Empleado> emps = List.of(emp1, emp2, emp3);

        showIncrementSalary(emps,Empleado::incrementSalary);
    }

    static void showIncrementSalary
            (List<Empleado> lista, ToDoubleFunction<Empleado> function){

        for (Empleado emp : lista){
            System.out.println(emp);
            System.out.println("Incremento: "+function.applyAsDouble(emp));
        }

    }
}
