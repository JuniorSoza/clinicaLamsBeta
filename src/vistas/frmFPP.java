package vistas;
import java.util.Calendar;
import java.util.GregorianCalendar;
import procesos.fechas;

/**
 *
 * @author Junior
 */
public class frmFPP extends javax.swing.JFrame {

    /**
     * Creates new form frmFPP
     */
    public frmFPP() {
        initComponents();
        this.setLocationRelativeTo(null); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CalendarFUM = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFechaGestacion = new javax.swing.JLabel();
        txtFUM = new javax.swing.JLabel();
        txtFechaParto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarGesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalendarFUM.setBackground(new java.awt.Color(255, 255, 255));
        CalendarFUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalendarFUMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalendarFUMMouseEntered(evt);
            }
        });
        CalendarFUM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CalendarFUMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CalendarFUMKeyReleased(evt);
            }
        });
        jPanel1.add(CalendarFUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 350, 220));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FUM:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA PRO. DE PARTO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("APLICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 90, -1));

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/embarazo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 200, 250));

        txtFechaGestacion.setText("-----------");
        jPanel1.add(txtFechaGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, 20));

        txtFUM.setText("-----------");
        jPanel1.add(txtFUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        txtFechaParto.setText("----------");
        jPanel1.add(txtFechaParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FECHA GESTACION:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        btnGuardarGesta.setText("GUARDAR");
        btnGuardarGesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarGestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarGesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fechas fecha = new fechas(); 
        txtFUM.setText(fecha.getFecha(CalendarFUM));                              
//        txtFechaGestacion.setText(fecha.fechaGestacion(CalendarFUM));
         int fechaParto = 270;
                    if (CalendarFUM.getDate() != null) {
                    //fecha del sistema
                        GregorianCalendar objCalendario = new GregorianCalendar();
                        int dias =0;
                        //fecha de ultima mestruacion
                        Calendar fechaGestacion = CalendarFUM.getCalendar();
                        while(fechaGestacion.before(objCalendario) || fechaGestacion.equals(objCalendario)){
                        dias++;
                        fechaGestacion.add(fechaGestacion.DATE, 1);                        
                      }       
                 fechaParto = fechaParto-dias;
                
                objCalendario.add(Calendar.DAY_OF_MONTH, fechaParto);
                         int anio = objCalendario.get(Calendar.YEAR);
                         int mes = objCalendario.get(Calendar.MONTH);
                         int dia = objCalendario.get(Calendar.DAY_OF_MONTH);
                txtFechaParto.setText(dia+"-"+mes+"-"+anio);
                int semanas = dias /7; 
                txtFechaGestacion.setText(semanas+" Semanas de gestacion");                
            }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CalendarFUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarFUMMouseClicked

    }//GEN-LAST:event_CalendarFUMMouseClicked

    private void CalendarFUMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalendarFUMKeyPressed

    }//GEN-LAST:event_CalendarFUMKeyPressed

    private void CalendarFUMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalendarFUMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CalendarFUMKeyReleased

    private void CalendarFUMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarFUMMouseEntered
        
        
    }//GEN-LAST:event_CalendarFUMMouseEntered

    private void btnGuardarGestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarGestaActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_btnGuardarGestaActionPerformed

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
            java.util.logging.Logger.getLogger(frmFPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JCalendar CalendarFUM;
    private javax.swing.JButton btnGuardarGesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtFUM;
    public javax.swing.JLabel txtFechaGestacion;
    private javax.swing.JLabel txtFechaParto;
    // End of variables declaration//GEN-END:variables
}
