package edu.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropertyRepository extends CrudRepository<Property, Long> {
    List<Property> findAll();
}
