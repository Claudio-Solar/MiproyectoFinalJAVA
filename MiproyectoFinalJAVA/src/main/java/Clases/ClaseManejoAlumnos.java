/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class ClaseManejoAlumnos {
    DefaultTableModel model;
    public void crearcolumnas(JTable tablaAlumnos) {
        DefaultTableModel modelo=new DefaultTableModel();
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombres");
        modelo.addColumn("ApPaterno");
        modelo.addColumn("ApMaterno");
        
        tablaAlumnos.setModel(modelo);
        
    }
    
    public void IngresoAlumnos(JTextField codigo,JTextField nombres, JTextField AppMaterno, JTextField AppPaterno,JTable tablaAlumnos) {
        
    model=(DefaultTableModel)tablaAlumnos.getModel();
    
    Clases.ClaseAlumno ObjetoAlumno=new Clases.ClaseAlumno();
    
    ObjetoAlumno.setCodigo(Integer.valueOf(codigo.getText()));
    ObjetoAlumno.setNombres((nombres.getText()));
    ObjetoAlumno.setApePaterno(AppPaterno.getText());
    ObjetoAlumno.setApeMaterno(AppMaterno.getText());
    
    Object [] filas=new Object[4];
    
    filas[0]=ObjetoAlumno.getCodigo();
    filas[1]=ObjetoAlumno.getNombres();
    filas[2]=ObjetoAlumno.getApePaterno();
    filas[3]=ObjetoAlumno.getApeMaterno();
    
    model.addRow(filas);
    
    tablaAlumnos.setModel(model);
    
    
    
    
    }
}
