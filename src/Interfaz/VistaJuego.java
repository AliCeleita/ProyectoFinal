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
    AudioClip disp;
    
    public VistaJuego() {
        getContentPane().setBackground(new java.awt.Color(0,0,0));
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        puntaje1.setVisible(true);
        x=nave.getX();
        hilo1=new Thread(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nave = new javax.swing.JLabel();
        puntaje1 = new Interfaz.Puntaje();
        alien1 = new javax.swing.JLabel();
        alien2 = new javax.swing.JLabel();
        alien3 = new javax.swing.JLabel();
        alien4 = new javax.swing.JLabel();
        alien5 = new javax.swing.JLabel();
        alien6 = new javax.swing.JLabel();
        alien7 = new javax.swing.JLabel();
        alien8 = new javax.swing.JLabel();
        alien9 = new javax.swing.JLabel();
        alien10 = new javax.swing.JLabel();
        alien11 = new javax.swing.JLabel();
        ali1 = new javax.swing.JLabel();
        ali2 = new javax.swing.JLabel();
        ali3 = new javax.swing.JLabel();
        ali4 = new javax.swing.JLabel();
        ali5 = new javax.swing.JLabel();
        ali6 = new javax.swing.JLabel();
        ali7 = new javax.swing.JLabel();
        ali8 = new javax.swing.JLabel();
        ali9 = new javax.swing.JLabel();
        ali10 = new javax.swing.JLabel();
        ali11 = new javax.swing.JLabel();
        ali12 = new javax.swing.JLabel();
        ali13 = new javax.swing.JLabel();
        ali14 = new javax.swing.JLabel();
        ali15 = new javax.swing.JLabel();
        ali16 = new javax.swing.JLabel();
        mar1 = new javax.swing.JLabel();
        mar2 = new javax.swing.JLabel();
        mar3 = new javax.swing.JLabel();
        mar4 = new javax.swing.JLabel();
        mar5 = new javax.swing.JLabel();
        mar6 = new javax.swing.JLabel();
        mar7 = new javax.swing.JLabel();
        mar8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 470));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/navee.png"))); // NOI18N

        alien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        alien11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien1.jpg"))); // NOI18N

        ali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        ali16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien2.jpg"))); // NOI18N

        mar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        mar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/alien3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(puntaje1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(ali1)
                                .addGap(18, 18, 18)
                                .addComponent(ali2)
                                .addGap(18, 18, 18)
                                .addComponent(ali3)
                                .addGap(18, 18, 18)
                                .addComponent(ali4)
                                .addGap(18, 18, 18)
                                .addComponent(ali5)
                                .addGap(18, 18, 18)
                                .addComponent(ali6)
                                .addGap(18, 18, 18)
                                .addComponent(ali7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(mar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(ali8)
                        .addGap(18, 18, 18)
                        .addComponent(ali9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ali10)
                                .addGap(18, 18, 18)
                                .addComponent(ali11)
                                .addGap(18, 18, 18)
                                .addComponent(ali12)
                                .addGap(18, 18, 18)
                                .addComponent(ali13)
                                .addGap(18, 18, 18)
                                .addComponent(ali14)
                                .addGap(18, 18, 18)
                                .addComponent(ali15)
                                .addGap(18, 18, 18)
                                .addComponent(ali16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mar4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mar5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mar6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mar7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mar8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nave)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(alien1)
                        .addGap(18, 18, 18)
                        .addComponent(alien2)
                        .addGap(18, 18, 18)
                        .addComponent(alien3)
                        .addGap(18, 18, 18)
                        .addComponent(alien4)
                        .addGap(18, 18, 18)
                        .addComponent(alien5)
                        .addGap(18, 18, 18)
                        .addComponent(alien6)
                        .addGap(18, 18, 18)
                        .addComponent(alien7)
                        .addGap(18, 18, 18)
                        .addComponent(alien8)
                        .addGap(18, 18, 18)
                        .addComponent(alien9)
                        .addGap(18, 18, 18)
                        .addComponent(alien10)
                        .addGap(18, 18, 18)
                        .addComponent(alien11)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mar1)
                    .addComponent(mar2)
                    .addComponent(mar3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mar8)
                    .addComponent(mar4)
                    .addComponent(mar5)
                    .addComponent(mar6)
                    .addComponent(mar7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ali2)
                    .addComponent(ali3)
                    .addComponent(ali4)
                    .addComponent(ali5)
                    .addComponent(ali6)
                    .addComponent(ali7)
                    .addComponent(ali1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ali16)
                            .addComponent(ali10)
                            .addComponent(ali11)
                            .addComponent(ali12)
                            .addComponent(ali13)
                            .addComponent(ali14)
                            .addComponent(ali15)
                            .addComponent(ali8)
                            .addComponent(ali9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(alien8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alien7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alien6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alien5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alien4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alien9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(alien10)
                            .addComponent(alien11)))
                    .addComponent(alien1)
                    .addComponent(alien3)
                    .addComponent(alien2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(nave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(xd,y,2,10);
        movimientoAlien();
        /*
        Se manejara el color de JFrame y se añade el distaro de la nave
        */
    }
    
    public void inicio(){
        if(hilo1!=null){
            hilo1=new Thread(this);
            hilo1.start();
        }else{
            hilo1.start();
        }
        /*
        Inicio y manejo de hilo
        */
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
            case KeyEvent.VK_UP:
                disp= java.applet.Applet.newAudioClip(getClass().getResource("/Archivos/disparo.wav"));
                disp.play();
                xd=x+25;
                y=nave.getY();
                inicio();
                requestFocusInWindow();
            break;
        }
        /*
        Se escuchara el teclado y se llama al hilo del disparo y se le agrega sonido al disparo
        */
    }//GEN-LAST:event_formKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ali1;
    private javax.swing.JLabel ali10;
    private javax.swing.JLabel ali11;
    private javax.swing.JLabel ali12;
    private javax.swing.JLabel ali13;
    private javax.swing.JLabel ali14;
    private javax.swing.JLabel ali15;
    private javax.swing.JLabel ali16;
    private javax.swing.JLabel ali2;
    private javax.swing.JLabel ali3;
    private javax.swing.JLabel ali4;
    private javax.swing.JLabel ali5;
    private javax.swing.JLabel ali6;
    private javax.swing.JLabel ali7;
    private javax.swing.JLabel ali8;
    private javax.swing.JLabel ali9;
    private javax.swing.JLabel alien1;
    private javax.swing.JLabel alien10;
    private javax.swing.JLabel alien11;
    private javax.swing.JLabel alien2;
    private javax.swing.JLabel alien3;
    private javax.swing.JLabel alien4;
    private javax.swing.JLabel alien5;
    private javax.swing.JLabel alien6;
    private javax.swing.JLabel alien7;
    private javax.swing.JLabel alien8;
    private javax.swing.JLabel alien9;
    private javax.swing.JLabel mar1;
    private javax.swing.JLabel mar2;
    private javax.swing.JLabel mar3;
    private javax.swing.JLabel mar4;
    private javax.swing.JLabel mar5;
    private javax.swing.JLabel mar6;
    private javax.swing.JLabel mar7;
    private javax.swing.JLabel mar8;
    private javax.swing.JLabel nave;
    private Interfaz.Puntaje puntaje1;
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
        /*
        Movimiento del hilo del disparo
        */
    }
    
    public void movimientoAlien(){
        int x1=250,i;
        try {
            if(mar1.getX()>50){
                while(mar1.getX()>50){
                    Thread.sleep(50);
                    mar1.setLocation(mar1.getX()-1, mar1.getY());
                    mar2.setLocation(mar2.getX()-1, mar2.getY());
                    mar3.setLocation(mar3.getX()-1, mar3.getY());
                }
            }else if(mar3.getX()<550){
                while(mar3.getX()<550){
                    Thread.sleep(50);
                    mar1.setLocation(mar1.getX()+1, mar1.getY());
                    mar2.setLocation(mar2.getX()+1, mar2.getY());
                    mar3.setLocation(mar3.getX()+1, mar3.getY());
                }
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}