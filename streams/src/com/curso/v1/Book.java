package com.curso.v1;

import java.util.List;
import java.util.function.Consumer;

public class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static void main(String[] args) {
        System.out.println("LIBRO Consumer");
        List<Book> books = List.of(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller"));

        Reader r = b -> {
            System.out.println("Reading book " + b.getTitle());
            return 0;
        };

        //Consumer: t -> void
        Consumer<Book> consumer = x -> r.read(x);
        books.forEach(consumer);
    }
}

@FunctionalInterface
interface Reader{
    int read(Book b);
    default void unread(Book b){}
}


//@FunctionalInterface
//interface Reader{
//    default void read(Book b){
//        //System.out.println("Reading book " + b.getTitle());
//    }
//    void unread(Book b);
//}


//NO CONTIENE EL METODO abstract
//@FunctionalInterface
//interface Reader{
//    default void read(Book b){ System.out.println("Default read");};
//}

//abstract class Reader{
//    abstract void read(Book b);
//}

//SOLO SE PUEDEN CREAR LAMBDAS DE INTERFACES
//abstract class Reader{
//    abstract void read(Book b);
//}

