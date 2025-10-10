package inter.com.v5;

public abstract class Principal {
    public static void main(String[] args) {
        boolean resultado = false;
        System.out.println("V5");

        //DEFINICION LAMBDA
        Predicado<String> pre = z -> true;
        //EJECUTA LAMBDA
        resultado = pre.probar("Academy");
        System.out.println(resultado); //true

        pre = z -> {
            boolean b = false;
            String w = "World";
            System.out.println("Procesos complejo....");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            w = z.concat(w);
            b = w.length() > 10;
            return b;
        };
        resultado = pre.probar("Hello ");
        System.out.println(resultado); //false

        Predicado<Integer> pre2 = x -> x.equals(10);
        resultado = pre2.probar(10);
        System.out.println("Integer is 10: "+resultado);

    }
}
