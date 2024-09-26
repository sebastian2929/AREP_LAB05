package edu.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FootballPlayerRepository extends CrudRepository<FootballPlayer, Long> {
    List<FootballPlayer> findAll();
}
