package functional.com.v2;

@FunctionalInterface
public interface Predicado<T> {
    boolean probar(T t);
    static <T> Predicado<T> negateStatic(Predicado<T> predicado) {
        return t -> !predicado.probar(t);
    }
}

