package com.realdolmen.jdbc;

import java.util.List;

/**
 * Created by vdabcursist on 07/08/2017.
 */
public class BooksApp {
    public static void main(String[] args) {
        BookDAO dao = new BookDAOImpl();

        dao.createBook(new Book(3,"Game of Cards", "Some One"));

        List<Book> books = dao.findBookByTitle("Game");
        books.forEach(System.out::println);

    }
    }

