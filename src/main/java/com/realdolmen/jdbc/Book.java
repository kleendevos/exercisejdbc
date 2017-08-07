package com.realdolmen.jdbc;

import java.io.Serializable;

/**
 * Created by vdabcursist on 07/08/2017.
 */
public class Book implements Serializable {

    private Integer id;
    private String title;
    private String author;

    public Book(Integer id,String title,String author) {
        this.title = title;
        this.id = id;
        this.author = author;
    }

    public Book() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", id=").append(id);
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
