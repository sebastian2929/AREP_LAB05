package edu.jpa;

import org.slf4j.Logger; // Importa la clase Logger para registro de logs
import org.slf4j.LoggerFactory; // Importa la fábrica de Logger
import org.springframework.boot.CommandLineRunner; // Importa la interfaz CommandLineRunner
import org.springframework.boot.SpringApplication; // Importa la clase SpringApplication para ejecutar la aplicación
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importa la anotación para configuración automática de Spring Boot
import org.springframework.context.annotation.Bean; // Importa la anotación para definir beans en el contexto de Spring

@SpringBootApplication // Anotación que indica que es una aplicación Spring Boot
public class AccessingDataJpaApplication {

    // Logger para registrar información durante la ejecución de la aplicación
    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    // Método principal que inicia la aplicación Spring Boot
    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args); // Lanza la aplicación
    }

    // Método que define un bean de tipo CommandLineRunner
    @Bean
    public CommandLineRunner demo(PropertyRepository repository) {
        return (args) -> {
            // Mensaje que indica que se buscarán todas las propiedades
            System.out.println("Properties found with findAll():");
            System.out.println("-------------------------------");

            // Llama al método findAll() del repositorio para obtener todas las propiedades
            repository.findAll().forEach(property -> {
                // Imprime cada propiedad encontrada en la consola
                System.out.println(property.toString());
            });
            System.out.println(""); // Línea en blanco para mejorar la legibilidad
        };
    }
}
