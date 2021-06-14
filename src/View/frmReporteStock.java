/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author Elizabeth
 */
public class frmReporteStock extends javax.swing.JFrame {
        Color boton_f=new Color(41,86,154);
        Color boton_b=new Color(0,204,153);
        Color encabezado=new Color(0,204,153);
        Color fondos=new Color(255,255,255);
        Color borde=new Color(0,204,153);

    
    public frmReporteStock() {
        initComponents();
        jpFondo1.setBackground(encabezado);
        jpFondo2.setBackground(fondos);
        jpFondo3.setBackground(fondos);
        jpFondo2.setBorder(BorderFactory.createLineBorder(encabezado, 3));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpFondo2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListadoArticulo = new javax.swing.JTable();
        jpFondo3 = new javax.swing.JPanel();
        rbCodigo = new javax.swing.JRadioButton();
        rbNomArt = new javax.swing.JRadioButton();
        btnReportes = new javax.swing.JButton();
        jpFondo4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        dcBuscarDel = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        dcBuscarAl = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reporte de Stock de Productos");

        javax.swing.GroupLayout jpFondo1Layout = new javax.swing.GroupLayout(jpFondo1);
        jpFondo1.setLayout(jpFondo1Layout);
        jpFondo1Layout.setHorizontalGroup(
            jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpFondo1Layout.setVerticalGroup(
            jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFondo2.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpFondo2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Buscar:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        TablaListadoArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fecha de ingreso", "Stock"
            }
        ));
        TablaListadoArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListadoArticuloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaListadoArticuloMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaListadoArticulo);

        rbCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbCodigo.setForeground(new java.awt.Color(0, 0, 102));
        rbCodigo.setText("Codigo");
        rbCodigo.setFocusable(false);
        rbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbCodigo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoActionPerformed(evt);
            }
        });

        rbNomArt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbNomArt.setForeground(new java.awt.Color(0, 0, 102));
        rbNomArt.setText("Nombre del Articulo");
        rbNomArt.setFocusable(false);
        rbNomArt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbNomArt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rbNomArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomArtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondo3Layout = new javax.swing.GroupLayout(jpFondo3);
        jpFondo3.setLayout(jpFondo3Layout);
        jpFondo3Layout.setHorizontalGroup(
            jpFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbCodigo)
                .addGap(18, 18, 18)
                .addComponent(rbNomArt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondo3Layout.setVerticalGroup(
            jpFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNomArt)
                    .addComponent(rbCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReportes.setBackground(new java.awt.Color(0, 0, 51));
        btnReportes.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(102, 153, 255));
        btnReportes.setText("Imprimir");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Del:");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("al");

        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondo4Layout = new javax.swing.GroupLayout(jpFondo4);
        jpFondo4.setLayout(jpFondo4Layout);
        jpFondo4Layout.setHorizontalGroup(
            jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcBuscarDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcBuscarAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jpFondo4Layout.setVerticalGroup(
            jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo4Layout.createSequentialGroup()
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcBuscarAl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpFondo4Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(dcBuscarDel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpFondo4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpFondo2Layout = new javax.swing.GroupLayout(jpFondo2);
        jpFondo2.setLayout(jpFondo2Layout);
        jpFondo2Layout.setHorizontalGroup(
            jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpFondo2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jpFondo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpFondo2Layout.setVerticalGroup(
            jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo2Layout.createSequentialGroup()
                .addGroup(jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondo2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jpFondo3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFondo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        // TODO add your handling code here:
       

    }//GEN-LAST:event_txtbuscarKeyReleased

    private void TablaListadoArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoArticuloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaListadoArticuloMouseClicked

    private void TablaListadoArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoArticuloMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TablaListadoArticuloMousePressed

    private void rbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoActionPerformed
        // TODO add your handling code here:
        txtbuscar.setText("");
        txtbuscar.setEnabled(true);
    }//GEN-LAST:event_rbCodigoActionPerformed

    private void rbNomArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomArtActionPerformed
        // TODO add your handling code here:
        txtbuscar.setText("");
        txtbuscar.setEnabled(true);
    }//GEN-LAST:event_rbNomArtActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        //listarXfechas(fecha_ini, fecha_fin);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReporteStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReporteStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaListadoArticulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReportes;
    private com.toedter.calendar.JDateChooser dcBuscarAl;
    private com.toedter.calendar.JDateChooser dcBuscarDel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpFondo1;
    private javax.swing.JPanel jpFondo2;
    private javax.swing.JPanel jpFondo3;
    private javax.swing.JPanel jpFondo4;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbNomArt;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
