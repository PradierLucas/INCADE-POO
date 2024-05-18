/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tppoo;

/**
 *
 * @author lucas
 */
public  class paciente implements administracion {
    
    String dni ;
    String nombre ;
    String obra_social ;

    public paciente(String dni, String nombre, String obra_social) {
        this.dni = dni;
        this.nombre = nombre;
        this.obra_social = obra_social;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObra_social() {
        return obra_social;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    @Override
    public String getCobertura() {

            return "Cobertura...";
    }

    @Override
    public double getDescuento() {
        return 10;
        }

    @Override
    public String getVademecum() {
        return "Vademecum...";
    }

  
   
    
}
