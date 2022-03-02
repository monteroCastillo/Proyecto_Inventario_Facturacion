/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Validaciones.*;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import Complementos.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

class VistaEmpleado extends javax.swing.JFrame {
    
    Controlador objControlador;
    Validaciones objValidaciones = new Validaciones();
    private static VistaEmpleado objEmpleado;
    vistaAdvertencia objVistaAdvertencia;
    
    TablaRender renderer = new TablaRender();
    
    private VistaEmpleado(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        objVistaAdvertencia = new vistaAdvertencia();
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro   
        
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        asignarTitulo();
        TextPrompt placeHolder  = new TextPrompt("Nombre Empleado", txNombreEmp);
        TextPrompt placeHolder2  = new TextPrompt("Cedula Empleado", txCedulaEmpleado);
        TextPrompt placeHolder3  = new TextPrompt("Usuario en el Sistema", txUsuarioEmpleado);
        TextPrompt placeHolder4  = new TextPrompt("Clave en el Sistema", txClaveEmpleado);
        TextPrompt placeHolder5  = new TextPrompt("Usuario en el Sistema", txUsuarioEmpleado);
        TextPrompt placeHolder6  = new TextPrompt("Dirección", txDireccionEmpleado);
        TextPrompt placeHolder7  = new TextPrompt("Telefono", txTelefonoEmpleado);        
       
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        tablaEmpleadoA_B.setDefaultRenderer(Object.class, renderer);
        tablaEmpleados.setDefaultRenderer(Object.class, renderer);
    }

