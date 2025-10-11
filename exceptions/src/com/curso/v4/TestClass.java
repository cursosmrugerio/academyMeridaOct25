package com.curso.v4;

import java.io.IOException;

class MyException extends Exception{ //CHECKED
    private final int code;
//    public MyException(int code, Throwable actualEx){
//        super(actualEx);
//        this.code = code;
//    }
    public MyException(int code, String message, Throwable actualEx){ //<==
        super(message,actualEx);
        this.code = code;
    }
    @Override
    public String getMessage() {
        return String.format("Exception - Code=%d, Msg=%s, OrigMsg=%s",
                code, super.getMessage(), this.getCause().getMessage()); //2
    }
}
public class TestClass {
    public static void main(String[] args)  {
        try {
            throw new MyException(404, "NOT FOUND", new IOException("FILE UNREADABLE"));
        } catch (Exception e) {
            System.out.println( e.getMessage() );
            //Exception - Code=404, Msg=NOT FOUND, OrigMsg=FILE UNREADABLE
        }
    }
}
