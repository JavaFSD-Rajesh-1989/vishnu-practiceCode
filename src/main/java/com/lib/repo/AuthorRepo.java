package com.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.entity.Author;

public interface AuthorRepo extends JpaRepository<Author,Long>{

}
