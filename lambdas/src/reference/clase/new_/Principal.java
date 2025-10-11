package reference.clase.new_;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Empleado {
    private String name;
    private double salary;
    private int edad;

    public Empleado(String name, double salary, int edad) {
        this.name = name;
        this.salary = salary;
        this.edad = edad;
    }

    public Empleado(){}

    public Empleado(String name) {
        this.name = name;
    }
    public Empleado(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + edad ;
    }
}

public class Principal {
    public static void main(String[] args) {
        //Empleado emp = new Empleado(); //OOP

        //NO TE ENVIO NADA -> REGRESA UN EMPLEADO
        Supplier<Empleado> supp1 = () -> new Empleado();
        Empleado emp1 =  supp1.get();
        System.out.println(emp1);
        //TE ENVIO UN STRING -> REGRESA UN EMPLEADO
        Function<String, Empleado> fun1 = n -> new Empleado(n);
        Empleado emp3 = fun1.apply("Epeneto");
        System.out.println(emp3);
        //TE ENVIO UN STRING & DOUBLE -> REGRESA UN EMPLEADO
        BiFunction<String,Double,Empleado> bf1 =
                        (y,t)->new Empleado(y,t);
        Empleado emp5 = bf1.apply("Filologo",300.0);
        System.out.println(emp5);

        System.out.println("***Method Reference***");
        Supplier<Empleado> supp2 = Empleado::new;
        Empleado emp2 =  supp2.get();
        System.out.println(emp2);

        Function<String, Empleado> fun2 = Empleado::new;
        Empleado emp4 = fun2.apply("Epeneto");
        System.out.println(emp4);

        BiFunction<String,Double,Empleado> bf2 = Empleado::new;
        Empleado emp6 = bf2.apply("Filologo",300.0);
        System.out.println(emp6);

        TriFunction<String,Double,Integer,Empleado> tf1 = Empleado::new;
        Empleado emp999 = tf1.apply("Andronico",200.0,20);
        System.out.println(emp999);
    }
}
