package com.library.library.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
