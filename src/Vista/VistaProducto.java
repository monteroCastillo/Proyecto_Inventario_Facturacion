


package Vista;

import Validaciones.Validaciones;
import javax.swing.JOptionPane;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductosVO;
import Controlador.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class VistaProducto extends javax.swing.JFrame {

    Controlador objControlador;     
    ProductoDAO objProductoDAO;
    Validaciones objValidaciones = new Validaciones();
    ArrayList<String> listaProducto = new ArrayList();   
    
    
    public VistaProducto(Controlador objControlador) {
    
        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        
        btnActualizar.setEnabled(false);              
        btnEliminar.setEnabled(false);       
        
        TextPrompt placeHolder  = new TextPrompt("Nombre Producto", txNombreProducto3);
        TextPrompt placeHolder2  = new TextPrompt("Código", txCodigoProducto3);
        TextPrompt placeHolder3  = new TextPrompt("Cantidad", txCantidadProducto3);
        TextPrompt placeHolder4  = new TextPrompt("Valor Compra", txValorCompraProducto3);
        TextPrompt placeHolder5  = new TextPrompt("Valor Venta", txValorVentaProducto3);
        TextPrompt placeHolder6  = new TextPrompt("Proveedor Producto", txProveedor3);
        TextPrompt placeHolder7  = new TextPrompt("Descripción", txDescripcionProducto3);
        
        asignarTitulo();
        
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        TablaRender renderer = new TablaRender();
        tablaProductos3.setDefaultRenderer(Object.class, renderer);
    }

    /**
     *
     * @return
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Iconos/logoLune.ico"));
        return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextProducto = new javax.swing.JPanel();
        txNombreProducto3 = new javax.swing.JTextField();
        txCodigoProducto3 = new javax.swing.JTextField();
        txCantidadProducto3 = new javax.swing.JTextField();
        txValorCompraProducto3 = new javax.swing.JTextField();
        txValorVentaProducto3 = new javax.swing.JTextField();
        txProveedor3 = new javax.swing.JTextField();
        txDescripcionProducto3 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaProductos3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnMostrarProductos = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaVistaProductos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(719, 620));

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setToolTipText("Vuelve al Menu Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 384));

        jTextProducto.setBackground(new java.awt.Color(255, 255, 255));

        txNombreProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCodigoProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txCodigoProducto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoProducto3ActionPerformed(evt);
            }
        });

        txCantidadProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txValorCompraProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txValorVentaProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txProveedor3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDescripcionProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jTextProductoLayout = new javax.swing.GroupLayout(jTextProducto);
        jTextProducto.setLayout(jTextProductoLayout);
        jTextProductoLayout.setHorizontalGroup(
            jTextProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNombreProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txCodigoProducto3)
                    .addComponent(txCantidadProducto3)
                    .addComponent(txValorCompraProducto3)
                    .addComponent(txValorVentaProducto3)
                    .addComponent(txProveedor3)
                    .addComponent(txDescripcionProducto3))
                .addContainerGap())
        );
        jTextProductoLayout.setVerticalGroup(
            jTextProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNombreProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCodigoProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCantidadProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txValorCompraProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txValorVentaProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDescripcionProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tablaProductos3.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductos3.setForeground(new java.awt.Color(0, 0, 0));
        tablaProductos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductos3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaProductos3);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Producto", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel14.setText("Visualizar Productos");

        btnMostrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye32.png"))); // NOI18N
        btnMostrarProductos.setText("MostrarProductos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        tablaVistaProductos.setBackground(new java.awt.Color(255, 255, 255));
        tablaVistaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaVistaProductos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(btnMostrarProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Visualizar  Productos", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosProducto(3);
            JOptionPane.showMessageDialog(null, "Producto Desactivado exitosamente", "Desactivacion Producto",JOptionPane.INFORMATION_MESSAGE );
                   
        }
        limpiarProducto();
        configuracionBotonesIniciales();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProducto(2);
            JOptionPane.showMessageDialog(null, "Producto Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProducto();
            configuracionBotonesIniciales();
            
        } 
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaProductos3, consulta);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
                
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProducto(1);
            JOptionPane.showMessageDialog(null, "Producto Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProducto();            
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void tablaProductos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductos3MouseClicked
        int row = tablaProductos3.rowAtPoint(evt.getPoint());

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
            datosTablaProducto(row);
            
        }  
    }//GEN-LAST:event_tablaProductos3MouseClicked

    private void txCodigoProducto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoProducto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoProducto3ActionPerformed

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

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaVistaProductos, consulta);
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    public void datosTablaProducto(int row) {        
        
        String nombreProducto = ((String) tablaProductos3.getValueAt(row, 0));
        String codigoProducto = ((String) tablaProductos3.getValueAt(row, 1));
        String cantidad = (String.valueOf(tablaProductos3.getValueAt(row, 2)));
        String valorCompraProducto = (String.valueOf(tablaProductos3.getValueAt(row, 3)));
        String valorVentaProducto = (String.valueOf(tablaProductos3.getValueAt(row, 4)));
        String proveedor = ((String) tablaProductos3.getValueAt(row, 5));
        String descripcion = ((String) tablaProductos3.getValueAt(row, 6));
        txNombreProducto3.setText(nombreProducto);
        txCodigoProducto3.setText(codigoProducto);
        txCantidadProducto3.setText(cantidad + "");
        txValorVentaProducto3.setText(valorVentaProducto + "");
        txValorCompraProducto3.setText(valorCompraProducto + "");
        txProveedor3.setText(proveedor);
        txDescripcionProducto3.setText(descripcion);        
        
    }
    
    public void enviarDatosProducto(int opcion) {
        
        ArrayList<String> arrayProductoNuevo = new ArrayList<>();
        
        arrayProductoNuevo.add(txNombreProducto3.getText());
        arrayProductoNuevo.add(txCodigoProducto3.getText());
        arrayProductoNuevo.add(txCantidadProducto3.getText());
        arrayProductoNuevo.add(txValorCompraProducto3.getText());
        arrayProductoNuevo.add(txValorVentaProducto3.getText());
        arrayProductoNuevo.add(txProveedor3.getText());
        arrayProductoNuevo.add(txDescripcionProducto3.getText());
        
        //objControlador.crearProducto(arrayProductoNuevo);
        
        switch (opcion) {
            case 1:
                objControlador.crearProducto(arrayProductoNuevo);
                break;
            case 2:
                objControlador.actualizarProducto(arrayProductoNuevo);
                break;
            case 3:
                objControlador.eliminarProducto(txCodigoProducto3.getText());
                break;
            default:
                break;
        }
        
    }
    
    private void asignarTitulo() {
        
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
        
        Boolean validacion = false;
        Boolean numerico = false;
        Boolean numerico2 = false;
        Boolean numerico3 = false;

        Boolean emailCorrecto = false;

        ArrayList<Integer> resultado = new ArrayList<>();

        resultado = objValidaciones.validarCamposVacios(validarCamposVacios2());
        

        if (resultado.size() != 0) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < resultado.size(); i++) {
            pintarErrores((resultado.get(i)));
        }

        numerico = objValidaciones.validarDatoNumerico(txCantidadProducto3.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txValorCompraProducto3.getText());
        numerico3 = objValidaciones.validarDatoNumerico(txValorVentaProducto3.getText());
        if ((numerico == false || numerico2 == false || numerico3 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(2);
            }

            if (numerico2 == false) {
                pintarErrores(3);
            }
            
            if (numerico3 == false) {
                pintarErrores(4);
            }

        }
        

        if (numerico == true && numerico2 == true && numerico3 == true && resultado.size() == 0) {
            validacion = true;
        }
        return validacion;
    }
    
    public void limpiarProducto() {
        txNombreProducto3.setText("");
        txCodigoProducto3.setText("");
        txCantidadProducto3.setText("");
        txValorCompraProducto3.setText("");
        txValorVentaProducto3.setText("");
        txProveedor3.setText("");
        txDescripcionProducto3.setText("");     
    }
    
    private ArrayList validarCamposVacios2() {     
                
        ArrayList arregloCamposProductos = new ArrayList<>();        
        arregloCamposProductos.add(txNombreProducto3.getText());
        arregloCamposProductos.add(txCodigoProducto3.getText());
        arregloCamposProductos.add(txCantidadProducto3.getText());
        arregloCamposProductos.add(txValorCompraProducto3.getText());
        arregloCamposProductos.add(txValorVentaProducto3.getText());
        arregloCamposProductos.add(txProveedor3.getText());
        arregloCamposProductos.add(txDescripcionProducto3.getText());     
                
        return arregloCamposProductos;
    }
    
    public void pintarErrores(int num) {

        switch (num) {

            case 0:
                txNombreProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 1:
                txCodigoProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 2:
                txCantidadProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 3:
                txValorCompraProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;
            
            case 4:
                txValorVentaProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break; 
                
            case 5:
                txProveedor3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 6:
                txDescripcionProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;
        }

    }
    
    public void limpiarErrores() {

        txNombreProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCodigoProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCantidadProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txValorCompraProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));
        
        txValorVentaProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txProveedor3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDescripcionProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScro


package Vista;

import Validaciones.Validaciones;
import javax.swing.JOptionPane;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductosVO;
import Controlador.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class VistaProducto extends javax.swing.JFrame {

    Controlador objControlador;     
    ProductoDAO objProductoDAO;
    Validaciones objValidaciones = new Validaciones();
    ArrayList<String> listaProducto = new ArrayList();   
    
    
    public VistaProducto(Controlador objControlador) {
    
        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        
        btnActualizar.setEnabled(false);              
        btnEliminar.setEnabled(false);       
        
        TextPrompt placeHolder  = new TextPrompt("Nombre Producto", txNombreProducto3);
        TextPrompt placeHolder2  = new TextPrompt("Código", txCodigoProducto3);
        TextPrompt placeHolder3  = new TextPrompt("Cantidad", txCantidadProducto3);
        TextPrompt placeHolder4  = new TextPrompt("Valor Compra", txValorCompraProducto3);
        TextPrompt placeHolder5  = new TextPrompt("Valor Venta", txValorVentaProducto3);
        TextPrompt placeHolder6  = new TextPrompt("Proveedor Producto", txProveedor3);
        TextPrompt placeHolder7  = new TextPrompt("Descripción", txDescripcionProducto3);
        
        asignarTitulo();
        
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        TablaRender renderer = new TablaRender();
        tablaProductos3.setDefaultRenderer(Object.class, renderer);
    }

    /**
     *
     * @return
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Iconos/logoLune.ico"));
        return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextProducto = new javax.swing.JPanel();
        txNombreProducto3 = new javax.swing.JTextField();
        txCodigoProducto3 = new javax.swing.JTextField();
        txCantidadProducto3 = new javax.swing.JTextField();
        txValorCompraProducto3 = new javax.swing.JTextField();
        txValorVentaProducto3 = new javax.swing.JTextField();
        txProveedor3 = new javax.swing.JTextField();
        txDescripcionProducto3 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaProductos3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnMostrarProductos = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaVistaProductos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(719, 620));

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setToolTipText("Vuelve al Menu Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 384));

        jTextProducto.setBackground(new java.awt.Color(255, 255, 255));

        txNombreProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txCodigoProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txCodigoProducto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoProducto3ActionPerformed(evt);
            }
        });

        txCantidadProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txValorCompraProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txValorVentaProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txProveedor3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txDescripcionProducto3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jTextProductoLayout = new javax.swing.GroupLayout(jTextProducto);
        jTextProducto.setLayout(jTextProductoLayout);
        jTextProductoLayout.setHorizontalGroup(
            jTextProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNombreProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txCodigoProducto3)
                    .addComponent(txCantidadProducto3)
                    .addComponent(txValorCompraProducto3)
                    .addComponent(txValorVentaProducto3)
                    .addComponent(txProveedor3)
                    .addComponent(txDescripcionProducto3))
                .addContainerGap())
        );
        jTextProductoLayout.setVerticalGroup(
            jTextProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNombreProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCodigoProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCantidadProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txValorCompraProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txValorVentaProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDescripcionProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tablaProductos3.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductos3.setForeground(new java.awt.Color(0, 0, 0));
        tablaProductos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductos3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaProductos3);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Producto", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel14.setText("Visualizar Productos");

        btnMostrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/eye32.png"))); // NOI18N
        btnMostrarProductos.setText("MostrarProductos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        tablaVistaProductos.setBackground(new java.awt.Color(255, 255, 255));
        tablaVistaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaVistaProductos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(btnMostrarProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Visualizar  Productos", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Eliminar", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.OK_OPTION){
            enviarDatosProducto(3);
            JOptionPane.showMessageDialog(null, "Producto Desactivado exitosamente", "Desactivacion Producto",JOptionPane.INFORMATION_MESSAGE );
                   
        }
        limpiarProducto();
        configuracionBotonesIniciales();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProducto(2);
            JOptionPane.showMessageDialog(null, "Producto Actualizado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProducto();
            configuracionBotonesIniciales();
            
        } 
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaProductos3, consulta);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
                
        Boolean validacion  = validaciones();
        if(validacion == true){
            enviarDatosProducto(1);
            JOptionPane.showMessageDialog(null, "Producto Creado Exitosamente", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            limpiarProducto();            
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void tablaProductos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductos3MouseClicked
        int row = tablaProductos3.rowAtPoint(evt.getPoint());

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
            datosTablaProducto(row);
            
        }  
    }//GEN-LAST:event_tablaProductos3MouseClicked

    private void txCodigoProducto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoProducto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoProducto3ActionPerformed

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

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaVistaProductos, consulta);
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    public void datosTablaProducto(int row) {        
        
        String nombreProducto = ((String) tablaProductos3.getValueAt(row, 0));
        String codigoProducto = ((String) tablaProductos3.getValueAt(row, 1));
        String cantidad = (String.valueOf(tablaProductos3.getValueAt(row, 2)));
        String valorCompraProducto = (String.valueOf(tablaProductos3.getValueAt(row, 3)));
        String valorVentaProducto = (String.valueOf(tablaProductos3.getValueAt(row, 4)));
        String proveedor = ((String) tablaProductos3.getValueAt(row, 5));
        String descripcion = ((String) tablaProductos3.getValueAt(row, 6));
        txNombreProducto3.setText(nombreProducto);
        txCodigoProducto3.setText(codigoProducto);
        txCantidadProducto3.setText(cantidad + "");
        txValorVentaProducto3.setText(valorVentaProducto + "");
        txValorCompraProducto3.setText(valorCompraProducto + "");
        txProveedor3.setText(proveedor);
        txDescripcionProducto3.setText(descripcion);        
        
    }
    
    public void enviarDatosProducto(int opcion) {
        
        ArrayList<String> arrayProductoNuevo = new ArrayList<>();
        
        arrayProductoNuevo.add(txNombreProducto3.getText());
        arrayProductoNuevo.add(txCodigoProducto3.getText());
        arrayProductoNuevo.add(txCantidadProducto3.getText());
        arrayProductoNuevo.add(txValorCompraProducto3.getText());
        arrayProductoNuevo.add(txValorVentaProducto3.getText());
        arrayProductoNuevo.add(txProveedor3.getText());
        arrayProductoNuevo.add(txDescripcionProducto3.getText());
        
        //objControlador.crearProducto(arrayProductoNuevo);
        
        switch (opcion) {
            case 1:
                objControlador.crearProducto(arrayProductoNuevo);
                break;
            case 2:
                objControlador.actualizarProducto(arrayProductoNuevo);
                break;
            case 3:
                objControlador.eliminarProducto(txCodigoProducto3.getText());
                break;
            default:
                break;
        }
        
    }
    
    private void asignarTitulo() {
        
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
        
        Boolean validacion = false;
        Boolean numerico = false;
        Boolean numerico2 = false;
        Boolean numerico3 = false;

        Boolean emailCorrecto = false;

        ArrayList<Integer> resultado = new ArrayList<>();

        resultado = objValidaciones.validarCamposVacios(validarCamposVacios2());
        

        if (resultado.size() != 0) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < resultado.size(); i++) {
            pintarErrores((resultado.get(i)));
        }

        numerico = objValidaciones.validarDatoNumerico(txCantidadProducto3.getText());
        numerico2 = objValidaciones.validarDatoNumerico(txValorCompraProducto3.getText());
        numerico3 = objValidaciones.validarDatoNumerico(txValorVentaProducto3.getText());
        if ((numerico == false || numerico2 == false || numerico3 == false) && resultado.size() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Datos númericos", "Error", JOptionPane.ERROR_MESSAGE);

            if (numerico == false) {
                pintarErrores(2);
            }

            if (numerico2 == false) {
                pintarErrores(3);
            }
            
            if (numerico3 == false) {
                pintarErrores(4);
            }

        }
        

        if (numerico == true && numerico2 == true && numerico3 == true && resultado.size() == 0) {
            validacion = true;
        }
        return validacion;
    }
    
    public void limpiarProducto() {
        txNombreProducto3.setText("");
        txCodigoProducto3.setText("");
        txCantidadProducto3.setText("");
        txValorCompraProducto3.setText("");
        txValorVentaProducto3.setText("");
        txProveedor3.setText("");
        txDescripcionProducto3.setText("");     
    }
    
    private ArrayList validarCamposVacios2() {     
                
        ArrayList arregloCamposProductos = new ArrayList<>();        
        arregloCamposProductos.add(txNombreProducto3.getText());
        arregloCamposProductos.add(txCodigoProducto3.getText());
        arregloCamposProductos.add(txCantidadProducto3.getText());
        arregloCamposProductos.add(txValorCompraProducto3.getText());
        arregloCamposProductos.add(txValorVentaProducto3.getText());
        arregloCamposProductos.add(txProveedor3.getText());
        arregloCamposProductos.add(txDescripcionProducto3.getText());     
                
        return arregloCamposProductos;
    }
    
    public void pintarErrores(int num) {

        switch (num) {

            case 0:
                txNombreProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 1:
                txCodigoProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 2:
                txCantidadProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 3:
                txValorCompraProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;
            
            case 4:
                txValorVentaProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break; 
                
            case 5:
                txProveedor3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;

            case 6:
                txDescripcionProducto3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                break;
        }

    }
    
    public void limpiarErrores() {

        txNombreProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCodigoProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txCantidadProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txValorCompraProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));
        
        txValorVentaProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txProveedor3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

        txDescripcionProducto3.setBorder(BorderFactory.createLineBorder(new Color(222,222,222), 1));

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jTextProducto;
    private javax.swing.JTable tablaProductos3;
    private javax.swing.JTable tablaVistaProductos;
    private javax.swing.JTextField txCantidadProducto3;
    private javax.swing.JTextField txCodigoProducto3;
    private javax.swing.JTextField txDescripcionProducto3;
    private javax.swing.JTextField txNombreProducto3;
    private javax.swing.JTextField txProveedor3;
    private javax.swing.JTextField txValorCompraProducto3;
    private javax.swing.JTextField txValorVentaProducto3;
    // End of variables declaration//GEN-END:variables
}
