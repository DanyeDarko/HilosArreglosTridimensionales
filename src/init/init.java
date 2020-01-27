package init;

import Hilos.hilosOperacion;
import Objetos.monitorHilos;
public class init{
public static void main(String[] args) {
    
    int tamañoArreglo = 16; // ESPECIFICAMOS EL LARGO DEL ARREGLO DE DOS DIMENSIONES
    int numeroHilos = 4; // ESPECIFICAMOS EL NUMERO DE HILOS A CORRER 
                        //
    monitorHilos datos = new monitorHilos(tamañoArreglo);
    // NUEVA ESTANCIA DE LA CLASE MONITOR HILOS LLAMADA DATOS
    // RECIBE COMO PARAMETRO EL LARGO DEL ARREGLO BIDIMENCIONAL

    int iteradorArreglo; // VARIABLE PARA  RECORRER ARREGLO DE HILOS

    hilosOperacion arregloHilos[] = new hilosOperacion[numeroHilos];
    // CREACION DE UN ARREGLO DE HILOS DE LA CLASE 'hilosOperacion' 
    // CON ESPACIO PARA 5 ESTANCIAS DE HILOS

    System.out.println("ARREGLO ORIGINAL CON NUMEROS GENERADOS"); // IMPRESION DE ARREGLO ORIGINAL
    datos.imprimirArreglo(0); // PASAMOS COMO PARAMETRO LA DIMENSION 0 QUE ES DONDE SE GENERARON LOS NUMEROS ALEATORIOS
    
    for (iteradorArreglo = 0; iteradorArreglo< numeroHilos; iteradorArreglo++) { // RECOREMOS EL ARREGLO DE HILOS DESDE EL 0 HASTA EL 3 (MENOR QUE @numeroHilos=4)
        arregloHilos[iteradorArreglo] = new hilosOperacion(datos,(iteradorArreglo + 1)); // CREA UNA INSTANCIA DE UN NUEVO HILO Y LES PASA EL MONITOR 'dato'
                                                                                         // EL ITERADOR MAS 1 ES DECIR'iteradorArreglo=0' agregramos 1 y sera la OPERACION A EFECTUAR 
                                                                                        //1 suma , 2 resta ,3 Multi .... 
        arregloHilos[iteradorArreglo].start(); // INICIAMOS LOS HILOS
    }

    try {
        for (iteradorArreglo = 0; iteradorArreglo< numeroHilos; iteradorArreglo++) { // RECOREMOS EL ARREGLO DE HILOS DESDE EL 0 HASTA EL 3 (MENOR QUE @numeroHilos=4)
            arregloHilos[iteradorArreglo].join(); // INICIAMOS LOS HILOS
        }
    
        

    } catch (Exception e) {
       
    }

  System.out.println();
  datos.imprimirArreglo(1);
  System.out.println();   
datos.combinarMatrizes(0, 1);
  

}
}