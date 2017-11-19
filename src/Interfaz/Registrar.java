/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Repositorio;
import Clases.Persona;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alisson Celeita
 * Brayan Garcia
 */
public class Registrar extends javax.swing.JPanel {
    
    /*
        En esta clase se hace el registro de usuarios con interfaz grafica
    */
    public int doc1, edad1;
    public Timestamp fecSeg;
    public String nom1,ape1,dia,mes,año,fecNac;
    public LocalDate nac1;
    public Date nac2;
    private Persona per;
    private DefaultTableModel table_model_personas,table_model_juvenil,table_model_adultos;
    private Date fecha1,fecha3,fecha5;
    public Timestamp fecha2,fecha4,fecha6;
    
    public Registrar() {
        initComponents();
    }

    public void setTableModel(DefaultTableModel table_model_personas){
        this.table_model_personas = table_model_personas;
    }
    
    public void refreshTableModel(){
        ArrayList<Persona> lista_personas = Repositorio.obtenerTodos();
        while (table_model_personas.getRowCount() > 0) {
            table_model_personas.removeRow(0);
        }
        
        for(Persona p : lista_personas)
        {
            fecha1=p.getFecNac();
            fecha2=p.getFecSeg();
            String[] data = {Integer.toString(p.getId()), Integer.toString(p.getDoc()), p.getNom(),p.getApe(),Integer.toString(p.getEdad()),fecha1.toString() , fecha2.toString()};
            table_model_personas.addRow(data);
        }
        
        /*
        Metodo creado para refrescar la tabla que refrescara a las personas INFANTILES
        en un tabla creada para esta categoria
        */
    }
    
    public void setTableModel2(DefaultTableModel table_model_juvenil){
        this.table_model_juvenil = table_model_juvenil;
    }
    
    public void refreshTableModel2()
    {
        ArrayList<Persona> lista_juvenil = Repositorio.obtenerTodos2();
        while (table_model_juvenil.getRowCount() > 0) {
            table_model_juvenil.removeRow(0);
        }
        
        for(Persona p : lista_juvenil)
        {
            fecha3=p.getFecNac();
            fecha4=p.getFecSeg();
            String[] data = {Integer.toString(p.getId()), Integer.toString(p.getDoc()), p.getNom(),p.getApe(),Integer.toString(p.getEdad()),fecha3.toString() , fecha4.toString()};
            table_model_juvenil.addRow(data);
        }
        
        /*
        Metodo creado para refrescar la tabla que refrescara a las personas JUVENILES
        en un tabla creada para esta categoria
        */
    }
    
    public void setTableModel3(DefaultTableModel table_model_adultos){
        this.table_model_adultos = table_model_adultos;
    }
    
