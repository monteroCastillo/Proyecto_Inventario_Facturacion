/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class VistaMenuAdmin2 extends javax.swing.JFrame {

    Controlador objControlador;
    public VistaMenuAdmin2(Controlador objControlador) {
       
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
    }
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
        btnProveedor = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALLCH\\Desktop\\logoJavaLargo500.png")); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(600, 600));

        btnProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedor.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/ProveedorOFF_64.png"))); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.setToolTipText("Gestiona los Proveedores");
        btnProveedor.setBorder(null);
        btnProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        btnProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProveedorKeyPressed(evt);
            }
        });

        btnConsultas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultas.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/searchOFF_64.png"))); // NOI18N
        btnConsultas.setText("CONSULTAS");
        btnConsultas.setToolTipText("Consultas a la base de datos");
        btnConsultas.setBorder(null);
        btnConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        btnConsultas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConsultasKeyPressed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/empleadoOFF_64.png"))); // NOI18N
        btnClientes.setText("EMPLEADOS");
        btnClientes.setBorder(null);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/analyticsOFF_64.png"))); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.setToolTipText("Grafica de los productos vendidos");
        btnReportes.setBorder(null);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        btnReportes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnReportesKeyPressed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/chevronAtrasOFF_64.png"))); // NOI18N
        btnAtras.setToolTipText("Anterior");
        btnAtras.setBorder(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        btnAtras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAtrasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        VistaProveedor objVistaProveedor = new VistaProveedor(objControlador);
        objVistaProveedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        Consultas obtenerConsultas = new Consultas(objControlador);
        obtenerConsultas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VistaEmpleado obtenerEmpleado = VistaEmpleado.obtenerEmpleado(objControlador);
        obtenerEmpleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
         objControlador.generarReportesGraficos("Productos más Vendidos","Productos", "Cantidades" );
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProveedorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnProveedor.doClick();
        }
    }//GEN-LAST:event_btnProveedorKeyPressed

    private void btnClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClientesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnClientes.doClick();
        }
    }//GEN-LAST:event_btnClientesKeyPressed

    private void btnConsultasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConsultasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnConsultas.doClick();
        }
    }//GEN-LAST:event_btnConsultasKeyPressed

    private void btnReportesKey/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class VistaMenuAdmin2 extends javax.swing.JFrame {

    Controlador objControlador;
    public VistaMenuAdmin2(Controlador objControlador) {
       
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        asignarTitulo();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Iconos/logoSencillo2000.png")).getImage());
        
    }
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
        btnProveedor = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALLCH\\Desktop\\logoJavaLargo500.png")); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(600, 600));

        btnProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedor.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/ProveedorOFF_64.png"))); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.setToolTipText("Gestiona los Proveedores");
        btnProveedor.setBorder(null);
        btnProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        btnProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProveedorKeyPressed(evt);
            }
        });

        btnConsultas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultas.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/searchOFF_64.png"))); // NOI18N
        btnConsultas.setText("CONSULTAS");
        btnConsultas.setToolTipText("Consultas a la base de datos");
        btnConsultas.setBorder(null);
        btnConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        btnConsultas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConsultasKeyPressed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/empleadoOFF_64.png"))); // NOI18N
        btnClientes.setText("EMPLEADOS");
        btnClientes.setBorder(null);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/analyticsOFF_64.png"))); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.setToolTipText("Grafica de los productos vendidos");
        btnReportes.setBorder(null);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        btnReportes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnReportesKeyPressed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/chevronAtrasOFF_64.png"))); // NOI18N
        btnAtras.setToolTipText("Anterior");
        btnAtras.setBorder(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        btnAtras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAtrasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        VistaProveedor objVistaProveedor = new VistaProveedor(objControlador);
        objVistaProveedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        Consultas obtenerConsultas = new Consultas(objControlador);
        obtenerConsultas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VistaEmpleado obtenerEmpleado = VistaEmpleado.obtenerEmpleado(objControlador);
        obtenerEmpleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
         objControlador.generarReportesGraficos("Productos más Vendidos","Productos", "Cantidades" );
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProveedorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnProveedor.doClick();
        }
    }//GEN-LAST:event_btnProveedorKeyPressed

    private void btnClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClientesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnClientes.doClick();
        }
    }//GEN-LAST:event_btnClientesKeyPressed

    private void btnConsultasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConsultasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnConsultas.doClick();
        }
    }//GEN-LAST:event_btnConsultasKeyPressed

    private void btnReportesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnReportesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnReportes.doClick();
        }
    }//GEN-LAST:event_btnReportesKeyPressed

    private void btnAtrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAtrasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnAtras.doClick();
        }
    }//GEN-LAST:event_btnAtrasKeyPressed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        frontEnd objFrontEnd= new frontEnd(objControlador);
        objFrontEnd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void asignarTitulo() {
        
        setTitle(objControlador.empleadoSesionAbierta());
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}