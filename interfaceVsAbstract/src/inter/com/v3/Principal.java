package inter.com.v3;

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
        System.out.println("V3 Clases Anónimas");
        Predicado pre1 = new Predicado(){
            public boolean probar(String z) {
                return z.contains("x");
            }
        };
        resultado = pre1.probar("java");
        System.out.println(resultado); //true

        Predicado pre2 =  new Predicado(){
            public boolean probar(String s) {
                return s.length()>=10;
            }
        };
        resultado = pre2.probar("javascrip");
        System.out.println(resultado); //false

        Predicado pre3 =  new Predicado(){
            public boolean probar(String z) {
                return z.isBlank();
            }
        };

        resultado = pre3.probar("t");
        System.out.println(resultado); //true


    }
}
