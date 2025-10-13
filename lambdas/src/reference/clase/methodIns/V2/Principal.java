package reference.clase.methodIns.V2;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Empleado {
    private String name;
    private double salary;
    Empleado(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //Method Instance
    double incrementSalary(double porcentaje) {
        return salary + (salary * porcentaje/100);
    }
    void setSalary(double newSalary){
        salary = newSalary;
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
        System.out.println("V2");
        Empleado emp1 = new Empleado("Epeneto",100);
        Empleado emp2 = new Empleado("Filologo",110);
        Empleado emp3 = new Empleado("Trifosa",150);
        List<Empleado> emps = List.of(emp1, emp2, emp3);

        incrementarSalarios(emps,
                    Empleado::incrementSalary,
                    Empleado::setSalary);
    }
    static void incrementarSalarios(List<Empleado> lista,
                                    BiFunction<Empleado,Double,Double> bf,
                                    BiConsumer<Empleado,Double> bc
                                    ) {
        for  (Empleado emp : lista) {
            System.out.println(emp);
            bc.accept(emp,bf.apply(emp,100.0));
            System.out.println(emp);
        }


    }


}
