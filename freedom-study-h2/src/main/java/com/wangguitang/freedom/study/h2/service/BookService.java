package com.wangguitang.freedom.study.h2.service;

import com.wangguitang.freedom.study.h2.entity.Book;

import java.util.List;

/**
 * Book-Service
 * @author freedom wang
 * @date 2018-08-14 23:36:28
 * @since 1.0
 */
public interface BookService {

    /**
     * 获取书籍
     * @author freedom wang
     * @date 2018-08-14 23:34:14
     * @since 1.0
     */
    public List<Book> getBooks();

    /**
     * 根据id获取书籍
     * @author freedom wang
     * @date 2018-08-14 23:50:50
     * @since 1.0
     */
    public Book getBook(Long id);

    /**
     * 新增书籍
     * @author freedom wang
     * @date 2018-08-14 23:34:38
     * @since 1.0
     */
    public int addBook(Book book);

    /**
     * 修改书籍
     * @author freedom wang
     * @date 2018-08-14 23:35:02
     * @since 1.0
     */
    public int updateBook(Book book);

    /**
     * 删除书籍
     * @author freedom wang
     * @date 2018-08-14 23:35:43
     * @since 1.0
     */
    public int deleteBook(long id);
}
