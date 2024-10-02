# Sistema de Gestión de Propiedades - CRUD

## Resumen del Proyecto

Este proyecto es un sistema CRUD (Crear, Leer, Actualizar, Eliminar) diseñado para gestionar propiedades inmobiliarias. A través de una aplicación web, los usuarios pueden realizar las siguientes operaciones sobre las propiedades:

- Crear nuevos anuncios de propiedades.
- Ver una lista de todas las propiedades disponibles y los detalles individuales de cada una.
- Actualizar la información de las propiedades existentes.
- Eliminar propiedades de la lista.

## Arquitectura del Sistema

El sistema está compuesto por tres partes principales:

1. **Frontend (HTML + JavaScript)**:
   - Interfaz gráfica que permite a los usuarios interactuar con el sistema.
   - Los usuarios pueden agregar, visualizar, editar y eliminar propiedades mediante formularios y listas.
   - Se utiliza JavaScript con Fetch API o AJAX para enviar las solicitudes al backend.

2. **Backend (Spring Boot REST API)**:
   - Proporciona los servicios REST necesarios para realizar las operaciones CRUD.
   - Contiene las clases y controladores para gestionar las propiedades (creación, obtención, actualización y eliminación).
   - Conecta el frontend con la base de datos para la persistencia de datos.

3. **Base de Datos (MySQL)**:
   - Almacena la información de las propiedades en una tabla llamada `properties`.
   - Se utiliza JPA/Hibernate para mapear los objetos del backend a la base de datos.

### Interacción entre los componentes

- El **frontend** envía solicitudes HTTP al **backend** a través de Fetch API.
- El **backend** maneja estas solicitudes con controladores que interactúan con la **base de datos** utilizando JPA/Hibernate.
- Las respuestas del backend son enviadas de vuelta al frontend, donde se actualiza la interfaz de usuario en tiempo real.

## Diseño de Clases

Las clases principales del sistema incluyen:

1. **Property**: Clase que representa una propiedad, con atributos como `id`, `address`, `price`, `size`, y `description`.
2. **PropertyService**: Servicio que contiene la lógica de negocio para las operaciones CRUD de las propiedades.
3. **PropertyController**: Controlador REST que gestiona las solicitudes HTTP y coordina las operaciones con la base de datos.
4. **PropertyRepository**: Repositorio que se encarga de las interacciones directas con la base de datos.

### Diagramas

![image](https://github.com/user-attachments/assets/63a19d32-0f31-4fc3-b849-ddb6fbaf5c9b)
![image](https://github.com/user-attachments/assets/a11ae2c9-72ac-44f1-975f-15d0435716bf)

## Instrucciones de Despliegue

Sigue estos pasos para configurar y desplegar el sistema en AWS:

1. Configuración del entorno local:
- Asegúrate de tener instalado Java, Maven y MySQL.
- Clona el repositorio del proyecto:
``` 
git clone https://github.com/sebastian2929/AREP_LAB05.git
```
2. Configuración de la Base de Datos (MySQL):

- La base de datos se va a crear por medio de un docker compose para levantar y ejecutar los servicios definidos en un archivo
- Usa el siguiente comando estando en el directorio del proyecto:
``` 
docker-compose up -d
```

3. Compilación y ejecución del Backend:
- Utiliza Maven para compilar y ejecutar la aplicación:
``` 
mvn clean install
mvn spring-boot:run
``` 

4. Ejecución

- [Ir a localhost](http://localhost:8080)

## Capturas de Pantalla
#### Crear Nueva Propiedad
![image](https://github.com/user-attachments/assets/856217fd-0302-4942-9949-926875441407)

![image](https://github.com/user-attachments/assets/ebaead67-d48b-4168-85e4-d0a3d4593acf)

#### Lista de Propiedades

![image](https://github.com/user-attachments/assets/873260e5-459b-4fc0-afc3-49f271b30e6a)

![image](https://github.com/user-attachments/assets/ebaead67-d48b-4168-85e4-d0a3d4593acf)

#### Actualizar Propiedad

![image](https://github.com/user-attachments/assets/c9404fe0-9016-4af5-adda-3da055f7f54d)
![image](https://github.com/user-attachments/assets/6c30d03e-4870-4122-a3ab-561530d3b48f)
![image](https://github.com/user-attachments/assets/232249d5-1bbd-46e3-a4b3-75c8d8a64352)
![image](https://github.com/user-attachments/assets/e565e8dd-5df8-427f-a350-8b939b3c71b1)
![image](https://github.com/user-attachments/assets/21271101-6e0a-4310-a875-92e304d727e3)
#### Eliminar Propiedad


![image](https://github.com/user-attachments/assets/4e854806-2fe4-4fe1-82c0-3ea54a00578f)
![image](https://github.com/user-attachments/assets/b416409a-295e-4662-8d3d-102b119cf709)
![image](https://github.com/user-attachments/assets/afe5e23a-333a-4b60-be6f-fd6bea146127)

#### Test funcionando

![image](https://github.com/user-attachments/assets/c7c75d42-a9db-4881-8482-a593ce508ccc)

## Autor

- [Sebastián David Blanco Rodríguez](https://github.com/Sebastian2929)


## Licencia


Este proyecto está bajo la Licencia (MIT) - ver el archivo [LICENSE](LICENSE.md) para ver más detalles.


