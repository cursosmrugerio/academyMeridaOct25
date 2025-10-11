package com.curso.v0;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Scrap {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                m2();
            else
                m3();
        }
        // INSERT CODE HERE
        catch(IOException|IndexOutOfBoundsException e){ } //FUNCIONA

        //catch(RuntimeException re){ }
        //catch(FileNotFoundException|IndexOutOfBoundsException e){ }

        // No puede existir superclases con subclases en un Multicatch
        // catch(IOException | RuntimeException | IndexOutOfBoundsException e){ }
        /*
        catch(IOException e){
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }*/


        // catch(IOException | IndexOutOfBoundsException e){ }
        // catch(FileNotFoundException fe){ }
        // catch(IOException e){ } //VALIDA
        System.out.println("FIN PROGRAMA");
    }

    public static void m2() throws IOException {
        throw new FileNotFoundException(); //Checked
    }

    public static void m3() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException(); //Unchecked RuntimeException
    }
}

