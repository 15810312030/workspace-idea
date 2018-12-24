/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Book
 * Author:   zyl
 * Date:     2018/12/21 14:18
 * Description: this is book
 * History:
 */
package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="t_book")
public class Book implements Serializable {

    private static final long serialVersionUID = -3363681305945128825L;


    @Id
    @GeneratedValue
    private Integer bookId;

    @Column(name="book_name")
    private String book_name;

    private  Integer bookType;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bookDate;

    private String bookUrl;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }



    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", book_name='" + book_name + '\'' +
                ", bookType=" + bookType +
                ", bookDate=" + bookDate +
                ", bookUrl='" + bookUrl + '\'' +
                '}';
    }
}
