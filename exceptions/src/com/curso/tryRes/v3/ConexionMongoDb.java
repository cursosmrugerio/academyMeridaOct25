package com.curso.tryRes.v3;

import java.io.IOException;

public class ConexionMongoDb implements AutoCloseable {

    private String host;
    ConexionMongoDb(String host){
        this.host = host;
    }

    void open() throws IOException {
        System.out.println("OPEN CONEXION MONGODB");
        throw new IOException();
    }

    @Override
    public void close() throws IOException {
        System.out.println("CLOSE CONEXION MONGODB");
        //throw new IOException();
    }
}
