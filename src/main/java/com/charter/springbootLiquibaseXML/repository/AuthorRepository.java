package com.charter.springbootLiquibaseXML.repository;

import com.charter.springbootLiquibaseXML.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}