    public void refreshTableModel3()
    {
        ArrayList<Persona> lista_adultos = Repositorio.obtenerTodos3();
        while (table_model_adultos.getRowCount() > 0) {
            table_model_adultos.removeRow(0);
        }
        
        for(Persona p : lista_adultos)
        {
            fecha5=p.getFecNac();
            fecha6=p.getFecSeg();
            String[] data = {Integer.toString(p.getId()), Integer.toString(p.getDoc()), p.getNom(),p.getApe(),Integer.toString(p.getEdad()),fecha5.toString() , fecha6.toString()};
            table_model_adultos.addRow(data);
        }
        /*
        Metodo creado para refrescar la tabla que refrescara a las personas ADULTAS
        en un tabla creada para esta categoria
        */
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labDoc = new javax.swing.JLabel();
        doc = new javax.swing.JTextField();
        labNom = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        labApe = new javax.swing.JLabel();
        ape = new javax.swing.JTextField();
        labEdad = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nac = new com.toedter.calendar.JDateChooser();
        url = new javax.swing.JTextField();
        exIm = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        bAg = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));

        labDoc.setText("Documento");

        labNom.setText("Nombre");

        labApe.setText("Apellido");

        labEdad.setText("Edad");

        jLabel1.setText("Fecha de nacimiento");

        url.setText("Direccion Imagen");

        exIm.setBackground(new java.awt.Color(102, 102, 255));
        exIm.setText("Examinar");
        exIm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exImActionPerformed(evt);
            }
        });

        reg.setBackground(new java.awt.Color(102, 102, 255));
        reg.setText("Registrar");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        bAg.setBackground(new java.awt.Color(102, 102, 255));
        bAg.setText("Agregar");
        bAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labDoc)
                                    .addComponent(labNom)
                                    .addComponent(labApe)
                                    .addComponent(labEdad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doc)
                                    .addComponent(nom)
                                    .addComponent(ape)
                                    .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exIm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(195, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reg)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labDoc)
                                .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exIm)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labNom)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labApe)
                                    .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labEdad)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bAg)))
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reg)
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        if(ape.getText().isEmpty()||doc.getText().isEmpty()||edad.getText().isEmpty()||nom.getText().isEmpty()||url.getText().isEmpty()||nac.getDate()==null){
            JOptionPane.showMessageDialog(null,"Digite todos los datos");
        }else{
            try{
                doc1=Integer.parseInt(doc.getText());
                nom1=(String)nom.getText();
                ape1=(String)ape.getText();
                //Las variables siguientes se usan para obtener los datos del JCalendar
                dia=Integer.toString(nac.getCalendar().get(Calendar.DAY_OF_MONTH));
                mes=Integer.toString((nac.getCalendar().get(Calendar.MONTH))+1);
                año=Integer.toString(nac.getCalendar().get(Calendar.YEAR));
                fecNac=dia+"/"+mes+"/"+año;
                nac1 = LocalDate.parse(fecNac, DateTimeFormatter.ofPattern("d/M/yyyy"));
                edad1=Integer.parseInt(edad.getText());
                //Se hacen las respectivas conversiones de datos para que sean recibidas en la base de datos
                LocalDateTime hoy=LocalDateTime.now();
                fecSeg=Timestamp.valueOf(hoy);
                nac2=Date.valueOf(nac1);
            }catch(NumberFormatException asd){
                JOptionPane.showMessageDialog(null,"Datos incorrectos");
            }
            //Se configura en que tabla se va a realizar el registro, se dividen las categorias
            
            switch(evt.getActionCommand()){
                case "Registrar":
                    
                    if(edad1>=5&&edad1<=15){
                        per=Persona.crear(0, doc1, nom1, ape1, edad1, nac2,fecSeg);
                        Repositorio.crear(per);
                        JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
                    }else if(edad1>=16&&edad1<=24){
                        per=Persona.crear(0, doc1, nom1, ape1, edad1, nac2,fecSeg);
                        Repositorio.crear2(per);
                        JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
                    }else if(edad1>=25&&edad1<=50){
                        per=Persona.crear(0, doc1, nom1, ape1, edad1, nac2,fecSeg);
                        Repositorio.crear3(per);
                        JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Datos incorrectos, edad incorrecta");
                    }
                    doc.setText("");
                    nom.setText("");
                    ape.setText("");
                    edad.setText("");
                    url.setText("");
                    
                    /*
                    Segun la edad que tenga se enviaran a una tabla especifica para
                    cada categoria 
                    */
                break;
                default:
                    JOptionPane.showMessageDialog(this, "Persona no creada", "mal", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_regActionPerformed
    //Se configuran los botones y el label para que la persona pueda ingresar la imagen que desee
    private void exImActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exImActionPerformed
        
	JFileChooser fc = new JFileChooser( "./data" );
	fc.setDialogTitle( "Buscar imagen de perro" );
	fc.setMultiSelectionEnabled( false );

	int resultado = fc.showOpenDialog( this );
        if( resultado == JFileChooser.APPROVE_OPTION ){
	    String imagen = fc.getSelectedFile( ).getAbsolutePath( );
	    url.setText( imagen);
        }
	 	
    }//GEN-LAST:event_exImActionPerformed

    private void bAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgActionPerformed
        String imagen = url.getText( );
	asignarimagen(imagen);
    }//GEN-LAST:event_bAgActionPerformed
    
    public void asignarimagen(String url) {
		
        ImageIcon icono = new ImageIcon();
            try {
                BufferedImage bImagen = ImageIO.read( new File( url ) );
                Image laImagen = bImagen.getScaledInstance( ( int ) ( 150 * 0.85 ), ( int ) ( 150 * 0.85 ), Image.SCALE_AREA_AVERAGING );;
                imagen.setIcon( new ImageIcon( laImagen ) );
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            //forma de ingresar o asignar una imagen en cada registro
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape;
    private javax.swing.JButton bAg;
    private javax.swing.JTextField doc;
    private javax.swing.JTextField edad;
    private javax.swing.JButton exIm;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labApe;
    private javax.swing.JLabel labDoc;
    private javax.swing.JLabel labEdad;
    private javax.swing.JLabel labNom;
    private com.toedter.calendar.JDateChooser nac;
    private javax.swing.JTextField nom;
    private javax.swing.JButton reg;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
