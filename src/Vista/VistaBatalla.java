/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Samsung
 */
public class VistaBatalla extends javax.swing.JFrame {

    /**
     * Creates new form VistaTerreno2
     */
    public VistaBatalla() {
        initComponents();
        
        
        this.panelTerreno.setLayout(new GridLayout(15,15));
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                botones [i][j]= new JButton();
                botones [i][j].setIcon(null);
                botones [i][j].setBorderPainted(true);
                this.panelTerreno.add(botones[i][j]); 
            }
        
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTerreno = new javax.swing.JPanel();
        btnInvocar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnMover = new javax.swing.JButton();
        btnLanzar = new javax.swing.JButton();
        btnMagia = new javax.swing.JButton();
        btnTrampa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTerreno.setEnabled(false);
        panelTerreno.setLayout(new java.awt.GridLayout(1, 0));

        btnInvocar.setText("Invocar criatura");
        btnInvocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvocarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar turno");

        btnMover.setText("Mover criatura");

        btnLanzar.setText("Lanzar dado");

        btnMagia.setText("Activar magia");

        btnTrampa.setText("Poner Trampa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMagia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTrampa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInvocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMover, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLanzar)
                    .addComponent(btnFinalizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMagia)
                    .addComponent(btnTrampa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMover)
                    .addComponent(btnInvocar))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvocarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBatalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnInvocar;
    private javax.swing.JButton btnLanzar;
    private javax.swing.JButton btnMagia;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnTrampa;
    private javax.swing.JPanel panelTerreno;
    // End of variables declaration//GEN-END:variables
    
    public JButton[][] botones = new JButton[15][15];
    
    
    public void agregarListener(ActionListener al,MouseAdapter ml,KeyListener kl){
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                this.botones[i][j].addActionListener(al);
                this.botones[i][j].addMouseListener(ml);
                
            }
        }
        this.panelTerreno.addMouseWheelListener(ml);
        this.btnInvocar.addActionListener(al);
        this.btnFinalizar.addActionListener(al);
        this.btnLanzar.addActionListener(al);
        this.btnMagia.addActionListener(al);
        this.btnMover.addActionListener(al);
        this.btnTrampa.addActionListener(al);
        this.addKeyListener(kl);
        this.setFocusable(true);
        
        
        
        
    }
    public JButton getBtnInvocar(){
        return this.btnInvocar;
    }
    public JButton[][] getBotonesTerreno(){
        return this.botones;
    }
    public JPanel getPanelTerreno(){
        return this.panelTerreno;
    }
    public JButton getBtnFinalizar(){
        return this.btnFinalizar;
    }
    public JButton getBtnLanzar(){
        return this.btnLanzar;
    }
    public JButton getBtnMagia(){
        return this.btnMagia;
    }
    public JButton getBtnMover(){
        return this.btnMover;
    }
    public JButton getBtnTrampa(){
        return this.btnTrampa;
    }
    
    
       
}
