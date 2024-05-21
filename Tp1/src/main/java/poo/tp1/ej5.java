package poo.tp1;

import java.util.Scanner;

/**
5. Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del
cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio
cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El
servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder
calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e
informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio
con el que cuenta.

 */
public class ej5 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] dni = new String[5];
        int[] servicio = new int[5];
        double[] monto = new double[5];

        
         System.out.println("-------Ingreso de datos de los clientes-------");
        for (int i = 0; i < 5; i++) {
            System.out.println("-----Cliente "+ (i+1) + "-----");
            System.out.print("Ingrese el DNI del cliente: ");
            dni[i] = scanner.nextLine();
            System.out.print("Ingrese el tipo de servicio según el número (1: Internet 30 megas, 2: Internet 50 megas, 3: Internet 100 megas): ");
            servicio[i] = scanner.nextInt();
            scanner.nextLine(); 

            switch (servicio[i]) {
            case 1:
                monto[i] = 750;
                break;
            case 2:
                monto[i] = 1100;
                break;
            case 3:
                monto[i] = 1500 * 0.95; 
                break;
            
        }
           
        }

        System.out.println("-------Datos de los clientes-------");
        for (int i = 0; i < 5; i++) {
            System.out.println("-----Cliente "+ (i+1) + "-----");
            System.out.println("DNI: " + dni[i]);
            System.out.println("Tipo de servicio: " + servicio[i]);
            System.out.println("Monto a pagar: $" + monto[i]);
            System.out.println("-----");
        }

        
    }

   
    }
