package Objetos;

import Interfaces.InterfazMonitorArreglo;
import java.util.Random;

public abstract class monitorAbstractClass implements InterfazMonitorArreglo{

    
     int ArregloMatrizes[][][];
     int numeroAleatorio;
     int tamañoArreglo;
     int iteradorPrimerDimension;
     int iteradorSegDimension;
     int iteradorTerDimencion;


    public int[][][] generarNumeros(){
        int[][][] matrizAux = new int[getTamañoArreglo()][getTamañoArreglo()][3];
        Random random = new Random();  //ESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS ALEATORIOS
        for (setIteradorPrimerDimension(0); getIteradorPrimerDimension() < getTamañoArreglo(); setIteradorPrimerDimension(getIteradorPrimerDimension() + 1)) {
            for (setIteradorSegDimension(0); getIteradorSegDimension() < getTamañoArreglo(); setIteradorSegDimension(getIteradorSegDimension() + 1)) {
                setNumeroAleatorio(random.nextInt(100)+1);
                System.out.println(""+getNumeroAleatorio());
                matrizAux[getIteradorPrimerDimension()][getIteradorSegDimension()][0] = getNumeroAleatorio();
                for ( setIteradorTerDimencion(1); getIteradorTerDimencion()< 3; setIteradorTerDimencion(getIteradorTerDimencion() + 1)) {
                    matrizAux[getIteradorPrimerDimension()][getIteradorSegDimension()][getIteradorTerDimencion()] = 0;
                }
            }
        }
        return matrizAux.clone();
    }


    public void imprimirArreglo(int numArregloImprimir){
        for (setIteradorPrimerDimension(0); iteradorPrimerDimension < getTamañoArreglo(); iteradorPrimerDimension++) {
            for (setIteradorSegDimension( 0); iteradorSegDimension < getTamañoArreglo(); iteradorSegDimension++) {
                System.out.printf("%3d ", ArregloMatrizes[getIteradorPrimerDimension()][getIteradorSegDimension()][numArregloImprimir]);
            }
            System.out.println("");
        }

    }


    public  void decidirOperacion(int operacion,int inicioX,int finX,int inicioY,int finY,int numMatriz){
        for (setIteradorPrimerDimension(inicioX); getIteradorPrimerDimension()< finX;setIteradorSegDimension(getIteradorSegDimension() + 1)) {
            for (setIteradorSegDimension(inicioY); getIteradorSegDimension() < finY;setIteradorSegDimension(getIteradorSegDimension()+1)) {
                switch (operacion) {
                    case 1:
                        getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][numMatriz] = getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][0] + 10;
                        break;
                    case 2:
                    getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][numMatriz] = getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][0] - 10;
                    break;
                    case 3:

                        getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][numMatriz] = getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][0] * 10;
                        break;
                    case 4:
                        getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][numMatriz] = getArregloMatrizes()[iteradorPrimerDimension][iteradorSegDimension][0] /10;
                        break;
                }
            }
        }
    }

    public void operacionCentral(){
        int filaYColumna = tamañoArreglo / 4;
        for (int k = 0; k < 4; k++) {
            decidirOperacion(k, filaYColumna, (filaYColumna * 3), filaYColumna, (filaYColumna * 3),1);
        }
    }
    
    
    
    
    
    /**
     * @return the ArregloMatrizes
     */
    public int[][][] getArregloMatrizes() {
        return ArregloMatrizes;
    }

    /**
     * @param ArregloMatrizes the ArregloMatrizes to set
     */
    public void setArregloMatrizes(int[][][] ArregloMatrizes) {
        this.ArregloMatrizes = ArregloMatrizes;
    }

    /**
     * @return the numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * @param numeroAleatorio the numeroAleatorio to set
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    /**
     * @return the tamañoArreglo
     */
    public int getTamañoArreglo() {
        return tamañoArreglo;
    }

    /**
     * @param tamañoArreglo the tamañoArreglo to set
     */
    public void setTamañoArreglo(int tamañoArreglo) {
        this.tamañoArreglo = tamañoArreglo;
    }

    /**
     * @return the iteradorPrimerDimension
     */
    public int getIteradorPrimerDimension() {
        return iteradorPrimerDimension;
    }

    /**
     * @param iteradorPrimerDimension the iteradorPrimerDimension to set
     */
    public void setIteradorPrimerDimension(int iteradorPrimerDimension) {
        this.iteradorPrimerDimension = iteradorPrimerDimension;
    }

    /**
     * @return the iteradorSegDimension
     */
    public int getIteradorSegDimension() {
        return iteradorSegDimension;
    }

    /**
     * @param iteradorSegDimension the iteradorSegDimension to set
     */
    public void setIteradorSegDimension(int iteradorSegDimension) {
        this.iteradorSegDimension = iteradorSegDimension;
    }

    /**
     * @return the iteradorTerDimencion
     */
    public int getIteradorTerDimencion() {
        return iteradorTerDimencion;
    }

    /**
     * @param iteradorTerDimencion the iteradorTerDimencion to set
     */
    public void setIteradorTerDimencion(int iteradorTerDimencion) {
        this.iteradorTerDimencion = iteradorTerDimencion;
    }





}