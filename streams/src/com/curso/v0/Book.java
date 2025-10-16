package com.curso.v0;

import java.util.List;

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
        System.out.println("LIBRO");
        List<Book> books = List.of(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller"));

        Reader r = b -> {
            System.out.println("Reading book " + b.getTitle());
        };

        books.forEach(x -> r.read(x));
    }
}

@FunctionalInterface
interface Reader{
    void read(Book b);
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

