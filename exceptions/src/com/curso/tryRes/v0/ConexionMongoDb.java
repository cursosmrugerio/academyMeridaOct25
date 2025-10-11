package com.curso.tryRes.v0;

import java.io.IOException;

public class ConexionMongoDb {

    private String host;
    ConexionMongoDb(String host){
        this.host = host;
    }

    void open() throws IOException {
        System.out.println("OPEN CONEXION MONGODB");
        //throw new IOException();
    }

    void close() throws IOException {
        System.out.println("CLOSE CONEXION MONGODB");
        //throw new IOException();
    }

}
