package inter.com.v3A;

public abstract class Principal {
    public static void main(String[] args) {
        boolean resultado = false;
        System.out.println("V3 Clases Anónimas");
        Predicado pre1 = new Predicado(){
            public boolean probar(String z) {
                return z.contains("x");
            }
            @Override
            public int sumar(int x, int y) {
                return x+y;
            }
        };
        resultado = pre1.probar("java");
        System.out.println(resultado); //true

        Predicado pre2 =  new Predicado(){
            public boolean probar(String s) {
                return s.length()>=10;
            }
            @Override
            public int sumar(int x, int y) {
                return x+y;
            }
        };
        resultado = pre2.probar("javascrip");
        System.out.println(resultado); //false

        Predicado pre3 =  new Predicado(){
            public boolean probar(String z) {
                return z.isBlank();
            }
            @Override
            public int sumar(int x, int y) {
                return x+y;
            }
        };

        resultado = pre3.probar("t");
        System.out.println(resultado); //true


    }
}
