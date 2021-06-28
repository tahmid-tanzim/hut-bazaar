package com.oneleven.library;

import com.oneleven.book.Book;

import javax.persistence.*;
import java.util.List;

@Entity
public class Library {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "library")
    private List<Book> books;

    public Library() {
    }

    public Library(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
