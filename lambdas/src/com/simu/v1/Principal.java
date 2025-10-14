package com.simu.v1;

import java.util.function.Consumer;
import java.util.function.Function;

class Book {
    private int id;
    private String title;
    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
//    @Override
//    public String toString() {
//        return "id: " + id + ", title: " + title;
//    }
}

public class Principal {

    public static void main(String[] args) {
        Book book = new Book(1,"PHP");

        Consumer<Book> c = System.out::println;
        c.accept(book); //DIRECCION MEMORIA DEL LIBRO

        System.out.println("************");

        Consumer<Book> c0 = b -> {
                                  System.out.println("PASO POR CONSUMER");
                                  String details = b.getId()+":"+b.getTitle();
                          };
        c0.accept(book); //PASO POR CONSUMER
        System.out.println(c0); //DIRECCION DE MEMORIA DE LA LAMBDA CONSUMER

        //Consumer<Book> c = b->System.out.println(b.getId()+":"+b.getTitle());
        //c.accept(book);

        //Consumer<Book> c = b -> b.getId()+":"+b.getTitle();
        //c.accept(book);
        //Function<Book,String> f = b -> b.getId()+":"+b.getTitle();
    }

}
