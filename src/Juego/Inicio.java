/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author AliCeleita
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bjugar = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        bpuntajes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        bjugar.setBackground(new java.awt.Color(102, 102, 255));
        bjugar.setText("Jugar");
        getContentPane().add(bjugar);
        bjugar.setBounds(210, 150, 160, 30);

        usuarios.setBackground(new java.awt.Color(102, 102, 255));
        usuarios.setText("Jugadores");
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        getContentPane().add(usuarios);
        usuarios.setBounds(210, 200, 160, 30);

        bpuntajes.setBackground(new java.awt.Color(102, 102, 255));
        bpuntajes.setText("Puntajes");
        getContentPane().add(bpuntajes);
        bpuntajes.setBounds(210, 250, 160, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Space Invaders");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 440, 60);

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\AliCeleita\\Pictures\\galaxia.jpg")); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 670, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        this.setVisible(false);
        Jugadores asd=new Jugadores();
        asd.setVisible(true);
    }//GEN-LAST:event_usuariosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton bjugar;
    private javax.swing.JButton bpuntajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}