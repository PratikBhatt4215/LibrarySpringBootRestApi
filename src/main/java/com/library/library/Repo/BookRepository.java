package com.library.library.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
