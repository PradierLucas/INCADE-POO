/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tppoo;

/**
 *
 * @author lucas
 */
public class pediatricos extends paciente implements nutricion  {
    

    double peso ;
    int celular;
    String tutor;

    public pediatricos(double peso, int celular, String tutor, String dni, String nombre, String obra_social) {
        super(dni, nombre, obra_social);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String getTipoDieta() {
        return "Dieta...";
    }

  
   

    
    
    
    
}
