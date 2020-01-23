package init;

import Hilos.hilosOperacion;
import Objetos.monitorHilos;
public class init{
public static void main(String[] args) {
    monitorHilos Dato = new monitorHilos(16);
    int iterador;
    hilosOperacion arregloHilos[] = new hilosOperacion[5];
    System.out.println("ARREGLO ORIGINAL CON NUMEROS GENERADOS");
    Dato.imprimirArreglo(0);
    






    for (iterador = 0; iterador< 1; iterador++) {
        arregloHilos[iterador] = new hilosOperacion(Dato,(iterador + 1));
        arregloHilos[iterador].start();
    }

  
     

   Dato.imprimirArreglo(1);
}
}