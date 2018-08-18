package com.wangguitang.freedom.study.h2.service.impl;

import com.wangguitang.freedom.study.h2.dao.BookDao;
import com.wangguitang.freedom.study.h2.entity.Book;
import com.wangguitang.freedom.study.h2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Book - ServiceImpl
 * @author freedom wang
 * @date 2018-08-14 23:37:06
 * @since 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getBooks() {
        return null;
    }

    @Override
    public Book getBook(Long id) {
        return bookDao.findById(id).get();
    }

    @Override
    public int addBook(Book book) {
        return 0;
    }

    @Override
    public int updateBook(Book book) {
        return 0;
    }

    @Override
    public int deleteBook(long id) {
        return 0;
    }
}
