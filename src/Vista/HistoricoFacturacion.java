/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import ModeloVO.*;
import java.util.ArrayList;
import java.util.Date;
import ModeloDAO.ClientesDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Validaciones.Validaciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;





/**
 *
 * @author ALLCH
 */
public class HistoricoFacturacion extends javax.swing.JFrame {

    Controlador objControlador;  
    Validaciones objValidaciones = new Validaciones();
    ArrayList<DetalleFacturaVO> arregloProductos = new ArrayList<>();
    ClientesDAO objClientesDAO = new ClientesDAO();
    
    String fecha;
    String hora;
    int numFactura = 0;
    int numFacturasEncontradas = 0;
    
    
        
    public HistoricoFacturacion(Controlador objControlador) {

        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        this.getContentPane().setBackground(Color.white); // CAMBIA EL COLOR DEL fRAME
        
        TablaRender renderer = new TablaRender();
        tablaHistoricoFactura.setDefaultRenderer(Object.class, renderer);    
        desactivarBotones();
        txBusqueda.setEnabled(false);
        btnBuscarFactura.setEnabled(false);
        //Escucha para que cuando se presione la tecka ejecute la accion
        btnBuscarFactura.addKeyListener(new PresionarTecla());
        
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        
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

        grupoFactura = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistoricoFactura = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Nit_CC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        respuestaIdentificacion = new javax.swing.JLabel();
        labelNumFactura = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelEmpleado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txBusqueda = new javax.swing.JTextField();
        btnBuscarFactura = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonConsecutivo = new javax.swing.JRadioButton();
        jRadioButtonNit = new javax.swing.JRadioButton();
        jRadioButtonTodas = new javax.swing.JRadioButton();
        jRadioButtonNombre = new javax.swing.JRadioButton();
        lbNumeroDeFacturas = new javax.swing.JLabel();
        btAdelanteFactura = new javax.swing.JButton();
        btAtrasFactura = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelIVA = new javax.swing.JLabel();
        labelTotalAPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(820, 0));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("Histórico Facturación");

