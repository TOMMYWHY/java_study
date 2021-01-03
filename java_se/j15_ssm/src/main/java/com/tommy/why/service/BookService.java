package com.tommy.why.service;

import com.tommy.why.pojo.Books;

import java.util.List;

public interface BookService {
    int addBook(Books books);
    int deleteBookById(int id);
    int updateBook(Books book);
    Books queryBookById(int id);
    List<Books> queryAllBooks();
}
