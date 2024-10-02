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
    public CommandLineRunner demo(PropertyRepository repository) {
        return (args) -> {
            // fetch all properties
            System.out.println("Properties found with findAll():");
            System.out.println("-------------------------------");
            repository.findAll().forEach(property -> {
                System.out.println(property.toString());
            });
            System.out.println("");
        };
    }
}
