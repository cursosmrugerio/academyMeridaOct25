package inter.com.v2;

//class PredicadoImpl1 implements Predicado {
//    @Override
//    public boolean probar(String z) {
//        return z.contains("x");
//    }
//}
// z ->  z.contains("x"); //LAMBDA

//class PredicadoImpl2 implements Predicado {
//    @Override
//    public boolean probar(String s) {
//        return s.length()>=10;
//    }
//}
// s ->  s.length()>=10; //LAMBDA

public abstract class Principal {
    public static void main(String[] args) {
        boolean resultado = false;
        System.out.println("V2*");
        Predicado pre1 = z ->  z.contains("x");
        resultado = pre1.probar("java");
        System.out.println(resultado); //true

        Predicado pre2 = s ->  s.length()>=10;
        resultado = pre2.probar("javascrip");
        System.out.println(resultado); //false

        Predicado pre3 = w ->  w.isBlank();
        resultado = pre3.probar("Q");
        System.out.println(resultado); //true


    }
}
