# EjercicioIOET

Aplicación creada utilizando [JAVA](https://www.java.com/es/), como IDE [Eclipse](https://www.eclipse.org/).

## :page_facing_up: Estructura del proyecto y Explicación
El proyecto de su carpeta fuente **src** tiene 3 paquetes:  
-**Entities**: Representa las entidades u clases que simplifican los datos. En estas se encuentran:  
  >**Schedule.java**: Esta clase representa el horario formado por el dia y la hora de trabajo.  
  >**Employee.java**: Aquí se crean los objetos empleados con su respectivo nombre y un ArrayList de schedules.  
  >**PairOfEmployees.java**: Luego de leer los datos del fichero, este objeto permitira crear el par de empleado con sus respectivos nombres y el contador de las veces que comparten schedules.  
  >**Results.java**: Este almacenara los pares de empleados que comparten schedules. Contiene la función que compara si un par de nombres ya esta agregado, caso contrario lo agrega a la lista atributo de esta clase.  
 -**fileRead**: Esta clase contiene la función que permite la lectura del fichero. 
    Dentro de la función **read** se crean los objetos de lectura de fichero. Se lee cada linea, y como la estructura de cada línea indica que lo que esta antes del igual es el nombre y despues las schedules. Se van creando los objetos schedules. Con estos se crea la lista de schedules y el nombre obtenido de la lectura se crea un objeto Employees, mismo que se va agregando al array que devuleve la función. Finalmente manejamos unas excepciones y realizamos los cierres de los objetos de lectura de ficheros.  
 -**TestSchedule**: Esta clase contiene la función **main** del proyecto.  
  Contiene las funciones **compareSchedules** que realiza la comparación de la listas de schedules pasadas por cada para de nombres comparados.  
  Tambien tiene la función **showResults** que mapea un objeto Results con los pares de empleados que tienen horarios similares.  
  En la función **main**, se comienza realizando la lectura del fichero con la funcion read de la clase fileRead. Luego hacemos el cáculo de combinaciones posibles dentro del numero general de empleados obtenidos. A continuación, se recorre la lista obtenida de la lectura del fichero, se va realizando las comparaciones, aqui se llama a la función compareSchedules y addPair que agrega el par de empleado al objeto Results.
 ## ⚙️ Ejecutar el proyecto  
 >Para ejecutar el proyecto localmente se debe de contar con un IDE de java por ejemplo Eclipse que fue utilizado aqui, tambien se puede usar otros como Netbeans, etc.  
 >Para hacer el menor cambio posible. Cree la carpeta **empleados** en su disco local C **C:\** y pegue los ficheros **empleados1.txt** y **empleados2.txt** encontados en este repositorio.  
 >En el caso que se requiera cambie la línea 18 de TestSchedule la parte del nombre del fichero **empleados1 o empleados2** para la ejecución de cualquiera de los dos archivos.  
 >Si desea agregue más líneas a estos ficheros, recuerde mantener el formato. Un **=** que separe el nombre un los schedules, y cada schedule separado por un **,**.  
 >Finalmente ejecute **TestSchedules** se visualizará en consola los resultados.
 
