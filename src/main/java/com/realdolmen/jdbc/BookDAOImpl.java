package com.realdolmen.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 07/08/2017.
 */
public class BookDAOImpl implements BookDAO {


    @Override
    public void createBook(Book b) {
//try with resources zorgt voor automatisch sluiten van de connectie aan het einde

        try (Connection connection = ConnectionFactory.INSTANCE.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO book (id, title, author) VALUES (?,?,?)"); // vraagtekens beveiligen tegen misbruik bij input in database

            statement.setInt(1,b.getId());
            statement.setString(2,b.getTitle());
            statement.setString(3,b.getAuthor());

            statement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Book> findBookByTitle(String title) {

    try (Connection connection = ConnectionFactory.INSTANCE.getConnection()) {
        PreparedStatement statement = connection.prepareStatement("SELECT id, title, author FROM book WHERE title LIKE ?");

        statement.setString(1,title + "%");
        ResultSet rs = statement.executeQuery();
        List<Book> books = new ArrayList<>();
        while (rs.next()){
            books.add(new Book(rs.getInt("id"),rs.getString("title"),rs.getString("author")));
        }
        return books;

    } catch (SQLException e) {
        e.printStackTrace();
    }

        return null;
    }

}
