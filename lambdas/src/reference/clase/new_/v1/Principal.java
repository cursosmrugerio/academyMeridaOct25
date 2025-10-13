package reference.clase.new_.v1;

class TriFunctionImpl implements TriFunction
        <String, Double, Integer, Empleado> {
    @Override
    public Empleado apply(String s, Double aDouble, Integer integer) {
        return new Empleado(s, aDouble, integer);
    }
}

class Empleado {
    private String name;
    private double salary;
    private int edad;

    public Empleado(String name, double salary, int edad) {
        this.name = name;
        this.salary = salary;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + edad ;
    }
}

public class Principal {
    public static void main(String[] args) {
        System.out.println("OOP");
        //CREAR UN OBJETO QUE IMPLEMENTE TriFunction
        TriFunction<String,Double,Integer,Empleado> tf1
                = new TriFunctionImpl();
        Empleado emp = tf1.apply("Patrobas",350.0,30);
        System.out.println(emp);

        System.out.println("Functional");
        TriFunction<String,Double,Integer,Empleado> tf2 =
                (x,y,z) -> new Empleado(x,y,z);
        Empleado emp2 = tf2.apply("Epeneto",250.0,20);
        System.out.println(emp2);

        System.out.println("Method Reference");
        TriFunction<String,Double,Integer,Empleado> tf3 = Empleado::new;
        Empleado emp3 = tf3.apply("Trifosa",250.0,20);
        System.out.println(emp3);

    }
}
