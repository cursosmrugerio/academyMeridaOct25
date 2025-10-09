package inter.com.v1;

public interface Predicado {

    //public abstract
    boolean probar(String cadena);

    //public
    static void negate(){
        System.out.println("negate() static");
        negatePrivate();
    }
    //public //similar método de instancia
    default void and(){
        System.out.println("and() default");
        andPrivate();
    }

    //JAVA9
    private static void negatePrivate(){
        System.out.println("negatePrivate() static");
    }
    private void andPrivate(){
        System.out.println("andPrivate()");
    }
}