        tablaHistoricoFactura.setBackground(new java.awt.Color(255, 255, 255));
        tablaHistoricoFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHistoricoFactura);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        jButton2.setText("Principal");
        jButton2.setToolTipText("Regresa al menu principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("    Nombre: ");
        jPanel2.add(jLabel1);
        jPanel2.add(labelNombre);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("    Identificación:");
        jPanel2.add(jLabel3);
        jPanel2.add(label_Nit_CC);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("    Teléfono:");
        jPanel2.add(jLabel4);
        jPanel2.add(labelTelefono);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("    Dirección:");
        jPanel2.add(jLabel5);
        jPanel2.add(labelDireccion);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(3, 2));

        respuestaIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        respuestaIdentificacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        respuestaIdentificacion.setText("Número Factura:");
        jPanel3.add(respuestaIdentificacion);
        jPanel3.add(labelNumFactura);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Fecha:");
        jPanel3.add(jLabel6);
        jPanel3.add(labelFecha);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Empleado Venta:");
        jPanel3.add(jLabel9);
        jPanel3.add(labelEmpleado);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Busqueda de Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        txBusqueda.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/busqueda.png"))); // NOI18N
        btnBuscarFactura.setText("Buscar");
        btnBuscarFactura.setToolTipText("Buscar Facturas");
        btnBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacturaActionPerformed(evt);
            }
        });
        btnBuscarFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnBuscarFacturaKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButtonConsecutivo.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonConsecutivo);
        jRadioButtonConsecutivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonConsecutivo.setText("Buscar por  Consecutivo");
        jRadioButtonConsecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConsecutivoActionPerformed(evt);
            }
        });

        jRadioButtonNit.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonNit);
        jRadioButtonNit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonNit.setText("Buscar por Nit del cliente");
        jRadioButtonNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNitActionPerformed(evt);
            }
        });

        jRadioButtonTodas.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonTodas);
        jRadioButtonTodas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonTodas.setText("Buscar  Todas");
        jRadioButtonTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodasActionPerformed(evt);
            }
        });

        jRadioButtonNombre.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonNombre);
        jRadioButtonNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonNombre.setText("Buscar por Nombre del Cliente");
        jRadioButtonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonConsecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonNit, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonTodas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonConsecutivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTodas)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lbNumeroDeFacturas.setBackground(new java.awt.Color(255, 255, 255));
        lbNumeroDeFacturas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbNumeroDeFacturas.setForeground(new java.awt.Color(0, 0, 0));

        btAdelanteFactura.setBackground(new java.awt.Color(255, 255, 255));
        btAdelanteFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btAdelanteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/forward.png"))); // NOI18N
        btAdelanteFactura.setText("Adelante");
        btAdelanteFactura.setToolTipText("Factura Siguiente");
        btAdelanteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdelanteFacturaActionPerformed(evt);
            }
        });

        btAtrasFactura.setBackground(new java.awt.Color(255, 255, 255));
        btAtrasFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btAtrasFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/rewind.png"))); // NOI18N
        btAtrasFactura.setText("Atras");
        btAtrasFactura.setToolTipText("Factura anterior");
        btAtrasFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNumeroDeFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btAtrasFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAdelanteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdelanteFactura)
                            .addComponent(btAtrasFactura)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumeroDeFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("I V A 19%");

        jLabel8.setText("Total a Pagar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelTotalAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturaActionPerformed
      
        numFactura = 0;
        numFacturasEncontradas = 0;
        
        if(validaciones()== true){
            
            
            if(jRadioButtonConsecutivo.isSelected()){
                buscarPorConsecutivo();
            }
            else if(jRadioButtonNit.isSelected()){
                buscarFacturaNit();
            }
            else if(jRadioButtonNombre.isSelected()){
                buscarFacturaNombre();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Seleccione una Opcion de Busqueda", "Advertencia",JOptionPane.INFORMATION_MESSAGE );

            }
            
            
        }
        
        else{
             JOptionPane.showMessageDialog(null, "Ingrese un dato para realizar la busqueda", "Advertencia",JOptionPane.INFORMATION_MESSAGE );

        }       
        
    }//GEN-LAST:event_btnBuscarFacturaActionPerformed

    private void btAtrasFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasFacturaActionPerformed
        if (numFactura >= 1) {
            numFactura--;

            if (jRadioButtonNit.isSelected()) {
                buscarFacturaNit();
            } 
            else if (jRadioButtonNombre.isSelected()) {
                buscarFacturaNombre();
            }
            else if(jRadioButtonTodas.isSelected()){
                buscarFacturasTodas();
            }
            lbNumeroDeFacturas.setText("Resultado  " + (numFactura + 1)   + " de " + numFacturasEncontradas);
            
            
        }
    }//GEN-LAST:event_btAtrasFacturaActionPerformed

    private void btAdelanteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdelanteFacturaActionPerformed
        if (numFactura < numFacturasEncontradas - 1) {
            numFactura++;

            if (jRadioButtonNit.isSelected()) {
                buscarFacturaNit();
            } 
            else if (jRadioButtonNombre.isSelected()) {
                buscarFacturaNombre();
            }
            else if (jRadioButtonTodas.isSelected()) {
                buscarFacturasTodas();
            }
            lbNumeroDeFacturas.setText("Resultado  " +   (numFactura + 1)  + " de " + numFacturasEncontradas);
            
        }
    }//GEN-LAST:event_btAdelanteFacturaActionPerformed

    private void jRadioButtonNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNitActionPerformed
        txBusqueda.setEnabled(true);
        btnBuscarFactura.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonNitActionPerformed

    private void jRadioButtonConsecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConsecutivoActionPerformed
        txBusqueda.setEnabled(true);
        btnBuscarFactura.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonConsecutivoActionPerformed

    private void jRadioButtonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNombreActionPerformed
        txBusqueda.setEnabled(true);
        btnBuscarFactura.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonNombreActionPerformed

    private void jRadioButtonTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodasActionPerformed
        
        numFactura = 0;
        numFacturasEncontradas = 0;
        txBusqueda.setEnabled(false);
        btnBuscarFactura.setEnabled(false);
        buscarFacturasTodas();
    }//GEN-LAST:event_jRadioButtonTodasActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void btnBuscarFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarFacturaKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

