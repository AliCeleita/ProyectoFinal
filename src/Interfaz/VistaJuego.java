/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Brayan
 */
public class VistaJuego extends javax.swing.JFrame implements Runnable{
    int x,y,xd;
    Thread hilo1;
    AudioClip movI,mov,disp;
    
    public VistaJuego() {
        getContentPane().setBackground(new java.awt.Color(0,0,0));
        initComponents();
        this.setResizable(false);
        x=nave.getX();
        hilo1=new Thread(this);
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

        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/navee.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(nave)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 350, Short.MAX_VALUE)
                .addComponent(nave))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void paint(Graphics g){
        setBackground(Color.BLACK);
        g.setColor(getBackground());
        g.fillRect(0,0,getWidth(),getHeight()-50);
        g.setColor(Color.white);
        g.fillRect(xd,y,2,10);
    }
    
    public void inicio(){
        if(hilo1!=null){
            hilo1=new Thread(this);
            hilo1.start();
        }else{
            hilo1.start();
        }
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                if(x>555){
                    x=550;
                }else{
                    x+=5;
                    nave.setLocation(x, nave.getY());
                    
                }
                mov= java.applet.Applet.newAudioClip(getClass().getResource("/Archivos/movNav.wav"));
                mov.play();
                try{
                    movI.stop();
                    disp.stop();
                }catch(Exception asd){
                    System.out.println("sin sonido");
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
                movI= java.applet.Applet.newAudioClip(getClass().getResource("/Archivos/movNav.wav"));
                movI.play();
                try{
                    mov.stop();
                    disp.stop();
                }catch(Exception asd){
                    System.out.println("sin sonido");
                }
                requestFocusInWindow();
            break;
            case KeyEvent.VK_UP:
                disp= java.applet.Applet.newAudioClip(getClass().getResource("/Archivos/disparo.wav"));
                disp.play();
                try{
                    movI.stop();
                    mov.stop();
                }catch(Exception asd){
                    System.out.println("sin sonido");
                }
                xd=x+25;
                y=nave.getY();
                inicio();
                requestFocusInWindow();
            break;
        }
    }//GEN-LAST:event_formKeyPressed
 


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nave;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            while(y>0){
                Thread.sleep(50);
                y-=1;
                repaint();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}