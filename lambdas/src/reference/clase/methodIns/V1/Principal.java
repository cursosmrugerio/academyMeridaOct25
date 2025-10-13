package reference.clase.methodIns.V1;

import java.util.List;
import java.util.function.*;

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

        double newSalary = 0.0;

        //METHOD REFERENCE
        BiFunction<Empleado,Double,Double> bifun = Empleado::incrementSalary;
        newSalary = bifun.apply(emp2,20.0);

        System.out.println(emp2);
        BiConsumer<Empleado,Double> bi = Empleado::setSalary;
        bi.accept(emp2,newSalary);
        System.out.println(emp2);



    }


}
