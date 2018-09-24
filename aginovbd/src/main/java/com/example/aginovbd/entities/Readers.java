package com.example.aginovbd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "readers")
public class Readers implements Serializable {

    @Id
    @Column(name = "id_reader")
    private Long id_reader;
    private String reader_SNL;
    private String reader_address;
    private Long reader_number;

    @JsonIgnore
    @OneToMany(mappedBy = "readers")
    private Collection<Readers> readers;

    public Readers() {}

    public Long getId_reader() {
        return id_reader;
    }

    public String getReader_SNL() {
        return reader_SNL;
    }

    public String getReader_address() {
        return reader_address;
    }

    public Long getReader_number() {
        return reader_number;
    }

    public Collection<Readers> getReaders() {
        return readers;
    }

    public void setId_reader(Long id_reader) {
        this.id_reader = id_reader;
    }

    public void setReader_SNL(String reader_SNL) {
        this.reader_SNL = reader_SNL;
    }

    public void setReader_address(String reader_address) {
        this.reader_address = reader_address;
    }

    public void setReader_number(Long reader_number) {
        this.reader_number = reader_number;
    }

    public void setReaders(Collection<Readers> readers) {
        this.readers = readers;
    }
}
