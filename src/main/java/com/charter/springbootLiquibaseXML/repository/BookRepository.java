package com.charter.springbootLiquibaseXML.repository;

import com.charter.springbootLiquibaseXML.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
