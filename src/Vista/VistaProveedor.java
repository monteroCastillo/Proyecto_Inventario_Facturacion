/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Validaciones.Validaciones;
import Controlador.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class VistaProveedor extends javax.swing.JFrame {
    
    Controlador objControlador;
    Validaciones objValidaciones = new Validaciones();
    private static VistaProveedor objEmpleado;
    
    public VistaProveedor(Controlador objControlador) {
        initComponents();
        
        this.getContentPane().setBackground(Color.white);  // pone el fondo del frame de color Blanco
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        asignarTitulo();        
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        TextPrompt placeHolder  = new TextPrompt("Nombre Proveedor", txNombreProveedor);
        TextPrompt placeHolder2  = new TextPrompt("Nit Proveedor", txNitProveedor);
        TextPrompt placeHolder3  = new TextPrompt("Dirección", txDireccionProveedor);
        TextPrompt placeHolder6  = new TextPrompt("Teléfono", txtelefonoProveedor);
        TextPrompt placeHolder4  = new TextPrompt("Ciudad", txCiudadProveedor);
        TextPrompt placeHolder5  = new TextPrompt("eMail Proveedor", txEmailProveedor);
        
        // Las filas de la tabla queda con colores intercalados
        TablaRender renderer = new TablaRender();
        tablaProveedoresA_B.setDefaultRenderer(Object.class, renderer);
        tablaProveedores.setDefaultRenderer(Object.class, renderer);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProveedoresA_B = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txNombreProveedor = new javax.swing.JTextField();
        txNitProveedor = new javax.swing.JTextField();
        txDireccionProveedor = new javax.swing.JTextField();
        txtelefonoProveedor = new javax.swing.JTextField();
        txCiudadProveedor = new javax.swing.JTextField();
        txEmailProveedor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnMostrarProveedores = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tablaProveedoresA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProveedoresA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresA_BMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProveedoresA_B);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txNombreProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txNitProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDireccionProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtelefonoProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCiudadProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txEmailProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txDireccionProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txNitProveedor)
                    .addComponent(txEmailProveedor)
                    .addComponent(txCiudadProveedor)
                    .addComponent(txtelefonoProveedor)
                    .addComponent(txNombreProveedor))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCiudadProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        jTabbedPane1.addTab("Proveedor", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnMostrarProveedores.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnMostrarProveedores.setText("Mostrar Proveedores");
        btnMostrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProveedoresActionPerformed(evt);
            }
        });

        tablaProveedores.setBackground(new java.awt.Color(255, 255, 255));
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaProveedores);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vista Proveedores", jPanel4);

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnMostrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProveedoresActionPerformed
        objControlador.llenarTablaProveedores(tablaProveedores);
    }//GEN-LAST:event_btnMostrarProveedoresActionPerformed

    private void tablaProveedoresA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresA_BMouseClicked
        int row = tablaProveedoresA_B.rowAtPoint(evt.getPoint());
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Editar o Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //Cuando Cancela        
        if (reply == JOptionPane.OK_CANCEL_OPTION) {            
            System.out.println("Cancelo !!!!!");
        }
        //Cuando Aprueba
        else if (reply == JOptionPane.OK_OPTION){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnMostrar.setEnabled(false);
            datosTablaProveedor(row);
            System.out.println("Aprobo !!!!!");
        } 
    }//GEN-LAST:event_tablaProveedoresA_BMouseClicked

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProveedores(1);
            JOptionPane.showMessageDialog(null, "Proveedor Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProveedor();
            
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaProveedores(tablaProveedoresA_B);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProveedores(2);
            JOptionPane.showMessageDialog(null, "Proveedor Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProveedor();
            configuracionBotonesIniciales();
            
        }       
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosProveedores(3);
            JOptionPane.showMessageDialog(null, "Proveedor Desactivado exitosamente", "Desactivacion Empleado",JOptionPane.INFORMATION_MESSAGE );
                   
        }
        limpiarProveedor();
        configuracionBotonesIniciales();
               
    }//GEN-LAST:event_btnEliminarActionPerformed
    
   
    
    public void enviarDatosProveedores(int opcion) {
        
        ArrayList<String> arrayProveedorNuevo = new ArrayList<>();
        
        arrayProveedorNuevo.add(txNombreProveedor.getText());
        arrayProveedorNuevo.add(txNitProveedor.getText());
        arrayProveedorNuevo.add(txDireccionProveedor.getText());
        arrayProveedorNuevo.add(txtelefonoProveedor.getText());
        arrayProveedorNuevo.add(txCiudadProveedor.getText());
        arrayProveedorNuevo.add(txEmailProveedor.getText());
        
        objControlador.crearProveedor(arrayProveedorNuevo);
        
        switch (opcion) {
            case 1:
                objControlador.crearProveedor(arrayProveedorNuevo);
                break;
            case 2:
                objControlador.actualizarProveedor(arrayProveedorNuevo);
                break;
            case 3:
                objControlador.eliminarProveedor(txNitProveedor.getText());
                break;
            default:
                break;
        }
        
    }
    
    public void datosTablaProveedor(int row) {
        
        String nombreProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 0));
        String nitProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 1));
        String direccionProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 2)));
        String telefonoProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 3)));
        String ciudadProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 4)));
        String emailProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 5));
        
        txNombreProveedor.setText(nombreProveedor);
        txNitProveedor.setText(nitProveedor);
        txDireccionProveedor.setText(direccionProveedor);
        txtelefonoProveedor.setText(telefonoProveedor + "");
        txCiudadProveedor.setText(ciudadProveedor + "");
        txEmailProveedor.setText(emailProveedor);
    }             
    
    private void asignarTitulo(){
      
        setTitle(objControlador.empleadoSesionAbierta());     
       
    }
    
    private void configuracionBotonesIniciales(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    private void activarBotonesTodos(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    public Boolean validaciones(){
        
        limpiarErrores();
        Boolean numerico = false;
        Boolean numerico2 = false;
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

        numerico = objValidaciones.validarDatoNumerico(txNitProveedor.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txtelefonoProveedor.getText());
        if ((numerico == false || numerico2 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(1);
            }

            if (numerico2 == false) {
                pintarErrores(3);
            }

        }
        emailCorrecto = objValidaciones.emailCorrecto(txEmailProveedor.getText());
        if (numerico == true && numerico2 == true && resultado.size() == 0 && emailCorrecto == false) {
            JOptionPane.showMessageDialog(this, "Ingrese Un correo Valido", "Campo Email Errado", JOptionPane.ERROR_MESSAGE);

            pintarErrores(5);
        }

        if (numerico == true && numerico2 == true && emailCorrecto == true && resultado.size() == 0) {
            validacion = true;
            
        }
        
        return validacion;
    }
    
    public void limpiarProveedor(){
        
        txNombreProveedor.setText("");
        txNitProveedor.setText("");
        txDireccionProveedor.setText("");
        txtelefonoProveedor.setText("");
        txCiudadProveedor.setText("");
        txEmailProveedor.setText("");     
              
    }
    
    private ArrayList validarCamposVacios2() {
        
        Boolean valido = false;  
        
        ArrayList arregloCamposProveedores = new ArrayList<>();        
        arregloCamposProveedores.add(txNombreProveedor.getText());
        arregloCamposProveedores.add(txNitProveedor.getText());
        arregloCamposProveedores.add(txDireccionProveedor.getText());
        arregloCamposProveedores.add(txtelefonoProveedor.getText());
        arregloCamposProveedores.add(txCiudadProveedor.getText());
        arregloCamposProveedores.add(txEmailProveedor.getText());     
                
        return arregloCamposProveedores;
    }
    
    public void pintarErrores(int num){
        
        switch(num){
            case 0: txNombreProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 1: txNitProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 2: txDireccionProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 3: txtelefonoProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 4: txCiudadProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 5: txEmailProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
            
            
        }
        
    }
    
    public void limpiarErrores() {

        txNombreProveedor.setBorder(BorderFactory.createLineBorder(new Color(/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Validaciones.Validaciones;
import Controlador.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class VistaProveedor extends javax.swing.JFrame {
    
    Controlador objControlador;
    Validaciones objValidaciones = new Validaciones();
    private static VistaProveedor objEmpleado;
    
    public VistaProveedor(Controlador objControlador) {
        initComponents();
        
        this.getContentPane().setBackground(Color.white);  // pone el fondo del frame de color Blanco
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        asignarTitulo();        
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        TextPrompt placeHolder  = new TextPrompt("Nombre Proveedor", txNombreProveedor);
        TextPrompt placeHolder2  = new TextPrompt("Nit Proveedor", txNitProveedor);
        TextPrompt placeHolder3  = new TextPrompt("Dirección", txDireccionProveedor);
        TextPrompt placeHolder6  = new TextPrompt("Teléfono", txtelefonoProveedor);
        TextPrompt placeHolder4  = new TextPrompt("Ciudad", txCiudadProveedor);
        TextPrompt placeHolder5  = new TextPrompt("eMail Proveedor", txEmailProveedor);
        
        // Las filas de la tabla queda con colores intercalados
        TablaRender renderer = new TablaRender();
        tablaProveedoresA_B.setDefaultRenderer(Object.class, renderer);
        tablaProveedores.setDefaultRenderer(Object.class, renderer);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProveedoresA_B = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txNombreProveedor = new javax.swing.JTextField();
        txNitProveedor = new javax.swing.JTextField();
        txDireccionProveedor = new javax.swing.JTextField();
        txtelefonoProveedor = new javax.swing.JTextField();
        txCiudadProveedor = new javax.swing.JTextField();
        txEmailProveedor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnMostrarProveedores = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tablaProveedoresA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProveedoresA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresA_BMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProveedoresA_B);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txNombreProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txNitProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDireccionProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtelefonoProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCiudadProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txEmailProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txDireccionProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txNitProveedor)
                    .addComponent(txEmailProveedor)
                    .addComponent(txCiudadProveedor)
                    .addComponent(txtelefonoProveedor)
                    .addComponent(txNombreProveedor))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCiudadProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        jTabbedPane1.addTab("Proveedor", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnMostrarProveedores.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnMostrarProveedores.setText("Mostrar Proveedores");
        btnMostrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProveedoresActionPerformed(evt);
            }
        });

        tablaProveedores.setBackground(new java.awt.Color(255, 255, 255));
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaProveedores);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vista Proveedores", jPanel4);

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnMostrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProveedoresActionPerformed
        objControlador.llenarTablaProveedores(tablaProveedores);
    }//GEN-LAST:event_btnMostrarProveedoresActionPerformed

    private void tablaProveedoresA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresA_BMouseClicked
        int row = tablaProveedoresA_B.rowAtPoint(evt.getPoint());
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Editar o Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        //Cuando Cancela        
        if (reply == JOptionPane.OK_CANCEL_OPTION) {            
            System.out.println("Cancelo !!!!!");
        }
        //Cuando Aprueba
        else if (reply == JOptionPane.OK_OPTION){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCrear.setEnabled(false);
            btnMostrar.setEnabled(false);
            datosTablaProveedor(row);
            System.out.println("Aprobo !!!!!");
        } 
    }//GEN-LAST:event_tablaProveedoresA_BMouseClicked

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProveedores(1);
            JOptionPane.showMessageDialog(null, "Proveedor Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProveedor();
            
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaProveedores(tablaProveedoresA_B);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProveedores(2);
            JOptionPane.showMessageDialog(null, "Proveedor Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProveedor();
            configuracionBotonesIniciales();
            
        }       
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosProveedores(3);
            JOptionPane.showMessageDialog(null, "Proveedor Desactivado exitosamente", "Desactivacion Empleado",JOptionPane.INFORMATION_MESSAGE );
                   
        }
        limpiarProveedor();
        configuracionBotonesIniciales();
               
    }//GEN-LAST:event_btnEliminarActionPerformed
    
   
    
    public void enviarDatosProveedores(int opcion) {
        
        ArrayList<String> arrayProveedorNuevo = new ArrayList<>();
        
        arrayProveedorNuevo.add(txNombreProveedor.getText());
        arrayProveedorNuevo.add(txNitProveedor.getText());
        arrayProveedorNuevo.add(txDireccionProveedor.getText());
        arrayProveedorNuevo.add(txtelefonoProveedor.getText());
        arrayProveedorNuevo.add(txCiudadProveedor.getText());
        arrayProveedorNuevo.add(txEmailProveedor.getText());
        
        objControlador.crearProveedor(arrayProveedorNuevo);
        
        switch (opcion) {
            case 1:
                objControlador.crearProveedor(arrayProveedorNuevo);
                break;
            case 2:
                objControlador.actualizarProveedor(arrayProveedorNuevo);
                break;
            case 3:
                objControlador.eliminarProveedor(txNitProveedor.getText());
                break;
            default:
                break;
        }
        
    }
    
    public void datosTablaProveedor(int row) {
        
        String nombreProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 0));
        String nitProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 1));
        String direccionProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 2)));
        String telefonoProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 3)));
        String ciudadProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 4)));
        String emailProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 5));
        
        txNombreProveedor.setText(nombreProveedor);
        txNitProveedor.setText(nitProveedor);
        txDireccionProveedor.setText(direccionProveedor);
        txtelefonoProveedor.setText(telefonoProveedor + "");
        txCiudadProveedor.setText(ciudadProveedor + "");
        txEmailProveedor.setText(emailProveedor);
    }             
    
    private void asignarTitulo(){
      
        setTitle(objControlador.empleadoSesionAbierta());     
       
    }
    
    private void configuracionBotonesIniciales(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    private void activarBotonesTodos(){
        btnCrear.setEnabled(true);
        btnMostrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    public Boolean validaciones(){
        
        limpiarErrores();
        Boolean numerico = false;
        Boolean numerico2 = false;
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

        numerico = objValidaciones.validarDatoNumerico(txNitProveedor.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txtelefonoProveedor.getText());
        if ((numerico == false || numerico2 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(1);
            }

            if (numerico2 == false) {
                pintarErrores(3);
            }

        }
        emailCorrecto = objValidaciones.emailCorrecto(txEmailProveedor.getText());
        if (numerico == true && numerico2 == true && resultado.size() == 0 && emailCorrecto == false) {
            JOptionPane.showMessageDialog(this, "Ingrese Un correo Valido", "Campo Email Errado", JOptionPane.ERROR_MESSAGE);

            pintarErrores(5);
        }

        if (numerico == true && numerico2 == true && emailCorrecto == true && resultado.size() == 0) {
            validacion = true;
            
        }
        
        return validacion;
    }
    
    public void limpiarProveedor(){
        
        txNombreProveedor.setText("");
        txNitProveedor.setText("");
        txDireccionProveedor.setText("");
        txtelefonoProveedor.setText("");
        txCiudadProveedor.setText("");
        txEmailProveedor.setText("");     
              
    }
    
    private ArrayList validarCamposVacios2() {
        
        Boolean valido = false;  
        
        ArrayList arregloCamposProveedores = new ArrayList<>();        
        arregloCamposProveedores.add(txNombreProveedor.getText());
        arregloCamposProveedores.add(txNitProveedor.getText());
        arregloCamposProveedores.add(txDireccionProveedor.getText());
        arregloCamposProveedores.add(txtelefonoProveedor.getText());
        arregloCamposProveedores.add(txCiudadProveedor.getText());
        arregloCamposProveedores.add(txEmailProveedor.getText());     
                
        return arregloCamposProveedores;
    }
    
    public void pintarErrores(int num){
        
        switch(num){
            case 0: txNombreProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 1: txNitProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 2: txDireccionProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 3: txtelefonoProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 4: txCiudadProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
                    
            case 5: txEmailProveedor.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    break;
            
            
        }
        
    }
    
    public void limpiarErrores() {

        txNombreProveedor.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txNitProveedor.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDireccionProveedor.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txtelefonoProveedor.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCiudadProveedor.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txEmailProveedor.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarProveedores;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable tablaProveedores;
    private javax.swing.JTable tablaProveedoresA_B;
    public javax.swing.JTextField txCiudadProveedor;
    private javax.swing.JTextField txDireccionProveedor;
    public javax.swing.JTextField txEmailProveedor;
    public javax.swing.JTextField txNitProveedor;
    public javax.swing.JTextField txNombreProveedor;
    public javax.swing.JTextField txtelefonoProveedor;
    // End of variables declaration//GEN-END:variables

   
}
