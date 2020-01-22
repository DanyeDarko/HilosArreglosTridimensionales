package Objetos;

import Interfaces.InterfazMonitorArreglo;

public abstract class monitorAbstractClass implements InterfazMonitorArreglo{

     int ArregloMatrizes[][][];
     int numeroAleatorio;


    public int[][] generarNumeros(){
        int[][] matrizAux = new int[100][100];
        return matrizAux;
    }


    public void imprimirArreglo(){

    }
    public  void decidirOperacion(int operacion){

    }



}