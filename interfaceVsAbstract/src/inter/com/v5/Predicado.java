package inter.com.v5;

@FunctionalInterface
public interface Predicado<T> {
    boolean probar(T t);
    //int suma(int z);

    default int suma(int z){
        return z+1;
    }
}
