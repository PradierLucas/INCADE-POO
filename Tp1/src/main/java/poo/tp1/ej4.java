/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp1;

import java.util.Scanner;

/**
4. Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
usuario.

 */
public class ej4 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] camiones = new int[3];
        String[] patente = new String[3];
        String[] chofer = new String[3];
        String[] carga = new String[3];
        String[] horaEgreso = new String[3];
        int camionesTe = 0;

         System.out.println("--------------Ingreso datos de los camiones-----------------");
       
         
        for (int i = 0; i < camiones.length; i++) {
            System.out.println("--Camión " + (i + 1));
            System.out.print("Patente: ");
            patente[i] = scanner.nextLine();
            System.out.print("Nombre del chofer: ");
            chofer[i] = scanner.nextLine();
            System.out.print("Tipo de carga (madera, yerba o té): ");
            carga[i] = scanner.nextLine();
            System.out.print("Hora de egreso: ");
            horaEgreso[i] = scanner.nextLine();

            

            if (carga[i].equalsIgnoreCase("Té") ) {
                camionesTe++;
            }
        }

        System.out.println("---------------Datos de los camiones----------------");
       

        for (int i = 0; i < camiones.length; i++) {
            System.out.println("---Camión " + (i + 1) + "---");
            System.out.println("Patente: " + patente[i]);
            System.out.println("Nombre del chofer: " + chofer[i]);
            System.out.println("Tipo de carga: " + carga[i]);
            System.out.println("Hora de egreso: " + horaEgreso[i]);
            System.out.println("---------------");
           
        }
        
        System.out.println("-------------------------------");
        System.out.println("Cantidad de camiones que cargaron té: " + camionesTe);

      
    }
}


    
