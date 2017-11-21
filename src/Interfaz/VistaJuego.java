/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
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
    int dir=1,dir2=2,dir3=1,dir4=2,dir5=1;
    int conDis=0,conCho=0;
    
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
        comNav();
        moviLin1();
        moviLin2();
        moviLin3();
        moviLin4();
        moviLin5();
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(xd,y,2,10);
        /*
        Se manejara el color de JFrame y se añade el disparo de la nave
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
                conDis++;
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
                y-=2;
                repaint();
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        Movimiento del hilo del disparo
        */
    }
    
    public void moviLin1(){
        try {
            if(dir==1&&mar1.getX()>0){
                Thread.sleep(50);
                mar1.setLocation(mar1.getX()-Puntaje.velocidad(), mar1.getY());
                mar2.setLocation(mar2.getX()-Puntaje.velocidad(), mar2.getY());
                mar3.setLocation(mar3.getX()-Puntaje.velocidad(), mar3.getY());
                repaint();
                if(mar1.getX()==-1){
                    dir=2;
                }
            }
            if(dir==2&&mar3.getX()<600){
                Thread.sleep(50);
                mar1.setLocation(mar1.getX()+Puntaje.velocidad(), mar1.getY());
                mar2.setLocation(mar2.getX()+Puntaje.velocidad(), mar2.getY());
                mar3.setLocation(mar3.getX()+Puntaje.velocidad(), mar3.getY());
                repaint();
                if(mar3.getX()==601){
                    dir=1;    
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void moviLin2(){
        try {
            if(dir2==2&&mar8.getX()<600){
                Thread.sleep(50);
                mar4.setLocation(mar4.getX()+Puntaje.velocidad(), mar4.getY());
                mar5.setLocation(mar5.getX()+Puntaje.velocidad(), mar5.getY());
                mar6.setLocation(mar6.getX()+Puntaje.velocidad(), mar6.getY());
                mar7.setLocation(mar7.getX()+Puntaje.velocidad(), mar7.getY());
                mar8.setLocation(mar8.getX()+Puntaje.velocidad(), mar8.getY());
                repaint();
                if(mar8.getX()==600){
                    dir2=1;
                    System.out.println("Si entraaaaa");
                }
            }
            if(dir2==1&&mar4.getX()>0){
                System.out.println("Si entra");
                Thread.sleep(50);
                mar4.setLocation(mar4.getX()-Puntaje.velocidad(), mar4.getY());
                mar5.setLocation(mar5.getX()-Puntaje.velocidad(), mar5.getY());
                mar6.setLocation(mar6.getX()-Puntaje.velocidad(), mar6.getY());
                mar7.setLocation(mar7.getX()-Puntaje.velocidad(), mar7.getY());
                mar8.setLocation(mar8.getX()-Puntaje.velocidad(), mar8.getY());
                repaint();
                if(mar4.getX()==0){
                    dir2=2;
                    
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void moviLin3(){
        try {
            if(dir3==1&&ali1.getX()>0){
                Thread.sleep(50);
                ali1.setLocation(ali1.getX()-Puntaje.velocidad(), ali1.getY());
                ali2.setLocation(ali2.getX()-Puntaje.velocidad(), ali2.getY());
                ali3.setLocation(ali3.getX()-Puntaje.velocidad(), ali3.getY());
                ali4.setLocation(ali4.getX()-Puntaje.velocidad(), ali4.getY());
                ali5.setLocation(ali5.getX()-Puntaje.velocidad(), ali5.getY());
                ali6.setLocation(ali6.getX()-Puntaje.velocidad(), ali6.getY());
                ali7.setLocation(ali7.getX()-Puntaje.velocidad(), ali7.getY());
                repaint();
                if(ali1.getX()==-1){
                    dir3=2;
                }
            }
            if(dir3==2&&ali7.getX()<600){
                Thread.sleep(50);
                ali1.setLocation(ali1.getX()+Puntaje.velocidad(), ali1.getY());
                ali2.setLocation(ali2.getX()+Puntaje.velocidad(), ali2.getY());
                ali3.setLocation(ali3.getX()+Puntaje.velocidad(), ali3.getY());
                ali4.setLocation(ali4.getX()+Puntaje.velocidad(), ali4.getY());
                ali5.setLocation(ali5.getX()+Puntaje.velocidad(), ali5.getY());
                ali6.setLocation(ali6.getX()+Puntaje.velocidad(), ali6.getY());
                ali7.setLocation(ali7.getX()+Puntaje.velocidad(), ali7.getY());
                repaint();
                if(ali7.getX()==601){
                    dir3=1;
                    
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void moviLin4(){
        try {
            if(dir4==2&&ali16.getX()<600){
                Thread.sleep(50);
                ali8.setLocation(ali8.getX()+Puntaje.velocidad(), ali8.getY());
                ali9.setLocation(ali9.getX()+Puntaje.velocidad(), ali9.getY());
                ali10.setLocation(ali10.getX()+Puntaje.velocidad(), ali10.getY());
                ali11.setLocation(ali11.getX()+Puntaje.velocidad(), ali11.getY());
                ali12.setLocation(ali12.getX()+Puntaje.velocidad(), ali12.getY());
                ali13.setLocation(ali13.getX()+Puntaje.velocidad(), ali13.getY());
                ali14.setLocation(ali14.getX()+Puntaje.velocidad(), ali14.getY());
                ali15.setLocation(ali15.getX()+Puntaje.velocidad(), ali15.getY());
                ali16.setLocation(ali16.getX()+Puntaje.velocidad(), ali16.getY());
                repaint();
                if(ali16.getX()==600){
                    dir4=1;
                }
            }
            if(dir4==1&&ali8.getX()>0){
                Thread.sleep(50);
                ali8.setLocation(ali8.getX()-Puntaje.velocidad(), ali8.getY());
                ali9.setLocation(ali9.getX()-Puntaje.velocidad(), ali9.getY());
                ali10.setLocation(ali10.getX()-Puntaje.velocidad(), ali10.getY());
                ali11.setLocation(ali11.getX()-Puntaje.velocidad(), ali11.getY());
                ali12.setLocation(ali12.getX()-Puntaje.velocidad(), ali12.getY());
                ali13.setLocation(ali13.getX()-Puntaje.velocidad(), ali13.getY());
                ali14.setLocation(ali14.getX()-Puntaje.velocidad(), ali14.getY());
                ali15.setLocation(ali15.getX()-Puntaje.velocidad(), ali15.getY());
                ali16.setLocation(ali16.getX()-Puntaje.velocidad(), ali16.getY());
                repaint();
                if(ali8.getX()==0){
                    dir4=2;
                    
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void moviLin5(){
        try {
            if(dir5==1&&alien1.getX()>0){
                Thread.sleep(50);
                alien1.setLocation(alien1.getX()-Puntaje.velocidad(), alien1.getY());
                alien2.setLocation(alien2.getX()-Puntaje.velocidad(), alien2.getY());
                alien3.setLocation(alien3.getX()-Puntaje.velocidad(), alien3.getY());
                alien4.setLocation(alien4.getX()-Puntaje.velocidad(), alien4.getY());
                alien5.setLocation(alien5.getX()-Puntaje.velocidad(), alien5.getY());
                alien6.setLocation(alien6.getX()-Puntaje.velocidad(), alien6.getY());
                alien7.setLocation(alien7.getX()-Puntaje.velocidad(), alien7.getY());
                alien8.setLocation(alien8.getX()-Puntaje.velocidad(), alien8.getY());
                alien9.setLocation(alien9.getX()-Puntaje.velocidad(), alien9.getY());
                alien10.setLocation(alien10.getX()-Puntaje.velocidad(), alien10.getY());
                alien11.setLocation(alien11.getX()-Puntaje.velocidad(), alien11.getY());
                repaint();
                if(alien1.getX()==-1){
                    dir5=2;
                }
            }
            if(dir5==2&&alien11.getX()<600){
                Thread.sleep(50);
                alien1.setLocation(alien1.getX()+Puntaje.velocidad(), alien1.getY());
                alien2.setLocation(alien2.getX()+Puntaje.velocidad(), alien2.getY());
                alien3.setLocation(alien3.getX()+Puntaje.velocidad(), alien3.getY());
                alien4.setLocation(alien4.getX()+Puntaje.velocidad(), alien4.getY());
                alien5.setLocation(alien5.getX()+Puntaje.velocidad(), alien5.getY());
                alien6.setLocation(alien6.getX()+Puntaje.velocidad(), alien6.getY());
                alien7.setLocation(alien7.getX()+Puntaje.velocidad(), alien7.getY());
                alien8.setLocation(alien8.getX()+Puntaje.velocidad(), alien8.getY());
                alien9.setLocation(alien9.getX()+Puntaje.velocidad(), alien9.getY());
                alien10.setLocation(alien10.getX()+Puntaje.velocidad(), alien10.getY());
                alien11.setLocation(alien11.getX()+Puntaje.velocidad(), alien11.getY());
                repaint();
                if(alien11.getX()==601){
                    dir5=1;
                    
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void compDisp(){
        if(conDis-conCho>5){
            Puntaje.restarVidas();
        }
    }
    public void comNav(){
        if(Math.sqrt((Math.pow((alien1.getX()-xd), 2))-(Math.pow((alien1.getY()-y), 2)))==0&&alien1.getText()!="n"){
                conCho++;
                alien1.setVisible(false);
                alien1.setText("n");
                alien1.setEnabled(false);
                hilo1=new Thread();
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien2.getX()-xd), 2))-(Math.pow((alien2.getY()-y), 2)))==0&&alien2.getText()!="n"){
                alien2.setText("n");
                alien2.setVisible(false);
                alien2.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien3.getX()-xd), 2))-(Math.pow((alien3.getY()-y), 2)))==0&&alien3.getText()!="n"){
                alien3.setText("n");
                alien3.setVisible(false);
                alien3.setEnabled(false);
                conCho++;
                hilo1=new Thread();
                
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien4.getX()-xd), 2))-(Math.pow((alien4.getY()-y), 2)))==0&&alien4.getText()!="n"){
                alien4.setText("n");
                alien4.setVisible(false);
                alien4.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien5.getX()-xd), 2))-(Math.pow((alien5.getY()-y), 2)))==0&&alien5.getText()!="n"){
                alien5.setText("n");
                alien5.setVisible(false);
                alien5.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien6.getX()-xd), 2))-(Math.pow((alien6.getY()-y), 2)))==0&&alien6.getText()!="n"){
                alien6.setText("n");
                alien6.setVisible(false);
                alien6.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien7.getX()-xd), 2))-(Math.pow((alien7.getY()-y), 2)))==0&&alien7.getText()!="n"){
                alien7.setText("n");
                alien7.setVisible(false);
                alien7.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien8.getX()-xd), 2))-(Math.pow((alien8.getY()-y), 2)))==0&&alien8.getText()!="n"){
                alien8.setText("n");
                alien8.setVisible(false);
                alien8.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien9.getX()-xd), 2))-(Math.pow((alien9.getY()-y), 2)))==0&&alien9.getText()!="n"){
                alien9.setText("n");
                alien9.setVisible(false);
                alien9.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien10.getX()-xd), 2))-(Math.pow((alien10.getY()-y), 2)))==0&&alien10.getText()!="n"){
                alien10.setText("n");
                alien10.setVisible(false);
                alien10.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((alien11.getX()-xd), 2))-(Math.pow((alien11.getY()-y), 2)))==0&&alien11.getText()!="n"){
                alien11.setText("n");
                alien11.setVisible(false);
                alien11.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali1.getX()-xd), 2))-(Math.pow((ali1.getY()-y), 2)))==0&&ali1.getText()!="n"){
                ali1.setText("n");
                ali1.setVisible(false);
                ali1.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali2.getX()-xd), 2))-(Math.pow((ali2.getY()-y), 2)))==0&&ali2.getText()!="n"){
            ali2.setText("n");
                ali2.setVisible(false);
                ali2.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali3.getX()-xd), 2))-(Math.pow((ali3.getY()-y), 2)))==0&&ali3.getText()!="n"){
                ali3.setText("n");
                ali3.setVisible(false);
                ali3.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali4.getX()-xd), 2))-(Math.pow((ali4.getY()-y), 2)))==0&&ali4.getText()!="n"){
                ali4.setText("n");
                ali4.setVisible(false);
                ali4.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali5.getX()-xd), 2))-(Math.pow((ali5.getY()-y), 2)))==0&&ali5.getText()!="n"){
                ali5.setText("n");
                ali5.setVisible(false);
                ali5.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali6.getX()-xd), 2))-(Math.pow((ali6.getY()-y), 2)))==0&&ali6.getText()!="n"){
                ali6.setText("n");
                ali6.setVisible(false);
                ali6.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali7.getX()-xd), 2))-(Math.pow((ali7.getY()-y), 2)))==0&&ali7.getText()!="n"){
                ali7.setText("n");
                ali7.setVisible(false);
                ali7.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali8.getX()-xd), 2))-(Math.pow((ali8.getY()-y), 2)))==0&&ali8.getText()!="n"){
                ali8.setText("n");
                ali8.setVisible(false);
                ali8.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali9.getX()-xd), 2))-(Math.pow((ali9.getY()-y), 2)))==0&&ali9.getText()!="n"){
                ali9.setText("n");
                ali9.setVisible(false);
                ali9.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali10.getX()-xd), 2))-(Math.pow((ali10.getY()-y), 2)))==0&&ali10.getText()!="n"){
                ali10.setText("n");
                ali10.setVisible(false);
                ali10.setEnabled(false); 
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali11.getX()-xd), 2))-(Math.pow((ali11.getY()-y), 2)))==0&&ali11.getText()!="n"){
                ali11.setText("n");
                ali11.setVisible(false);
                ali11.setEnabled(false);
                conCho++;  
                hilo1=new Thread();
                
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali12.getX()-xd), 2))-(Math.pow((ali12.getY()-y), 2)))==0&&ali12.getText()!="n"){
                ali12.setText("n");
                ali12.setVisible(false);
                ali12.setEnabled(false);
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali13.getX()-xd), 2))-(Math.pow((ali13.getY()-y), 2)))==0&&ali13.getText()!="n"){
                ali13.setText("n");
                ali13.setVisible(false);
                ali13.setEnabled(false);
                conCho++;  
                hilo1=new Thread();
                
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali14.getX()-xd), 2))-(Math.pow((ali14.getY()-y), 2)))==0&&ali14.getText()!="n"){
                ali14.setText("n");
                ali14.setVisible(false);
                ali14.setEnabled(false);
                conCho++; 
                hilo1=new Thread();
                
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali15.getX()-xd), 2))-(Math.pow((ali15.getY()-y), 2)))==0&&ali15.getText()!="n"){
                ali15.setText("n");
                ali15.setVisible(false);
                ali15.setEnabled(false);
                conCho++;
                hilo1=new Thread();
                
               Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((ali16.getX()-xd), 2))-(Math.pow((ali16.getY()-y), 2)))==0&&ali16.getText()!="n"){
                ali16.setText("n");
                ali16.setVisible(false);
                ali16.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar1.getX()-xd), 2))-(Math.pow((mar1.getY()-y), 2)))==0&&mar1.getText()!="n"){
                mar1.setText("n");
                mar1.setVisible(false);
                mar1.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar2.getX()-xd), 2))-(Math.pow((mar2.getY()-y), 2)))==0&&mar2.getText()!="n"){
                mar2.setText("n");
                mar2.setVisible(false);
                mar2.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar3.getX()-xd), 2))-(Math.pow((mar3.getY()-y), 2)))==0&&mar3.getText()!="n"){
                mar3.setText("n");
                mar3.setVisible(false);
                mar3.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar4.getX()-xd), 2))-(Math.pow((mar4.getY()-y), 2)))==0&&mar4.getText()!="n"){
                mar4.setText("n");
                mar4.setVisible(false);
                mar4.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar5.getX()-xd), 2))-(Math.pow((mar5.getY()-y), 2)))==0&&mar5.getText()!="n"){
                mar5.setText("n");
                mar5.setVisible(false);
                mar5.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar6.getX()-xd), 2))-(Math.pow((mar6.getY()-y), 2)))==0&&mar6.getText()!="n"){
                mar6.setText("n");
                mar6.setVisible(false);
                mar6.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar7.getX()-xd), 2))-(Math.pow((mar7.getY()-y), 2)))==0&&mar7.getText()!="n"){
                mar7.setText("n");
                mar7.setVisible(false);
                mar7.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }else if(Math.sqrt((Math.pow((mar8.getX()-xd), 2))-(Math.pow((mar8.getY()-y), 2)))==0&&mar8.getText()!="n"){
                mar8.setText("n");
                mar8.setVisible(false);
                mar8.setEnabled(false);  
                hilo1=new Thread();
                conCho++;
                Puntaje.sumarPuntos();
        }
    }
    
    
}