package edu.jpa;

import java.util.List; // Importa la clase List para manejar colecciones de objetos

import org.springframework.data.repository.CrudRepository; // Importa la interfaz CrudRepository de Spring Data

// Interfaz que extiende CrudRepository para manejar operaciones CRUD en la entidad Customer
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    // Método para encontrar una lista de clientes por su apellido
    List<Customer> findByLastName(String lastName);

    // Método para encontrar un cliente por su ID
    Customer findById(long id);
}
