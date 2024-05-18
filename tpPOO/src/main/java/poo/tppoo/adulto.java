/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tppoo;

/**
 *
 * @author lucas
 */
public class adulto extends paciente implements clinica {
    
  
            
    double presion ;
    double altura;
    double peso;

    public adulto(double presion, double altura, double peso, String dni, String nombre, String obra_social) {
        super(dni, nombre, obra_social);
        this.presion = presion;
        this.altura = altura;
        this.peso = peso;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

     @Override
    public String getRx() {
        return "Resultado Rx";
    }

    @Override
    public String getAnalisis() {
           
        return "Resultado Analisis de sangre";

    }
    

   
    
}
