/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.agendabd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lucas
 */
public class contacto {
    
    int codigo ;
    String nombre;
    String apellido;
    String direccion;
    String telefono;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void crearContacto(JTextField nombre, JTextField apellido,JTextField direc ,JTextField tel  ){
        
        setNombre(nombre.getText());
        setApellido(apellido.getText());
        setDireccion(direc.getText());
        setTelefono(tel.getText());
        
        conexion conex= new conexion();
        
        String consulta = "insert into contacto  (nombre, apellido, direccion, telefono) values (?,?,?,?);";
        
        try{
            
            CallableStatement cs = conex.conectarbd().prepareCall(consulta);
            
            cs.setString(1,getNombre());
            cs.setString(2, getApellido());
            cs.setString(3,getDireccion());
            cs.setString(4,getTelefono());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Contacto creado");
            
            
        } catch(Exception e){
              JOptionPane.showMessageDialog(null,"Error al crear el contacto" + e.toString());
        }
       
            
        
    }
    
    
    public void mostrarContactos(JTable tabla){
        
        conexion conex = new conexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel> (modelo);
        tabla.setRowSorter(OrdenarTabla);
        
        String consulta = "select * from contacto;";
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");
        
        tabla.setModel(modelo);
        
        String[] datos = new String[5];
        
        Statement st;
        
        try{
            
            st = conex.conectarbd().createStatement();
            
            ResultSet rs = st.executeQuery(consulta);
            
            while (rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                
                modelo.addRow(datos);
            }
            
           tabla.setModel(modelo);
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error al mostrar contactos " + e.toString());
        }
        
    }
    
    public void seleccionarContacto(JTable tabla, JTextField id ,JTextField nombre,JTextField apellido,JTextField direccion, JTextField telefono){
        
        try{
            
            int fila = tabla.getSelectedRow();
            
            if(fila >=0){
                
                id.setText((tabla.getValueAt(fila,0).toString()));
                nombre.setText((tabla.getValueAt(fila,1).toString()));
                apellido.setText((tabla.getValueAt(fila,2).toString()));
                direccion.setText((tabla.getValueAt(fila,3).toString()));
                telefono.setText((tabla.getValueAt(fila,4).toString()));
                
                
            }else{
                 JOptionPane.showMessageDialog(null,"Fila no seleccionada" );
            }
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error al seleccinar el contacto" + e.toString());
        }
        
    }
    
    public void editarContacto(JTextField id ,JTextField nombre, JTextField apellido,JTextField direc ,JTextField tel ){
        
        setCodigo(Integer.parseInt(id.getText()));
        setNombre(nombre.getText());
        setApellido(apellido.getText());
        setDireccion(direc.getText());
        setTelefono(tel.getText());
        
        conexion conex= new conexion();
        
        String consulta = "update contacto set  nombre= ? , apellido=?, direccion=?, telefono=? where contacto.id = ? ;";
        
         try{
            
            CallableStatement cs = conex.conectarbd().prepareCall(consulta);
            
            cs.setString(1,getNombre());
            cs.setString(2, getApellido());
            cs.setString(3,getDireccion());
            cs.setString(4,getTelefono());
            cs.setInt(5,getCodigo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Contacto editado con éxito");
            
            
        } catch(Exception e){
              JOptionPane.showMessageDialog(null,"Error al editar el contacto " + e.toString());
        }
        
    }
    
    public void borrarContacto(JTextField id){
        
        setCodigo(Integer.parseInt(id.getText()));
        
         conexion conex= new conexion();
        
        String consulta = "delete from contacto where contacto.id = ? ;";
        
         try{
            
            CallableStatement cs = conex.conectarbd().prepareCall(consulta);
            
        
            cs.setInt(1,getCodigo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Contacto eliminado con éxito");
            
            
        } catch(Exception e){
              JOptionPane.showMessageDialog(null,"Error al eliminar el contacto " + e.toString());
        }
        
    
    }
    
    
    /* public void exportarContactosATxt(String rutaArchivo) {
        conexion conex = new conexion();
        String consulta = "select * from contacto;";
        Statement st;
        BufferedWriter writer = null;

        try {
            st = conex.conectarbd().createStatement();
            ResultSet rs = st.executeQuery(consulta);

            writer = new BufferedWriter(new FileWriter(rutaArchivo));
            writer.write("Id\tNombre\tApellido\tDirección\tTelefono\n");

            while (rs.next()) {
                String linea = rs.getString("id") + "\t" + rs.getString("nombre") + "\t" + rs.getString("apellido") + "\t" + rs.getString("direccion") + "\t" + rs.getString("telefono");
                writer.write(linea + "\n");
            }

            JOptionPane.showMessageDialog(null, "Contactos exportados con éxito a " + rutaArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al exportar contactos: " + e.toString());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar el archivo: " + e.toString());
            }
        }
    }
     */
     
      public void exportarContactosATxt() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Contactos");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();

            // Asegurarse de que el archivo tiene la extensión .txt
            if (!rutaArchivo.endsWith(".txt")) {
                rutaArchivo += ".txt";
            }

            conexion conex = new conexion();
            String consulta = "select * from contacto;";
            Statement st;
            BufferedWriter writer = null;

            try {
                st = conex.conectarbd().createStatement();
                ResultSet rs = st.executeQuery(consulta);

                writer = new BufferedWriter(new FileWriter(rutaArchivo));
                writer.write("Id\tNombre\tApellido\tDirección\tTelefono\n");

                while (rs.next()) {
                    String linea = rs.getString("id") + "\t" + rs.getString("nombre") + "\t" + rs.getString("apellido") + "\t" + rs.getString("direccion") + "\t" + rs.getString("telefono");
                    writer.write(linea + "\n");
                }

                JOptionPane.showMessageDialog(null, "Contactos exportados con éxito a " + rutaArchivo);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al exportar contactos: " + e.toString());
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar el archivo: " + e.toString());
                }
            }
        }
    }
    
}
