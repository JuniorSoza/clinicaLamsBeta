package vistas;

import com.sun.istack.internal.logging.Logger;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import procesos.Hilo;
import procesos.conectaDB;
/**
 *
 * @author Junior
 */
public class frmPrincipalD extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;
    
    public frmPrincipalD(String apellidos) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtSesion.setText(apellidos);
        RadioApellidoD.setSelected(true);
        con = conectaDB.conectaDB();
        
                //obtencion de la fecha del sistema
        GregorianCalendar objCalendario = new GregorianCalendar();
        int anio,mes,dia;
        
        anio = objCalendario.get(Calendar.YEAR);
        mes = objCalendario.get(Calendar.MONTH)+1;
        dia = objCalendario.get(Calendar.DAY_OF_MONTH);
                
        lbFechaActualTxt.setText(anio+"-"+mes+"-"+dia);
    }
    
    
    
    private class Hilo implements Runnable{

        @Override
        public void run() {
            while(true){
                Get_Data(); 
                        try {
                Thread.sleep(30000);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupBusquedaPaciente = new javax.swing.ButtonGroup();
        txtSesion = new javax.swing.JLabel();
        lbBienvenida = new javax.swing.JLabel();
        PanelPacientesParaAtender = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPacientesAtender = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPacientesAtender2 = new javax.swing.JTable();
        PanelOpciones = new javax.swing.JPanel();
        btnRecetasMedicas = new javax.swing.JButton();
        btnCertificadoMedico = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        PanelAunEstaPorDefinir = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBusqueda = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        RadioNombresD = new javax.swing.JRadioButton();
        RadioApellidoD = new javax.swing.JRadioButton();
        RadioHistoriaD = new javax.swing.JRadioButton();
        lbFechaActualTxt = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSesion.setText("-----------");
        getContentPane().add(txtSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 20));

        lbBienvenida.setText("Bienvenido:");
        getContentPane().add(lbBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        PanelPacientesParaAtender.setBackground(new java.awt.Color(255, 255, 255));
        PanelPacientesParaAtender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaPacientesAtender = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TablaPacientesAtender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Historia", "Apellidos", "Nombres", "Cedula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPacientesAtender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPacientesAtenderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaPacientesAtender);

        PanelPacientesParaAtender.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 880, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pacientes para atender");
        PanelPacientesParaAtender.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        TablaPacientesAtender2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TablaPacientesAtender2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaPacientesAtender2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPacientesAtender2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaPacientesAtender2);

        PanelPacientesParaAtender.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 880, 100));

        getContentPane().add(PanelPacientesParaAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 940, 270));

        PanelOpciones.setBackground(new java.awt.Color(51, 153, 255));
        PanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecetasMedicas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRecetasMedicas.setText("RECETAS MEDICAS");
        btnRecetasMedicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetasMedicasActionPerformed(evt);
            }
        });
        PanelOpciones.add(btnRecetasMedicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 90));

        btnCertificadoMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCertificadoMedico.setText("CERTIFICADOS MEDICOS");
        btnCertificadoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificadoMedicoActionPerformed(evt);
            }
        });
        PanelOpciones.add(btnCertificadoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 90));

        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        PanelOpciones.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 90));

        getContentPane().add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 310, 390));

        PanelAunEstaPorDefinir.setBackground(new java.awt.Color(255, 255, 255));
        PanelAunEstaPorDefinir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        PanelAunEstaPorDefinir.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 420, 30));

        TablaBusqueda = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Historia", "Apellidos", "Nombres", "Cedula"
            }
        ));
        TablaBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBusqueda);

        PanelAunEstaPorDefinir.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 880, 220));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGroupBusquedaPaciente.add(RadioNombresD);
        RadioNombresD.setText("Nombres");
        RadioNombresD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNombresDActionPerformed(evt);
            }
        });
        jPanel2.add(RadioNombresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnGroupBusquedaPaciente.add(RadioApellidoD);
        RadioApellidoD.setText("Apellidos");
        RadioApellidoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioApellidoDActionPerformed(evt);
            }
        });
        jPanel2.add(RadioApellidoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        btnGroupBusquedaPaciente.add(RadioHistoriaD);
        RadioHistoriaD.setText("Historia");
        RadioHistoriaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioHistoriaDActionPerformed(evt);
            }
        });
        jPanel2.add(RadioHistoriaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        PanelAunEstaPorDefinir.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 410, 40));

        getContentPane().add(PanelAunEstaPorDefinir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 940, 320));

        lbFechaActualTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFechaActualTxt.setText("--/--/----");
        getContentPane().add(lbFechaActualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoDoctor.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecetasMedicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetasMedicasActionPerformed
        frmRecetasMedicas recetasMedicas = new frmRecetasMedicas();
        recetasMedicas.setVisible(true);
    }//GEN-LAST:event_btnRecetasMedicasActionPerformed

    private void btnCertificadoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificadoMedicoActionPerformed
        frmCertificadosMedicos certificadoMedicos = new frmCertificadosMedicos();
        certificadoMedicos.setVisible(true);
    }//GEN-LAST:event_btnCertificadoMedicoActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        frmNuevoUsuario NuevoUsuario = new frmNuevoUsuario();
        NuevoUsuario.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased

        Busqueda();
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void RadioApellidoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioApellidoDActionPerformed
        Busqueda();
    }//GEN-LAST:event_RadioApellidoDActionPerformed

    private void RadioHistoriaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioHistoriaDActionPerformed
        Busqueda();
    }//GEN-LAST:event_RadioHistoriaDActionPerformed

    private void RadioNombresDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNombresDActionPerformed
        Busqueda();
    }//GEN-LAST:event_RadioNombresDActionPerformed

    private void TablaBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBusquedaMouseClicked
        String apellidos = txtSesion.getText();          
        try{
                    int row= TablaBusqueda.getSelectedRow();
                    String table_click= TablaBusqueda.getModel().getValueAt(row, 0).toString();
                    String sql= "select * from paciente p\n" +
                                "left join consulta_hombre c\n" +
                                "on p.historia = c.fk_historia\n" +
                                "where p.historia = '"+table_click+"' \n" +
                                "order by c.id desc";
                    pst=con.prepareStatement(sql);
                    rs=  pst.executeQuery();
                    if(rs.next()){
                    //envio de informacion al formulario de paciente cuando se encuentra un paciente
                        String historia=rs.getString("historia");
                        frmNuevoPaciente frm = new frmNuevoPaciente(historia);
                        frm.setVisible(true);                        
                        frm.NumeroHistoria.setText(historia);
                        frm.txtApellidos.setText(rs.getString("apellidos"));
                        frm.txtNombres.setText(rs.getString("nombres"));
                        frm.ComboBoxSexo.setSelectedItem(rs.getString("sexo"));
                        frm.ComboBoxGSanguineo.setSelectedItem(rs.getString("grup_san"));
                        frm.ComboBoxEstado.setSelectedItem(rs.getString("estad_civil"));
                        frm.txtEdad.setText(rs.getString("edad"));
                        frm.txtTelefono.setText(rs.getString("fono"));
                        frm.txtDireccion.setText(rs.getString("direccion"));
                        frm.txtCI.setText(rs.getString("cedula"));
                        frm.txtAntecedentesFamiliares.setText(rs.getString("antFamiliares"));
                        frm.txtAntecedentesPersonales.setText(rs.getString("antPersonales"));
                        //campo oculpo para la edicion de solo la historia
                        frm.valorParaModificarSoloLaHistoria.setText("1234");
                        //datos que modificare en la otra tabla
                        frm.txtPA.setText(rs.getString("presion_arterial"));
                        frm.txtFR.setText(rs.getString("presion_respiratoria"));
                        frm.txtFC.setText(rs.getString("presion_cardiaca"));
                        frm.txtTALLA.setText(rs.getString("talla"));
                        frm.txtPESO.setText(rs.getString("peso"));
                        
                        frm.txtApellidos.setEnabled(false);
                        frm.txtNombres.setEnabled(false);
                        frm.ComboBoxSexo.setEnabled(false);
                        frm.ComboBoxGSanguineo.setEnabled(false);
                        frm.ComboBoxEstado.setEnabled(false);
                        frm.txtEdad.setEnabled(false);
                        frm.txtCI.setEnabled(false);
                        frm.txtTelefono.setEnabled(false);
                        frm.txtDireccion.setEnabled(false);
                        frm.txtAntecedentesFamiliares.setEnabled(false);
                        frm.txtAntecedentesPersonales.setEnabled(false);
                        frm.CheckBoxEditarDatosGenerales.setVisible(true);
                        
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
        
    }//GEN-LAST:event_TablaBusquedaMouseClicked

    private void TablaPacientesAtenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPacientesAtenderMouseClicked
               try{
                    int row= TablaPacientesAtender.getSelectedRow();
                    String table_click= TablaPacientesAtender.getModel().getValueAt(row, 0).toString();
                    String sql= "select * from paciente p\n" +
                                "left join consulta_hombre c\n" +
                                "on p.historia = c.fk_historia\n" +
                                "where p.historia = '"+table_click+"' \n" +
                                "order by c.id desc";
                    pst=con.prepareStatement(sql);
                    rs=  pst.executeQuery();
                    if(rs.next()){
                    //envio de informacion al formulario de paciente cuando se encuentra un paciente
                        String historia=rs.getString("historia");
                        frmNuevoPacienteExamenes frm = new frmNuevoPacienteExamenes();
                        frm.setVisible(true);                        
                        frm.NumeroHistoria.setText(historia);
                        //campo oculpo para la edicion de solo la historia
                        frm.valorParaModificarSoloLaHistoria.setText("Masculino");
                        //datos que modificare en la otra tabla
                        frm.txtNombrePaciente.setText(rs.getString("nombres"));
                        frm.txtApellidosPaciente.setText(rs.getString("apellidos"));
                        frm.txtIdPaciente.setText(rs.getString("id"));
                        frm.txtPA.setText(rs.getString("presion_arterial"));
                        frm.txtFR.setText(rs.getString("presion_respiratoria"));
                        frm.txtFC.setText(rs.getString("presion_cardiaca"));
                        frm.txtTALLA.setText(rs.getString("talla"));
                        frm.txtPESO.setText(rs.getString("peso"));
                        frm.PanelGestacion.setVisible(false);
                        frm.PanelNuevaGesta.setVisible(false);
                        
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
       
    }//GEN-LAST:event_TablaPacientesAtenderMouseClicked

    private void TablaPacientesAtender2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPacientesAtender2MouseClicked
                      try{
                    int row= TablaPacientesAtender2.getSelectedRow();
                    String table_click= TablaPacientesAtender2.getModel().getValueAt(row, 0).toString();
                    String sql= "select * from paciente p\n" +
                                "left join tratamiento_mujer c\n" +
                                "on p.historia = c.fk_historia\n" +
                                "where p.historia = '"+table_click+"' \n" +
                                "order by c.id desc";
                    pst=con.prepareStatement(sql);
                    rs=  pst.executeQuery();
                    if(rs.next()){
                    //envio de informacion al formulario de paciente cuando se encuentra un paciente
                        String historia=rs.getString("historia");
                        frmNuevoPacienteExamenes frm = new frmNuevoPacienteExamenes();
                        frm.setVisible(true);                        
                        frm.NumeroHistoria.setText(historia);
                        //campo oculpo para la edicion de solo la historia
                        frm.valorParaModificarSoloLaHistoria.setText("Femenino");
                        //datos que modificare en la otra tabla
                        frm.txtNombrePaciente.setText(rs.getString("nombres"));
                        frm.txtApellidosPaciente.setText(rs.getString("apellidos"));
                        frm.txtIdPaciente.setText(rs.getString("id"));
                        frm.txtPA.setText(rs.getString("presion_arterial"));
                        frm.txtFR.setText(rs.getString("presion_respiratoria"));
                        frm.txtFC.setText(rs.getString("presion_cardiaca"));
                        frm.txtTALLA.setText(rs.getString("talla"));
                        frm.txtPESO.setText(rs.getString("peso"));
                        frm.PanelGestacion.setVisible(true);
                        frm.PanelNuevaGesta.setVisible(true);
                        
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        } 
    }//GEN-LAST:event_TablaPacientesAtender2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       new Thread(new Hilo()).start();
    }//GEN-LAST:event_formWindowOpened
    private void Busqueda(){
                   //convertir en mayusculas los datos que se ingresan
        int Posicion = txtBusqueda.getCaretPosition();
        String busqueda = (txtBusqueda.getText()).toUpperCase();
        txtBusqueda.setText(busqueda);
        txtBusqueda.setCaretPosition(Posicion);
        
       //sql para realizar la busqueda predictiva 
       String sql="";
        if (RadioNombresD.isSelected()) {
             sql= "Select historia,apellidos,nombres, cedula from paciente where nombres like ? and estado =1";
        }if(RadioHistoriaD.isSelected()){
             sql= "Select historia,apellidos,nombres, cedula from paciente where historia like ? and estado =1";
        }if (RadioApellidoD.isSelected()) {
             sql= "Select historia,apellidos,nombres,cedula from paciente where apellidos like ? and estado =1";
        } 
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,busqueda+"%");
            rs= pst.executeQuery();
            TablaBusqueda.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);

        }
    }
    private void Get_Data(){        
        String sql="select p.historia, p.nombres, p.apellidos, p.cedula from consulta_hombre c\n" +
                        "inner join paciente p\n" +
                        "on p.historia = c.fk_historia\n" +
                        "where c.tratamiento ='sd'";
        String sql2="select p.historia, p.nombres, p.apellidos, p.cedula from tratamiento_mujer t\n"
                        + "inner join paciente p\n" +
"                        on p.historia = t.fk_historia\n" +
"                        where t.tratamiento ='sd'";
        
        try{
         pst=con.prepareStatement(sql);
         rs= pst.executeQuery();
         TablaPacientesAtender.setModel(DbUtils.resultSetToTableModel(rs));
         pst2=con.prepareStatement(sql2);
         rs2= pst2.executeQuery();
         TablaPacientesAtender2.setModel(DbUtils.resultSetToTableModel(rs2));
                    notificacionPaciente c = new notificacionPaciente();
                    c.iniciar();
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);          
            }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(frmPrincipalD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new frmPrincipalD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAunEstaPorDefinir;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JPanel PanelPacientesParaAtender;
    private javax.swing.JRadioButton RadioApellidoD;
    private javax.swing.JRadioButton RadioHistoriaD;
    private javax.swing.JRadioButton RadioNombresD;
    private javax.swing.JTable TablaBusqueda;
    public javax.swing.JTable TablaPacientesAtender;
    private javax.swing.JTable TablaPacientesAtender2;
    private javax.swing.JButton btnCertificadoMedico;
    private javax.swing.ButtonGroup btnGroupBusquedaPaciente;
    private javax.swing.JButton btnRecetasMedicas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBienvenida;
    private javax.swing.JLabel lbFechaActualTxt;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtSesion;
    // End of variables declaration//GEN-END:variables
}
