package com.tommy.why.controller;


import com.tommy.why.pojo.Books;
import com.tommy.why.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list",books);
        return "allBook";
    }
    
    
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }

    @RequestMapping("/add")
    public String addBook(Books books){
        System.out.println("add book"+books);
//        Books book = new Books();
        int i = bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";

    }

    @RequestMapping("/update")
    public String updateBook(Books books){
        System.out.println(books);
        int i = bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/delete/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){

        int i = bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}
