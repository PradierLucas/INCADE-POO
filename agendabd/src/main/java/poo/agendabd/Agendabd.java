
package poo.agendabd;


public class Agendabd {

    public static void main(String[] args) {
       
        
      conexion conex = new conexion();
        conex.conectarbd();
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        
    }
}
