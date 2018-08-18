package com.wangguitang.freedom.study.h2.controller;

import com.wangguitang.freedom.study.h2.entity.Book;
import com.wangguitang.freedom.study.h2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 获取图书
     * @author freedom wang
     * @date 2018-08-15 08:35:07
     * @since 1.0
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable long id) {
        return  bookService.getBook(id);
    }

}
