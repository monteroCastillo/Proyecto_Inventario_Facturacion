package Vista;

import ModeloVO.*;
import Controlador.*;
import ModeloDAO.ProductoDAO;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


//import com.mxrck.autocompleter.TextAutoCompleter;
//import com.mxrck.autocompleter.*;


public class Ventas extends javax.swing.JFrame {

    
    Controlador objControlador;
    ProductoDAO objProductoDAO = new ProductoDAO();
    private static Ventas objVentas;

    TableRowSorter rowSorter; // es la variable para realizar el filtro de busqueda
    int IDBUSQUEDA = 0; // Filtraria por nombre de producto

    ArrayList<DetalleFacturaVO> arregloProductos = new ArrayList<>();

    DefaultTableModel model = new DefaultTableModel();
    DecimalFormat formatea = new DecimalFormat("###,###.##"); ////Coloca puntos decimales 
     
    int numProductos = 0;      
    
    public Ventas(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        //Cuando se selecciona un elemento de la tabla las letras se colocan del color seleccionado
        tablaVentasProductos.setSelectionForeground(Color.yellow);
        //Cuando se selecciona un elemento de la tabla el fondo  se coloca del color seleccionado
        tablaVentasProductos.setSelectionBackground(Color.red);

        panelCanasta.setVisible(false);
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        labelNumProductos.setVisible(false);
        
        this.getContentPane().setBackground(Color.white);  // Pinta el Form de color blanco
       
        TablaRender renderer = new TablaRender();
        tablaVentasProductos.setDefaultRenderer(Object.class, renderer);
        
        //asignarTitulo();  
        //llenarJcomboProductos();
        
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

    //Patron singleton
    public static Ventas obtenerVentas(Controlador objControlador) {

        if (objVentas == null) {

            objVentas = new Ventas(objControlador);
        }

        return objVentas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentasProductos = new javax.swing.JTable();
        btPrincipalVentas = new javax.swing.JButton();
        panelCanasta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelNumProductos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelInformacionVentas = new javax.swing.JLabel();
        jComboIDclientes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Ventas");

        tablaVentasProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVentasProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentasProductos);

        btPrincipalVentas.setBackground(new java.awt.Color(255, 255, 255));
        btPrincipalVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btPrincipalVentas.setText("Principal");
        btPrincipalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalVentasActionPerformed(evt);
            }
        });

        panelCanasta.setBackground(new java.awt.Color(255, 255, 255));
        panelCanasta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        panelCanasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCanastaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Ir a la Canasta");

        labelNumProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/shopping-cart_64.png"))); // NOI18N

        javax.swing.GroupLayout panelCanastaLayout = new javax.swing.GroupLayout(panelCanasta);
        panelCanasta.setLayout(panelCanastaLayout);
        panelCanastaLayout.setHorizontalGroup(
            panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanastaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addGroup(panelCanastaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCanastaLayout.setVerticalGroup(
            panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanastaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Cliente");

        jComboIDclientes.setBackground(new java.awt.Color(255, 255, 255));
        jComboIDclientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboIDclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboIDclientesActionPerformed(evt);
            }
        });
        jComboIDclientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboIDclientesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jComboIDclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboIDclientes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Filtro Productos");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)))
                        .addComponent(panelCanasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCanasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Permite seleccionar un producto de la tabla de ventas para llevarlo a la
     * canaste de compra.
     *
     * @param evt
     */
    private void tablaVentasProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasProductosMouseClicked
        int row = tablaVentasProductos.rowAtPoint(evt.getPoint());
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Agregarlo al carrito de compras", "Agregar Articulo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            //Cuando Cancela        
            if (reply == JOptionPane.OK_CANCEL_OPTION) {
                System.out.println("cancelo!!");
            } //Cuando Aprueba
            else if (reply == JOptionPane.OK_OPTION) {
                panelCanasta.setVisible(true);
            datosTablaProducto(row);
            labelNumProductos.setVisible(true);
            labelNumProductos.setText(++numProductos + "");
            }
//        String d = JOptionPane.showInputDialog("Desea Agregar este producto \n al carrito de compras (S)");
//        if (d == null) {
//            System.out.println("El valor de la variable d es : " + d);
//        } else {
//            panelCanasta.setVisible(true);
//            datosTablaProducto(row);
//            labelNumProductos.setVisible(true);
//            labelNumProductos.setText(++numProductos + "");
//        }
    }//GEN-LAST:event_tablaVentasProductosMouseClicked

    private void btPrincipalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalVentasActionPerformed

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
    }//GEN-LAST:event_btPrincipalVentasActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvepackage Vista;

import ModeloVO.*;
import Controlador.*;
import ModeloDAO.ProductoDAO;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


//import com.mxrck.autocompleter.TextAutoCompleter;
//import com.mxrck.autocompleter.*;


public class Ventas extends javax.swing.JFrame {

    
    Controlador objControlador;
    ProductoDAO objProductoDAO = new ProductoDAO();
    private static Ventas objVentas;

