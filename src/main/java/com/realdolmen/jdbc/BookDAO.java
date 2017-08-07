package com.realdolmen.jdbc;

import java.util.List;

/**
 * Created by vdabcursist on 07/08/2017.
 */
public interface BookDAO {

    void createBook(Book b);

    void updateBook (Book b);

    List<Book> findBookByTitle(String title);

    List<Book> findBookById(Integer id);

    List<Book> findBookByAuthor(String author);

    List<Book> FindAllBooks();


}
