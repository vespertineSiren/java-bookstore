package dev.vespertine.javabookstore.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long sectionid;

    private String name;



    @OneToMany(mappedBy = "section")
    @JsonIgnoreProperties("section")
    private Set<Book> books = new HashSet<>();

    public long getSection() {
        return sectionid;
    }

    public void setSection(long section) {
        this.sectionid = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
