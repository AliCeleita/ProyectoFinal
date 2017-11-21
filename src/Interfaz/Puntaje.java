/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.HistorialPuntajes;
import Clases.Persona;
import Clases.Repositorio;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan
 */
public class Puntaje extends javax.swing.JPanel {

    static int puntaje=0;
    static String jugador;
    static int v,n=0;
    static HistorialPuntajes obj;
    static Timestamp fecSeg;
    public Timestamp fecha2;
    
    private DefaultTableModel tablaHis;
    public Puntaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pu = new javax.swing.JLabel();
        Lpuntos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 70));
        setPreferredSize(new java.awt.Dimension(400, 60));

        pu.setForeground(new java.awt.Color(255, 255, 255));
        pu.setText("Puntos");
        pu.setAlignmentX(0.5F);

        Lpuntos.setForeground(new java.awt.Color(255, 255, 255));
        Lpuntos.setText("0");

        jLabel5.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(Lpuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lpuntos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void setTableModel(DefaultTableModel tablaHis){
        this.tablaHis = tablaHis;
    }
    
    public void refreshTableModel(){
        ArrayList<HistorialPuntajes> listaHis = Repositorio.obtenerTodos4();
        while (tablaHis.getRowCount() > 0) {
            tablaHis.removeRow(0);
        }
        
        for(HistorialPuntajes p : listaHis)
        {
            fecha2=p.getFecSeg();
            String[] data = {Integer.toString(p.getId()), p.getNombre(),Integer.toString(p.getPuntos()),fecha2.toString()};
            tablaHis.addRow(data);
        }
        
        /*
        Metodo creado para refrescar la tabla que refrescara los historiales de juego
        */
    }
    
    public void setJugador( String jugador){
        this.jugador=jugador;
    }
    
    public static int velocidad(){
        if(puntaje<=1150){
            v=2;
            return v;
        }else if(puntaje<=2300){
            v=8;
            return v;
        }else{
            v=16;
            return v;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Lpuntos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pu;
    // End of variables declaration//GEN-END:variables
    /*public static void restarVidas(){
        n++;
        if(n==1){
            vida1.setVisible(false);
        }else if(n==2){
            vida2.setVisible(false);
        }else if(n==3){
            
            LocalDateTime hoy=LocalDateTime.now();
            fecSeg=Timestamp.valueOf(hoy);
            obj= HistorialPuntajes.crear(0, jugador, puntaje, fecSeg);
            Repositorio.crear5(obj);
            
            vida3.setVisible(false);
            JOptionPane.showMessageDialog(null, "Fin del juego");
            Inicio.main(null);
        }
    }*/
    public static void sumarPuntos(){
        puntaje+=100;
        Lpuntos.setText(Integer.toString(puntaje));
        if(puntaje==3500){
            JOptionPane.showMessageDialog(null, "Ganaste");
            Inicio.main(null);
            LocalDateTime hoy=LocalDateTime.now();
            fecSeg=Timestamp.valueOf(hoy);
            obj= HistorialPuntajes.crear(0, jugador, puntaje, fecSeg);
            Repositorio.crear5(obj);
        }
    }
    
}
