/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class ViewPrincipal extends javax.swing.JFrame {

    ViewResultado viewResultado;
    ControllerPrincipal controllerPrincipal = new ControllerPrincipal();

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAlturaTx = new javax.swing.JTextField();
        txtAlturaRx = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPotenciaTransmissor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAtenConector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGanhoTx = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGanhoRx = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDistanciaRadioEnlace = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFreqIdaVolta = new javax.swing.JTextField();
        btnCalcula = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAtenCabo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jLabel1.setBackground(new java.awt.Color(195, 195, 195));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 88, 88));
        jLabel1.setText("Altura da torre Tx [m]");

        jLabel2.setBackground(new java.awt.Color(195, 195, 195));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(88, 88, 88));
        jLabel2.setText("Altura da torre Rx [m]");

        txtAlturaTx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlturaTx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtAlturaRx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlturaRx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setBackground(new java.awt.Color(195, 195, 195));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(88, 88, 88));
        jLabel3.setText("Potência do transmissor [W]");

        txtPotenciaTransmissor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPotenciaTransmissor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setBackground(new java.awt.Color(195, 195, 195));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(88, 88, 88));
        jLabel4.setText("Atenuação do conector [dB]");

        txtAtenConector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAtenConector.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setBackground(new java.awt.Color(195, 195, 195));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(88, 88, 88));
        jLabel6.setText("Ganho da antena Tx [dBi]");

        txtGanhoTx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGanhoTx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setBackground(new java.awt.Color(195, 195, 195));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(88, 88, 88));
        jLabel7.setText("Ganho da antena Rx [dBi]");

        txtGanhoRx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGanhoRx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setBackground(new java.awt.Color(195, 195, 195));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(88, 88, 88));
        jLabel8.setText("Distância do rádio enlace [km]");

        txtDistanciaRadioEnlace.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDistanciaRadioEnlace.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setBackground(new java.awt.Color(195, 195, 195));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(88, 88, 88));
        jLabel9.setText("Frequência de operação [MHz]");

        txtFreqIdaVolta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFreqIdaVolta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnCalcula.setBackground(new java.awt.Color(195, 195, 195));
        btnCalcula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalcula.setForeground(new java.awt.Color(88, 88, 88));
        btnCalcula.setText("Calcular");
        btnCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaActionPerformed(evt);
            }
        });

        btnLimpa.setBackground(new java.awt.Color(195, 195, 195));
        btnLimpa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpa.setForeground(new java.awt.Color(88, 88, 88));
        btnLimpa.setText("Limpar");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        btnCancela.setBackground(new java.awt.Color(195, 195, 195));
        btnCancela.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancela.setForeground(new java.awt.Color(88, 88, 88));
        btnCancela.setText("Sair");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(195, 195, 195));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(88, 88, 88));
        jLabel5.setText("Atenuação do cabo [dB/m]");

        txtAtenCabo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAtenCabo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Projeto Interdisciplinar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel10)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(342, 342, 342)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGanhoRx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtDistanciaRadioEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFreqIdaVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAlturaTx)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPotenciaTransmissor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlturaRx, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtenCabo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(txtAtenConector, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGanhoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlturaTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtenCabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGanhoRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlturaRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistanciaRadioEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtenConector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPotenciaTransmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFreqIdaVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGanhoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcula)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancela)
                        .addComponent(btnLimpa)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed

        if(txtAlturaTx.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo altura da antena transmissora vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtAlturaRx.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo altura da antena receptora vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtAtenCabo.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo atenuação do cabo vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtAtenConector.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo atenuação do conector vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtDistanciaRadioEnlace.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo distância do rádio enlace vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtFreqIdaVolta.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo frequência vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtGanhoRx.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo ganho da antena receptora vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtGanhoTx.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo ganho da antena transmissora vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(txtPotenciaTransmissor.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo potência de transmissão vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        else
        {
            viewResultado = new ViewResultado(controllerPrincipal.calculaPotenciaRecebidaPr(
                    controllerPrincipal.calculaPotenciaEfetivamenteIrradiadaPeirp(Double.parseDouble(txtPotenciaTransmissor.getText()),
                    Double.parseDouble(txtGanhoTx.getText()), 
                    Double.parseDouble(txtAtenConector.getText()), 
                    Double.parseDouble(txtAlturaTx.getText()), 
                    Double.parseDouble(txtAtenCabo.getText())),
                    
                    controllerPrincipal.calculaAe(Double.parseDouble(txtDistanciaRadioEnlace.getText()),
                    Double.parseDouble(txtFreqIdaVolta.getText())),
                    
                    Double.parseDouble(txtAtenConector.getText()),
                    Double.parseDouble(txtAlturaRx.getText()),
                    Double.parseDouble(txtAtenCabo.getText())),
                    
                    controllerPrincipal.calculaPotenciaEfetivamenteIrradiadaPeirp(Double.parseDouble(txtPotenciaTransmissor.getText()),
                    Double.parseDouble(txtGanhoTx.getText()), 
                    Double.parseDouble(txtAtenConector.getText()), 
                    Double.parseDouble(txtAlturaTx.getText()), 
                    Double.parseDouble(txtAtenCabo.getText())),

                    controllerPrincipal.calculaRaio(Double.parseDouble(txtDistanciaRadioEnlace.getText()),
                    Double.parseDouble(txtFreqIdaVolta.getText())),


                    Double.parseDouble(txtAlturaTx.getText()), 
                    Double.parseDouble(txtAlturaRx.getText()),
                    Double.parseDouble(txtFreqIdaVolta.getText()),
                    Double.parseDouble(txtDistanciaRadioEnlace.getText()));


            viewResultado.setVisible(true);
        }
    }//GEN-LAST:event_btnCalculaActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        txtAlturaRx.setText("");
        txtAlturaTx.setText("");
        txtAtenCabo.setText("");
        txtAtenConector.setText("");
        txtDistanciaRadioEnlace.setText("");
        txtFreqIdaVolta.setText("");
        txtGanhoRx.setText("");
        txtGanhoTx.setText("");
        txtPotenciaTransmissor.setText("");
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcula;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAlturaRx;
    private javax.swing.JTextField txtAlturaTx;
    private javax.swing.JTextField txtAtenCabo;
    private javax.swing.JTextField txtAtenConector;
    private javax.swing.JTextField txtDistanciaRadioEnlace;
    private javax.swing.JTextField txtFreqIdaVolta;
    private javax.swing.JTextField txtGanhoRx;
    private javax.swing.JTextField txtGanhoTx;
    private javax.swing.JTextField txtPotenciaTransmissor;
    // End of variables declaration//GEN-END:variables
}
