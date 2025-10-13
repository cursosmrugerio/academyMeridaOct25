package reference.clase.static_.v0;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

class Empleado {
    private String name;
    static private int contador;
    Empleado(String name) {
        name = name;
        contador++;
    }
    static int getContador() {
        return contador;
    }
}

public class Principal {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Erasto");
        Empleado emp2 = new Empleado("Filologo");
        Empleado emp3 = new Empleado("Trifosa");

        System.out.println("OOP: "+Empleado.getContador()); //3

        //NO TE PASO NADA -> REGRESA UN int
        Supplier<Integer> sup = () -> Empleado.getContador();
        System.out.println("Lambda: "+sup.get()); //3

        Supplier<Integer> supMR = Empleado::getContador;
        System.out.println("Method Reference: "+supMR.get()); //3

        IntSupplier intSup2 = () -> Empleado.getContador();
        System.out.println("Lambda IntSupplier: "+intSup2.getAsInt()); //3

        IntSupplier intSupMR = Empleado::getContador;
        System.out.println("Method Reference IntSupplier: "+intSupMR.getAsInt());

    }
}
