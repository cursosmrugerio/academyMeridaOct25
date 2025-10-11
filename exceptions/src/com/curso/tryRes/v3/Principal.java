package com.curso.tryRes.v3;

import java.io.IOException;

public class Principal {
    public static void main(String[] args)  {

        System.out.println("Try With Resource with Effective Final");
        //Try with Resources (Automaticamente CERRAR el recurso)

        //conn debe ser Efective Final
        ConexionMongoDb conn = new ConexionMongoDb("127.0.0.1");
        try (conn) {
            conn.open();
            System.out.println("PROCESANDO.....");
            Thread.sleep(3000);
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
        //conn = null;
        System.out.println(conn);
        System.out.println("FIN PROGRAMA");
    }
}
