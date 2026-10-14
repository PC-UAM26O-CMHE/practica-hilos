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

En esta parte se modifica la clase `SumaArreglo` para que herede de `Thread`, con el objetivo de preparar el programa para ejecutar el cálculo de la suma mediante hilos.

Se sobrescribe el método `run()`, que contendrá el trabajo realizado por cada hilo.

### Conceptos trabajados

- Herencia de la clase `Thread`.
- Sobrescritura del método `run()` mediante `@Override`.
- Diferencia entre el hilo principal y los hilos creados por el programa.

### Estado actual

La clase ya hereda de `Thread` y cuenta con el método `run()`. La implementación del cálculo concurrente se desarrollará en los siguientes pasos de la práctica.
