package functional.com.v1;

@FunctionalInterface
public interface Predicado<T> {
    boolean probar(T t);

    static <V> Predicado<V> andStatic(Predicado<V> predicado1,
                                      Predicado<V> predicado2) {
        //LA LAMBDA NO SE EJECUTA
        //SOLO SE DEFINE LA LAMBDA
        Predicado<V> predicado =
                v -> predicado1.probar(v) && predicado2.probar(v);
        return predicado; //FUNCIONES DE ORDEN SUPERIOR

    }
    static <V> Predicado<V> orStatic(Predicado<V> predicado1,
                                      Predicado<V> predicado2) {
        Predicado<V> predicado =
                v -> predicado1.probar(v) || predicado2.probar(v);
        return predicado;
    }
    static <Z> Predicado<Z> negateStatic(Predicado<Z> predicado) {
        return z -> !predicado.probar(z);
    }
}