//Da click al boton elegido
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnBuscarFactura.doClick();
        }
    }//GEN-LAST:event_btnBuscarFacturaKeyTyped

    
    public void buscarPorConsecutivo(){
        String serialFactura;
        serialFactura = txBusqueda.getText();// obtiene el numero de factura introducido por el usuario en el jtext
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFactura);
        llenarInterfazDatosCliente(serialFactura);
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    
    }
    
    public void buscarFacturaNit(){
        ArrayList<String> serialFacturaCliente = new ArrayList<>();
        String facturaNit = txBusqueda.getText();
        serialFacturaCliente = objControlador.obtener_id_Factura_apartir_del_nit(facturaNit);
        numFacturasEncontradas = serialFacturaCliente.size();
        lbNumeroDeFacturas.setText("");
        lbNumeroDeFacturas.setText("Resultados  " +numFacturasEncontradas);
        
        if(numFacturasEncontradas > 1){
            activarBotones();
        }
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFacturaCliente.get(numFactura));
        llenarInterfazDatosCliente(serialFacturaCliente.get(numFactura));
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    }
    
    public void buscarFacturaNombre(){
        ArrayList<String> serialFacturaCliente = new ArrayList<>();
        String facturaNombre = txBusqueda.getText();
        serialFacturaCliente = objControlador.obtener_id_Factura_apartir_del_Nombre(facturaNombre );
        
        numFacturasEncontradas = serialFacturaCliente.size();
        lbNumeroDeFacturas.setText("");
        lbNumeroDeFacturas.setText("Resultados  " +numFacturasEncontradas);
        
        if(numFacturasEncontradas > 1){
            activarBotones();
        }
        
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFacturaCliente.get(numFactura));
        llenarInterfazDatosCliente(serialFacturaCliente.get(numFactura));
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    }
    
    public void buscarFacturasTodas(){
        ArrayList<String> serialFacturaCliente = new ArrayList<>();
        
        serialFacturaCliente = objControlador.obtenerFacturasTodas();
        
        numFacturasEncontradas = serialFacturaCliente.size();
        
        lbNumeroDeFacturas.setText("Resultados " +numFacturasEncontradas);
        
        if(numFacturasEncontradas > 1){
            activarBotones();
        }
        
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFacturaCliente.get(numFactura));
        llenarInterfazDatosCliente(serialFacturaCliente.get(numFactura));
        ob/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import ModeloVO.*;
import java.util.ArrayList;
import java.util.Date;
import ModeloDAO.ClientesDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Validaciones.Validaciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;





/**
 *
 * @author ALLCH
 */
public class HistoricoFacturacion extends javax.swing.JFrame {

    Controlador objControlador;  
    Validaciones objValidaciones = new Validaciones();
    ArrayList<DetalleFacturaVO> arregloProductos = new ArrayList<>();
    ClientesDAO objClientesDAO = new ClientesDAO();
    
    String fecha;
    String hora;
    int numFactura = 0;
    int numFacturasEncontradas = 0;
    
    
        
    public HistoricoFacturacion(Controlador objControlador) {

        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        this.getContentPane().setBackground(Color.white); // CAMBIA EL COLOR DEL fRAME
        
        TablaRender renderer = new TablaRender();
        tablaHistoricoFactura.setDefaultRenderer(Object.class, renderer);    
        desactivarBotones();
        txBusqueda.setEnabled(false);
        btnBuscarFactura.setEnabled(false);
        //Escucha para que cuando se presione la tecka ejecute la accion
        btnBuscarFactura.addKeyListener(new PresionarTecla());
        
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
        
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

        grupoFactura = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistoricoFactura = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Nit_CC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        respuestaIdentificacion = new javax.swing.JLabel();
        labelNumFactura = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelEmpleado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txBusqueda = new javax.swing.JTextField();
        btnBuscarFactura = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonConsecutivo = new javax.swing.JRadioButton();
        jRadioButtonNit = new javax.swing.JRadioButton();
        jRadioButtonTodas = new javax.swing.JRadioButton();
        jRadioButtonNombre = new javax.swing.JRadioButton();
        lbNumeroDeFacturas = new javax.swing.JLabel();
        btAdelanteFactura = new javax.swing.JButton();
        btAtrasFactura = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelIVA = new javax.swing.JLabel();
        labelTotalAPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(820, 0));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("Histórico Facturación");