    //Patron Singleton
    public static VistaEmpleado obtenerEmpleado(Controlador objControlador) {
        
        if (objEmpleado == null) {
            
            objEmpleado = new VistaEmpleado(objControlador);
            
        }
        return objEmpleado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEmpleadoA_B = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txNombreEmp = new javax.swing.JTextField();
        txCedulaEmpleado = new javax.swing.JTextField();
        txDireccionEmpleado = new javax.swing.JTextField();
        txTelefonoEmpleado = new javax.swing.JTextField();
        txUsuarioEmpleado = new javax.swing.JTextField();
        txClaveEmpleado = new javax.swing.JTextField();
        jComboTipoEmpleado = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Tipo empleado");

        tablaEmpleadoA_B.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleadoA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmpleadoA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoA_BMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaEmpleadoA_B);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/floppy-disk_32.png"))); // NOI18N
        btnCrear.setText("Guardar");
        btnCrear.setToolTipText("Guarda la informacion del Empleado");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setToolTipText("Muestra todos los Empleados");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/pencil.png"))); // NOI18N
        btnActualizar.setText("Editar");
        btnActualizar.setToolTipText("Permite editar la Informacion del Empleado");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/error32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina a un Empleado ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        txNombreEmp.setBackground(new java.awt.Color(255, 255, 255));
        txNombreEmp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCedulaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txCedulaEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDireccionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txDireccionEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txTelefonoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txTelefonoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txUsuarioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txUsuarioEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txClaveEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txClaveEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jComboTipoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jComboTipoEmpleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuario", "admin" }));
        jComboTipoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txDireccionEmpleado)
                        .addComponent(txTelefonoEmpleado)
                        .addComponent(txUsuarioEmpleado)
                        .addComponent(txClaveEmpleado)
                        .addComponent(jComboTipoEmpleado, 0, 258, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txNombreEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addComponent(txCedulaEmpleado, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(73, 73, 73))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(63, 63, 63)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setText("Colaboradores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vista Empleado", jPanel2);

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setToolTipText("Vuelve al Menu Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("usuario")) {

            VistaMenuUsuarioComun interfaz2 = new VistaMenuUsuarioComun(objControlador);
            interfaz2.show();
            this.dispose();
        } else if (objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("admin")) {
            frontEnd interfaz = new frontEnd(objControlador);
            interfaz.show();
            this.dispose(); // instruccion que cierra la ventana actual
        } else {
            JOptionPane.showMessageDialog(null, "Imposible regresar al Menu Principal \n en este momento");

        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleados);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosEmpleados(3);
            JOptionPane.showMessageDialog(null, "Empleado Desactivado exitosamente", "Desactivacion Empleado",JOptionPane.INFORMATION_MESSAGE );
        
            
        }
        limpiarEmpleado();
        configuracionBotonesIniciales();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validarCamposVacios() == true){
            enviarDatosEmpleados(2);
            JOptionPane.showMessageDialog(null, "Empleado Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarEmpleado();
            configuracionBotonesIniciales();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleadoA_B);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosEmpleados(1);
            JOptionPane.showMessageDialog(null, "Empleado Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarEmpleado();
            
        }     
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void tablaEmpleadoA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoA_BMouseClicked
        int row = tablaEmpleadoA_B.rowAtPoint(evt.getPoint());

        

        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0);

        int reply = JOptionPane.showConfirmDialog(null, "Desea Editar o Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //Cuando Cancela        
        if (reply == JOptionPane.OK_CANCEL_OPTION) {            
            
        }
        //Cuando Aprueba
        else if (reply == JOptionPane.OK_OPTION){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnMostrar.setEnabled(false);
            datosTablaEmpleado(row);
            
        }     
      
    }//GEN-LAST:event_tablaEmpleadoA_BMouseClicked
    
    public void enviarDatosEmpleados(int opcion) {
        
        ArrayList<String> arrayEmpleadoNuevo = new ArrayList<>();
        
        String tipoEmpleado;
        tipoEmpleado = jComboTipoEmpleado.getSelectedItem().toString();
        
        arrayEmpleadoNuevo.add(txNombreEmp.getText());
        arrayEmpleadoNuevo.add(txCedulaEmpleado.getText());
        arrayEmpleadoNuevo.add(txUsuarioEmpleado.getText());
        arrayEmpleadoNuevo.add(txClaveEmpleado.getText());
        arrayEmpleadoNuevo.add(txDireccionEmpleado.getText());
        arrayEmpleadoNuevo.add(txTelefonoEmpleado.getText());
        arrayEmpleadoNuevo.add(tipoEmpleado);
        
        switch (opcion) {
            case 1:
                objControlador.crearEmpleado(arrayEmpleadoNuevo);
                break;
            case 2:
                objControlador.actualizarEmpleado(arrayEmpleadoNuevo);
                break;
            case 3:
                objControlador.eliminarEmpleado(txCedulaEmpleado.getText());
                break;
            default:
                break;
        }
    }      
    
    public void datosTablaEmpleado(int row) {
        
        String nombreEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 0));
        String idEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 1));
        String usuarioEmpleado = (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 2)));
        String claveEmpleado= (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 3)));
        String direccionEmpleado = (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 4)));
        String telEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 5));
        String tipoEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 6));
        
        txNombreEmp.setText(nombreEmpleado);
        txCedulaEmpleado.setText(idEmpleado);
        txUsuarioEmpleado.setText(usuarioEmpleado);
        txClaveEmpleado.setText(claveEmpleado);
        txDireccionEmpleado.setText(direccionEmpleado);
        txTelefonoEmpleado.setText(telEmpleado);       
        jComboTipoEmpleado.setSelectedItem(tipoEmpleado);
    }  
    
    
    public void limpiarEmpleado(){
        
        txNombreEmp.setText("");
        txCedulaEmpleado.setText("");
        txUsuarioEmpleado.setText("");
        txClaveEmpleado.setText("");
        txDireccionEmpleado.setText("");
        txTelefonoEmpleado.setText("");
        
    }
    
    private void asignarTitulo(){
      
        setTitle(objControlador.empleadoSesionAbierta());     
       
    }
    
    private void activarBotonesTodos(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    private void configuracionBotonesIniciales(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    private Boolean validarCamposVacios() {
        Boolean valido = false;
        if ((txNombreEmp.getText().length() == 0) || (txCedulaEmpleado.getText().length() == 0)
            || (txDireccionEmpleado.getText().length() == 0) || (txTelefonoEmpleado.getText().length() == 0)
                || (txUsuarioEmpleado.getText().length() == 0) || (txClaveEmpleado.getText().length() == 0)){
            System.out.println("No hay texto");
        } else {
            System.out.println("Si hay texto");
            valido = true;
        }
        return valido;
    }
    
    public Boolean validaciones() {

        limpiarErrores();
        
        Boolean validacion = false;
        Boolean numerico = false;
        Boolean numerico2 = false;

        Boolean emailCorrecto = false;

        ArrayList<Integer> resultado = new ArrayList<>();

        resultado = objValidaciones.validarCamposVacios(validarCamposVacios2());

        if (resultado.size() != 0) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < resultado.size(); i++) {
            pintarErrores((resultado.get(i)));
        }

        numerico = objValidaciones.validarDatoNumerico(txTelefonoEmpleado.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txCedulaEmpleado.getText());
        if ((numerico == false || numerico2 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(3);
            }

            if (numerico2 == false) {
                pintarErrores(1);
            }

        }

        if (numerico == true && numerico2 == true && resultado.size() == 0) {
         validacion = true;
            
        }
        
        return validacion;
    }   
    
    private ArrayList validarCamposVacios2() {
        
        Boolean valido = false;  
        
        ArrayList arregloCamposEmpleados = new ArrayList<>();        
        arregloCamposEmpleados.add(txNombreEmp.getText());
        arregloCamposEmpleados.add(txCedulaEmpleado.getText());
        arregloCamposEmpleados.add(txDireccionEmpleado.getText());
        arregloCamposEmpleados.add(txTelefonoEmpleado.getText());
        arregloCamposEmpleados.add(txUsuarioEmpleado.getText());
        arregloCamposEmpleados.add(txClaveEmpleado.getText());     
                
        return arregloCamposEmpleados;
    }
    
    public void pintarErrores(int num){
        
        switch(num){
            case 0: txNombreEmp.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 1: txCedulaEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 2: txDireccionEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 3: txTelefonoEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 4: txUsuarioEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 5: txClaveEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
            
            
        }
        
    }     
          
    
    public void limpiarErrores() {

        txNombreEmp.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCedulaEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDireccionEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txTelefonoEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txUsuarioEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txClaveEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }  
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboTipoEmpleado;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaEmpleadoA_B;
    private javax.swing.JTable tablaEmpleados;
    public javax.swing.JTextField txCedulaEmpleado;
    public javax.swing.JTextField txClaveEmpleado;
    public javax.swing.JTextField txDireccionEmpleado;
    public javax.swing.JTextField txNombreEmp;
    public javax.swing.JTextField txTelefonoEmpleado;
    private javax.swing.JTextField txUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables

   
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Validaciones.*;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import Complementos.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

class VistaEmpleado extends javax.swing.JFrame {
    
    Controlador objControlador;
    Validaciones objValidaciones = new Validaciones();
    private static VistaEmpleado objEmpleado;
    vistaAdvertencia objVistaAdvertencia;
    
    TablaRender renderer = new TablaRender();
    
    private VistaEmpleado(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        objVistaAdvertencia = new vistaAdvertencia();
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro   
        
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        asignarTitulo();
        TextPrompt placeHolder  = new TextPrompt("Nombre Empleado", txNombreEmp);
        TextPrompt placeHolder2  = new TextPrompt("Cedula Empleado", txCedulaEmpleado);
        TextPrompt placeHolder3  = new TextPrompt("Usuario en el Sistema", txUsuarioEmpleado);
        TextPrompt placeHolder4  = new TextPrompt("Clave en el Sistema", txClaveEmpleado);
        TextPrompt placeHolder5  = new TextPrompt("Usuario en el Sistema", txUsuarioEmpleado);
        TextPrompt placeHolder6  = new TextPrompt("Dirección", txDireccionEmpleado);
        TextPrompt placeHolder7  = new TextPrompt("Telefono", txTelefonoEmpleado);        
       
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        tablaEmpleadoA_B.setDefaultRenderer(Object.class, renderer);
        tablaEmpleados.setDefaultRenderer(Object.class, renderer);
    }

    //Patron Singleton
    public static VistaEmpleado obtenerEmpleado(Controlador objControlador) {
        
        if (objEmpleado == null) {
            
            objEmpleado = new VistaEmpleado(objControlador);
            
        }
        return objEmpleado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEmpleadoA_B = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txNombreEmp = new javax.swing.JTextField();
        txCedulaEmpleado = new javax.swing.JTextField();
        txDireccionEmpleado = new javax.swing.JTextField();
        txTelefonoEmpleado = new javax.swing.JTextField();
        txUsuarioEmpleado = new javax.swing.JTextField();
        txClaveEmpleado = new javax.swing.JTextField();
        jComboTipoEmpleado = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Tipo empleado");

        tablaEmpleadoA_B.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleadoA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmpleadoA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoA_BMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaEmpleadoA_B);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/floppy-disk_32.png"))); // NOI18N
        btnCrear.setText("Guardar");
        btnCrear.setToolTipText("Guarda la informacion del Empleado");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setToolTipText("Muestra todos los Empleados");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/pencil.png"))); // NOI18N
        btnActualizar.setText("Editar");
        btnActualizar.setToolTipText("Permite editar la Informacion del Empleado");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/error32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina a un Empleado ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        txNombreEmp.setBackground(new java.awt.Color(255, 255, 255));
        txNombreEmp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCedulaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txCedulaEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDireccionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txDireccionEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txTelefonoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txTelefonoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txUsuarioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txUsuarioEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txClaveEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txClaveEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jComboTipoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jComboTipoEmpleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuario", "admin" }));
        jComboTipoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txDireccionEmpleado)
                        .addComponent(txTelefonoEmpleado)
                        .addComponent(txUsuarioEmpleado)
                        .addComponent(txClaveEmpleado)
                        .addComponent(jComboTipoEmpleado, 0, 258, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txNombreEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addComponent(txCedulaEmpleado, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(73, 73, 73))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(63, 63, 63)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setText("Colaboradores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vista Empleado", jPanel2);

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setToolTipText("Vuelve al Menu Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("usuario")) {

            VistaMenuUsuarioComun interfaz2 = new VistaMenuUsuarioComun(objControlador);
            interfaz2.show();
            this.dispose();
        } else if (objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("admin")) {
            frontEnd interfaz = new frontEnd(objControlador);
            interfaz.show();
            this.dispose(); // instruccion que cierra la ventana actual
        } else {
            JOptionPane.showMessageDialog(null, "Imposible regresar al Menu Principal \n en este momento");

        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleados);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosEmpleados(3);
            JOptionPane.showMessageDialog(null, "Empleado Desactivado exitosamente", "Desactivacion Empleado",JOptionPane.INFORMATION_MESSAGE );
        
            
        }
        limpiarEmpleado();
        configuracionBotonesIniciales();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validarCamposVacios() == true){
            enviarDatosEmpleados(2);
            JOptionPane.showMessageDialog(null, "Empleado Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarEmpleado();
            configuracionBotonesIniciales();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleadoA_B);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosEmpleados(1);
            JOptionPane.showMessageDialog(null, "Empleado Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarEmpleado();
            
        }     
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void tablaEmpleadoA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoA_BMouseClicked
        int row = tablaEmpleadoA_B.rowAtPoint(evt.getPoint());

        

        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0);

        int reply = JOptionPane.showConfirmDialog(null, "Desea Editar o Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //Cuando Cancela        
        if (reply == JOptionPane.OK_CANCEL_OPTION) {            
            
        }
        //Cuando Aprueba
        else if (reply == JOptionPane.OK_OPTION){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnMostrar.setEnabled(false);
            datosTablaEmpleado(row);
            
        }     
      
    }//GEN-LAST:event_tablaEmpleadoA_BMouseClicked
    
    public void enviarDatosEmpleados(int opcion) {
        
        ArrayList<String> arrayEmpleadoNuevo = new ArrayList<>();
        
        String tipoEmpleado;
        tipoEmpleado = jComboTipoEmpleado.getSelectedItem().toString();
        
        arrayEmpleadoNuevo.add(txNombreEmp.getText());
        arrayEmpleadoNuevo.add(txCedulaEmpleado.getText());
        arrayEmpleadoNuevo.add(txUsuarioEmpleado.getText());
        arrayEmpleadoNuevo.add(txClaveEmpleado.getText());
        arrayEmpleadoNuevo.add(txDireccionEmpleado.getText());
        arrayEmpleadoNuevo.add(txTelefonoEmpleado.getText());
        arrayEmpleadoNuevo.add(tipoEmpleado);
        
        switch (opcion) {
            case 1:
                objControlador.crearEmpleado(arrayEmpleadoNuevo);
                break;
            case 2:
                objControlador.actualizarEmpleado(arrayEmpleadoNuevo);
                break;
            case 3:
                objControlador.eliminarEmpleado(txCedulaEmpleado.getText());
                break;
            default:
                break;
        }
    }      
    
    public void datosTablaEmpleado(int row) {
        
        String nombreEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 0));
        String idEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 1));
        String usuarioEmpleado = (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 2)));
        String claveEmpleado= (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 3)));
        String direccionEmpleado = (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 4)));
        String telEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 5));
        String tipoEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 6));
        
        txNombreEmp.setText(nombreEmpleado);
        txCedulaEmpleado.setText(idEmpleado);
        txUsuarioEmpleado.setText(usuarioEmpleado);
        txClaveEmpleado.setText(claveEmpleado);
        txDireccionEmpleado.setText(direccionEmpleado);
        txTelefonoEmpleado.setText(telEmpleado);       
        jComboTipoEmpleado.setSelectedItem(tipoEmpleado);
    }  
    
    
    public void limpiarEmpleado(){
        
        txNombreEmp.setText("");
        txCedulaEmpleado.setText("");
        txUsuarioEmpleado.setText("");
        txClaveEmpleado.setText("");
        txDireccionEmpleado.setText("");
        txTelefonoEmpleado.setText("");
        
    }
    
    private void asignarTitulo(){
      
        setTitle(objControlador.empleadoSesionAbierta());     
       
    }
    
    private void activarBotonesTodos(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    private void configuracionBotonesIniciales(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    private Boolean validarCamposVacios() {
        Boolean valido = false;
        if ((txNombreEmp.getText().length() == 0) || (txCedulaEmpleado.getText().length() == 0)
            || (txDireccionEmpleado.getText().length() == 0) || (txTelefonoEmpleado.getText().length() == 0)
                || (txUsuarioEmpleado.getText().length() == 0) || (txClaveEmpleado.getText().length() == 0)){
            System.out.println("No hay texto");
        } else {
            System.out.println("Si hay texto");
            valido = true;
        }
        return valido;
    }
    
    public Boolean validaciones() {

        limpiarErrores();
        
        Boolean validacion = false;
        Boolean numerico = false;
        Boolean numerico2 = false;

        Boolean emailCorrecto = false;

        ArrayList<Integer> resultado = new ArrayList<>();

        resultado = objValidaciones.validarCamposVacios(validarCamposVacios2());

        if (resultado.size() != 0) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < resultado.size(); i++) {
            pintarErrores((resultado.get(i)));
        }

        numerico = objValidaciones.validarDatoNumerico(txTelefonoEmpleado.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txCedulaEmpleado.getText());
        if ((numerico == false || numerico2 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(3);
            }

            if (numerico2 == false) {
                pintarErrores(1);
            }

        }

        if (numerico == true && numerico2 == true && resultado.size() == 0) {
         validacion = true;
            
        }
        
        return validacion;
    }   
    
    private ArrayList validarCamposVacios2() {
        
        Boolean valido = false;  
        
        ArrayList arregloCamposEmpleados = new ArrayList<>();        
        arregloCamposEmpleados.add(txNombreEmp.getText());
        arregloCamposEmpleados.add(txCedulaEmpleado.getText());
        arregloCamposEmpleados.add(txDireccionEmpleado.getText());
        arregloCamposEmpleados.add(txTelefonoEmpleado.getText());
        arregloCamposEmpleados.add(txUsuarioEmpleado.getText());
        arregloCamposEmpleados.add(txClaveEmpleado.getText());     
                
        return arregloCamposEmpleados;
    }
    
    public void pintarErrores(int num){
        
        switch(num){
            case 0: txNombreEmp.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 1: txCedulaEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 2: txDireccionEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 3: txTelefonoEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 4: txUsuarioEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 5: txClaveEmpleado.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
            
            
        }
        
    }     
          
    
    public void limpiarErrores() {

        txNombreEmp.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCedulaEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDireccionEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txTelefonoEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txUsuarioEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txClaveEmpleado.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }  
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboTipoEmpleado;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaEmpleadoA_B;
    private javax.swing.JTable tablaEmpleados;
    public javax.swing.JTextField txCedulaEmpleado;
    public javax.swing.JTextField txClaveEmpleado;
    public javax.swing.JTextField txDireccionEmpleado;
    public javax.swing.JTextField txNombreEmp;
    public javax.swing.JTextField txTelefonoEmpleado;
    private javax.swing.JTextField txUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables

   
}
