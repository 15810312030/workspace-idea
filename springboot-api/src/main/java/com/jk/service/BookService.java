package com.jk.service;

import com.jk.model.Book;

import java.util.List;

/*
 * @Author : 乔光辉
 * @Date : 2018/12/21$ 21:19$
 * @Description : $
 */
public interface BookService {


    List<Book> queryBookList();

    void saveBook(Book book);

    void updateBookInfo(Book book);


    Book getBookInfoById(Integer id);
}
