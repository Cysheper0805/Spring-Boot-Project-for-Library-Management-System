package com.cysheper.pojo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@lombok.Data
@lombok.ToString
public class Book {
    private String name;
    private Integer book_id;
    private String price;
    private String author;
    private String exist;
    private Integer reader;

    public Book() {
        this.name = "null";
        this.book_id = 0;
        this.price = "null";
        this.author = "null";
        this.exist = "未借出";
        this.reader = 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getExist() {
        return exist;
    }

    public void setExit(String exist) {
        this.exist = exist;
    }

    public Integer getReader() {
        return reader;
    }

    public void setReader(Integer reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", book_id=" + book_id +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                ", exit='" + exist + '\'' +
                ", reader=" + reader +
                '}';
    }
}
