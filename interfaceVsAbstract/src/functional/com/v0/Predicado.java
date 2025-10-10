package functional.com.v0;

@FunctionalInterface
public interface Predicado<T> {
    boolean probar(T t);
}
