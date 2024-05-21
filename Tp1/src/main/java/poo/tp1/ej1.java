

package poo.tp1;

import java.util.Scanner;

/**
 1. Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
notas se debe mostrar la nota más alta y el promedio de notas.
 */
public class ej1 {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese la cantidad de notas: ");
            int n = scanner.nextInt();
        
        double[] notas = new double[n];
        double alta = 0;
        double suma = 0;
      
   
       
    
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": " );
            notas[i] = scanner.nextDouble();
             suma = suma + notas[i];
            
        }
        
        
        double promedio = suma / n;
          
        for (int i = 0; i < n; i++) {
            
            if (notas[i] > alta) {
                alta = notas[i];
            }
           
        }

 
   
        System.out.println("La nota más alta es: " + alta);
        System.out.println("El promedio de las notas es: " + promedio);

   
    
    }
}

        
    