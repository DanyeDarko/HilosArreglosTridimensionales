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
        int[][][] matrizAux = new int[getTamañoArreglo()][getTamañoArreglo()][6];
        Random random = new Random();  //ESTANCIA DE UN OBJETO RANDOM PARA GENERAR NUMEROS ALEATORIOS
        for (setIteradorPrimerDimension(0); getIteradorPrimerDimension() < getTamañoArreglo(); setIteradorPrimerDimension(getIteradorPrimerDimension() + 1)) {
            for (setIteradorSegDimension(0); getIteradorSegDimension() < getTamañoArreglo(); setIteradorSegDimension(getIteradorSegDimension() + 1)) {
                setNumeroAleatorio(random.nextInt(100)+1);
                System.out.println("VALOR: "+getNumeroAleatorio()+" AGREGADO EN [ "+getIteradorPrimerDimension()+" ] [ "+getIteradorSegDimension()+" ]");
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


    public void decidirOperacion(int operacion, int inicio1, int fin1, int inicio2, int fin2, int dimensionOperacion){
        for (int iteDimension1 = inicio1; iteDimension1< fin1; iteDimension1 ++) {
            for (int iteDimension2 = inicio2; iteDimension2 < fin2; iteDimension2++)  {
                switch (operacion) {
                    case 1: // S U  M A 
                        getArregloMatrizes()[iteDimension1][iteDimension2][dimensionOperacion] = getArregloMatrizes()[iteDimension1][iteDimension2][0] + 10;
                        break;
                    case 2: // R E S T A
                    getArregloMatrizes()[iteDimension1][iteDimension2][dimensionOperacion] = getArregloMatrizes()[iteDimension1][iteDimension2][0] - 10;
                    break;
                    case 3: // M U L T I P L I C A C I O N 
                        getArregloMatrizes()[iteDimension1][iteDimension2][dimensionOperacion] = getArregloMatrizes()[iteDimension1][iteDimension2][0] * 10;
                        break;
                    case 4: // D I V I S I O N 
                        getArregloMatrizes()[iteDimension1][iteDimension2][dimensionOperacion] = getArregloMatrizes()[iteDimension1][iteDimension2][0] /10;
                        break;
                }
            }
        }
    }

    
    public void operacionCentral(int dimension){
        int filasColumnasCentro = tamañoArreglo / 4;
        for (int operacionAleatoria = 0; operacionAleatoria <4; operacionAleatoria++) {
            decidirOperacion(operacionAleatoria, filasColumnasCentro, (filasColumnasCentro * 3), filasColumnasCentro, (filasColumnasCentro * 3),5);
        }
    }
    
    
    @Override
    public void combinarMatrizes(int cara1,int cara2) {

            for (int i = 0; i < getTamañoArreglo(); i++) {

                System.out.println("cara " + cara1);
                for (int j = 0; j < getTamañoArreglo(); j++) {
                    System.out.printf("%4d ", getArregloMatrizes()[i][j][cara1]);
                }
                System.out.println("cara " + cara2);
                for (int j = 0; j < getTamañoArreglo(); j++) {
                    System.out.printf("%4d ", getArregloMatrizes()[i][j][cara2]);
                }
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