package vistas;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import procesos.conectaDB;

/**
 *
 * @author Junior
 */
public class frmCertificadosMedicos extends javax.swing.JFrame {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

    public frmCertificadosMedicos() {
        initComponents();
        con = conectaDB.conectaDB();
        
    }
    
    private void CargarSintomas(){
        try {
            String sql= "Select sintoma from sintomas where sintoma like ? ";
            String dato = txtBusquedaSintoma.getText();
                pst=con.prepareStatement(sql);  
                pst.setString(1,"%"+dato+"%");
                rs= pst.executeQuery();
                TableSintomas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaAtencion = new com.toedter.calendar.JCalendar();
        txtNombrePaciente = new javax.swing.JTextField();
        txtEdadPaciente = new javax.swing.JTextField();
        txtCedulaPaciente = new javax.swing.JTextField();
        txtDiasReposo = new javax.swing.JTextField();
        btnGenerarCertificad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        lbNombrePaciente = new javax.swing.JLabel();
        lbEdadPaciente = new javax.swing.JLabel();
        lbCedulaPaciente = new javax.swing.JLabel();
        lbSintomas = new javax.swing.JLabel();
        lbDiasReposo = new javax.swing.JLabel();
        lbFechaAtencion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableSintomas = new javax.swing.JTable();
        txtBusquedaSintoma = new javax.swing.JTextField();
        fondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(fechaAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 370, 220));

        txtNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 430, -1));
        getContentPane().add(txtEdadPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 60, -1));
        getContentPane().add(txtCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 150, -1));

        txtDiasReposo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasReposoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiasReposo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 60, -1));

        btnGenerarCertificad.setText("Generar Certificado");
        btnGenerarCertificad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCertificadActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarCertificad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 140, 50));

        txtSintomas.setColumns(20);
        txtSintomas.setRows(5);
        jScrollPane1.setViewportView(txtSintomas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 430, 130));

        lbNombrePaciente.setText("Nombre Paciente:");
        getContentPane().add(lbNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        lbEdadPaciente.setText("Edad");
        getContentPane().add(lbEdadPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        lbCedulaPaciente.setText("CI:");
        getContentPane().add(lbCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        lbSintomas.setText("Sintomas:");
        getContentPane().add(lbSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        lbDiasReposo.setText("Dias Reposo:");
        getContentPane().add(lbDiasReposo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        lbFechaAtencion.setText("Fecha Atencion:");
        getContentPane().add(lbFechaAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        TableSintomas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TableSintomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sintoma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableSintomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSintomasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableSintomas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 370, 100));

        txtBusquedaSintoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaSintomaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBusquedaSintoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 370, -1));

        fondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoFinal.png"))); // NOI18N
        getContentPane().add(fondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePacienteActionPerformed

    private void txtDiasReposoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasReposoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasReposoActionPerformed

    private void btnGenerarCertificadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCertificadActionPerformed
       SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYY");
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;
        try {
            report=JasperCompileManager.compileReport(new File("").getAbsolutePath()+
                    "/src/reportes/CertificadoMedico.jrxml");
            p.put("NombresPaciente",txtNombrePaciente.getText());
            p.put("cedula", txtCedulaPaciente.getText());
            p.put("fechaCertificado",formato.format( fechaAtencion.getDate()));
            p.put("Edad", txtEdadPaciente.getText());
            p.put("sintomas", txtSintomas.getText());
            p.put("dias", txtDiasReposo.getText());
            print=JasperFillManager.fillReport(report, p,new JREmptyDataSource());
            JasperViewer view=new JasperViewer(print,false);
            view.setTitle("Certificado Medico");
            view.setVisible(true);            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarCertificadActionPerformed

    private void txtBusquedaSintomaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaSintomaKeyReleased
        CargarSintomas();
    }//GEN-LAST:event_txtBusquedaSintomaKeyReleased

    private void TableSintomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSintomasMouseClicked
                    int row= TableSintomas.getSelectedRow();
                    String table_click= TableSintomas.getModel().getValueAt(row, 0).toString();                                        
                    txtSintomas.setText(table_click);
    }//GEN-LAST:event_TableSintomasMouseClicked

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
            java.util.logging.Logger.getLogger(frmCertificadosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCertificadosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCertificadosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCertificadosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCertificadosMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSintomas;
    private javax.swing.JButton btnGenerarCertificad;
    private com.toedter.calendar.JCalendar fechaAtencion;
    private javax.swing.JLabel fondoPantalla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCedulaPaciente;
    private javax.swing.JLabel lbDiasReposo;
    private javax.swing.JLabel lbEdadPaciente;
    private javax.swing.JLabel lbFechaAtencion;
    private javax.swing.JLabel lbNombrePaciente;
    private javax.swing.JLabel lbSintomas;
    private javax.swing.JTextField txtBusquedaSintoma;
    private javax.swing.JTextField txtCedulaPaciente;
    private javax.swing.JTextField txtDiasReposo;
    private javax.swing.JTextField txtEdadPaciente;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextArea txtSintomas;
    // End of variables declaration//GEN-END:variables
}