        tablaHistoricoFactura.setBackground(new java.awt.Color(255, 255, 255));
        tablaHistoricoFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHistoricoFactura);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        jButton2.setText("Principal");
        jButton2.setToolTipText("Regresa al menu principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("    Nombre: ");
        jPanel2.add(jLabel1);
        jPanel2.add(labelNombre);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("    Identificación:");
        jPanel2.add(jLabel3);
        jPanel2.add(label_Nit_CC);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("    Teléfono:");
        jPanel2.add(jLabel4);
        jPanel2.add(labelTelefono);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("    Dirección:");
        jPanel2.add(jLabel5);
        jPanel2.add(labelDireccion);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(3, 2));

        respuestaIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        respuestaIdentificacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        respuestaIdentificacion.setText("Número Factura:");
        jPanel3.add(respuestaIdentificacion);
        jPanel3.add(labelNumFactura);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Fecha:");
        jPanel3.add(jLabel6);
        jPanel3.add(labelFecha);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Empleado Venta:");
        jPanel3.add(jLabel9);
        jPanel3.add(labelEmpleado);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Busqueda de Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        txBusqueda.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/busqueda.png"))); // NOI18N
        btnBuscarFactura.setText("Buscar");
        btnBuscarFactura.setToolTipText("Buscar Facturas");
        btnBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacturaActionPerformed(evt);
            }
        });
        btnBuscarFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnBuscarFacturaKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButtonConsecutivo.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonConsecutivo);
        jRadioButtonConsecutivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonConsecutivo.setText("Buscar por  Consecutivo");
        jRadioButtonConsecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConsecutivoActionPerformed(evt);
            }
        });

        jRadioButtonNit.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonNit);
        jRadioButtonNit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonNit.setText("Buscar por Nit del cliente");
        jRadioButtonNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNitActionPerformed(evt);
            }
        });

        jRadioButtonTodas.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonTodas);
        jRadioButtonTodas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonTodas.setText("Buscar  Todas");
        jRadioButtonTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodasActionPerformed(evt);
            }
        });

        jRadioButtonNombre.setBackground(new java.awt.Color(255, 255, 255));
        grupoFactura.add(jRadioButtonNombre);
        jRadioButtonNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButtonNombre.setText("Buscar por Nombre del Cliente");
        jRadioButtonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonConsecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonNit, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonTodas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonConsecutivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTodas)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lbNumeroDeFacturas.setBackground(new java.awt.Color(255, 255, 255));
        lbNumeroDeFacturas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbNumeroDeFacturas.setForeground(new java.awt.Color(0, 0, 0));

        btAdelanteFactura.setBackground(new java.awt.Color(255, 255, 255));
        btAdelanteFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btAdelanteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/forward.png"))); // NOI18N
        btAdelanteFactura.setText("Adelante");
        btAdelanteFactura.setToolTipText("Factura Siguiente");
        btAdelanteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdelanteFacturaActionPerformed(evt);
            }
        });

        btAtrasFactura.setBackground(new java.awt.Color(255, 255, 255));
        btAtrasFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btAtrasFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/rewind.png"))); // NOI18N
        btAtrasFactura.setText("Atras");
        btAtrasFactura.setToolTipText("Factura anterior");
        btAtrasFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNumeroDeFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btAtrasFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAdelanteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdelanteFactura)
                            .addComponent(btAtrasFactura)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumeroDeFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("I V A 19%");

        jLabel8.setText("Total a Pagar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelTotalAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturaActionPerformed
      
        numFactura = 0;
        numFacturasEncontradas = 0;
        
        if(validaciones()== true){
            
            
            if(jRadioButtonConsecutivo.isSelected()){
                buscarPorConsecutivo();
            }
            else if(jRadioButtonNit.isSelected()){
                buscarFacturaNit();
            }
            else if(jRadioButtonNombre.isSelected()){
                buscarFacturaNombre();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Seleccione una Opcion de Busqueda", "Advertencia",JOptionPane.INFORMATION_MESSAGE );

            }
            
            
        }
        
        else{
             JOptionPane.showMessageDialog(null, "Ingrese un dato para realizar la busqueda", "Advertencia",JOptionPane.INFORMATION_MESSAGE );

        }       
        
    }//GEN-LAST:event_btnBuscarFacturaActionPerformed

    private void btAtrasFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasFacturaActionPerformed
        if (numFactura >= 1) {
            numFactura--;

            if (jRadioButtonNit.isSelected()) {
                buscarFacturaNit();
            } 
            else if (jRadioButtonNombre.isSelected()) {
                buscarFacturaNombre();
            }
            else if(jRadioButtonTodas.isSelected()){
                buscarFacturasTodas();
            }
            lbNumeroDeFacturas.setText("Resultado  " + (numFactura + 1)   + " de " + numFacturasEncontradas);
            
            
        }
    }//GEN-LAST:event_btAtrasFacturaActionPerformed

    private void btAdelanteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdelanteFacturaActionPerformed
        if (numFactura < numFacturasEncontradas - 1) {
            numFactura++;

            if (jRadioButtonNit.isSelected()) {
                buscarFacturaNit();
            } 
            else if (jRadioButtonNombre.isSelected()) {
                buscarFacturaNombre();
            }
            else if (jRadioButtonTodas.isSelected()) {
                buscarFacturasTodas();
            }
            lbNumeroDeFacturas.setText("Resultado  " +   (numFactura + 1)  + " de " + numFacturasEncontradas);
            
        }
    }//GEN-LAST:event_btAdelanteFacturaActionPerformed

    private void jRadioButtonNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNitActionPerformed
        txBusqueda.setEnabled(true);
        btnBuscarFactura.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonNitActionPerformed

    private void jRadioButtonConsecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConsecutivoActionPerformed
        txBusqueda.setEnabled(true);
        btnBuscarFactura.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonConsecutivoActionPerformed

    private void jRadioButtonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNombreActionPerformed
        txBusqueda.setEnabled(true);
        btnBuscarFactura.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonNombreActionPerformed

    private void jRadioButtonTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodasActionPerformed
        
        numFactura = 0;
        numFacturasEncontradas = 0;
        txBusqueda.setEnabled(false);
        btnBuscarFactura.setEnabled(false);
        buscarFacturasTodas();
    }//GEN-LAST:event_jRadioButtonTodasActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void btnBuscarFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarFacturaKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

