package sodaFide;

import java.util.ArrayList;
import java.util.Random;

public class SodaFide extends javax.swing.JFrame {

    public SodaFide() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //metodo que limpia los inputs
    public void limpiarConsola() {
        jTextField_IngresaNombre.setText("");
        jTextField_IngresaCedula.setText("");
        jCheckBox_Discapacidad.setSelected(false);
        jComboBoxComboMenu.setSelectedIndex(0);
        jLabelTotalMonto.setText("");

    }

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
        jScrollPane2 = new javax.swing.JScrollPane();
        text_Pila = new javax.swing.JTextArea();
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

        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jComboBoxComboMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxComboMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combo 1", "Combo 2 ", "Combo 3", "Combo 4 " }));
        jComboBoxComboMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxComboMenuMouseClicked(evt);
            }
        });
        jComboBoxComboMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComboMenuActionPerformed(evt);
            }
        });

        jLabelTotalMonto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_IngresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxComboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotalMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox_Discapacidad)
                        .addComponent(jTextField_IngresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_AgregaPedido))
                    .addComponent(jLabel2))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_IngresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_IngresaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox_Discapacidad)
                    .addComponent(jComboBoxComboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_AgregaPedido)
                    .addComponent(jLabelTotalMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(135, 135, 135))
        );

        jTabbedPaneLista.addTab("Agregar Pedido", jPanel2);

        jButton_AtenderPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AtenderPedido.setText("Atender Pedido");
        jButton_AtenderPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtenderPedidoActionPerformed(evt);
            }
        });

        jTextPaneListaPedidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jTextPaneListaPedidos);

        text_Pila.setColumns(20);
        text_Pila.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        text_Pila.setRows(5);
        jScrollPane2.setViewportView(text_Pila);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_AtenderPedido)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_AtenderPedido)
                .addGap(83, 83, 83))
        );

        jTabbedPaneLista.addTab("Lista de Pedidos", jPanel1);

        jTextAreaPilaTrastes.setColumns(20);
        jTextAreaPilaTrastes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaPilaTrastes.setRows(5);
        jScrollPane3.setViewportView(jTextAreaPilaTrastes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPaneLista.addTab("Pila Trastes", jPanel3);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPaneLista)
                .addGap(0, 0, 0))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneLista, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //al presionar este boton se guardan todos los datos ingresados de la orden
        int cedula = Integer.parseInt(jTextField_IngresaCedula.getText());
        String nombre = jTextField_IngresaNombre.getText();
        boolean discapacidad = jCheckBox_Discapacidad.isSelected();
        String comboEscogido = "";
        int precioEscogido = 0;
        //se valida la opcion que el usuario seleccione en el comboBox
        switch (jComboBoxComboMenu.getSelectedIndex()) {
            case 0:
                comboEscogido = "Combo 1";
                precioEscogido = 4000;

                break;
            case 1:
                comboEscogido = "Combo 2";
                precioEscogido = 5000;

                break;
            case 2:
                comboEscogido = "Combo 3";
                precioEscogido = 6000;

                break;
            case 3:
                comboEscogido = "Combo 4";
                precioEscogido = 7000;

                break;
        }

        //se crea la nueva orden
        Orden ordencita = new Orden(precioEscogido, comboEscogido, nombre,
                cedula, discapacidad);

        //se envia la nueva orden
        colita.encola(ordencita);

        //se muestra la cola
        jTextPaneListaPedidos.setText(colita.toString());

        //se limpian los inputs
        limpiarConsola();

    }//GEN-LAST:event_jButton_AgregaPedidoActionPerformed

    private void jComboBoxComboMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxComboMenuActionPerformed

        //event Mouse Clicked
        //este evento unicamente funciona para mostrar en pantalla
        //el precio del combo seleccionado
        int precioEscogido = 0;

        String precioEscogidotring = precioEscogido + "";
        jLabelTotalMonto.setText(precioEscogidotring);

        switch (jComboBoxComboMenu.getSelectedIndex()) {
            case 0:

                precioEscogido = 4000;
                precioEscogidotring = precioEscogido + "";
                jLabelTotalMonto.setText(precioEscogidotring);
                break;
            case 1:

                precioEscogido = 5000;
                precioEscogidotring = precioEscogido + "";
                jLabelTotalMonto.setText(precioEscogidotring);

                break;
            case 2:

                precioEscogido = 6000;
                precioEscogidotring = precioEscogido + "";
                jLabelTotalMonto.setText(precioEscogidotring);
                break;
            case 3:

                precioEscogido = 7000;
                precioEscogidotring = precioEscogido + "";
                jLabelTotalMonto.setText(precioEscogidotring);

                break;
        }
    }//GEN-LAST:event_jComboBoxComboMenuActionPerformed

    private void jButton_AtenderPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtenderPedidoActionPerformed
        boolean idUnicoTraste = false;
        //al precionar este boton si la cola esta vacia muestra una alerta
        if (colita.ColaVacia()) {
            jTextPaneListaPedidos.setText("No hay pedidos en la cola");
            text_Pila.setText("No hay traste que agregar");
        } else {
            //elimina al primero de la cola
            colita.eliminaPrimero();
            //muestra la cola actualizada
            jTextPaneListaPedidos.setText(colita.toString());

            //Genera un nuevo traste
            Traste traste = new Traste();
            
            int idTraste;
            boolean idTrasteYaEstapresente = false;
            do{
                //creamos un id random para el traste entre 1 y 10000
                 idTraste = (int) (Math.random() * 10000 + 1);
                //el ID es unico asi que solo se va a asignar si no esta 
                //presente en el arraylist registrado
                idTrasteYaEstapresente=buscarSiIDEstaRepetido(idTraste);
                //si el ID ya esta presente va seguir generando valores random
                //hasta que genere un valor que no haya sido  
                //almacena en el array list
            }while(idTrasteYaEstapresente);
            
            //agregarID a laLista
            idTrasteArraylist.add(idTraste);
            
            //creamos un boolean random
            boolean tieneCubiertos = random.nextBoolean();
            
            //se crea un nuevo traste con atributos id,tieneCubiertos
            traste = new Traste(idTraste, tieneCubiertos);
            
            //se muestra el traste nuevo
            text_Pila.setText(traste.toString());
            
            //se envia el nuevo traste a la pila
            miPila.push(traste);
            
            //se muestra la pila actualizada
            jTextAreaPilaTrastes.setText(miPila.toString());

        }

    }//GEN-LAST:event_jButton_AtenderPedidoActionPerformed

    private void jComboBoxComboMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxComboMenuMouseClicked

    }//GEN-LAST:event_jComboBoxComboMenuMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SodaFide.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SodaFide().setVisible(true);
            }
        });
    }
    
    //en esta rutina se envia un id generado de forma aleatoria y se compara
    //con todos los IDs existentes registrados para que no haya repeticiones
    //en caso de haber una repeticion sale un true 
    private boolean buscarSiIDEstaRepetido(int idUnico){
        boolean IDEstaRepetido = false;
        for (int i=0; i<idTrasteArraylist.size(); i++){
            if (idUnico==idTrasteArraylist.get(i)){
                IDEstaRepetido = true;
            }
        }
 
        return IDEstaRepetido;
    }
    ArrayList<Integer> idTrasteArraylist = new ArrayList<Integer>();
    Cola colita = new Cola();
    Pila miPila = new Pila();
    Random random = new Random();
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneLista;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaPilaTrastes;
    private javax.swing.JTextField jTextField_IngresaCedula;
    private javax.swing.JTextField jTextField_IngresaNombre;
    private javax.swing.JTextPane jTextPaneListaPedidos;
    private javax.swing.JTextArea text_Pila;
    // End of variables declaration//GEN-END:variables
}