    TableRowSorter rowSorter; // es la variable para realizar el filtro de busqueda
    int IDBUSQUEDA = 0; // Filtraria por nombre de producto

    ArrayList<DetalleFacturaVO> arregloProductos = new ArrayList<>();

    DefaultTableModel model = new DefaultTableModel();
    DecimalFormat formatea = new DecimalFormat("###,###.##"); ////Coloca puntos decimales 
     
    int numProductos = 0;      
    
    public Ventas(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        //Cuando se selecciona un elemento de la tabla las letras se colocan del color seleccionado
        tablaVentasProductos.setSelectionForeground(Color.yellow);
        //Cuando se selecciona un elemento de la tabla el fondo  se coloca del color seleccionado
        tablaVentasProductos.setSelectionBackground(Color.red);

        panelCanasta.setVisible(false);
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        labelNumProductos.setVisible(false);
        
        this.getContentPane().setBackground(Color.white);  // Pinta el Form de color blanco
       
        TablaRender renderer = new TablaRender();
        tablaVentasProductos.setDefaultRenderer(Object.class, renderer);
        
        //asignarTitulo();  
        //llenarJcomboProductos();
        
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

    //Patron singleton
    public static Ventas obtenerVentas(Controlador objControlador) {

        if (objVentas == null) {

            objVentas = new Ventas(objControlador);
        }

        return objVentas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentasProductos = new javax.swing.JTable();
        btPrincipalVentas = new javax.swing.JButton();
        panelCanasta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelNumProductos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelInformacionVentas = new javax.swing.JLabel();
        jComboIDclientes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Ventas");

        tablaVentasProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVentasProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentasProductos);

        btPrincipalVentas.setBackground(new java.awt.Color(255, 255, 255));
        btPrincipalVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/iconoHogar.png"))); // NOI18N
        btPrincipalVentas.setText("Principal");
        btPrincipalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalVentasActionPerformed(evt);
            }
        });

        panelCanasta.setBackground(new java.awt.Color(255, 255, 255));
        panelCanasta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        panelCanasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCanastaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Ir a la Canasta");

        labelNumProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos/shopping-cart_64.png"))); // NOI18N

        javax.swing.GroupLayout panelCanastaLayout = new javax.swing.GroupLayout(panelCanasta);
        panelCanasta.setLayout(panelCanastaLayout);
        panelCanastaLayout.setHorizontalGroup(
            panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanastaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addGroup(panelCanastaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCanastaLayout.setVerticalGroup(
            panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanastaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Cliente");

        jComboIDclientes.setBackground(new java.awt.Color(255, 255, 255));
        jComboIDclientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboIDclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboIDclientesActionPerformed(evt);
            }
        });
        jComboIDclientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboIDclientesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jComboIDclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboIDclientes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Filtro Productos");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)))
                        .addComponent(panelCanasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCanasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Permite seleccionar un producto de la tabla de ventas para llevarlo a la
     * canaste de compra.
     *
     * @param evt
     */
    private void tablaVentasProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasProductosMouseClicked
        int row = tablaVentasProductos.rowAtPoint(evt.getPoint());
        
        int reply = JOptionPane.showConfirmDialog(null, "Desea Agregarlo al carrito de compras", "Agregar Articulo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            //Cuando Cancela        
            if (reply == JOptionPane.OK_CANCEL_OPTION) {
                System.out.println("cancelo!!");
            } //Cuando Aprueba
            else if (reply == JOptionPane.OK_OPTION) {
                panelCanasta.setVisible(true);
            datosTablaProducto(row);
            labelNumProductos.setVisible(true);
            labelNumProductos.setText(++numProductos + "");
            }
//        String d = JOptionPane.showInputDialog("Desea Agregar este producto \n al carrito de compras (S)");
//        if (d == null) {
//            System.out.println("El valor de la variable d es : " + d);
//        } else {
//            panelCanasta.setVisible(true);
//            datosTablaProducto(row);
//            labelNumProductos.setVisible(true);
//            labelNumProductos.setText(++numProductos + "");
//        }
    }//GEN-LAST:event_tablaVentasProductosMouseClicked

    private void btPrincipalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalVentasActionPerformed

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
    }//GEN-LAST:event_btPrincipalVentasActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        System.out.println("Entro al evento de teclado  keyReleased");
        try {
            rowSorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase(), IDBUSQUEDA));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El filtrado no se ha podido llevar a cabo ");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void panelCanastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanastaMouseClicked
        Canasta canasta = new Canasta(objControlador);
        canasta.setVisible(true);
        this.dispose(); // instruccion que cierra la ventana actual
       
    }//GEN-LAST:event_panelCanastaMouseClicked

    private void jComboIDclientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboIDclientesKeyTyped
        prueba();     
 

    }//GEN-LAST:event_jComboIDclientesKeyTyped

    public void validarCliente(){
         boolean cliente;
        
        cliente = objControlador.consultarIdCliente(labelInformacionVentas, String.valueOf(jComboIDclientes.getSelectedItem()));//txID_cliente_ventas.getText());

        if (cliente == true) {

            // btnMostrarDatos.setEnabled(true);
            mostrarDatos();

        } else {

        }
        
    }
    private void jComboIDclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboIDclientesActionPerformed
        
        validarCliente();

       
    }//GEN-LAST:event_jComboIDclientesActionPerformed

    /**
     * al cliquear sobre un elemento de la tabla que se muestra, este se
     * agregara a un arreglo para luego pasarlo a la canasta de compra
     *
     * @param row
     */
    public void datosTablaProducto(int row) {

        //saca los valores de la tabla de Productos de la clase Ventas
        String codigoProducto = ((String) tablaVentasProductos.getValueAt(row, 0));
        String nombreProducto = ((String) tablaVentasProductos.getValueAt(row, 1));
        float valorProducto = 0;
        String valor ;
        
        try {
//          
           valorProducto = objControlador.sacarPrecioProducto(nombreProducto);
        
        } catch (Exception e) {
            System.out.println("Imposible encontrar el codigo del producto" + e);
        }
        
        arregloProductos.add(new DetalleFacturaVO(codigoProducto, nombreProducto, valorProducto, 0, ""));

        objControlador.mostrarProductos(arregloProductos);
//        //return arregloProductos;

    }

    /**
     * Llena el combobox con todos los nombres de los productos
     */
    private void mostrarDatos() {
        String consulta = "SELECT * FROM producto";
        // objControlador.llenarTablaProductos(tablaVentasProductos, consulta);

        llenarTablaProductos(consulta);

    }

    public ArrayList<DetalleFacturaVO> getArregloProductos() {
        return arregloProductos;
    }

