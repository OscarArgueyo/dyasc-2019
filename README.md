# Diseño y Arquitectura de Sistemas de Computacion - UNTREF 2019
Repositorio con trabajos practicos y tareas de la materia Diseño y Arquitectura de Sistemas de Computacion - UNTREF 2019

## Entrega de Fibo 3
#### Consideraciones y decisiones de diseño
Partiendo de Fibo2 se intento dividir las responsabilidades de la solucion en distintas clases. 
<br>
Se creo una clase para el manejo de parametros mejorando la lectura de los mismos sin importar el orden en que son cargados. <br>
Se creo una clase para el manejo de impresion de la secuencia en sus distintas formas.<br>
Se creo una clase para el manejo de guardado en archivos independiente de las otras clases.<br>
Se creo una interfaz printable que implementa la clase de manejo de impresiones de la secuencia.
Se abstrajo toda la logica de parseo de parametros e impresion de la clase program.
Se quito logica de impresion en la clase de fibonacci y solo se lo dejo con el calculo de su secuencia.