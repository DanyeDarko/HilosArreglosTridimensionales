
package Hilos;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import Objetos.monitorHilos;

public class hilosOperacion extends Thread{
   
    monitorHilos Datos;
    int operacion;
    int filas,columnas;


    public hilosOperacion(monitorHilos d,int operacion){
    this.Datos=d;
    this.operacion=operacion;
    this.filas=Datos.getTamañoArreglo();
    this.columnas=Datos.getTamañoArreglo();
    }


    public void run (){
        System.out.println("LA OPERACION ES "+operacion);
        switch (operacion) {
            case 1:
              Datos.decidirOperacion(operacion, 0, (filas / 2), 0, (columnas / 2), 1);
                break;
            case 2:
                Datos.decidirOperacion(operacion, (columnas / 2), columnas, 0, (filas / 2), 1);
                break;
            case 3:
                Datos.decidirOperacion(operacion, 0, (filas / 2), (filas / 2), filas, 1);
                break;
            case 4:
                Datos.decidirOperacion(operacion, (columnas / 2), columnas, (filas / 2), filas, 1);
                break;
            case 5:
                Datos.operacionCentral();
                break;
        }

    }
}
