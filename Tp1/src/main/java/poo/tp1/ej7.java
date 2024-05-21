
package poo.tp1;

import java.util.Scanner;

/**
7. Se realizó un censo provincial y se desea procesar la información obtenida en dicho
censo. De cada una de las personas censadas se tiene la siguiente información: número de
documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona
censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e
informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres,
porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones,
mostrar datos de la persona que registra la mayor edad.
 */
public class ej7 {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int personas = 0;
        int varones = 0;
        int mujeres = 0;
        int varones16a65 = 0;
        int mayorEdad = 0;
        int dniMayorEdad = 0;
        String sexoMayorEdad = "";

        
           System.out.println("---------Ingreso de datos--------");
           System.out.println();
           
        while (true) {
            
            System.out.print("Ingrese el número de documento (0 para terminar): ");
            
            int dni = scanner.nextInt();
            if (dni == 0) {
                break;
            }

            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();
            
            scanner.nextLine(); 
            
            System.out.print("Ingrese el sexo (F: femenino / M: masculino): ");
            String sexo = scanner.nextLine();
            
           
            personas++;
            
            if (sexo.equalsIgnoreCase("M")) {
               varones++;
                if (edad >= 16 && edad <= 65) {
                    varones16a65++;
                }
            } else if (sexo.equalsIgnoreCase("f")) {
                mujeres++;
            }

        
            if (edad > mayorEdad) {
                mayorEdad = edad;
                dniMayorEdad = dni;
                sexoMayorEdad = sexo;
            }
        }

        
        double porcentajeVarones16a65 = 0;
        if (varones > 0) {
            porcentajeVarones16a65 =  varones16a65 / varones * 100;
        }

        System.out.println("---------Datos del censo--------");
        System.out.println();
        
        System.out.println("Cantidad total de personas censadas: " + personas);
        System.out.println("Cantidad de varones: " + varones);
        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentajeVarones16a65 + "%");
        System.out.println();
        System.out.println("-------Datos de la persona con mayor edad--------");
        System.out.println();
        System.out.println("DNI: " + dniMayorEdad);
        System.out.println("Edad: " + mayorEdad);
        System.out.println("Sexo: " + sexoMayorEdad);
       

      
    }
}

    
    
