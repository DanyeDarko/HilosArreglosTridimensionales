
package Interfaces; 

public interface InterfazMonitorArreglo { // **** INTERFAZ QUE SE IMPLEMENTA EN LA CLASE ABSTRACTA 'monitorAbstractClass'
                                          // OBLIGA A USAR ESTOS METODOS EN LA CLASE  QUE SE IMPLEMENTA Y DE LAS QUE HEREDA

    public int[][][] generarNumeros(); // METODO PARA GENERAR UNA MATRIZ DE 3 DIMENSIONES
                                      // CON NUMEROS ALEATORIOS SE OCUPA EN EL COSTRUCTOR DE
                                      // LA CLASE 'monitorHilos' 
    public void imprimirArreglo(int numeroArregloImprimir); //NOS PERMITE ELEGIR QUE ARREGLO IMPRIMIR
                                                           // SEGUN SU DIMENSION 0 ORIGINAL,1 SUMA ,2 RESTA ... 

    public void combinarMatrizes(int cara1,int cara2); // PERMITE ELEGIR ENTRE LA COMBINACION DE DOS MATRICES PARA IMPRESION 
                                                       // CARA 1 Y CARA DOS REPRESENTAN DISTINTAS DIMENSIONES DEL ARREGLO

    public void decidirOperacion(int operacion, int inicio1, int fin1, int inicio2, int fin2, int dimension); 
    // METODO PARA DECIDIR OPERACION SEGUN ,EL NUMERO DE HILO ; 
    // OPERACION : HACER UN SWITCH DE QUE OPERACION EFECTUAR (1 SUMA,2 RESTA ...)
    // inicio1: PRIMER INICIO DE OPERACION EN X   fin1: FIN DE LA OPERACION  <----- HORIZONTAL   inicio1 =0  inicia 0 -> 0 1 2 3 4 5 6 | fin1 =7 | 8 9 10 finaliza en 6

    // inicio2: SEGUNDO INICIO DE OPERACION EN X  fin2 : FIN DE LA OPERACION <----- VERTICAL     inicio2 =0  inicia 0 -> 0 1 2 3 4 5 6 7 8 9 10
    //                                                                                                                   1   
    //                                                                                                                   2
    //                                                                                                                   3 | fin2=4 | finaliza en 3 
    // dimension: SOLO DECIDE SOBRE QUE DIMENSION DE LA MATRIZ ARROJAR LOS RESULTADOS
    
    public void operacionCentral(int dimension); // LA OPERACION CENTRAL CICLA ALEATORIAMENTE LA DECICION DE OPERACION  4 VECES RECIBE LA OPERACION 
                                                 // COMO DIMENSION OPERACION 5 DIMENSION 5 A ESCRIBIR EN EL ARREGLO
}


