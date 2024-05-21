/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tp1;

import java.util.Scanner;

/**
 2. Cargar un vector con “n” notas e indicar la cantidad de aprobados (Notas mayores o
iguales a 6), la cantidad de desaprobados (Notas menores a 6).

 */
public class ej2 {
    
    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la cantidad de notas: ");
        int n = scanner.nextInt();

  
        double[] notas = new double[n];

     
        int aprobados = 0;
        int desaprobados = 0;

       
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

           
            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

       

    
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

    
}
    
}
