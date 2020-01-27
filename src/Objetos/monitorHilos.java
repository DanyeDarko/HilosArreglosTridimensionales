package Objetos;


public class monitorHilos extends  monitorAbstractClass{ // OBJETO PARA MONITOREAR HILOS HEREDA TODOS LOS METODOS Y VARIABLES DE LA CLASE
                                                         // 'monitorAbstractClass' POR LO QUE NO ES NECESARIO DEFINIR NADA MAS QUE CONSTRUIR LA CLASE
                                                         // INICIALISANDO VARIABLES 

public monitorHilos(int tamañoArreglo){
    this.tamañoArreglo=tamañoArreglo; // EL TAMAÑO DEL ARREGLO SE PASA COMO PARAMETRO EN LA CLASE 'init' AL CREAR NUEVA ESTANCIA
                                    // DE CLASE 'monitorHilos' llamada ------- > datos 
    this.ArregloMatrizes=generarNumeros(); // LA VARIABLE MATRIZ SE INICIALISA CON UNA NUEVA MATRIZ GENERADA POR EL METODO DE RELLENAR
                                           // MATRIZ DE MANERA ALEATORIA EN LA DIMENSION 0 ,MIENTRAS LAS OTRAS INCIALISAR CON 0 CADA POSICION(VACIA)

    this.iteradorPrimerDimension=0; // ITERADOR PARA LA PRIMERA DIMENSION DEL ARREGLO[ X1,X2,X3,X4] 

    this.iteradorSegDimension=0; // ITERADOR PAR LA SEGUNDA DIMENSION DEL ARREGLO [X1,X2,X3,X4]
                                 //                                               [Y1,Y2,Y3.Y4]

    this.iteradorTerDimencion=0; /* ITERADOR PARA LA TERCERA DIMENSION DEL ARREGLO  [0]  = [X1,X2,X3,X4]
                                                                                           [Y1,Y2,Y3.Y4]

                                                                                    [1]  = [A1,A2,A3,A4]
                                                                                           [B1,B2,B3.B4]*/
    this.numeroAleatorio=0; // INICIALISA EL NUMERO ALEATORIO EN 0 O SIN VALOR 
    
}


  












}