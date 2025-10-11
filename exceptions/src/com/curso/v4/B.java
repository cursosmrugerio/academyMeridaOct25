package com.curso.v4;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    byte getStatusCode(Object obj) throws NullPointerException {
        if (obj != null) return (byte)128; //-128
        else return -1;
    }
    //byte -128 a 127
}

class B extends A {
    @Override
    byte getStatusCode(Object obj)  {
        if (obj != null) return (byte)128; //-128
        else return -1;
    }
}