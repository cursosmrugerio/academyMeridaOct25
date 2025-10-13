package reference.obj.methodIns.V0;

import java.util.List;
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

        double newSalary = 0.0;

        //OOP
        newSalary = emp2.incrementSalary(20.0);
        System.out.println(newSalary);

        //LAMBDA
        DoubleUnaryOperator duo1 = t -> emp2.incrementSalary(t);
        newSalary = duo1.applyAsDouble(20.0);
        System.out.println(newSalary);

        //METHOD REFERENCE
        DoubleUnaryOperator duo2 = emp2::incrementSalary;
        newSalary = duo2.applyAsDouble(20.0);
        System.out.println(newSalary);
    }


}
