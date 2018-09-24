package com.example.aginovbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "booksdelivery")
public class BooksDelivery implements Serializable {

    @Id
    @Column(name = "id_delivery")
    private Long id_delivery;
    private Date out_date;
    private Date in_date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_books")
    private Books books;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_reader")
    private Readers readers;

    public BooksDelivery () {}

    public Long getId_delivery() {
        return id_delivery;
    }

    public Date getOut_date() {
        return out_date;
    }

    public Date getIn_date() {
        return in_date;
    }

    public Books getBooks() {
        return books;
    }

    public Readers getReaders() {
        return readers;
    }

    public void setId_delivery(Long id_delivery) {
        this.id_delivery = id_delivery;
    }

    public void setOut_date(Date out_date) {
        this.out_date = out_date;
    }

    public void setIn_date(Date in_date) {
        this.in_date = in_date;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public void setReaders(Readers readers) {
        this.readers = readers;
    }
}
