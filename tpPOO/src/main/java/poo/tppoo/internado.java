/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tppoo;

/**
 *
 * @author lucas
 */
public class internado extends paciente implements nutricion , clinica{
    
    double presion;
    String habitacion;
    String rh;

    public internado(double presion, String habitacion, String rh, String dni, String nombre, String obra_social) {
        super(dni, nombre, obra_social);
        this.presion = presion;
        this.habitacion = habitacion;
        this.rh = rh;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    @Override
    public String getTipoDieta() {
        return "Dieta...";
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
