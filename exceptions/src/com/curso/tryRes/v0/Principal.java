package com.curso.tryRes.v0;

import java.io.IOException;

public class Principal {
    public static void main(String[] args)  {
        ConexionMongoDb conn = new ConexionMongoDb("127.0.0.1");

        try {
            conn.open();
        } catch (IOException e) {
            System.out.println(e);
        } //PROBLEMA POR NO CERRAR LA CONEXION DB

        System.out.println("FIN PROGRAMA");
    }
}
