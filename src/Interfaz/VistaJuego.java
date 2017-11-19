/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan
 */
public class VistaJuego extends javax.swing.JFrame implements KeyListener{

    int x=300;
    Thread hilo1;
    Thread hilo2;
    
    
    public VistaJuego() {
        initComponents();
        hilo1=new Thread();
        hilo2=new Thread();
    }
    
    /*public void paint(Graphics g){
        g.setColor(getBackground());
        g.fillRect(0,0,getWidth(),getHeight());
        g.fillRect(x+1,380,30,30);
        g.setColor(Color.blue);
        g.fillRect(x,380,30,30);
        g.setColor(Color.ORANGE);
        g.fillOval(x,380,30,30);
    }*/
    
    public void inicio(){
        
        if(hilo1!=null){
            hilo1=new Thread();
            hilo1.start();
        }else{
            hilo1.start();
        }
        
    }
    
    public void inicio1(){
        
        if(hilo2!=null){
            hilo2=new Thread();
            hilo2.start();
        }else{
            hilo2.start();
        }
        
    }
    
    public void run() {
        
        try {   
            
            if(hilo1.isAlive()==true){
                Thread.sleep(10);
                x+=5;
                repaint();
            }else if(hilo2.isAlive()==true){
                Thread.sleep(10);
                x-=5;
                repaint();
            }
                
                
            
        } catch (InterruptedException ex) {
                System.out.println("error");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 400));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        nave.setBackground(new java.awt.Color(0, 0, 0));
        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/navee.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(nave)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(nave)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJuego().setVisible(true);
            }
        });


    /*public void teclado(int tecla, boolean presionada){
        switch(tecla){
            case KeyEvent.VK_RIGHT:   
                hilo1.start();
                requestFocusInWindow();
                break;
            case KeyEvent.VK_LEFT:   
                hilo2.start();
                requestFocusInWindow();
                break;
            
        }

    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nave;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        nave.setBounds(x,380,200,15);
        
        int tecla = e.getKeyCode(); 
        switch(tecla){
            case KeyEvent.VK_RIGHT:   
                if(hilo1!=null){
                    hilo1=new Thread();
                    hilo1.start();
                }else{
                    hilo1.start();
                }
                requestFocusInWindow();
                break;
            case KeyEvent.VK_LEFT:   
                if(hilo2!=null){
                    hilo2=new Thread();
                    hilo2.start();
                }else{
                    hilo2.start();
                }
                requestFocusInWindow();
                break;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*}*/}

    
