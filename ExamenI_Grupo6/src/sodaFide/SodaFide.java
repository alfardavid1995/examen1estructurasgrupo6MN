/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodaFide;

/**
 *
 * @author Wstov
 */
public class SodaFide extends javax.swing.JFrame {
    private int contador = 0;

    /**
     * Creates new form SodaFide
     */
    public SodaFide() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPaneLista = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_IngresaNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_IngresaCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox_Discapacidad = new javax.swing.JCheckBox();
        jButton_AgregaPedido = new javax.swing.JButton();
        jComboBoxComboMenu = new javax.swing.JComboBox<>();
        jLabelTotalMonto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_AtenderPedido = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneListaPedidos = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaPilaTrastes = new javax.swing.JTextArea();

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pedido", "Nombre", "Cedula", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jTabbedPaneLista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del Cliente:");

        jTextField_IngresaNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_IngresaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IngresaNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cedula del Cliente:");

        jTextField_IngresaCedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Menu:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total:");

        jCheckBox_Discapacidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Discapacidad.setText("Discapacidad");
        jCheckBox_Discapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DiscapacidadActionPerformed(evt);
            }
        });

        jButton_AgregaPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AgregaPedido.setText("Agregar Pedido");
        jButton_AgregaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregaPedidoActionPerformed(evt);
            }
        });

        jComboBoxComboMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combo 1", "Combo 2 (Tiene cubiertos)", "Combo 3", "Combo 4 (Tiene cubiertos)" }));
        jComboBoxComboMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComboMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(200, 200, 200)
                        .addComponent(jLabelTotalMonto))
                    .addComponent(jTextField_IngresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxComboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox_Discapacidad)
                                .addComponent(jTextField_IngresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton_AgregaPedido)
                        .addGap(30, 30, 30)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_IngresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_IngresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox_Discapacidad)
                    .addComponent(jComboBoxComboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton_AgregaPedido)
                    .addComponent(jLabelTotalMonto))
                .addGap(91, 91, 91))
        );

        jTabbedPaneLista.addTab("Agregar Pedido", jPanel2);

        jButton_AtenderPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AtenderPedido.setText("Atender Pedido");
        jButton_AtenderPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtenderPedidoActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jTextPaneListaPedidos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(667, 667, 667))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_AtenderPedido)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton_AtenderPedido)
                .addGap(49, 49, 49))
        );

        jTabbedPaneLista.addTab("Lista de Pedidos", jPanel1);

        jTextAreaPilaTrastes.setColumns(20);
        jTextAreaPilaTrastes.setRows(5);
        jScrollPane3.setViewportView(jTextAreaPilaTrastes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jTabbedPaneLista.addTab("Pila Trastes", jPanel3);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneLista)
                .addGap(257, 257, 257))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneLista, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_DiscapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DiscapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_DiscapacidadActionPerformed

    private void jTextField_IngresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IngresaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IngresaNombreActionPerformed

    private void jButton_AgregaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregaPedidoActionPerformed
        int cedula=Integer.parseInt(jTextField_IngresaCedula.getText());
        String nombre=jTextField_IngresaNombre.getText();
        boolean discapacidad=jCheckBox_Discapacidad.isSelected();
        String comboEscogido = "";
        int precioEscogido = 0;
        boolean tieneCubiertos= false;
        
        Traste traste = new Traste();
                
        
        switch(jComboBoxComboMenu.getSelectedIndex()){
            case 0:
                comboEscogido="Combo 1";
                precioEscogido = 4000;
                break;
            case 1:
                comboEscogido="Combo 2";
                precioEscogido = 5000;
                tieneCubiertos = true;
                break;
             case 2:
                comboEscogido="Combo 3";
                precioEscogido = 6000;

                break;
            case 3:
                comboEscogido="Combo 4";
                precioEscogido = 7000;
                   tieneCubiertos = true;
                break;
        }
        Orden ordencita = new Orden( precioEscogido,comboEscogido, nombre, cedula, discapacidad,tieneCubiertos);
        String precioEscogidotring = precioEscogido+ "";
        jLabelTotalMonto.setText(precioEscogidotring);
        colita.encola(ordencita);
        jTextPaneListaPedidos.setText(colita.toString());
      
        contador += 1;
        traste = new Traste(contador,ordencita.isTieneCubiertos());
         miPila.push(traste);
    }//GEN-LAST:event_jButton_AgregaPedidoActionPerformed

    private void jComboBoxComboMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxComboMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxComboMenuActionPerformed

    private void jButton_AtenderPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtenderPedidoActionPerformed
        // TODO add your handling code here:
      
        colita.eliminaPrimero();
        jTextPaneListaPedidos.setText(colita.toString());
        jTextAreaPilaTrastes.setText(miPila.toString());
       
    }//GEN-LAST:event_jButton_AtenderPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(SodaFide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SodaFide().setVisible(true);
            }
        });
    }
    Cola colita = new  Cola();
    Pila miPila = new Pila();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregaPedido;
    private javax.swing.JButton jButton_AtenderPedido;
    private javax.swing.JCheckBox jCheckBox_Discapacidad;
    private javax.swing.JComboBox<String> jComboBoxComboMenu;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTotalMonto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneLista;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaPilaTrastes;
    private javax.swing.JTextField jTextField_IngresaCedula;
    private javax.swing.JTextField jTextField_IngresaNombre;
    private javax.swing.JTextPane jTextPaneListaPedidos;
    // End of variables declaration//GEN-END:variables
}