//Da click al boton elegido
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnBuscarFactura.doClick();
        }
    }//GEN-LAST:event_btnBuscarFacturaKeyTyped

    
    public void buscarPorConsecutivo(){
        String serialFactura;
        serialFactura = txBusqueda.getText();// obtiene el numero de factura introducido por el usuario en el jtext
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFactura);
        llenarInterfazDatosCliente(serialFactura);
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    
    }
    
    public void buscarFacturaNit(){
        ArrayList<String> serialFacturaCliente = new ArrayList<>();
        String facturaNit = txBusqueda.getText();
        serialFacturaCliente = objControlador.obtener_id_Factura_apartir_del_nit(facturaNit);
        numFacturasEncontradas = serialFacturaCliente.size();
        lbNumeroDeFacturas.setText("");
        lbNumeroDeFacturas.setText("Resultados  " +numFacturasEncontradas);
        
        if(numFacturasEncontradas > 1){
            activarBotones();
        }
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFacturaCliente.get(numFactura));
        llenarInterfazDatosCliente(serialFacturaCliente.get(numFactura));
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    }
    
    public void buscarFacturaNombre(){
        ArrayList<String> serialFacturaCliente = new ArrayList<>();
        String facturaNombre = txBusqueda.getText();
        serialFacturaCliente = objControlador.obtener_id_Factura_apartir_del_Nombre(facturaNombre );
        
        numFacturasEncontradas = serialFacturaCliente.size();
        lbNumeroDeFacturas.setText("");
        lbNumeroDeFacturas.setText("Resultados  " +numFacturasEncontradas);
        
        if(numFacturasEncontradas > 1){
            activarBotones();
        }
        
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFacturaCliente.get(numFactura));
        llenarInterfazDatosCliente(serialFacturaCliente.get(numFactura));
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    }
    
    public void buscarFacturasTodas(){
        ArrayList<String> serialFacturaCliente = new ArrayList<>();
        
        serialFacturaCliente = objControlador.obtenerFacturasTodas();
        
        numFacturasEncontradas = serialFacturaCliente.size();
        
        lbNumeroDeFacturas.setText("Resultados " +numFacturasEncontradas);
        
        if(numFacturasEncontradas > 1){
            activarBotones();
        }
        
        objControlador.llenarDetalleTablaFacturasHistorico(tablaHistoricoFactura, serialFacturaCliente.get(numFactura));
        llenarInterfazDatosCliente(serialFacturaCliente.get(numFactura));
        objControlador.operaDatosTablaVentas(tablaHistoricoFactura, labelIVA, labelTotalAPagar); // metodo que calcula el valor total de los productos,iva y total
    }
    
    public void fecha(){
       
        hora = String.format("%TT", new Date());
        fecha = String.format("%tD ", new Date());
        labelFecha.setText(hora + "   " + fecha);
        System.out.println("La hora es: "+ hora + "   "+fecha);       
        
    }    
        
    /**
     * 
     * @param serialFactura 
     */
    public void llenarInterfazDatosCliente(String serialFactura){
        
        ArrayList<FacturaVO> facturas = objControlador.llenarDatosClienteFacturaHistorico(serialFactura);
        
        String idCliente = facturas.get(0).getIdCliente();
        String fecha1;
        fecha1 = facturas.get(0).getFecha();
        String hora1 = facturas.get(0).getHora();
        String empleado = facturas.get(0).getIdEmpleado();
        labelFecha.setText(fecha1 + "  " + hora1);
        labelEmpleado.setText(empleado);
        
        ArrayList<ClientesVO>  arreglo = objClientesDAO.listarClienteFactura(idCliente);      
                
       //Llena el encabezado de la factura en el historico
       labelNombre.setText(arreglo.get(0).getNombreCliente());
       labelDireccion.setText(arreglo.get(0).getDireccion());
       labelTelefono.setText(arreglo.get(0).getTelefono()); 
       label_Nit_CC.setText(arreglo.get(0).getIdCliente());
       labelNumFactura.setText(serialFactura);
       
    }
    
    private void asignarTitulo() {
        
        setTitle(objControlador.empleadoSesionAbierta());
        
    }
    
    public Boolean validaciones(){
        
        Boolean resultado = false;

        resultado = objValidaciones.validarUnCampoVacio(txBusqueda.getText());
        
        return resultado;
    }
    
    public void activarBotones(){
        
        btAdelanteFactura.setEnabled(true);
        btAtrasFactura.setEnabled(true);
    }
    
    public void desactivarBotones(){
        btAdelanteFactura.setEnabled(false);
        btAtrasFactura.setEnabled(false);
        
    }
    
    public class PresionarTecla extends KeyAdapter {
        
        
      @Override
      public void keyPressed(KeyEvent ke) {
          
          char cTeclaPresionada = ke.getKeyChar();
          
          if (cTeclaPresionada == KeyEvent.VK_ENTER) {
              btnBuscarFactura.doClick();
          }
      }
}

    
    
     
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdelanteFactura;
    private javax.swing.JButton btAtrasFactura;
    private javax.swing.JButton btnBuscarFactura;
    private javax.swing.ButtonGroup grupoFactura;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonConsecutivo;
    private javax.swing.JRadioButton jRadioButtonNit;
    private javax.swing.JRadioButton jRadioButtonNombre;
    private javax.swing.JRadioButton jRadioButtonTodas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEmpleado;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelIVA;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumFactura;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTotalAPagar;
    private javax.swing.JLabel label_Nit_CC;
    private javax.swing.JLabel lbNumeroDeFacturas;
    private javax.swing.JLabel respuestaIdentificacion;
    private javax.swing.JTable tablaHistoricoFactura;
    private javax.swing.JTextField txBusqueda;
    // End of variables declaration//GEN-END:variables
}
