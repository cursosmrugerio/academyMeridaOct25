package com.curso.v3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        FileInputStream tempFis = null;
        try (FileInputStream fis = new FileInputStream("c:\\temp\\test.text")) {
            System.out.println(fis);
            tempFis = fis;
        }
        catch(IOException e){ }
        finally{
            try {
                tempFis.close();
            } catch (IOException e) {
            }
        }

//        catch (FileNotFoundException e){
//            //Exception que atrapa el constructor de FileInputStream(String)
//        }
//        catch (IOException e){
//            //Exception que lanza el metodo close()
//        }
//        catch (Throwable e){
//        }

//        finally{
//            tempFis.close();
//        }

    }
}
