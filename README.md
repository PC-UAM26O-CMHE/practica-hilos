# Práctica de Hilos

Repositorio para la práctica de programación concurrente en Java.

## Primera parte: Solución secuencial

### Descripción

Este programa en Java crea e inicializa un arreglo de números enteros aleatorios y calcula la suma de sus elementos.

El programa realiza las siguientes operaciones:

1. Recibe como argumento el tamaño del arreglo.
2. Inicializa el arreglo con números aleatorios entre 0 y 99.
3. Imprime los elementos del arreglo.
4. Calcula la suma de todos sus elementos.
5. Muestra el identificador del hilo que realiza la suma y el resultado final.

### Tecnologías

- Java
- Arreglos de enteros
- Generación de números aleatorios
- Clase `Thread`

### Compilación

Para compilar el programa, ejecuta:

```bash
javac SumaArreglo.java
```

### Ejecución

El programa recibe como argumento el tamaño del arreglo. Por ejemplo:

```bash
java SumaArreglo 20
```

Este comando crea un arreglo de 20 elementos, muestra sus valores y calcula la suma.

## Segunda parte: Creación de hilos mediante Thread

### Descripción

En esta parte se modifica la clase `SumaArreglo` para que herede de la clase `Thread` y pueda ejecutar el cálculo de la suma mediante varios hilos.

Cada hilo se encargará de sumar una parte del arreglo. El hilo principal esperará a que los trabajadores terminen mediante el método `join()` y después sumará los resultados parciales.

### Conceptos trabajados

- Herencia de la clase `Thread`.
- Sobrescritura del método `run()`.
- Inicio de los hilos mediante `start()`.
- Espera de los hilos mediante `join()`.
- División del arreglo entre varios hilos.
- Almacenamiento de las sumas parciales en un arreglo compartido.

### Compilación

```bash
javac SumaArreglo.java
```

### Ejecución

```bash
java SumaArreglo 20 4
```

El programa recibe el tamaño del arreglo y la cantidad de hilos que se utilizarán.

### Estado

En desarrollo.

---

## Tercera parte: Creación de tareas mediante Runnable

### Descripción

En esta parte se modifica la clase `SumaArreglo` para que implemente la interfaz `Runnable`.

A diferencia de la solución anterior, el objeto `SumaArreglo` representa una tarea y no directamente un hilo. Para ejecutar cada tarea, se crea un objeto `Thread` al que se le pasa la tarea correspondiente.

Cada tarea calculará una suma parcial del arreglo. El hilo principal esperará a que terminen los trabajadores mediante `join()` y acumulará los resultados parciales.

### Conceptos trabajados

- Implementación de la interfaz `Runnable`.
- Sobrescritura del método `run()`.
- Diferencia entre una tarea y un hilo.
- Creación de objetos `Thread` a partir de tareas.
- Inicio y sincronización de los hilos mediante `start()` y `join()`.
- Uso de un arreglo compartido para almacenar los resultados parciales.

### Compilación

```bash
javac SumaArreglo.java
```

### Ejecución

```bash
java SumaArreglo 20 4
```

El programa recibe el tamaño del arreglo y la cantidad de hilos que se utilizarán.

### Estado

Pendiente de implementación.

---

## Cuarta parte: Tareas con resultado mediante Callable

### Descripción

En esta parte se modifica la clase `SumaArreglo` para que implemente la interfaz `Callable<Integer>`, que permite ejecutar tareas que devuelven un resultado de tipo entero.

Las tareas se enviarán a un grupo de hilos administrado mediante `ExecutorService`. Cada tarea calculará una suma parcial y devolverá su resultado mediante `call()`.

El hilo principal recuperará los resultados utilizando objetos `Future<Integer>` y el método `get()`, para finalmente calcular la suma total del arreglo.

### Conceptos trabajados

- Implementación de la interfaz `Callable<Integer>`.
- Uso del método `call()` para devolver resultados.
- Administración de hilos mediante `ExecutorService`.
- Creación de un grupo fijo de hilos con `Executors.newFixedThreadPool()`.
- Envío de tareas mediante `submit()`.
- Recuperación de resultados mediante `Future<Integer>` y `get()`.
- Cierre del grupo de hilos mediante `shutdown()`.

### Compilación

```bash
javac SumaArreglo.java
```

### Ejecución

```bash
java SumaArreglo 20 4
```

El programa recibe el tamaño del arreglo y la cantidad de hilos que se utilizarán.

### Estado

Pendiente de implementación.

---

## Tecnologías utilizadas

- Java.
- Programación concurrente.
- Clase `Thread`.
- Interfaz `Runnable`.
- Interfaz `Callable<Integer>`.
- `ExecutorService` y `Future`.
- Arreglos de enteros.
- Generación de números aleatorios.

## Observaciones

Las tres soluciones concurrentes permiten estudiar distintas formas de ejecutar el cálculo de la suma de un arreglo. La solución con `Thread` representa el hilo mediante un objeto de la clase `SumaArreglo`; la solución con `Runnable` separa la tarea del hilo; y la solución con `Callable<Integer>` permite devolver resultados y administrarlos mediante `Future`.
La clase ya hereda de `Thread` y cuenta con el método `run()`. La implementación del cálculo concurrente se desarrollará en los siguientes pasos de la práctica.
