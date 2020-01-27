
package Hilos;



import Objetos.monitorHilos;

public class hilosOperacion extends Thread{
   
    monitorHilos Datos;
    int operacion;
    int tamañoArreglo;


    public hilosOperacion(monitorHilos d,int operacion){
    this.Datos=d;
    this.operacion=operacion;
    this.tamañoArreglo=Datos.getTamañoArreglo();
   
    }


    public void run (){
        switch (operacion) {
            case 1:
              Datos.decidirOperacion(operacion, 0, (tamañoArreglo/ 2), 0, (tamañoArreglo / 2), operacion);
                break;
            case 2:
            Datos.decidirOperacion(operacion, 0, (tamañoArreglo/2), (tamañoArreglo / 2), tamañoArreglo, operacion);
                break;
            case 3:
            Datos.decidirOperacion(operacion, (tamañoArreglo / 2), tamañoArreglo, 0, (tamañoArreglo/ 2), operacion);
                break;
            case 4:
            Datos.decidirOperacion(operacion,(tamañoArreglo / 2), tamañoArreglo, (tamañoArreglo / 2), tamañoArreglo, operacion);
                break;
            case 5:
                Datos.operacionCentral(operacion);
                break;
        }

    }
}

