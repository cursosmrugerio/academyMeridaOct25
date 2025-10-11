package com.curso.tryRes.v1;

import java.io.IOException;

public class Principal {
    public static void main(String[] args)  {
        ConexionMongoDb conn = new ConexionMongoDb("127.0.0.1");

        try {
            conn.open();
            System.out.println("PROCESANDO.....");
            Thread.sleep(3000);
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
        finally {
            try {
                conn.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        System.out.println("FIN PROGRAMA");
    }
}
