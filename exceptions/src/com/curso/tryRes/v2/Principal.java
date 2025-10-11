package com.curso.tryRes.v2;

import java.io.IOException;

public class Principal {
    public static void main(String[] args)  {

        System.out.println("Try With Resource");
        //Try with Resources (Automaticamente CERRAR el recurso)
        try (ConexionMongoDb conn = new ConexionMongoDb("127.0.0.1")) {
            conn.open();
            System.out.println("PROCESANDO.....");
            Thread.sleep(3000);
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("FIN PROGRAMA");
    }
}
