/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.agendabd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class conexion {
    
    Connection conexionbd = null;
    
    String user = "root";
    String password = "32322040";
    String bd = "agenda";
    String host = "localhost";
    String port = "3306";
    
    String cadena = "jdbc:mysql://" + host + ":" + port + "/" + bd;
    
    
    public Connection conectarbd(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexionbd = DriverManager.getConnection(cadena,user,password);
           /* JOptionPane.showMessageDialog(null,"Conexión a la base de datos existosa");*/
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión a la base de datos fallida" + e.toString());
        }
        
        return conexionbd;
    }
}
