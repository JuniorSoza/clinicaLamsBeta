/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import procesos.conectaDB;

/**
 *
 * @author EDHUAR
 */
public class frmNuevoUsuario extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    ResultSet rs = null;
    
    public frmNuevoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = conectaDB.conectaDB(); 
        btnEliminarUsuario.setEnabled(false);
        btnActualizarPaciente.setEnabled(false);
        
               
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
        jPanel1 = new javax.swing.JPanel();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        ComboBoxRol = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnActualizarPaciente = new javax.swing.JButton();
        btnNuevoPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBusqueda = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registro de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 26, 201, -1));

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 52, 201, -1));

        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCIKeyReleased(evt);
            }
        });
        jPanel1.add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 83, 201, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 128, 201, -1));

        ComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "E", "D" }));
        jPanel1.add(ComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 204, -1, -1));

        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 29, -1, -1));

        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 55, -1, -1));

        jLabel4.setText("CI:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 86, -1, -1));

        jLabel5.setText("Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 131, -1, -1));

        jLabel6.setText("Contrase??a:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 169, -1, -1));

        jLabel7.setText("Rol:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 207, -1, -1));
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 166, 201, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 380, 250));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarUsuario.setText("Guardar");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        btnEliminarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 50));

        btnActualizarPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizarPaciente.setText("Actualizar");
        btnActualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 50));

        btnNuevoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevoPaciente.setText("Nuevo");
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 170, 250));

        TablaBusqueda = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellidos", "Nombres", "Usuario", "Cedula"
            }
        ));
        TablaBusqueda.setFocusable(false);
        TablaBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 610, 110));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 610, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoFinal.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset(){
    txtNombres.setText("");
    txtApellidos.setText("");
    ComboBoxRol.setSelectedItem(-1);
    txtCI.setText("");
    txtUsuario.setText("");
    txtContrasena.setText("");
    btnGuardarUsuario.setEnabled(true);
    btnEliminarUsuario.setEnabled(false);
    btnActualizarPaciente.setEnabled(false);
    txtCI.setEnabled(true);
    txtUsuario.setEnabled(true);
    
    }
    
    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed

        try{
        //valida que los campos esten llenos
        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog( this, "Ingrese el campo apellido","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog( this, "Ingrese el Campo Nombre","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtCI.getText().equals("")) {
            JOptionPane.showMessageDialog( this, "Ingrese el Campo Cedula","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog( this, "Ingrese el Campo Usuario","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtContrasena.getText().equals("")) {
            JOptionPane.showMessageDialog( this, "Ingrese el Campo Contrase??a","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Statement stmt;
        stmt = con.createStatement();
        String sql1 = "Select usuario from usuario where usuario= '" + txtUsuario.getText() + "'";
        rs =stmt.executeQuery(sql1);
        if(rs.next()){
        JOptionPane.showMessageDialog( this, "El Usuario '"+txtUsuario.getText()+"' ya Existe","Error", JOptionPane.ERROR_MESSAGE);
        txtUsuario.setText("");
        txtUsuario.requestDefaultFocus();
       return;
      }
        String sql= "insert into usuario(apellidos,nombres,cedula,usuario,contrasena,rol)values('"+ txtApellidos.getText() + "','"+ txtNombres.getText() + "','"+ txtCI.getText() + "','" + txtUsuario.getText() + "','"+ txtContrasena.getText() + "','" + ComboBoxRol.getSelectedItem() +"')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Exito al guarda","Usuario",JOptionPane.INFORMATION_MESSAGE);
            btnGuardarUsuario.setEnabled(false);
            reset();

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        try{
            int confirmar = JOptionPane.showConfirmDialog(null," Esta seguro de eliminar este usuario ?","Confirmation",JOptionPane.YES_NO_OPTION);

            if (confirmar==0)
            {
                String sql= "DELETE  from usuario where cedula = '" + txtCI.getText() +"'";

                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Usuario Eliminado","Usuario",JOptionPane.INFORMATION_MESSAGE);
                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showConfirmDialog(this,ex);
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnActualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPacienteActionPerformed
        try{
            
            String sql= "update usuario set apellidos='"+ txtApellidos.getText() + "',nombres='"+ txtNombres.getText() + "',cedula='"+ txtCI.getText() + "',usuario='" + txtUsuario.getText() + "',contrasena='"+ txtContrasena.getText() + "',rol='" + ComboBoxRol.getSelectedItem() + "' where cedula='" + txtCI.getText() + "'";
                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Datos Actualizados","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
            btnActualizarPaciente.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnActualizarPacienteActionPerformed

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        //convertir en mayusculas los datos que se ingresan 
        int Posicion = txtApellidos.getCaretPosition();
        String busqueda = (txtApellidos.getText()).toUpperCase();
        txtApellidos.setText(busqueda);
        txtApellidos.setCaretPosition(Posicion);
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        // TODO add your handling code here:
        //convertir en mayusculas los datos que se ingresan 
        int Posicion = txtNombres.getCaretPosition();
        String busqueda = (txtNombres.getText()).toUpperCase();
        txtNombres.setText(busqueda);
        txtNombres.setCaretPosition(Posicion);
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtCIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyReleased
        // TODO add your handling code here:
         //validar solo numeros
        JTextField object = (JTextField)evt.getSource();
        String str = object.getText();
        char[] fuente = str.toCharArray();
        char[] resultado = new char[fuente.length];
        int j=0;
        boolean error = false;
        for(int i=0;i<fuente.length;i++){
            if(fuente[i]>='0' && fuente[i]<='9'){
                resultado[j++] = fuente[i];
            }else{
                error = true;
                Toolkit.getDefaultToolkit().beep();
            }
            
        }
        if(error){
            object.setText(new String (resultado,0,j));
        }
    }//GEN-LAST:event_txtCIKeyReleased

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        //validar letas
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        //validar letas
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void TablaBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBusquedaMouseClicked
        
        try{
            int row= TablaBusqueda.getSelectedRow();
            String table_click= TablaBusqueda.getModel().getValueAt(row, 3).toString();
            String sql= "select * from usuario where cedula = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
           
            if(rs.next()){
            txtApellidos.setText(rs.getString("apellidos"));
            txtNombres.setText(rs.getString("nombres"));
            
            txtCI.setText(rs.getString("cedula"));
            txtUsuario.setText(rs.getString("usuario"));
            txtContrasena.setText(rs.getString("contrasena"));
            ComboBoxRol.setSelectedItem(rs.getString("rol"));
            
            btnActualizarPaciente.setEnabled(true);
            btnEliminarUsuario.setEnabled(true);
            btnGuardarUsuario.setEnabled(false);
            txtCI.setEnabled(false);
            txtUsuario.setEnabled(false);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_TablaBusquedaMouseClicked

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        //convertir en mayusculas los datos que se ingresan
        int Posicion = txtBusqueda.getCaretPosition();
        String busqueda = (txtBusqueda.getText()).toUpperCase();
        txtBusqueda.setText(busqueda);
        txtBusqueda.setCaretPosition(Posicion);

        //sql para realizar la busqueda predictiva
        String sql="";
        
            sql= "Select apellidos,nombres,usuario,cedula from usuario where apellidos like ? ";
        
        try
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,busqueda+"%");
            rs= pst.executeQuery();
            TablaBusqueda.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        reset();
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxRol;
    private javax.swing.JTable TablaBusqueda;
    private javax.swing.JButton btnActualizarPaciente;
    public javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCI;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
