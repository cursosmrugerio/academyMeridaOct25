package com.curso.v0;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Scrap2 {
    public static void main(String[] args) {
        try {
            try {
                if (args.length == 0) m2();else m3();
            }catch (Exception e){}
        }catch (Exception e){}

        System.out.println("FIN PROGRAMA");
    }

    public static void m2() throws IOException {
        throw new FileNotFoundException(); //Checked
    }

    public static void m3() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException(); //Unchecked RuntimeException
    }
}

