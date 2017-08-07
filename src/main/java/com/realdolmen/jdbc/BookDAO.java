package com.realdolmen.jdbc;

import java.util.List;

/**
 * Created by vdabcursist on 07/08/2017.
 */
public interface BookDAO {

    void createBook(Book b);
    List<Book> findBookByTitle(String Title);




}
