package com.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.entity.User;

public interface UserRepo extends JpaRepository<User,Long>{

}
