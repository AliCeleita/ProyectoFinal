/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class Puntaje extends javax.swing.JPanel {

    static int puntaje=0;
    static String jugador,asd;
    static int v,n=0;
    public Puntaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pu = new javax.swing.JLabel();
        vi = new javax.swing.JLabel();
        Lpuntos = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 70));
        setPreferredSize(new java.awt.Dimension(400, 60));

        pu.setForeground(new java.awt.Color(255, 255, 255));
        pu.setText("Puntos");
        pu.setAlignmentX(0.5F);

        vi.setForeground(new java.awt.Color(255, 255, 255));
        vi.setText("Vidas");

        Lpuntos.setForeground(new java.awt.Color(255, 255, 255));
        Lpuntos.setText("0");

        vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/vidas.png"))); // NOI18N

        vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/vidas.png"))); // NOI18N

        vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/vidas.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(vida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vida3)
                .addGap(22, 22, 22))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vida1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vida3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vida2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void setJugador( String jugador){
        this.jugador=jugador;
    }
    
    public static int velocidad(){
        if(puntaje<=1150){
            v=2;
            return v;
        }else if(puntaje<=2300){
            v=6;
            return v;
        }else{
            v=10;
            return v;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Lpuntos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pu;
    private javax.swing.JLabel vi;
    private static javax.swing.JLabel vida1;
    private static javax.swing.JLabel vida2;
    private static javax.swing.JLabel vida3;
    // End of variables declaration//GEN-END:variables
    public static void restarVidas(){
        n++;
        if(n==1){
            vida1.setVisible(false);
        }else if(n==2){
            vida2.setVisible(false);
        }else if(n==3){
            vida3.setVisible(false);
            JOptionPane.showMessageDialog(null, "Fin del juego");
            Inicio.main(null);
        }
    }
    public static void sumarPuntos(){
        puntaje+=100;
        Lpuntos.setText(Integer.toString(puntaje));
    }
    
}
