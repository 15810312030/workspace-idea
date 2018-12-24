package com.jk.controller;

import com.jk.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.jk.model.Book;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
 * @Author : 乔光辉
 * @Date : 2018/12/21$ 22:10$
 * @Description : $
 */
@Controller
public class BookController {

    @Autowired
    private com.jk.service.BookService BookService;

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "/index";
    }

    @RequestMapping("/queryBookList")
    @ResponseBody
    public List<Book> queryBookList(){
        return BookService.queryBookList();
    }

    @RequestMapping("/saveBook")
    @ResponseBody
    public String saveBook(Book book){
        try {
            if(book.getBookId() == null) {
                BookService.saveBook(book);
                return "1";
            }else {
                BookService.updateBookInfo(book);
                return "1";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    @RequestMapping("/getBookInfoById")
    @ResponseBody
    public Book getBookInfoById(Integer id) {
        Book book = BookService.getBookInfoById(id);
        return book;
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request
            , @RequestParam(value="picFile",required=false) MultipartFile file) {
        String path = FileUtil.FileUpload(file, request);
        if (path.contains("null")) {
            return null;
        } else {
            return path;
        }
    }

}
