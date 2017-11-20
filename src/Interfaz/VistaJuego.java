/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;



import java.awt.Color;
import java.awt.event.KeyEvent;


/**
 *
 * @author Brayan
 */
public class VistaJuego extends javax.swing.JFrame {
    int x=300;
    
    public VistaJuego() {
        initComponents();
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nave = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 400));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        nave.setBackground(new java.awt.Color(0, 0, 0));
        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/navee.png"))); // NOI18N
        getContentPane().add(nave);
        nave.setBounds(280, 330, 50, 48);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/fondo2.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 600, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                if(x>550){
                    x=550;
                }else{
                    x+=5;
                    nave.setLocation(x, nave.getY());
                    
                }
                requestFocusInWindow();
            break;
            case KeyEvent.VK_LEFT:
                if(x<0){
                    x=0;
                }else{
                    x-=5;
                    nave.setLocation(x,nave.getY());
                }
                requestFocusInWindow();
            break;
        }
    }//GEN-LAST:event_formKeyPressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel nave;
    // End of variables declaration//GEN-END:variables

}