package com.jk.mapper;

import com.jk.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @Author : 乔光辉
 * @Date : 2018/12/21$ 19:44$
 * @Description : dao层
 */
@Repository
public interface BookMapper extends JpaRepository<Book,Integer> {

}
