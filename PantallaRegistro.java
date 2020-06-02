/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author orlan
 */
public class PantallaRegistro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pantallaregistro
     */
       Connection con;
    public PantallaRegistro() {
                    initComponents();
                    

        try {
          
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfDocumento = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Registro de pacientes");

        tfDocumento.setText("Ingrese el No de Documento");
        tfDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDocumentoFocusGained(evt);
            }
        });

        tfApellidos.setText("Ingrese apellido del paciente");
        tfApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApellidosFocusGained(evt);
            }
        });

        tfNombres.setText("Ingrese nombre del paciente");
        tfNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombresFocusGained(evt);
            }
        });

        Grupo1.add(rbMasculino);
        rbMasculino.setText("Masculino");

        rbFemenino.setText("Femenino");

        jLabel2.setText("Fecha de nacimiento");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbFemenino)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(rbMasculino)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
     
          
        String sexo="";
        
        if(rbMasculino.isSelected()){
            sexo="M";
        }if(rbFemenino.isSelected()){
            sexo="F";
        }
         try {      
            con = DriverManager.getConnection("jdbc:mysql://localhost/Sistema Hospital","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO pacientes VALUES('"+tfDocumento.getText()+"','"+tfNombres.getText()+"','"+tfApellidos.getText()+"','1986-06-15','"+sexo+"')");
        } catch (SQLException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No se puede conectar a la base de datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfDocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDocumentoFocusGained
        // TODO add your handling code here:
        
        tfDocumento.setText("");
        
    }//GEN-LAST:event_tfDocumentoFocusGained

    private void tfNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombresFocusGained
        // TODO add your handling code here:
           tfNombres.setText("");
    }//GEN-LAST:event_tfNombresFocusGained

    private void tfApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusGained
        // TODO add your handling code here:
           tfApellidos.setText("");
    }//GEN-LAST:event_tfApellidosFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfDocumento;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration//GEN-END:variables
}
