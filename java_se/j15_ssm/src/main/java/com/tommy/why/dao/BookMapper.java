package com.tommy.why.dao;

import com.tommy.why.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);
    int deleteBookById(@Param("bookId") int id);
    int updateBook( Books book);
    Books queryBookById(@Param("bookId") int id);
    List<Books> queryAllBooks();



}
