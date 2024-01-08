package com.study.ch08.book;

public class Book {
    String bookName;
    String writer;


    Book (String bookName, String writer) {
        this.bookName = bookName;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
