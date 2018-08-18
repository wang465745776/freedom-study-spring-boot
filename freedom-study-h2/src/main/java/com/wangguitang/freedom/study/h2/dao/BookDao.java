package com.wangguitang.freedom.study.h2.dao;

import com.wangguitang.freedom.study.h2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book,Long>{

}
