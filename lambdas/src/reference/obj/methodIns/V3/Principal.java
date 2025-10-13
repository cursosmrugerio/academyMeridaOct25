package reference.obj.methodIns.V3;

import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleUnaryOperator;

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
        Empleado emp1 = new Empleado("Erasto",100);
        Empleado emp2 = new Empleado("Filologo",110);
        Empleado emp3 = new Empleado("Trifosa",150);
        List<Empleado> emps = List.of(emp1, emp2, emp3);

        incrementarSalarios(emps);

    }

    static void incrementarSalarios(List<Empleado> lista) {
        //lista.forEach(System.out::println);
        lista.forEach(q -> {
            System.out.println(q);
            DoubleUnaryOperator duo = q::incrementSalary;
            DoubleConsumer dc = q::setSalary;    //emp.setSalary(duo.applyAsDouble(50));
            dc.accept(duo.applyAsDouble(100));
            System.out.println(q);
        });
    }


}