//     System.out.println("Entro al evento de teclado  keyReleased");
//        rowSorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase(), IDBUSQUEDA));
    public void llenarTablaProductos(String consulta) {

        DefaultTableModel model = new DefaultTableModel();
        tablaVentasProductos.setModel(model);
        ArrayList<ProductosVO> listaProductos = new ArrayList();

        try {

            model.addColumn("Producto");
            model.addColumn("Codigo");
            model.addColumn("Cantidad");
            model.addColumn("Valor Compra");
            model.addColumn("Valor Venta");
            model.addColumn("Proveedor");
            model.addColumn("Descripcion");

            Object[] columna = new Object[7];

            listaProductos = objProductoDAO.listarProductos(consulta);

            int numRegistros = listaProductos.size();

            System.out.println("Numero de registros EN LA CLASE VENTAS " + numRegistros);
            for (int i = 0; i < numRegistros; i++) {
                columna[0] = listaProductos.get(i).getNombreProducto();
                columna[1] = listaProductos.get(i).getCodigoProducto();
                columna[2] = listaProductos.get(i).getCantidad();
                columna[3] = formatea.format(listaProductos.get(i).getValorCompraProd());
                columna[4] = formatea.format(listaProductos.get(i).getValorVentaProd());
                columna[5] = listaProductos.get(i).getProveedor();
                columna[6] = listaProductos.get(i).getDescripcion();

                model.addRow(columna);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la carga de los datos " + e);
        }

        rowSorter = new TableRowSorter(model);
        tablaVentasProductos.setRowSorter(rowSorter);
    }
    
    public void prueba() {

        ArrayList<String> listaIDclientes = new ArrayList();

//        ArrayList<String> keywords = new ArrayList<>(5);
//        keywords.add("1234");
//        keywords.add("autocomplete");
//        keywords.add("stackabuse");
//        keywords.add("java");
        String consulta = "SELECT ced_nit_cliente FROM clientes";

        listaIDclientes = objControlador.buscarIDclientes(consulta);
        jComboIDclientes.setFocusTraversalKeysEnabled(false);
//        AutoCompleteDecorator.decorate(txID_cliente_ventas, listaIDclientes, false);
        
        AutoCompleteDecorator.decorate(jComboIDclientes);
       
       
        for (String key : listaIDclientes) {
            jComboIDclientes.addItem(key);
        }     
        
    }    
    
    
    private void asignarTitulo() {
        
        setTitle(objControlador.empleadoSesionAbierta());
        
    } 
    
    public void llenarJcomboProductos() {

        ArrayList<String> listaIDclientes = new ArrayList();
        String consulta = "SELECT ced_nit_cliente FROM clientes";

        listaIDclientes = objControlador.buscarIDclientes(consulta);
        Iterator<String> nombreIterator = listaIDclientes.iterator();

        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.println(elemento);
        }
        
        for (int i = 0; i < listaIDclientes.size(); i++) {

            jComboIDclientes.addItem(listaIDclientes.get(i));

        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPrincipalVentas;
    private javax.swing.JComboBox<String> jComboIDclientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelInformacionVentas;
    private javax.swing.JLabel labelNumProductos;
    private javax.swing.JPanel panelCanasta;
    private javax.swing.JTable tablaVentasProductos;
    // End of variables declaration//GEN-END:variables
}
