# Proyecto de Spring Boot

Este proyecto es una aplicación de Spring Boot que gestiona productos e ítems. A continuación, se describen las principales características y cómo configurar el proyecto.

## Tecnologías utilizadas

- **Java**
- **Spring Boot**
- **Maven**

## Estructura del proyecto

El proyecto está organizado de la siguiente manera:

- `src/main/java/com/niko/sbc/items/models/`: Contiene las clases de modelo `Product` e `Item`.
- `src/main/java/com/niko/sbc/items/services/`: Contiene la interfaz `ItemService`.

## Clases principales

### Product

Representa un producto con los siguientes atributos:

- `id`: Identificador único del producto.
- `name`: Nombre del producto.
- `price`: Precio del producto.
- `createdAt`: Fecha de creación del producto.

### Item

Representa un ítem que contiene un producto y una cantidad. Tiene un método `getTotal` que calcula el total del ítem multiplicando el precio del producto por la cantidad.

### ItemService

Interfaz que define los métodos para obtener todos los ítems y obtener un ítem por su ID.

## Configuración del proyecto

Para configurar y ejecutar el proyecto, sigue estos pasos:

1. **Clonar el repositorio**:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd <NOMBRE_DEL_PROYECTO>
    ```

2. **Compilar el proyecto**:
    ```sh
    mvn clean install
    ```

3. **Ejecutar la aplicación**:
    ```sh
    mvn spring-boot:run
    ```

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios a tu fork (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.# sbcItems
