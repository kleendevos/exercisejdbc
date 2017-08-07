package com.realdolmen.jdbc;

import java.util.List;

/**
 * Created by vdabcursist on 07/08/2017.
 */
public class BooksApp {
    public static void main(String[] args) {
        BookDAO dao = new BookDAOImpl();

        //dao.createBook(new Book(5,"title 4", "Some Body Else"));
        //dao.createBook(new Book(6, "title 3", "Some One Else"));

        List<Book> books = dao.findBookByTitle("Game");
        books.forEach(System.out::println);

        List<Book> books1 = dao.findBookById(1);
        books1.forEach(System.out::println);

        List<Book> books2 = dao.findBookByAuthor("So");
        books2.forEach(System.out::println);

        List<Book> books3 = dao.FindAllBooks();
        books3.forEach(System.out::println);

    }
    }

