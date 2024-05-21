
package poo.tp1;

import java.util.Scanner;

/**
 6. En una carrera automovilística se desea calcular cuál es el menor tiempo realizado entre
cada uno de sus 12 competidores. Para ello, se pide un algoritmo que sea capaz de permitir
el ingreso por teclado del número de vehículo y el tiempo (en segundos) de cada
participante. Una vez encontrado el que realizó el mejor tiempo, se debe informar por
pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.
 */
public class ej6 {
    
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vehiculos = new int[12];
        double[] tiempos = new double[12];
      
      
        
        System.out.println("-------Ingreso datos de competidores-------");

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("---Competidor " + (i + 1));
            System.out.print("Ingrese el número de vehículo: ");
            vehiculos[i] = scanner.nextInt();
            System.out.print("Ingrese el tiempo en segundos: ");
            tiempos[i] = scanner.nextDouble();
            
               
        }
        
        double menor = tiempos[0]   ;
        int ganador = vehiculos[0] ;

       for (int i = 0; i < vehiculos.length; i++) {
           if(tiempos[i] < menor){
                menor= tiempos[i];
                ganador = vehiculos[i];
            }
       }
       
             
        System.out.println("-------Ganador-------");
        System.out.println("Número de vehículo: " + ganador);
        System.out.println("Tiempo: " + menor + " segundos");

       
    }
}

  