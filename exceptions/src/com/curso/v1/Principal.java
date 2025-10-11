package com.curso.v1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            procesa();
        }

        catch (FileNotFoundException e) { //SUBCLASE
            System.out.println("1: "+e);
        }
        catch (IOException e) { //SUPERCLASE
            System.out.println("2: "+e);
        }
        catch (Exception e) { //SUPERCLASE
            System.out.println("3: "+e);
        }

    }

    private static void procesa() throws IOException {
        throw new FileNotFoundException(); //Checked
    }
}
