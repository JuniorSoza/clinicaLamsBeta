package vistas;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import procesos.conectaDB;

/**
 *
 * @author Junior
 */
public class frmNuevoPacienteE extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    ResultSet rs = null;
    
    public frmNuevoPacienteE(String sesion, String Nhistoria) {
        initComponents();
        this.setLocationRelativeTo(null);
        con = conectaDB.conectaDB(); 
        CheckBoxEditarDatosGenerales.setVisible(false);
        txtSesion.setText(sesion); 
        NumeroHistoria.setText(Nhistoria);
        
        //obtencion de la fecha del sistema
        GregorianCalendar objCalendario = new GregorianCalendar();
        int anio,mes,dia;
        
        anio = objCalendario.get(Calendar.YEAR);
        mes = objCalendario.get(Calendar.MONTH)+1;
        dia = objCalendario.get(Calendar.DAY_OF_MONTH);
                
        lbFechaActualTxt.setText(anio+"-"+mes+"-"+dia);
        CargarDoctores();

    }

    //metodo para generar la historia clinica
    public void GenerarHistoria(){
        //generacion de los numeros aleatorios
        String acumulaApe ="";
        String acumulaNom ="";
        Random  rando = new Random();
        int Numero = rando.nextInt(999);
        //extraccion de las iniciales de los apellidos y los nombres
         String inicialesApellido= txtApellidos.getText();
         String inicialesNombre= txtNombres.getText();
         StringTokenizer apellido = new StringTokenizer(inicialesApellido); 
         StringTokenizer nombre = new StringTokenizer(inicialesNombre);  

        while (apellido.hasMoreTokens()) { 
            acumulaApe += apellido.nextToken().charAt(0);                         
        }
        while (nombre.hasMoreTokens()) { 
            acumulaNom += nombre.nextToken().charAt(0);                         
        }
        NumeroHistoria.setText(acumulaApe+""+acumulaNom+""+Numero);
    }
    
