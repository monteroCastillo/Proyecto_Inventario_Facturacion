
package Vista;

import Controlador.Controlador;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import  Controlador.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author ALLCH
 */
public class frontEnd extends javax.swing.JFrame {

    Controlador objControlador;
    public frontEnd(Controlador objControlador) {
       
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Iconos/logoLune.ico"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/logoJavaLargo500.png"))); // NOI18N

        btnSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/Flecha_chevron60.png"))); // NOI18N
        btnSiguiente.setText("jButton3");
        btnSiguiente.setToolTipText("Mas Opciones");
        btnSiguiente.setBorder(null);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        btnSiguiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSiguienteKeyPressed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/moneyOFF_64.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setToolTipText("Permite Vender Productos");
        btnVentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setRequestFocusEnabled(false);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        btnVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVentasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnVentasKeyTyped(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/clientesOFF_64.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setToolTipText("Gestiona Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnClientesKeyPressed(evt);
            }
        });

        btnFacturas.setBackground(new java.awt.Color(255, 255, 255));
        btnFacturas.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/facturaOFF_64.png"))); // NOI18N
        btnFacturas.setText("FACTURAS");
        btnFacturas.setToolTipText("Historico de Facturas");
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFacturasMousePressed(evt);
            }
        });
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        btnFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFacturasKeyPressed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnProducto.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/hiloOFF_64.png"))); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.setToolTipText("Gestiona Los productos");
        btnProducto.setBorder(null);
        btnProducto.setBorderPainted(false);
        btnProducto.setContentAreaFilled(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        btnProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProductoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        VistaMenuAdmin2 objVistaMenuAdmin2 =new VistaMenuAdmin2(objControlador);
        objVistaMenuAdmin2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Ventas objVentas = new Ventas(objControlador);
        objVentas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        VistaCliente objVistaCliente = new VistaCliente(objControlador);
        objVistaCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        HistoricoFacturacion objHistorico = new HistoricoFacturacion(objControlador);
        objHistorico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        VistaProducto objVistaProducto = new VistaProducto(objControlador);
        objVistaProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setBackground((Color.yellow));
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground((Color.white));
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground((Color.RED));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVentasKeyTyped
//        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
//            btnVentas.doClick();
//        } 
    }//GEN-LAST:event_btnVentasKeyTyped

    private void btnVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVentasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnVentas.
package Vista;

import Controlador.Controlador;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import  Controlador.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author ALLCH
 */
public class frontEnd extends javax.swing.JFrame {

    Controlador objControlador;
    public frontEnd(Controlador objControlador) {
       
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Iconos/logoLune.ico"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/logoJavaLargo500.png"))); // NOI18N

        btnSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/Flecha_chevron60.png"))); // NOI18N
        btnSiguiente.setText("jButton3");
        btnSiguiente.setToolTipText("Mas Opciones");
        btnSiguiente.setBorder(null);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        btnSiguiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSiguienteKeyPressed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/moneyOFF_64.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setToolTipText("Permite Vender Productos");
        btnVentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setRequestFocusEnabled(false);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        btnVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVentasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnVentasKeyTyped(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/clientesOFF_64.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setToolTipText("Gestiona Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnClientesKeyPressed(evt);
            }
        });

        btnFacturas.setBackground(new java.awt.Color(255, 255, 255));
        btnFacturas.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/facturaOFF_64.png"))); // NOI18N
        btnFacturas.setText("FACTURAS");
        btnFacturas.setToolTipText("Historico de Facturas");
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFacturasMousePressed(evt);
            }
        });
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        btnFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFacturasKeyPressed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnProducto.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/hiloOFF_64.png"))); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.setToolTipText("Gestiona Los productos");
        btnProducto.setBorder(null);
        btnProducto.setBorderPainted(false);
        btnProducto.setContentAreaFilled(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        btnProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProductoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        VistaMenuAdmin2 objVistaMenuAdmin2 =new VistaMenuAdmin2(objControlador);
        objVistaMenuAdmin2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Ventas objVentas = new Ventas(objControlador);
        objVentas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        VistaCliente objVistaCliente = new VistaCliente(objControlador);
        objVistaCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        HistoricoFacturacion objHistorico = new HistoricoFacturacion(objControlador);
        objHistorico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        VistaProducto objVistaProducto = new VistaProducto(objControlador);
        objVistaProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setBackground((Color.yellow));
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground((Color.white));
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground((Color.RED));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVentasKeyTyped
//        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
//            btnVentas.doClick();
//        } 
    }//GEN-LAST:event_btnVentasKeyTyped

    private void btnVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVentasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnVentas.doClick();
        }
    }//GEN-LAST:event_btnVentasKeyPressed

    private void btnClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClientesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnClientes.doClick();
        }
    }//GEN-LAST:event_btnClientesKeyPressed

    private void btnFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturasMousePressed

    private void btnFacturasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFacturasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnFacturas.doClick();
        }
    }//GEN-LAST:event_btnFacturasKeyPressed

    private void btnProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProductoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnProducto.doClick();
        }

    }//GEN-LAST:event_btnProductoKeyPressed

    private void btnSiguienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSiguienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnSiguiente.doClick();
        }
    }//GEN-LAST:event_btnSiguienteKeyPressed

    private void asignarTitulo() {
        
        setTitle(objControlador.empleadoSesionAbierta());
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}