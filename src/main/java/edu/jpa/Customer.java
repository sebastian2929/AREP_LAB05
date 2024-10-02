package edu.jpa; // Declaración del paquete donde se encuentra la clase

import jakarta.persistence.Entity; // Importación de la anotación Entity para definir una entidad JPA
import jakarta.persistence.GeneratedValue; // Importación de la anotación para indicar que el valor es generado automáticamente
import jakarta.persistence.GenerationType; // Importación de la clase que define las estrategias de generación de ID
import jakarta.persistence.Id; // Importación de la anotación para definir la clave primaria de la entidad

@Entity // Anotación que indica que esta clase es una entidad JPA
public class Customer { // Declaración de la clase Customer

    @Id // Anotación que indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.AUTO) // Anotación que indica que el valor del ID se generará automáticamente
    private Long id; // Campo para almacenar el identificador único del cliente
    private String firstName; // Campo para almacenar el nombre del cliente
    private String lastName; // Campo para almacenar el apellido del cliente

    // Constructor protegido sin parámetros, requerido por JPA
    protected Customer() {}

    // Constructor que recibe el nombre y apellido del cliente
    public Customer(String firstName, String lastName) {
        this.firstName = firstName; // Asigna el nombre al campo
        this.lastName = lastName; // Asigna el apellido al campo
    }

    // Método toString para representar la entidad como cadena
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']", // Formato de la representación
                id, firstName, lastName); // Inserción de valores en el formato
    }

    // Métodos getter y setter para acceder y modificar los campos

    public Long getId() { // Método para obtener el ID del cliente
        return id; // Retorna el ID
    }

    // Método para obtener el nombre del cliente
    public String getFirstName() {
        return firstName; // Retorna el nombre
    }

    // Método para obtener el apellido del cliente
    public String getLastName() {
        return lastName; // Retorna el apellido
    }

    // Método para establecer el ID del cliente
    public void setId(long id) {
        this.id = id; // Asigna el valor del ID
    }

    // Método para establecer el nombre del cliente
    public void setFirstName(String firstName) {
        this.firstName = firstName; // Asigna el valor del nombre
    }

    public void setLastName(String lastName) { // Método para establecer el apellido del cliente
        this.lastName = lastName; // Asigna el valor del apellido
    }
}
