package functional.com.v3;

@FunctionalInterface
public interface Predicado<T> {
    boolean probar(T t);

    default Predicado<T> andDefault(Predicado<T> predicado) {
        return t -> this.probar(t) && predicado.probar(t);
    }

    default Predicado<T> orDefault(Predicado<T> predicado) {
        return t -> this.probar(t) || predicado.probar(t);
    }

    default Predicado<T> negateDefault() {
        return t -> !this.probar(t);
    }
}

