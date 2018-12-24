package com.jk.service.impl;
import com.jk.model.Book;

import com.jk.mapper.BookMapper;
import com.jk.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author : 乔光辉
 * @Date : 2018/12/21$ 19:51$
 * @Description : $
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;


    @Override
    public List<Book> queryBookList() {
        return bookMapper.findAll();
    }

    @Override
    public void saveBook(Book book) {
        bookMapper.save(book);
    }

    @Override
    public void updateBookInfo(Book book) {
        bookMapper.save(book);
    }

    @Override
    public Book getBookInfoById(Integer id) {
        Book book = bookMapper.getOne(id);
        return book;
    }
}
