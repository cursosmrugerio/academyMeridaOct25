package inter.com.v1;

class PredicadoImpl1 implements Predicado {
    @Override
    public boolean probar(String cadena) {
        return cadena.contains("x");
    }
}

class PredicadoImpl2 implements Predicado {
    @Override
    public boolean probar(String cadena) {
        return cadena.length()>=10;
    }
}

public abstract class Principal {
    public static void main(String[] args) {
        boolean resultado = false;

        Predicado pre1 = new PredicadoImpl1();
        resultado = pre1.probar("java");
        System.out.println(resultado); //true

        Predicado pre2 = new PredicadoImpl2();
        resultado = pre2.probar("javascript");
        System.out.println(resultado); //false


    }
}
