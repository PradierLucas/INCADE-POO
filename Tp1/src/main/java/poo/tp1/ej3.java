
package poo.tp1;

import java.util.Scanner;

/**
 3. Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.

 */
public class ej3 {
 

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

      
        double[] cantidades = new double[n];
        double[] costos = new double[n];
        double precioTotal = 0 ;

     
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = scanner.nextDouble();
            System.out.print("Ingrese el costo del producto " + (i + 1) + ": ");
            costos[i] = scanner.nextDouble();
           
            precioTotal = precioTotal + (cantidades[i] * costos[i]) ;
            
        }
            System.out.println("--------------------------------");
            System.out.println("Precio total: $" + precioTotal);
            System.out.println("--------------------------------");
            System.out.println("Productos con un precio mayor a $1000:");
        for (int i = 0; i < n; i++) {
            
            double precioProducto = cantidades[i] * costos[i];
         
            if (precioProducto > 1000) {
                System.out.println("Producto " + (i + 1) +  ": $" + precioProducto );
             

                
            }
        }

       
       

     

    
}
}
