package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListPlayGround {

    public static void showHowToUseListWorkWithStreams() {
        List<Book> books = new ArrayList<>(); // Creating a list of Book

        // Adding three books to the List
        books.add(new Book("TDD", 0 ,0));
        books.add(new Book("Effective Java", 0, 0));
        books.add(new Book("Clean code", 0,0));


        //Using that list to create a brand new
        List<Book> TDDBooks = books.stream()
                .filter(book -> book.getName().contains("TDD")).toList();
        // This the list of books

        //Print the new list of books
        TDDBooks.forEach(book -> System.out.println(book.getName()));
    }
}
