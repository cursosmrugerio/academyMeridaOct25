package functional.com.v0;

@FunctionalInterface
public interface Predicado<T> {
    boolean probar(T t);

    static <V> Predicado<V> andStatic(Predicado<V> predicado1,
                                      Predicado<V> predicado2) {
        Predicado<V> predicado =
                v -> predicado1.probar(v) && predicado2.probar(v);
        return predicado;
    }
}

