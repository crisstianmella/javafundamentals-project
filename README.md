# javafundamentals-project
Proyecto final del curso Java Fundamentals Escalab

Alumno: Crisstian Mella

Endpoints:
1.	Listar todos los usuarios: http://localhost:8080/api/users/

•	Lista todos los usuarios y sus respectivos teléfonos.
•	No requiere de ningún parámetro adicional en la url.
•	No requiere el envio de ningún body.

2.	Crear un usuario: http://localhost:8080/api/users/

•	Crea un usuario en la base de datos a partir de un JSON.
•	No requiere de ningún parámetro adicional en la URL.
•	Requiere el envio de un body en formato JSON.
 
3.	Actualizar un usuario: http://localhost:8080/api/users/{id}

•	Actualiza un usuario dentro de la base de datos.
•	La URL requiere de un parámetro {id} para buscar al usuario en la base de datos y actualizar.
•	Requiere el envio de un body en formato JSON.

4.	Dar de baja un usuario (active: false): http://localhost:8080/api/users/down/{id}

•	Inhabilita o desactiva un usuario en la tabla Users.
•	La URL requiere de un parámetro {id} para buscar al usuario en la base de datos y actualizar su status de activo en la base de datos.
•	No requiere del envío de ningún body.

5.	Dar de alta un usuario (active: true): http://localhost:8080/api/users/up/{id}

•	Habilita o activa a un usuario en la tabla Users.
•	La URL requiere de un parámetro {id} para buscar al usuario en la base de datos y actualizar su status de activo en la base de datos.
•	No requiere del envío de ningún body.
 
6.	Borrar un usuario: http://localhost:8080/api/users/{id}

•	La URL requiere de un parámetro {id} para buscar al usuario en la base de datos y actualizar su status de activo en la base de datos.
•	No requiere del envío de ningún body.
