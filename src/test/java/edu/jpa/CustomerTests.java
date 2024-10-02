package edu.jpa;

import org.junit.jupiter.api.Test; // Importa la anotación para definir métodos de prueba
import static org.junit.jupiter.api.Assertions.*; // Importa las aserciones de JUnit

class CustomerTests {

    // Prueba para verificar la creación de un nuevo cliente
    @Test
    void customerCreationTest() {
        Customer customer = new Customer("John", "Doe"); // Crea un nuevo cliente
        assertNotNull(customer); // Verifica que el cliente no sea nulo
        assertEquals("John", customer.getFirstName()); // Verifica el nombre
        assertEquals("Doe", customer.getLastName()); // Verifica el apellido
    }

    // Prueba para verificar el ID de un cliente
    @Test
    void customerIdTest() {
        Customer customer = new Customer("Jane", "Smith");
        customer.setId(1L); // Establece un ID
        assertEquals(1L, customer.getId()); // Verifica que el ID se haya establecido correctamente
    }

    // Prueba para verificar la representación en cadena del cliente
    @Test
    void customerToStringTest() {
        Customer customer = new Customer("Alice", "Wonderland");
        customer.setId(2L); // Establece un ID
        String expected = "Customer[id=2, firstName='Alice', lastName='Wonderland']"; // Representación esperada
        assertEquals(expected, customer.toString()); // Verifica la representación en cadena
    }

    // Prueba para verificar el constructor por defecto
    @Test
    void defaultConstructorTest() {
        Customer customer = new Customer(); // Crea un cliente usando el constructor por defecto
        assertNotNull(customer); // Verifica que el cliente no sea nulo
    }

    // Prueba para verificar el nombre de pila del cliente
    @Test
    void customerFirstNameTest() {
        Customer customer = new Customer("Tom", "Jones");
        assertEquals("Tom", customer.getFirstName()); // Verifica el nombre de pila
    }

    // Prueba para verificar el apellido del cliente
    @Test
    void customerLastNameTest() {
        Customer customer = new Customer("Tom", "Jones");
        assertEquals("Jones", customer.getLastName()); // Verifica el apellido
    }

    // Prueba para establecer un nuevo nombre de pila
    @Test
    void setFirstNameTest() {
        Customer customer = new Customer("John", "Doe");
        customer.setFirstName("Johnny"); // Establece un nuevo nombre de pila
        assertEquals("Johnny", customer.getFirstName()); // Verifica el nuevo nombre de pila
    }

    // Prueba para establecer un nuevo apellido
    @Test
    void setLastNameTest() {
        Customer customer = new Customer("John", "Doe");
        customer.setLastName("Doe Jr."); // Establece un nuevo apellido
        assertEquals("Doe Jr.", customer.getLastName()); // Verifica el nuevo apellido
    }

    // Prueba para verificar que el ID del cliente es nulo inicialmente
    @Test
    void customerIdIsNullInitially() {
        Customer customer = new Customer("John", "Doe");
        assertNull(customer.getId()); // Verifica que el ID sea nulo al inicio
    }

    // Prueba para establecer y verificar el ID de un cliente
    @Test
    void customerSetIdTest() {
        Customer customer = new Customer("Alice", "Smith");
        customer.setId(3L); // Establece un ID
        assertEquals(3L, customer.getId()); // Verifica que el ID se haya establecido correctamente
    }
}
