package inter.com.v0;

class PredicadoImpl implements Predicado{
    @Override
    public boolean probar(String cadena) {
        return cadena.contains("x");
    }
}

public abstract class Principal {
    public static void main(String[] args) {
        Predicado pre = new PredicadoImpl();
        boolean resultado = pre.probar("java");
        System.out.println(resultado);

        Predicado.negate(); //static
        pre.and(); //default
    }
}
