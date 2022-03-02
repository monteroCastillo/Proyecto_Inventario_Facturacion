/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ModeloDAO.ClientesDAO;
import Controlador.*;
import Validaciones.Validaciones;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ALLCH
 */
public class VistaCliente extends javax.swing.JFrame {
    
    Controlador objControlador;     
    ClientesDAO objClientesDAO;    
    Validaciones objValidaciones = new Validaciones();
    Boolean numerico = false;
    Boolean numerico2 = false;
    
    public VistaCliente(Controlador objControlador) {
        
        initComponents();
        
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiciona la ventana en el centro
      
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
       
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        //setTitle("Shirley Patiño - Administradora");
        this.getContentPane().setBackground(Color.white);  // pone el fondo del frame de color Blanco
        
        TextPrompt placeHolder  = new TextPrompt("Nombre Cliente", txNombreCliente);
        TextPrompt placeHolder2  = new TextPrompt("Nit o Cédula", txCedulaNitCliente);
        TextPrompt placeHolder3  = new TextPrompt("Dirección", txDireccionCliente);
        TextPrompt placeHolder6  = new TextPrompt("Ciudad", txCiudadCliente);
        TextPrompt placeHolder4  = new TextPrompt("Email", txEmailCliente);
        TextPrompt placeHolder5  = new TextPrompt("Teléfono", txTelefonoCliente);
        
        UIManager uiManager = new UIManager();
        UIManager.put("tablaClientesA_B.background",Color.white);
        
        
        TablaRender renderer = new TablaRender();
        tablaClientesA_B.setDefaultRenderer(Object.class, renderer);
        tablaVistaClientes.setDefaultRenderer(Object.class, renderer);
       
        
    }
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Iconos/logoLune.ico"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClientesA_B = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txNombreCliente = new javax.swing.JTextField();
        txCedulaNitCliente = new javax.swing.JTextField();
        txDireccionCliente = new javax.swing.JTextField();
        txTelefonoCliente = new javax.swing.JTextField();
        txCiudadCliente = new javax.swing.JTextField();
        txEmailCliente = new javax.swing.JTextField();
        checkPublicidad = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVistaClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btPrincipalCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/floppy-disk_32.png"))); // NOI18N
        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/pencil.png"))); // NOI18N
        btnActualizar.setText("Editar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/error32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
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

        tablaClientesA_B.setBackground(new java.awt.Color(255, 255, 255));
        tablaClientesA_B.setForeground(new java.awt.Color(0, 0, 0));
        tablaClientesA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientesA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesA_BMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaClientesA_B);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txNombreCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCedulaNitCliente.setBackground(new java.awt.Color(255, 255, 255));
        txCedulaNitCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txDireccionCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txTelefonoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txTelefonoCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCiudadCliente.setBackground(new java.awt.Color(255, 255, 255));
        txCiudadCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        txEmailCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        checkPublicidad.setBackground(new java.awt.Color(255, 255, 255));
        checkPublicidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        checkPublicidad.setText("Desea recibir publicidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(txEmailCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txCiudadCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txCedulaNitCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNombreCliente, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txCedulaNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(checkPublicidad, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye.png"))); // NOI18N
        jButton3.setText("      Mostrar Clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tablaVistaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaVistaClientes);

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel11.setText("Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualizar Clientes", jPanel4);

        btPrincipalCrear.setBackground(new java.awt.Color(255, 255, 255));
        btPrincipalCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btPrincipalCrear.setText("Principal");
        btPrincipalCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrincipalCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPrincipalCrear)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 

    private void btPrincipalCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalCrearActionPerformed
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

    }//GEN-LAST:event_btPrincipalCrearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        objControlador.llenarTablaClientes(tablaVistaClientes);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaClientesA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesA_BMouseClicked
        int row = tablaClientesA_B.rowAtPoint(evt.getPoint());

        int reply = JOptionPane.showConfirmDialog(null, "Desea Editar o Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //Cuando Cancela        
        if (reply == JOptionPane.OK_CANCEL_OPTION) { 
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCrear.setEnabled(true);
            btnMostrar.setEnabled(true);
            
        }
        //Cuando Aprueba
        else if (reply == JOptionPane.OK_OPTION){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnMostrar.setEnabled(false);
            datosTablaCliente(row);
            
        }  
    }//GEN-LAST:event_tablaClientesA_BMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosCliente(3);
            JOptionPane.showMessageDialog(null, "Cliente Desactivado exitosamente", "Desactivacion Cliente",JOptionPane.INFORMATION_MESSAGE );
                   
        }
        limpiarCliente();
        //activarBotonesTodos(); 
        configuracionBotonesIniciales();
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosCliente(2);
            JOptionPane.showMessageDialog(null, "Cliente Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarCliente();
            //activarBotonesTodos();
            configuracionBotonesIniciales();
            
        } 
               
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaClientes(tablaClientesA_B);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosCliente(1);
            JOptionPane.showMessageDialog(null, "Cliente Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarCliente();            
        }
    }//GEN-LAST:event_btnCrearActionPerformed
     
    public void enviarDatosCliente(int opcion) {
        
        ArrayList<String> arrayClienteNuevo = new ArrayList<>();
        
        String publicidad = "no";
        if (checkPublicidad.isSelected()) {
            publicidad = "si";
        }
        
        arrayClienteNuevo.add(txNombreCliente.getText());
        arrayClienteNuevo.add(txCedulaNitCliente.getText());
        arrayClienteNuevo.add(txDireccionCliente.getText());
        arrayClienteNuevo.add(txTelefonoCliente.getText());
        arrayClienteNuevo.add(txCiudadCliente.getText());
        arrayClienteNuevo.add(txEmailCliente.getText());
        arrayClienteNuevo.add(publicidad);        
        
        switch (opcion) {
            case 1:
                objControlador.crearCliente(arrayClienteNuevo);
                break;
            case 2:
                objControlador.actualizarCliente(arrayClienteNuevo);
                break;
            case 3:
                objControlador.eliminarCliente(txCedulaNitCliente.getText());
                break;
            default:
                break;
        }
    }
    
    
    
    public void datosTablaCliente(int row) {        
        
        String nombreCliente = ((String) tablaClientesA_B.getValueAt(row, 0));
        String cedulaNitCliente = ((String) tablaClientesA_B.getValueAt(row, 1));
        String direccionCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 2)));
        String telefonoCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 3)));
        String ciudadCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 4)));
        String emailCliente = ((String) tablaClientesA_B.getValueAt(row, 5));
        String publicidad = ((String) tablaClientesA_B.getValueAt(row, 6));
        txNombreCliente.setText(nombreCliente);
        txCedulaNitCliente.setText(cedulaNitCliente);
        txDireccionCliente.setText(direccionCliente);
        txTelefonoCliente.setText(telefonoCliente);
        txCiudadCliente.setText(ciudadCliente);
        txEmailCliente.setText(emailCliente);
        
        if (publicidad.equalsIgnoreCase("si")) {
            checkPublicidad.setSelected(true);
        } else if (publicidad.equalsIgnoreCase("no")) {
            checkPublicidad.setSelected(false);
        }        
        
    }
    
    private void asignarTitulo() {
        
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
    
    
    public Boolean validaciones(){
        
        limpiarErrores();

        Boolean emailCorrecto = false;
        Boolean validacion = false;

        ArrayList<Integer> resultado = new ArrayList<>();

        resultado = objValidaciones.validarCamposVacios(validarCamposVacios2());
        

        if (resultado.size() != 0) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < resultado.size(); i++) {
            pintarErrores((resultado.get(i)));
        }

        numerico = objValidaciones.validarDatoNumerico(txTelefonoCliente.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txCedulaNitCliente.getText());
        if ((numerico == false || numerico2 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(3);
            }

            if (numerico2 == false) {
                pintarErrores(1);
            }

        }
        emailCorrecto = objValidaciones.emailCorrecto(txEmailCliente.getText());
        if (numerico == true && numerico2 == true && resultado.size() == 0 && emailCorrecto == false) {
            JOptionPane.showMessageDialog(this, "Ingrese Un correo Valido", "Campo Email Errado", JOptionPane.ERROR_MESSAGE);

            pintarErrores(5);
        }

        if (numerico == true && numerico2 == true && emailCorrecto == true && resultado.size() == 0) {
             validacion = true;            
        }        
        return validacion;
    }
   
    
    public void limpiarCliente() {
        txNombreCliente.setText("");
        txCedulaNitCliente.setText("");
        txDireccionCliente.setText("");
        txTelefonoCliente.setText("");
        txCiudadCliente.setText("");
        txEmailCliente.setText("");
        checkPublicidad.setSelected(false);        
    }    
    
    
    private ArrayList validarCamposVacios2() {     
                
        ArrayList arregloCamposClientes = new ArrayList<>();        
        arregloCamposClientes.add(txNombreCliente.getText());
        arregloCamposClientes.add(txCedulaNitCliente.getText());
        arregloCamposClientes.add(txDireccionCliente.getText());
        arregloCamposClientes.add(txTelefonoCliente.getText());
        arregloCamposClientes.add(txCiudadCliente.getText());
        arregloCamposClientes.add(txEmailCliente.getText());     
                
        return arregloCamposClientes;
    }
    
    public void pintarErrores(int num) {

        switch (num) {

            case 0:
                txNombreCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 1:
                txCedulaNitCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 2:
                txDireccionCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 3:
                txTelefonoCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 4:
                txCiudadCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 5:
                txEmailCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

        }

    }
    
    public void limpiarErrores() {

        txNombreCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCedulaNitCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDireccionCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txTelefonoCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCiudadCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txEmailCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPrincipalCrear;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    public javax.swing.JCheckBox checkPublicidad;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaClientesA_B;
    private javax.swing.JTable tablaVistaClientes;
    public javax.swing.JTextField txCedulaNitCliente;
    public javax.swing.JTextField txCiudadCliente;
    public javax.swing.JTextField txDireccionCliente;
    public javax.swing.JTextField txEmailCliente;
    public javax.swing.JTextField txNombreCliente;
    public javax.swing.JTextField txTele/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ModeloDAO.ClientesDAO;
import Controlador.*;
import Validaciones.Validaciones;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ALLCH
 */
public class VistaCliente extends javax.swing.JFrame {
    
    Controlador objControlador;     
    ClientesDAO objClientesDAO;    
    Validaciones objValidaciones = new Validaciones();
    Boolean numerico = false;
    Boolean numerico2 = false;
    
    public VistaCliente(Controlador objControlador) {
        
        initComponents();
        
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiciona la ventana en el centro
      
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
       
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        //setTitle("Shirley Patiño - Administradora");
        this.getContentPane().setBackground(Color.white);  // pone el fondo del frame de color Blanco
        
        TextPrompt placeHolder  = new TextPrompt("Nombre Cliente", txNombreCliente);
        TextPrompt placeHolder2  = new TextPrompt("Nit o Cédula", txCedulaNitCliente);
        TextPrompt placeHolder3  = new TextPrompt("Dirección", txDireccionCliente);
        TextPrompt placeHolder6  = new TextPrompt("Ciudad", txCiudadCliente);
        TextPrompt placeHolder4  = new TextPrompt("Email", txEmailCliente);
        TextPrompt placeHolder5  = new TextPrompt("Teléfono", txTelefonoCliente);
        
        UIManager uiManager = new UIManager();
        UIManager.put("tablaClientesA_B.background",Color.white);
        
        
        TablaRender renderer = new TablaRender();
        tablaClientesA_B.setDefaultRenderer(Object.class, renderer);
        tablaVistaClientes.setDefaultRenderer(Object.class, renderer);
       
        
    }
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Iconos/logoLune.ico"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClientesA_B = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txNombreCliente = new javax.swing.JTextField();
        txCedulaNitCliente = new javax.swing.JTextField();
        txDireccionCliente = new javax.swing.JTextField();
        txTelefonoCliente = new javax.swing.JTextField();
        txCiudadCliente = new javax.swing.JTextField();
        txEmailCliente = new javax.swing.JTextField();
        checkPublicidad = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVistaClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btPrincipalCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/floppy-disk_32.png"))); // NOI18N
        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/pencil.png"))); // NOI18N
        btnActualizar.setText("Editar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/error32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
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

        tablaClientesA_B.setBackground(new java.awt.Color(255, 255, 255));
        tablaClientesA_B.setForeground(new java.awt.Color(0, 0, 0));
        tablaClientesA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientesA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesA_BMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaClientesA_B);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txNombreCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCedulaNitCliente.setBackground(new java.awt.Color(255, 255, 255));
        txCedulaNitCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txDireccionCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txTelefonoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txTelefonoCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCiudadCliente.setBackground(new java.awt.Color(255, 255, 255));
        txCiudadCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        txEmailCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        checkPublicidad.setBackground(new java.awt.Color(255, 255, 255));
        checkPublicidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        checkPublicidad.setText("Desea recibir publicidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(txEmailCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txCiudadCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txCedulaNitCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNombreCliente, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txCedulaNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(checkPublicidad, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye.png"))); // NOI18N
        jButton3.setText("      Mostrar Clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tablaVistaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaVistaClientes);

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel11.setText("Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualizar Clientes", jPanel4);

        btPrincipalCrear.setBackground(new java.awt.Color(255, 255, 255));
        btPrincipalCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btPrincipalCrear.setText("Principal");
        btPrincipalCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrincipalCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPrincipalCrear)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 

    private void btPrincipalCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalCrearActionPerformed
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

    }//GEN-LAST:event_btPrincipalCrearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        objControlador.llenarTablaClientes(tablaVistaClientes);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaClientesA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesA_BMouseClicked
        int row = tablaClientesA_B.rowAtPoint(evt.getPoint());

        int reply = JOptionPane.showConfirmDialog(null, "Desea Editar o Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //Cuando Cancela        
        if (reply == JOptionPane.OK_CANCEL_OPTION) { 
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCrear.setEnabled(true);
            btnMostrar.setEnabled(true);
            
        }
        //Cuando Aprueba
        else if (reply == JOptionPane.OK_OPTION){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnMostrar.setEnabled(false);
            datosTablaCliente(row);
            
        }  
    }//GEN-LAST:event_tablaClientesA_BMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosCliente(3);
            JOptionPane.showMessageDialog(null, "Cliente Desactivado exitosamente", "Desactivacion Cliente",JOptionPane.INFORMATION_MESSAGE );
                   
        }
        limpiarCliente();
        //activarBotonesTodos(); 
        configuracionBotonesIniciales();
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosCliente(2);
            JOptionPane.showMessageDialog(null, "Cliente Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarCliente();
            //activarBotonesTodos();
            configuracionBotonesIniciales();
            
        } 
               
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaClientes(tablaClientesA_B);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosCliente(1);
            JOptionPane.showMessageDialog(null, "Cliente Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarCliente();            
        }
    }//GEN-LAST:event_btnCrearActionPerformed
     
    public void enviarDatosCliente(int opcion) {
        
        ArrayList<String> arrayClienteNuevo = new ArrayList<>();
        
        String publicidad = "no";
        if (checkPublicidad.isSelected()) {
            publicidad = "si";
        }
        
        arrayClienteNuevo.add(txNombreCliente.getText());
        arrayClienteNuevo.add(txCedulaNitCliente.getText());
        arrayClienteNuevo.add(txDireccionCliente.getText());
        arrayClienteNuevo.add(txTelefonoCliente.getText());
        arrayClienteNuevo.add(txCiudadCliente.getText());
        arrayClienteNuevo.add(txEmailCliente.getText());
        arrayClienteNuevo.add(publicidad);        
        
        switch (opcion) {
            case 1:
                objControlador.crearCliente(arrayClienteNuevo);
                break;
            case 2:
                objControlador.actualizarCliente(arrayClienteNuevo);
                break;
            case 3:
                objControlador.eliminarCliente(txCedulaNitCliente.getText());
                break;
            default:
                break;
        }
    }
    
    
    
    public void datosTablaCliente(int row) {        
        
        String nombreCliente = ((String) tablaClientesA_B.getValueAt(row, 0));
        String cedulaNitCliente = ((String) tablaClientesA_B.getValueAt(row, 1));
        String direccionCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 2)));
        String telefonoCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 3)));
        String ciudadCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 4)));
        String emailCliente = ((String) tablaClientesA_B.getValueAt(row, 5));
        String publicidad = ((String) tablaClientesA_B.getValueAt(row, 6));
        txNombreCliente.setText(nombreCliente);
        txCedulaNitCliente.setText(cedulaNitCliente);
        txDireccionCliente.setText(direccionCliente);
        txTelefonoCliente.setText(telefonoCliente);
        txCiudadCliente.setText(ciudadCliente);
        txEmailCliente.setText(emailCliente);
        
        if (publicidad.equalsIgnoreCase("si")) {
            checkPublicidad.setSelected(true);
        } else if (publicidad.equalsIgnoreCase("no")) {
            checkPublicidad.setSelected(false);
        }        
        
    }
    
    private void asignarTitulo() {
        
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
    
    
    public Boolean validaciones(){
        
        limpiarErrores();

        Boolean emailCorrecto = false;
        Boolean validacion = false;

        ArrayList<Integer> resultado = new ArrayList<>();

        resultado = objValidaciones.validarCamposVacios(validarCamposVacios2());
        

        if (resultado.size() != 0) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < resultado.size(); i++) {
            pintarErrores((resultado.get(i)));
        }

        numerico = objValidaciones.validarDatoNumerico(txTelefonoCliente.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txCedulaNitCliente.getText());
        if ((numerico == false || numerico2 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(3);
            }

            if (numerico2 == false) {
                pintarErrores(1);
            }

        }
        emailCorrecto = objValidaciones.emailCorrecto(txEmailCliente.getText());
        if (numerico == true && numerico2 == true && resultado.size() == 0 && emailCorrecto == false) {
            JOptionPane.showMessageDialog(this, "Ingrese Un correo Valido", "Campo Email Errado", JOptionPane.ERROR_MESSAGE);

            pintarErrores(5);
        }

        if (numerico == true && numerico2 == true && emailCorrecto == true && resultado.size() == 0) {
             validacion = true;            
        }        
        return validacion;
    }
   
    
    public void limpiarCliente() {
        txNombreCliente.setText("");
        txCedulaNitCliente.setText("");
        txDireccionCliente.setText("");
        txTelefonoCliente.setText("");
        txCiudadCliente.setText("");
        txEmailCliente.setText("");
        checkPublicidad.setSelected(false);        
    }    
    
    
    private ArrayList validarCamposVacios2() {     
                
        ArrayList arregloCamposClientes = new ArrayList<>();        
        arregloCamposClientes.add(txNombreCliente.getText());
        arregloCamposClientes.add(txCedulaNitCliente.getText());
        arregloCamposClientes.add(txDireccionCliente.getText());
        arregloCamposClientes.add(txTelefonoCliente.getText());
        arregloCamposClientes.add(txCiudadCliente.getText());
        arregloCamposClientes.add(txEmailCliente.getText());     
                
        return arregloCamposClientes;
    }
    
    public void pintarErrores(int num) {

        switch (num) {

            case 0:
                txNombreCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 1:
                txCedulaNitCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 2:
                txDireccionCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 3:
                txTelefonoCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 4:
                txCiudadCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 5:
                txEmailCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

        }

    }
    
    public void limpiarErrores() {

        txNombreCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCedulaNitCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDireccionCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txTelefonoCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCiudadCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txEmailCliente.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPrincipalCrear;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    public javax.swing.JCheckBox checkPublicidad;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaClientesA_B;
    private javax.swing.JTable tablaVistaClientes;
    public javax.swing.JTextField txCedulaNitCliente;
    public javax.swing.JTextField txCiudadCliente;
    public javax.swing.JTextField txDireccionCliente;
    public javax.swing.JTextField txEmailCliente;
    public javax.swing.JTextField txNombreCliente;
    public javax.swing.JTextField txTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