//cargar los doctores en disponibles en el comboBox 
    private void CargarDoctores(){
        String  sql= "Select apellidos,nombres from usuario where rol ='D'";
        try {
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            while(rs.next()){
            ComboBoxDoctores.addItem(rs.getString("apellidos")+" "+rs.getString("nombres"));
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBienvenida = new javax.swing.JLabel();
        txtSesion = new javax.swing.JLabel();
        lbFechaActualTxt = new javax.swing.JLabel();
        tabPanelPaciente = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        lbNombres = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        ComboBoxSexo = new javax.swing.JComboBox();
        GrupoSanguineo = new javax.swing.JLabel();
        ComboBoxGSanguineo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxEstado = new javax.swing.JComboBox();
        lbTelefono = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbEdad1 = new javax.swing.JLabel();
        CheckBoxEditarDatosGenerales = new javax.swing.JCheckBox();
        txtDireccion = new java.awt.TextArea();
        txtAntecedentesPersonales = new java.awt.TextArea();
        txtAntecedentesFamiliares = new java.awt.TextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        lbCI = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelSignosVitales = new javax.swing.JPanel();
        txtPA = new javax.swing.JTextField();
        txtFC = new javax.swing.JTextField();
        txtFR = new javax.swing.JTextField();
        lbFr = new javax.swing.JLabel();
        lbFc = new javax.swing.JLabel();
        lbPA = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTALLA = new javax.swing.JTextField();
        txtPESO = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        lbTalla = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ComboBoxDoctores = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarHistoria = new javax.swing.JButton();
        btnNuevoPaciente = new javax.swing.JButton();
        btnBuscarPaciente = new javax.swing.JButton();
        lbHistoria = new javax.swing.JLabel();
        NumeroHistoria = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        valorParaModificarSoloLaHistoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBienvenida.setText("Bienvenido:");
        getContentPane().add(lbBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSesion.setText("---------");
        getContentPane().add(txtSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 20));

        lbFechaActualTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFechaActualTxt.setText("--/--/----");
        getContentPane().add(lbFechaActualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbApellidos.setText("APELLIDOS:");
        jPanel1.add(lbApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 47, 280, -1));

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 87, 280, -1));

        lbNombres.setText("NOMBRES:");
        jPanel1.add(lbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 70, 20));

        sexo.setText("SEXO:");
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 137, -1, -1));

        ComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        ComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSexoActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 134, -1, -1));

        GrupoSanguineo.setText("GRUPO SANGUINEO:");
        jPanel1.add(GrupoSanguineo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 134, 130, 20));

        ComboBoxGSanguineo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(ComboBoxGSanguineo, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 134, -1, -1));

        jLabel1.setText("ESTADO CIVIL:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, -1, 20));

        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casado(a)", "Soltero(a)", "Viudo(a)", "Divorciado(a)", "UL" }));
        jPanel1.add(ComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 174, -1, -1));

        lbTelefono.setText("TELEFONO:");
        jPanel1.add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 274, 70, 20));

        lbDireccion.setText("DIRECCION:");
        jPanel1.add(lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 334, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 274, 160, -1));

        lbEdad1.setText("EDAD:");
        jPanel1.add(lbEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 214, -1, 30));

        CheckBoxEditarDatosGenerales.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxEditarDatosGenerales.setText("Editar datos generales");
        CheckBoxEditarDatosGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEditarDatosGeneralesActionPerformed(evt);
            }
        });
        CheckBoxEditarDatosGenerales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CheckBoxEditarDatosGeneralesKeyPressed(evt);
            }
        });
        jPanel1.add(CheckBoxEditarDatosGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 160, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 344, 280, 118));

        txtAntecedentesPersonales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAntecedentesPersonalesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAntecedentesPersonalesKeyTyped(evt);
            }
        });
        jPanel1.add(txtAntecedentesPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 344, 280, 118));

        txtAntecedentesFamiliares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAntecedentesFamiliaresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAntecedentesFamiliaresKeyTyped(evt);
            }
        });
        jPanel1.add(txtAntecedentesFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 171, 280, 111));

        jLabel10.setText("ANTECEDENTES FAMILIARES:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 151, -1, -1));

        jLabel11.setText("ANTECEDENTES PERSONALES:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 324, -1, -1));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 214, 60, -1));

        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCIKeyReleased(evt);
            }
        });
        jPanel1.add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 214, 130, -1));

        lbCI.setText("CI:");
        jPanel1.add(lbCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 217, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        tabPanelPaciente.addTab("DATOS GENERALES", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSignosVitales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPAKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, -1));

        txtFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFCKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 80, -1));

        txtFR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFRKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtFR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 80, -1));

        lbFr.setText("FRECUENCIA RESPIRATORIA:");
        PanelSignosVitales.add(lbFr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        lbFc.setText("FRECUENCIA CARDIACA:");
        PanelSignosVitales.add(lbFc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 20));

        lbPA.setText("PRECION ARTERIAL:");
        PanelSignosVitales.add(lbPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel3.setText("Kg");
        PanelSignosVitales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        jLabel2.setText("Cm");
        PanelSignosVitales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 20, -1));

        txtTALLA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTALLAKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtTALLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 80, -1));

        txtPESO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPESOKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtPESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, -1));

        lbPeso.setText("PESO:");
        PanelSignosVitales.add(lbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 40, -1));

        lbTalla.setText("TALLA:");
        PanelSignosVitales.add(lbTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPanel2.add(PanelSignosVitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 160));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.add(ComboBoxDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, -1));

        jLabel18.setText("DOCTORES");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Nota://");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setText("No olvide seleccionar el doctor quien va a atender el paciente");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 500, 290));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarHistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarHistoria.setText("Enviar");
        btnGuardarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHistoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        btnNuevoPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevoPaciente.setText("Nuevo");
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 50));

        btnBuscarPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 170, 220));

        lbHistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHistoria.setText("HISTORIA n°:");
        jPanel2.add(lbHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        NumeroHistoria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NumeroHistoria.setText("-------");
        jPanel2.add(NumeroHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        tabPanelPaciente.addTab("CONSULTA", jPanel5);

        getContentPane().add(tabPanelPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 770, 540));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoDoctor.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 630));

        valorParaModificarSoloLaHistoria.setText("jLabel21");
        getContentPane().add(valorParaModificarSoloLaHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        
        //convertir en mayusculas los datos que se ingresan 
        int Posicion = txtNombres.getCaretPosition();
        String busqueda = (txtNombres.getText()).toUpperCase();
        txtNombres.setText(busqueda);
        txtNombres.setCaretPosition(Posicion);
        GenerarHistoria();
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
     
        //convertir en mayusculas los datos que se ingresan 
        int Posicion = txtApellidos.getCaretPosition();
        String busqueda = (txtApellidos.getText()).toUpperCase();
        txtApellidos.setText(busqueda);
        txtApellidos.setCaretPosition(Posicion);
        GenerarHistoria();
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed

    }//GEN-LAST:event_txtApellidosActionPerformed

    private void CheckBoxEditarDatosGeneralesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CheckBoxEditarDatosGeneralesKeyPressed
        
    }//GEN-LAST:event_CheckBoxEditarDatosGeneralesKeyPressed

    private void CheckBoxEditarDatosGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxEditarDatosGeneralesActionPerformed
        // TODO add your handling code here:
        if (CheckBoxEditarDatosGenerales.isSelected()) {            
            ComboBoxEstado.setEnabled(true);
            txtCI.setEnabled(true);
            txtEdad.setEnabled(true);
            txtTelefono.setEnabled(true);
            txtDireccion.setEnabled(true);
            txtAntecedentesFamiliares.setEnabled(true);
            txtAntecedentesPersonales.setEnabled(true);
            CheckBoxEditarDatosGenerales.setEnabled(false);
        }else{
            txtApellidos.setEnabled(false);                          
            txtNombres.setEnabled(false);
            ComboBoxSexo.setEnabled(false);
            ComboBoxGSanguineo.setEnabled(false);
            ComboBoxEstado.setEnabled(false);
            txtEdad.setEnabled(false);
            txtCI.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtDireccion.setEnabled(false);
            txtAntecedentesFamiliares.setEnabled(false);
            txtAntecedentesPersonales.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBoxEditarDatosGeneralesActionPerformed

    private void btnGuardarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHistoriaActionPerformed
        
        //condicion para ver si lo que desea en editar o registrar un nuevo paciente
        String sql = null ;
        String sqlConsulta = null ;
        String sqlConsultaGesta = null ;
        String Mensage = null;
        
         //valida que los campos esten llenos
        if (txtApellidos.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el campo apellido","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtNombres.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el Campo Nombre","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtEdad.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el Campo Edad","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtCI.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el Campo Cedula","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtTelefono.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el Campo Telefono","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtPA.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese la Presion Arterial","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtFR.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese la Frecuencia Respiratoria","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtFC.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese la Frecuencia Cardiaca","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtTALLA.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese ls Talla","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if (txtPESO.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el Peso","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        int confirmar = JOptionPane.showConfirmDialog(null," Esta seguro de enviar ?","Confirmation",JOptionPane.YES_NO_OPTION);

            if (confirmar==0)
            {
        //insercion de pacientes Hombres con sus consultas  
        if(ComboBoxSexo.getSelectedItem()=="Masculino"){
        if (CheckBoxEditarDatosGenerales.isSelected() || valorParaModificarSoloLaHistoria.getText()=="1234") {
                        sql= " UPDATE paciente  SET  nombres='"+txtNombres.getText()+"', apellidos='"+txtApellidos.getText()+"', sexo='"+ComboBoxSexo.getSelectedItem()+"', grup_san='"+ComboBoxGSanguineo.getSelectedItem()+"', \n" +
                        "       estad_civil='"+ComboBoxEstado.getSelectedItem()+"', edad='"+txtEdad.getText()+"', fono='"+txtTelefono.getText()+"', direccion='"+txtDireccion.getText()+"', antfamiliares='"+txtAntecedentesFamiliares.getText()+"', \n" +
                        "       antpersonales='"+txtAntecedentesPersonales.getText()+"',cedula='"+txtCI.getText()+"'\n" +
                        " WHERE historia = '"+NumeroHistoria.getText()+"'";
                        
                       sqlConsulta ="INSERT INTO consulta_hombre(\n" +
                        "            fk_historia, talla, peso, presion_arterial, presion_cardiaca, \n" +
                        "            presion_respiratoria, fecha_consulta, sintomas, examen_fisico, \n" +
                        "            id_campo, tratamiento, rp, indicaciones, doctor)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','"+txtTALLA.getText()+"','"+txtPESO.getText()+"','"+txtPA.getText()+"','"+txtFC.getText()+"', \n" +
                        "            '"+txtFR.getText()+"','"+lbFechaActualTxt.getText()+"','sd','sd', \n" +
                        "            'sd','sd','sd','sd','"+ComboBoxDoctores.getSelectedItem()+"');";
                        
              Mensage = "Exito,Historia enviada";

        }else{
                       sql= "INSERT INTO paciente(\n" +
                        "             historia, nombres, apellidos, fecha, sexo, grup_san, estad_civil, \n" +
                        "            edad, fono, direccion, antfamiliares, antpersonales, estado,cedula)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','"+txtNombres.getText()+"', '"+txtApellidos.getText()+"', '"+lbFechaActualTxt.getText()+"', '"+ComboBoxSexo.getSelectedItem()+"', '"+ComboBoxGSanguineo.getSelectedItem()+"', '"+ComboBoxEstado.getSelectedItem()+"', \n" +
                        "            '"+txtEdad.getText()+"', '"+txtTelefono.getText()+"', '"+txtDireccion.getText()+"', '"+txtAntecedentesFamiliares.getText()+"', '"+txtAntecedentesPersonales.getText()+"', 1,'"+txtCI.getText()+"')";

                       sqlConsulta ="INSERT INTO consulta_hombre(\n" +
                        "            fk_historia, talla, peso, presion_arterial, presion_cardiaca, \n" +
                        "            presion_respiratoria, fecha_consulta, sintomas, examen_fisico, \n" +
                        "            id_campo, tratamiento, rp, indicaciones, doctor)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','"+txtTALLA.getText()+"','"+txtPESO.getText()+"','"+txtPA.getText()+"','"+txtFC.getText()+"', \n" +
                        "            '"+txtFR.getText()+"','"+lbFechaActualTxt.getText()+"','sd','sd', \n" +
                        "            'sd','sd','sd','sd','"+ComboBoxDoctores.getSelectedItem()+"');";

              Mensage = "N° de Historia es:"+NumeroHistoria.getText()+"";
        }}else{
           //insercion del paciente mujer
        if (CheckBoxEditarDatosGenerales.isSelected() || valorParaModificarSoloLaHistoria.getText()=="1234" ) {
                        sql= " UPDATE paciente  SET  nombres='"+txtNombres.getText()+"', apellidos='"+txtApellidos.getText()+"', sexo='"+ComboBoxSexo.getSelectedItem()+"', grup_san='"+ComboBoxGSanguineo.getSelectedItem()+"', \n" +
                        "       estad_civil='"+ComboBoxEstado.getSelectedItem()+"', edad='"+txtEdad.getText()+"', fono='"+txtTelefono.getText()+"', direccion='"+txtDireccion.getText()+"', antfamiliares='"+txtAntecedentesFamiliares.getText()+"', \n" +
                        "       antpersonales='"+txtAntecedentesPersonales.getText()+"',cedula='"+txtCI.getText()+"'\n" +
                        " WHERE historia = '"+NumeroHistoria.getText()+"'";
                        
                       sqlConsulta ="INSERT INTO consulta_mujer_gesta(\n" +
                        "            fk_historia, numero_gesta, numero_cesaria, numero_parto, \n" +
                        "            numero_aborto, fecha_fum)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','0','0','0', \n" +
                        "            '0','sd');";
                        
                       sqlConsultaGesta="INSERT INTO tratamiento_mujer(\n" +
                        "            fk_historia, fecha_consulta, talla, peso, presion_arterial, \n" +
                        "            presion_cardiaca, presion_respiratoria, sintomas, examen_fisico, \n" +
                        "            id_campo, tratamiento, rp, indicaciones, doctor, numero_gesta)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','"+lbFechaActualTxt.getText()+"','"+txtTALLA.getText()+"','"+txtPESO.getText()+"','"+txtPA.getText()+"', \n" +
                        "            '"+txtFC.getText()+"','"+txtFR.getText()+"','sd','sd', \n" +
                        "            'sd','sd','sd','sd','"+ComboBoxDoctores.getSelectedItem()+"','0');";
          
              Mensage = "Historia, Historia enviada";

        }else{
                       sql= "INSERT INTO paciente(\n" +
                        "             historia, nombres, apellidos, fecha, sexo, grup_san, estad_civil, \n" +
                        "            edad, fono, direccion, antfamiliares, antpersonales, estado,cedula)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','"+txtNombres.getText()+"', '"+txtApellidos.getText()+"', '"+lbFechaActualTxt.getText()+"', '"+ComboBoxSexo.getSelectedItem()+"', '"+ComboBoxGSanguineo.getSelectedItem()+"', '"+ComboBoxEstado.getSelectedItem()+"', \n" +
                        "            '"+txtEdad.getText()+"', '"+txtTelefono.getText()+"', '"+txtDireccion.getText()+"', '"+txtAntecedentesFamiliares.getText()+"', '"+txtAntecedentesPersonales.getText()+"', 1,'"+txtCI.getText()+"')";

                       sqlConsulta ="INSERT INTO consulta_mujer_gesta(\n" +
                        "            fk_historia, numero_gesta, numero_cesaria, numero_parto, \n" +
                        "            numero_aborto, fecha_fum)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','0','0','0', \n" +
                        "            '0','sd');";
                        
                       sqlConsultaGesta="INSERT INTO tratamiento_mujer(\n" +
                        "            fk_historia, fecha_consulta, talla, peso, presion_arterial, \n" +
                        "            presion_cardiaca, presion_respiratoria, sintomas, examen_fisico, \n" +
                        "            id_campo, tratamiento, rp, indicaciones, doctor, numero_gesta)\n" +
                        "    VALUES ('"+NumeroHistoria.getText()+"','"+lbFechaActualTxt.getText()+"','"+txtTALLA.getText()+"','"+txtPESO.getText()+"','"+txtPA.getText()+"', \n" +
                        "            '"+txtFC.getText()+"','"+txtFR.getText()+"','sd','sd', \n" +
                        "            'sd','sd','sd','sd','"+ComboBoxDoctores.getSelectedItem()+"','0');";
                    
              Mensage = "N° de Historia es:"+NumeroHistoria.getText()+"";
            }                  
        }
        
      
               try{
                      pst=con.prepareStatement(sql);
                      pst.execute();
                      pst2=con.prepareStatement(sqlConsulta);
                      pst2.execute();
                        //esto se ejecutara solo si es una mujer
                        if (ComboBoxSexo.getSelectedItem()=="Femenino") {                                          
                        pst3=con.prepareStatement(sqlConsultaGesta);
                        pst3.execute();
                            }
                      JOptionPane.showMessageDialog(this,Mensage,"Paciente",JOptionPane.INFORMATION_MESSAGE);


                  }catch(HeadlessException | SQLException ex){
                      JOptionPane.showConfirmDialog(this,ex);
                  }
            }
    }//GEN-LAST:event_btnGuardarHistoriaActionPerformed

    private void ComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSexoActionPerformed
      
    }//GEN-LAST:event_ComboBoxSexoActionPerformed

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
       reset();                
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        this.dispose();       
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        //validar letas
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
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
    }//GEN-LAST:event_txtEdadKeyReleased

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

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
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
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtAntecedentesFamiliaresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAntecedentesFamiliaresKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAntecedentesFamiliaresKeyReleased

    private void txtAntecedentesPersonalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAntecedentesPersonalesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAntecedentesPersonalesKeyReleased

    private void txtPAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPAKeyReleased
        // TODO add your handling code here:
        //validar solo numeros
        JTextField object = (JTextField)evt.getSource();
        String str = object.getText();
        char[] fuente = str.toCharArray();
        char[] resultado = new char[fuente.length];
        int j=0;
        boolean error = false;
        for(int i=0;i<fuente.length;i++){
            if(fuente[i]>='0' && fuente[i]<='9' || fuente[i]=='/'){
                resultado[j++] = fuente[i];
            }else{
                error = true;
                Toolkit.getDefaultToolkit().beep();
            }
            
        }
        if(error){
            object.setText(new String (resultado,0,j));
        }
    }//GEN-LAST:event_txtPAKeyReleased

    private void txtFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFCKeyReleased
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
    }//GEN-LAST:event_txtFCKeyReleased

    private void txtFRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFRKeyReleased
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
    }//GEN-LAST:event_txtFRKeyReleased

    private void txtTALLAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTALLAKeyReleased
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
    }//GEN-LAST:event_txtTALLAKeyReleased

    private void txtPESOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPESOKeyReleased
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
    }//GEN-LAST:event_txtPESOKeyReleased

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        //validar letas
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtAntecedentesFamiliaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAntecedentesFamiliaresKeyTyped
        // TODO add your handling code here:
        //validar letas
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '!' || c > '.')
                && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAntecedentesFamiliaresKeyTyped

    private void txtAntecedentesPersonalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAntecedentesPersonalesKeyTyped
        // TODO add your handling code here:
        //validar letas
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '!' || c > '.')
                && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAntecedentesPersonalesKeyTyped

    
    //resetear todos los campos para el ingreso de un nuevo paciente
    private void reset(){
    txtNombres.setText("");
    txtApellidos.setText("");
    ComboBoxSexo.setSelectedItem(1);
    ComboBoxGSanguineo.setSelectedItem(1);
    ComboBoxEstado.setSelectedItem(1);
    txtEdad.setText("");
    txtCI.setText("");
    txtTelefono.setText("");
    txtDireccion.setText("");
    txtAntecedentesFamiliares.setText("");
    txtAntecedentesPersonales.setText("");
    txtTALLA.setText("");
    txtPESO.setText("");
    txtPA.setText("");
    txtFC.setText("");
    txtFR.setText("");
    txtNombres.setEnabled(true);
    txtApellidos.setEnabled(true);
    ComboBoxSexo.setEnabled(true);
    ComboBoxGSanguineo.setEnabled(true);
    ComboBoxEstado.setEnabled(true);
    txtEdad.setEnabled(true);
    txtCI.setEnabled(true);
    txtTelefono.setEnabled(true);
    txtDireccion.setEnabled(true);
    txtAntecedentesFamiliares.setEnabled(true);
    txtAntecedentesPersonales.setEnabled(true);
    NumeroHistoria.setText("");
    CheckBoxEditarDatosGenerales.setVisible(false);
    CheckBoxEditarDatosGenerales.setSelected(false);
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
            java.util.logging.Logger.getLogger(frmNuevoPacienteE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPacienteE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPacienteE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPacienteE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new frmNuevoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox CheckBoxEditarDatosGenerales;
    private javax.swing.JComboBox ComboBoxDoctores;
    public javax.swing.JComboBox ComboBoxEstado;
    public javax.swing.JComboBox ComboBoxGSanguineo;
    public javax.swing.JComboBox ComboBoxSexo;
    private javax.swing.JLabel GrupoSanguineo;
    public javax.swing.JLabel NumeroHistoria;
    private javax.swing.JPanel PanelSignosVitales;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnGuardarHistoria;
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbBienvenida;
    private javax.swing.JLabel lbCI;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEdad1;
    private javax.swing.JLabel lbFc;
    private javax.swing.JLabel lbFechaActualTxt;
    private javax.swing.JLabel lbFr;
    private javax.swing.JLabel lbHistoria;
    private javax.swing.JLabel lbNombres;
    private javax.swing.JLabel lbPA;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbTalla;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel sexo;
    public javax.swing.JTabbedPane tabPanelPaciente;
    public java.awt.TextArea txtAntecedentesFamiliares;
    public java.awt.TextArea txtAntecedentesPersonales;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCI;
    public java.awt.TextArea txtDireccion;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtFC;
    public javax.swing.JTextField txtFR;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtPA;
    public javax.swing.JTextField txtPESO;
    public javax.swing.JLabel txtSesion;
    public javax.swing.JTextField txtTALLA;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JLabel valorParaModificarSoloLaHistoria;
    // End of variables declaration//GEN-END:variables
}
