package com.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lib.entity.Book;

public interface BookRepo  extends  JpaRepository<Book,Long>{
    @Query("select case when count(b)>0 then true else false end from Book b where b.title=?1")
	boolean existsByTitle(String title);

}
