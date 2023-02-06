/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import procesos.conectaDB;
import procesos.fechas;

/**
 *
 * @author Junior
 */
public class frmNuevoPacienteExamenes extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    ResultSet rs = null;
    
    public frmNuevoPacienteExamenes() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = conectaDB.conectaDB(); 

        //obtencion de la fecha del sistema
        GregorianCalendar objCalendario = new GregorianCalendar();
        int anio,mes,dia;        
        anio = objCalendario.get(Calendar.YEAR);
        mes = objCalendario.get(Calendar.MONTH)+1;
        dia = objCalendario.get(Calendar.DAY_OF_MONTH);                
        lbFechaActualTxt.setText(anio+"-"+mes+"-"+dia);
       

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHistoria = new javax.swing.JLabel();
        NumeroHistoria = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarHistoria = new javax.swing.JButton();
        btnEliminarHistoria = new javax.swing.JButton();
        tabPanelPaciente = new javax.swing.JTabbedPane();
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
        PanelGestacion = new javax.swing.JPanel();
        ComboBoxCesarea = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxParto = new javax.swing.JComboBox();
        ComboBoxAborto = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtGesta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelNuevaGesta = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        CalendarFUM = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        txtFUM = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFechaGestacion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFechaParto = new javax.swing.JLabel();
        CheckBoxNuevaGesta = new javax.swing.JCheckBox();
        panelEvolucionDiagnostico = new javax.swing.JPanel();
        PanelEvoDiag = new javax.swing.JPanel();
        txtExamenFisico = new java.awt.TextArea();
        txtSintomas = new java.awt.TextArea();
        txtIDcampo = new java.awt.TextArea();
        txtTratamiento = new java.awt.TextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRp = new java.awt.TextArea();
        txtIndicaciones = new java.awt.TextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnRecetaMedica = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        valorParaModificarSoloLaHistoria = new javax.swing.JLabel();
        lbFechaActualTxt = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JLabel();
        txtApellidosPaciente = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHistoria.setText("HISTORIA n°:");
        getContentPane().add(lbHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, -1, -1));

        NumeroHistoria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NumeroHistoria.setText("-------");
        getContentPane().add(NumeroHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarHistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarHistoria.setText("Guardar");
        btnGuardarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHistoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 50));

        btnEliminarHistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarHistoria.setText("Eliminar");
        btnEliminarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHistoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 170, 160));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSignosVitales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPAKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 80, -1));

        txtFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFCKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 80, -1));

        txtFR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFRKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtFR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 80, -1));

        lbFr.setText("FRECUENCIA RESPIRATORIA:");
        PanelSignosVitales.add(lbFr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        lbFc.setText("FRECUENCIA CARDIACA:");
        PanelSignosVitales.add(lbFc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 20));

        lbPA.setText("PRECION ARTERIAL:");
        PanelSignosVitales.add(lbPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel3.setText("Kg");
        PanelSignosVitales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

        jLabel2.setText("Cm");
        PanelSignosVitales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 20, -1));

        txtTALLA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTALLAKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtTALLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, -1));

        txtPESO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPESOKeyReleased(evt);
            }
        });
        PanelSignosVitales.add(txtPESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));

        lbPeso.setText("PESO:");
        PanelSignosVitales.add(lbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, -1));

        lbTalla.setText("TALLA:");
        PanelSignosVitales.add(lbTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jPanel2.add(PanelSignosVitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, 160));

        PanelGestacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxCesarea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboBoxCesarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCesareaActionPerformed(evt);
            }
        });
        PanelGestacion.add(ComboBoxCesarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel7.setText("CESAREA N°:");
        PanelGestacion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel8.setText("PARTO N°:");
        PanelGestacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        ComboBoxParto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboBoxParto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPartoActionPerformed(evt);
            }
        });
        PanelGestacion.add(ComboBoxParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        ComboBoxAborto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboBoxAborto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAbortoActionPerformed(evt);
            }
        });
        PanelGestacion.add(ComboBoxAborto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel6.setText("ABORTO N°:");
        PanelGestacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtGesta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGesta.setText("0");
        PanelGestacion.add(txtGesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 30, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("GESTA N°:");
        PanelGestacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel2.add(PanelGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 280));

        PanelNuevaGesta.setBackground(new java.awt.Color(255, 153, 255));
        PanelNuevaGesta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("CALCULAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelNuevaGesta.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, -1));

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
        PanelNuevaGesta.add(CalendarFUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 220));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FUM:");
        PanelNuevaGesta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        txtFUM.setText("-----------");
        PanelNuevaGesta.add(txtFUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FECHA GESTACION:");
        PanelNuevaGesta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        txtFechaGestacion.setText("-----------");
        PanelNuevaGesta.add(txtFechaGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FECHA PRO. DE PARTO:");
        PanelNuevaGesta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        txtFechaParto.setText("----------");
        PanelNuevaGesta.add(txtFechaParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        CheckBoxNuevaGesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxNuevaGestaActionPerformed(evt);
            }
        });
        PanelNuevaGesta.add(CheckBoxNuevaGesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jPanel2.add(PanelNuevaGesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 590, 280));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        tabPanelPaciente.addTab("CONSULTA", jPanel5);

        panelEvolucionDiagnostico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEvoDiag.setBackground(new java.awt.Color(255, 255, 255));
        PanelEvoDiag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelEvoDiag.add(txtExamenFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 360, 110));
        PanelEvoDiag.add(txtSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, 110));
        PanelEvoDiag.add(txtIDcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 120));
        PanelEvoDiag.add(txtTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 360, 120));

        jLabel14.setText("EXAMEN FISICO");
        PanelEvoDiag.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel15.setText("ID");
        PanelEvoDiag.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel16.setText("TRATAMIENTO");
        PanelEvoDiag.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, 20));

        jLabel17.setText("SINTOMAS");
        PanelEvoDiag.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        PanelEvoDiag.add(txtRp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 360, 120));
        PanelEvoDiag.add(txtIndicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 360, 120));

        jLabel19.setText("Rp");
        PanelEvoDiag.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel20.setText("INDICACIONES");
        PanelEvoDiag.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        panelEvolucionDiagnostico.add(PanelEvoDiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        tabPanelPaciente.addTab("EVOLUCION / DIAGNOSTICO", panelEvolucionDiagnostico);

        getContentPane().add(tabPanelPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 820, 540));

        btnRecetaMedica.setBackground(new java.awt.Color(153, 0, 0));
        btnRecetaMedica.setText("Generar Receta");
        btnRecetaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaMedicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecetaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 170, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoDoctor.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 630));

        valorParaModificarSoloLaHistoria.setText("-------");
        getContentPane().add(valorParaModificarSoloLaHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        lbFechaActualTxt.setText("jLabel4");
        getContentPane().add(lbFechaActualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        txtNombrePaciente.setText("jLabel1");
        getContentPane().add(txtNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        txtApellidosPaciente.setText("jLabel1");
        getContentPane().add(txtApellidosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        txtIdPaciente.setText("jLabel1");
        getContentPane().add(txtIdPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHistoriaActionPerformed
        
     //condicion para ver si lo que desea en editar o registrar un nuevo paciente
        String sqlConsulta = null ;
        String sqlConsultaGesta = null ;
        String Mensage = null;
        
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
        
        //insercion de pacientes Hombres con sus consultas  
        if(valorParaModificarSoloLaHistoria.getText()=="Masculino"){
 
                       sqlConsulta ="UPDATE consulta_hombre set\n" +
                        "       sintomas='"+txtSintomas.getText()+"', examen_fisico='"+txtExamenFisico.getText()+"', \n" +
                        "       id_campo='"+txtIDcampo.getText()+"', tratamiento='"+txtTratamiento.getText()+"', rp='"+txtRp.getText()+"', indicaciones='"+txtIndicaciones.getText()+"'\n" +
                        " WHERE fk_historia='"+NumeroHistoria.getText()+"' and id='"+txtIdPaciente.getText()+"';";
                        

        }else{  
                       sqlConsulta ="UPDATE consulta_mujer_gesta set\n" +
                        "       numero_gesta='"+txtGesta.getText()+"', numero_cesaria='"+ComboBoxCesarea.getSelectedItem()+"', numero_parto='"+ComboBoxParto.getSelectedItem()+"', \n" +
                        "       numero_aborto='"+ComboBoxAborto.getSelectedItem()+"', fecha_fum='"+txtFUM.getText()+"'\n" +
                        " WHERE fk_historia='"+NumeroHistoria.getText()+"'and fecha_fum='sd';";
                        
                       sqlConsultaGesta="UPDATE tratamiento_mujer set\n" +
                        "       sintomas='"+txtSintomas.getText()+"', examen_fisico='"+txtExamenFisico.getText()+"', \n" +
                        "       id_campo='"+txtIDcampo.getText()+"', tratamiento='"+txtTratamiento.getText()+"', rp='"+txtRp.getText()+"', indicaciones='"+txtIndicaciones.getText()+"', numero_gesta='"+txtGesta.getText()+"'\n" +
                        " WHERE fk_historia='"+NumeroHistoria.getText()+"'and id='"+txtIdPaciente.getText()+"';";
          
              Mensage = "Exito,Historia generada";                
        }
        
      
               try{
                      pst2=con.prepareStatement(sqlConsulta);
                      pst2.execute();                      
                  }catch(HeadlessException | SQLException ex){
                      JOptionPane.showConfirmDialog(this,ex);
                  }
               //esto se ejecutara solo si es una mujer
               if (valorParaModificarSoloLaHistoria.getText()=="Femenino") {
                try{
                      pst2=con.prepareStatement(sqlConsulta);
                      pst2.execute();                                                                 
                        pst3=con.prepareStatement(sqlConsultaGesta);
                        pst3.execute();
                            
                      JOptionPane.showMessageDialog(this,Mensage,"Paciente",JOptionPane.INFORMATION_MESSAGE);


                  }catch(HeadlessException | SQLException ex){
                      JOptionPane.showConfirmDialog(this,ex);
                  }}
        

    }//GEN-LAST:event_btnGuardarHistoriaActionPerformed

    private void btnEliminarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHistoriaActionPerformed
            try{
                    int confirmar = JOptionPane.showConfirmDialog(null," Seguro de borrar el registro ?","Confirmation",JOptionPane.YES_NO_OPTION);
                    
                    if (confirmar==0)
                    {
                    String sql= "UPDATE  paciente set estado = 0 WHERE historia='"+NumeroHistoria.getText()+"'";

                    pst=con.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(this,"Paciente Eliminado","Paciente",JOptionPane.INFORMATION_MESSAGE);
                    
                    }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showConfirmDialog(this,ex);
        }
    }//GEN-LAST:event_btnEliminarHistoriaActionPerformed

    private void ComboBoxCesareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCesareaActionPerformed
        getGestaTotal();        
    }//GEN-LAST:event_ComboBoxCesareaActionPerformed

    private void ComboBoxPartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPartoActionPerformed
        getGestaTotal();
    }//GEN-LAST:event_ComboBoxPartoActionPerformed

    private void ComboBoxAbortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAbortoActionPerformed
        getGestaTotal();
    }//GEN-LAST:event_ComboBoxAbortoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
            txtFechaGestacion.setText(semanas+" Semanas");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CalendarFUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarFUMMouseClicked

    }//GEN-LAST:event_CalendarFUMMouseClicked

    private void CalendarFUMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarFUMMouseEntered

    }//GEN-LAST:event_CalendarFUMMouseEntered

    private void CalendarFUMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalendarFUMKeyPressed

    }//GEN-LAST:event_CalendarFUMKeyPressed

    private void CalendarFUMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalendarFUMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CalendarFUMKeyReleased

    private void CheckBoxNuevaGestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxNuevaGestaActionPerformed
     getGestaTotal();        
    }//GEN-LAST:event_CheckBoxNuevaGestaActionPerformed

    private void btnRecetaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaMedicaActionPerformed
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;
        try {
            report=JasperCompileManager.compileReport(new File("").getAbsolutePath()+
                    "/src/reportes/receta.jrxml");
            p.put("Rp", txtRp.getText());
            p.put("Indicaciones", txtIndicaciones.getText());
            p.put("fecha", lbFechaActualTxt.getText());
            p.put("nombrePaciente", txtApellidosPaciente.getText()+" "+txtNombrePaciente.getText());
            print=JasperFillManager.fillReport(report, p,new JREmptyDataSource());        
            JasperViewer view=new JasperViewer(print,false);
            view.setTitle("rp / Indicaciones");
            view.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }//GEN-LAST:event_btnRecetaMedicaActionPerformed

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
    //obtener la suma total de las gestaciones del paciente mujer
    public void getGestaTotal(){
        int NuevaGesta = 0;
        if (CheckBoxNuevaGesta.isSelected()) {
            NuevaGesta = 1;
        }else{
            NuevaGesta = 0;
        }
        int cesarea =Integer.parseInt((String)ComboBoxCesarea.getSelectedItem());
        int parto = Integer.parseInt((String) ComboBoxParto.getSelectedItem());
        int aborto = Integer.parseInt((String) ComboBoxAborto.getSelectedItem());
        int gesta = cesarea+parto+aborto+NuevaGesta;
        txtGesta.setText(gesta+"");
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
            java.util.logging.Logger.getLogger(frmNuevoPacienteExamenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPacienteExamenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPacienteExamenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevoPacienteExamenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    public com.toedter.calendar.JCalendar CalendarFUM;
    private javax.swing.JCheckBox CheckBoxNuevaGesta;
    public javax.swing.JComboBox ComboBoxAborto;
    public javax.swing.JComboBox ComboBoxCesarea;
    public javax.swing.JComboBox ComboBoxParto;
    public javax.swing.JLabel NumeroHistoria;
    private javax.swing.JPanel PanelEvoDiag;
    public javax.swing.JPanel PanelGestacion;
    public javax.swing.JPanel PanelNuevaGesta;
    private javax.swing.JPanel PanelSignosVitales;
    public javax.swing.JButton btnEliminarHistoria;
    private javax.swing.JButton btnGuardarHistoria;
    private javax.swing.JButton btnRecetaMedica;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbFc;
    private javax.swing.JLabel lbFechaActualTxt;
    private javax.swing.JLabel lbFr;
    private javax.swing.JLabel lbHistoria;
    private javax.swing.JLabel lbPA;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbTalla;
    private javax.swing.JPanel panelEvolucionDiagnostico;
    public javax.swing.JTabbedPane tabPanelPaciente;
    public javax.swing.JLabel txtApellidosPaciente;
    public java.awt.TextArea txtExamenFisico;
    public javax.swing.JTextField txtFC;
    public javax.swing.JTextField txtFR;
    public javax.swing.JLabel txtFUM;
    public javax.swing.JLabel txtFechaGestacion;
    private javax.swing.JLabel txtFechaParto;
    public javax.swing.JLabel txtGesta;
    public java.awt.TextArea txtIDcampo;
    public javax.swing.JLabel txtIdPaciente;
    public java.awt.TextArea txtIndicaciones;
    public javax.swing.JLabel txtNombrePaciente;
    public javax.swing.JTextField txtPA;
    public javax.swing.JTextField txtPESO;
    public java.awt.TextArea txtRp;
    public java.awt.TextArea txtSintomas;
    public javax.swing.JTextField txtTALLA;
    public java.awt.TextArea txtTratamiento;
    public javax.swing.JLabel valorParaModificarSoloLaHistoria;
    // End of variables declaration//GEN-END:variables
}
