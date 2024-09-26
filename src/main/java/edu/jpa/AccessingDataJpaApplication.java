package edu.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(FootballPlayerRepository repository) {
        return (args) -> {
            // fetch all players
            log.info("Players found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(player -> {
                log.info(player.toString());
            });
            log.info("");
        };
    }
}
