package com.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.entity.Author;

public interface AutherRepo extends JpaRepository<Author,Long>{

}
