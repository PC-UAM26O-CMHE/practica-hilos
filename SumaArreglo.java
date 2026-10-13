import java.util.Arrays;
import java.util.Random;

public class SumaArreglo extends Thread {
    static int[] arreglo = null;
    SumaArreglo(int n) {
         arreglo = new int[n];
    }

    @Override
    public void run() {
        int suma = 0;
	int tam = arreglo.length / hilos;
	int resto = arreglo.length % hilos;
	int ini = id * tam;
	int fin = ini + tam;

        for (int i = ini; i < fin; i++) {
 	    suma = suma + arreglo[i];
        }

        if (resto > id) {

           suma = suma + arreglo[(arreglo.length - 1) - id];
	 }

         resultado[id] = suma;
}



    }


    public int sumar() {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

         System.out.println(
             "Thread id: " + Thread.currentThread().getId()
 	     + " Suma Local: " + suma);

	  return suma;
     }

     void inicializarArreglo(int[] arreglo, int n) {
         Random azar = new Random();

	 for (int i = 0; i < arreglo.length; i++) {
	     arreglo[i] = azar.nextInt(n);
	 }
     }

      void imprimir(int[] arreglo) {
	  System.out.println(Arrays.toString(arreglo));
     }

     public static void main(String[] args) {
         int n = Integer.parseInt(args[0]);

	 SumaArreglo sm = new SumaArreglo(n);
 	 sm.inicializarArreglo(arreglo, 100);
	 sm.imprimir(arreglo);

	 int resultado = sm.sumar();
	 System.out.println("Suma: " + resultado);
     }
}
