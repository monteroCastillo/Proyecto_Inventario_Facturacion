package Controlador;

import ConexionDB.ConsultasDB;
import ModeloDAO.*;
import ModeloVO.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

import java.io.File;
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.apache.commons.codec.digest.DigestUtils;

public class Controlador {

    ClientesDAO objClientesDAO = new ClientesDAO();
    ProductoDAO objProductoDAO = new ProductoDAO();
    EmpleadoDAO objEmpleadoDAO = new EmpleadoDAO();
    ProveedorDAO objProveedorDAO = new ProveedorDAO();
    FacturaDAO objFacturaDAO = new FacturaDAO();
    DetalleFacturaDAO objDetalleFacturaDAO = new DetalleFacturaDAO();
    DetalleFacturaVO objDetalleFacturaVO;

    
    ConsultasDB objConsultas = new ConsultasDB();
    ArrayList<DetalleFacturaVO> arregloProductosVendidos = new ArrayList<>();
    public ArrayList<ClientesVO> arregloClienteFactura = new ArrayList<>();

    DefaultTableModel modeloCanasta = new DefaultTableModel();

    //variables globales
    float sumaValorTotal = 0;
    String nombreEmpleado = "vacio";
    String cedulaEmpleado = "vacio";
    String tipoEmpleado = "vacio";
    
    DecimalFormat formatea = new DecimalFormat("###,###.##"); ////Coloca puntos decimales 
        
    public Controlador() {

    }

    /**
     * Muestra todos los clientes de la base de datos
     *
     * @param tablaD
     */
    public void llenarTablaClientes(JTable tablaD) {

        ArrayList<ClientesVO> listaClientes = new ArrayList();
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);

        model.addColumn("Nombre");
        model.addColumn("Identificacion");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");
        model.addColumn("Publicidad");

        Object[] columna = new Object[7];

        listaClientes = objClientesDAO.listarClientes();
        int numRegistros = listaClientes.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaClientes.get(i).getNombreCliente();
            columna[1] = listaClientes.get(i).getIdCliente();
            columna[2] = listaClientes.get(i).getDireccion();
            columna[3] = listaClientes.get(i).getTelefono();
            columna[4] = listaClientes.get(i).getCiudad();
            columna[5] = listaClientes.get(i).getEmail();
            columna[6] = listaClientes.get(i).getPublicidad();
            model.addRow(columna);
        }

    }

    /**
     * Muestra todos los empleados de la base de datos
     *
     * @param tablaD
     */
    public void llenarTablaEmpleados(JTable tablaD) {

        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList();
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);

        model.addColumn("Nombre");
        model.addColumn("Identificacion");
        model.addColumn("Usuario");
        model.addColumn("Clave");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Tipo empleado");

        Object[] columna = new Object[7];

        listaEmpleados = objEmpleadoDAO.listarEmpleados();
        int numRegistros = listaEmpleados.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaEmpleados.get(i).getNombreEmpleado();
            columna[1] = listaEmpleados.get(i).getCedula();
            columna[2] = listaEmpleados.get(i).getUsuario();
            columna[3] = listaEmpleados.get(i).getClave();
            columna[4] = listaEmpleados.get(i).getDireccionEmpleado();
            columna[5] = listaEmpleados.get(i).getTelEmpleado();
            columna[6] = listaEmpleados.get(i).getTipoEmpleado();

            model.addRow(columna);
        }

    }

    /**
     * Muestra los datos de los productos en una tabla
     *
     * @param tablaD
     * @param consulta
     */
    public void llenarTablaProductos(JTable tablaD, String consulta) {

        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
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

            //int numRegistros = objProductoDAO.listarProductos(consulta).size();
            listaProductos = objProductoDAO.listarProductos(consulta);

            int numRegistros = listaProductos.size();

            for (int i = 0; i < numRegistros; i++) {
                tablaD.setSelectionBackground(new java.awt.Color(211,252,193));                
                columna[0] = listaProductos.get(i).getNombreProducto();
                columna[1] = listaProductos.get(i).getCodigoProducto();
                columna[2] = formatea.format(listaProductos.get(i).getCantidad());
                columna[3] = formatea.format(listaProductos.get(i).getValorCompraProd());
                columna[4] = formatea.format(listaProductos.gepackage Controlador;

import ConexionDB.ConsultasDB;
import ModeloDAO.*;
import ModeloVO.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

import java.io.File;
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.apache.commons.codec.digest.DigestUtils;

public class Controlador {

    ClientesDAO objClientesDAO = new ClientesDAO();
    ProductoDAO objProductoDAO = new ProductoDAO();
    EmpleadoDAO objEmpleadoDAO = new EmpleadoDAO();
    ProveedorDAO objProveedorDAO = new ProveedorDAO();
    FacturaDAO objFacturaDAO = new FacturaDAO();
    DetalleFacturaDAO objDetalleFacturaDAO = new DetalleFacturaDAO();
    DetalleFacturaVO objDetalleFacturaVO;

    
    ConsultasDB objConsultas = new ConsultasDB();
    ArrayList<DetalleFacturaVO> arregloProductosVendidos = new ArrayList<>();
    public ArrayList<ClientesVO> arregloClienteFactura = new ArrayList<>();

    DefaultTableModel modeloCanasta = new DefaultTableModel();

    //variables globales
    float sumaValorTotal = 0;
    String nombreEmpleado = "vacio";
    String cedulaEmpleado = "vacio";
    String tipoEmpleado = "vacio";
    
    DecimalFormat formatea = new DecimalFormat("###,###.##"); ////Coloca puntos decimales 
        
    public Controlador() {

    }

    /**
     * Muestra todos los clientes de la base de datos
     *
     * @param tablaD
     */
    public void llenarTablaClientes(JTable tablaD) {

        ArrayList<ClientesVO> listaClientes = new ArrayList();
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);

        model.addColumn("Nombre");
        model.addColumn("Identificacion");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");
        model.addColumn("Publicidad");

        Object[] columna = new Object[7];

        listaClientes = objClientesDAO.listarClientes();
        int numRegistros = listaClientes.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaClientes.get(i).getNombreCliente();
            columna[1] = listaClientes.get(i).getIdCliente();
            columna[2] = listaClientes.get(i).getDireccion();
            columna[3] = listaClientes.get(i).getTelefono();
            columna[4] = listaClientes.get(i).getCiudad();
            columna[5] = listaClientes.get(i).getEmail();
            columna[6] = listaClientes.get(i).getPublicidad();
            model.addRow(columna);
        }

    }

    /**
     * Muestra todos los empleados de la base de datos
     *
     * @param tablaD
     */
    public void llenarTablaEmpleados(JTable tablaD) {

        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList();
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);

        model.addColumn("Nombre");
        model.addColumn("Identificacion");
        model.addColumn("Usuario");
        model.addColumn("Clave");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Tipo empleado");

        Object[] columna = new Object[7];

        listaEmpleados = objEmpleadoDAO.listarEmpleados();
        int numRegistros = listaEmpleados.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaEmpleados.get(i).getNombreEmpleado();
            columna[1] = listaEmpleados.get(i).getCedula();
            columna[2] = listaEmpleados.get(i).getUsuario();
            columna[3] = listaEmpleados.get(i).getClave();
            columna[4] = listaEmpleados.get(i).getDireccionEmpleado();
            columna[5] = listaEmpleados.get(i).getTelEmpleado();
            columna[6] = listaEmpleados.get(i).getTipoEmpleado();

            model.addRow(columna);
        }

    }

    /**
     * Muestra los datos de los productos en una tabla
     *
     * @param tablaD
     * @param consulta
     */
    public void llenarTablaProductos(JTable tablaD, String consulta) {

        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
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

            //int numRegistros = objProductoDAO.listarProductos(consulta).size();
            listaProductos = objProductoDAO.listarProductos(consulta);

            int numRegistros = listaProductos.size();

            for (int i = 0; i < numRegistros; i++) {
                tablaD.setSelectionBackground(new java.awt.Color(211,252,193));                
                columna[0] = listaProductos.get(i).getNombreProducto();
                columna[1] = listaProductos.get(i).getCodigoProducto();
                columna[2] = formatea.format(listaProductos.get(i).getCantidad());
                columna[3] = formatea.format(listaProductos.get(i).getValorCompraProd());
                columna[4] = formatea.format(listaProductos.get(i).getValorVentaProd());
                columna[5] = listaProductos.get(i).getProveedor();
                columna[6] = listaProductos.get(i).getDescripcion();
                
                model.addRow(columna);
            }
        } catch (Exception e) {
            // System.out.println("Error Cargando la base de datos de productos");
            JOptionPane.showMessageDialog(null, "Error Cargando la base de datos ");
        }

    }

    /**
     * Muestra los datos de los proveedores en una tabla
     *
     * @param tablaD
     */
    public void llenarTablaProveedores(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
        ArrayList<ProveedorVO> arregloProveedores = new ArrayList();

        model.addColumn("Nombre");
        model.addColumn("Nit");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");

        Object[] columna = new Object[6];

        arregloProveedores = objProveedorDAO.listarProveedores();
        int numRegistros = arregloProveedores.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = arregloProveedores.get(i).getNombreProveedor();
            columna[1] = arregloProveedores.get(i).getNit();
            columna[2] = arregloProveedores.get(i).getDireccioProveedor();
            columna[3] = arregloProveedores.get(i).getTelefonoProveedor();
            columna[4] = arregloProveedores.get(i).getCiudad();
            columna[5] = arregloProveedores.get(i).getEmail();

            model.addRow(columna);
        }

    }

    /**
     * LLena el detalle de la factura en la vista de registro de facturas, esto
     * lo hace apartir del serial de la factura
     *
     * @param tablaD
     * @param serialFactura
     */
    public void llenarDetalleTablaFacturasHistorico(JTable tablaD, String serialFactura) {

        //arregloProductosVendidos.clear();  //LIMPIA EL ARREGLO PARA QUE NO INTERFIERA CON HISTORICO DE FACTURA
        tablaD.setModel(modeloCanasta);
        ((DefaultTableModel) tablaD.getModel()).setRowCount(0); //Limpia las filas de la tabla para que no se sumen elementos
        ((DefaultTableModel) tablaD.getModel()).setColumnCount(0); //Limpia las columnas de la tabla para que no se sumen elementos
        ArrayList<DetalleFacturaVO> listaDetalleFactura = new ArrayList();
        String consulta = "SELECT *FROM  detallefactura WHERE serialfactura = " + "'" + serialFactura + "'";

        try {

            listaDetalleFactura = objDetalleFacturaDAO.listarDetalleFacturaDAO(consulta);
        } catch (Exception e) {

            String d = JOptionPane.showInputDialog("Numero de factura NO Valido (S)");
            if (d.equals("s")) {
                System.exit(0);
            }
        }

        if (!listaDetalleFactura.isEmpty()) {

            modeloCanasta.addColumn("CANT");
            modeloCanasta.addColumn("Codigo");
            modeloCanasta.addColumn("Nombre Producto");
            modeloCanasta.addColumn("Valor Producto");
            modeloCanasta.addColumn("V. total");

            Object[] columna = new Object[5];// Numero de Columnas

            listaDetalleFactura = objDetalleFacturaDAO.listarDetalleFacturaDAO(consulta);

            //Lo pasa al arreglo global arregloProductosVendidos
            setArregloProductosVendidos(listaDetalleFactura);

            int numRegistros = listaDetalleFactura.size();

            for (int i = 0; i < numRegistros; i++) {
                columna[0] = listaDetalleFactura.get(i).getCantidad();
                columna[1] = listaDetalleFactura.get(i).getCodigoProducto();
                columna[2] = listaDetalleFactura.get(i).getNombreProducto();
                columna[3] = formatea.format(listaDetalleFactura.get(i).getPrecioProducto());

                modeloCanasta.addRow(columna);
            }
        } else {
            JOptionPane.showInputDialog("Numero de factura NO valido Desea salir (S)");
        }

    }
    
    /**
     * LLena el detalle de la factura en la vista de registro de facturas, esto
     * lo hace apartir del serial de la factura
     *
     * @param tablaD
     * @param datoFactura    
     * @param tipo
     */
    public void llenarDetalleTablaFacturasHistoricoNit(JTable tablaD, String datoFactura, String tipo) {

        //arregloProductosVendidos.clear();  //LIMPIA EL ARREGLO PARA QUE NO INTERFIERA CON HISTORICO DE FACTURA
        tablaD.setModel(modeloCanasta);
        ((DefaultTableModel) tablaD.getModel()).setRowCount(0); //Limpia las filas de la tabla para que no se sumen elementos
        ((DefaultTableModel) tablaD.getModel()).setColumnCount(0); //Limpia las columnas de la tabla para que no se sumen elementos
        ArrayList<DetalleFacturaVO> listaDetalleFactura = new ArrayList();
        
        String consulta = "";
        
        //Hace la consulta por consecutivo de factura
        if(tipo.equalsIgnoreCase("consecutivo")){
            consulta = "SELECT *FROM  detallefactura WHERE serialfactura = " + "'" + datoFactura + "'";
        }
        
        // Hace la consulta por el nit o cedula  del cliente 
        else if(tipo.equalsIgnoreCase("nit")){
            consulta = "SELECT *FROM  detallefactura WHERE idCliente = " + "'" + datoFactura + "'";
        }
        
        try {

            listaDetalleFactura = objDetalleFacturaDAO.listarDetalleFacturaDAO(consulta);
        } catch (Exception e) {

            String d = JOptionPane.showInputDialog("Numero de factura NO Valido (S)");
            if (d.equals("s")) {
                System.exit(0);
            }
        }

        if (!listaDetalleFactura.isEmpty()) {

            modeloCanasta.addColumn("CANT");
            modeloCanasta.addColumn("Codigo");
            modeloCanasta.addColumn("Nombre Producto");
            modeloCanasta.addColumn("Valor Producto");
            modeloCanasta.addColumn("V. total");

            Object[] columna = new Object[5];// Numero de Columnas

            listaDetalleFactura = objDetalleFacturaDAO.listarDetalleFacturaDAO(consulta);

            //Lo pasa al arreglo global arregloProductosVendidos
            setArregloProductosVendidos(listaDetalleFactura);

            int numRegistros = listaDetalleFactura.size();

            for (int i = 0; i < numRegistros; i++) {
                columna[0] = listaDetalleFactura.get(i).getCantidad();
                columna[1] = listaDetalleFactura.get(i).getCodigoProducto();
                columna[2] = listaDetalleFactura.get(i).getNombreProducto();
                columna[3] = listaDetalleFactura.get(i).getPrecioProducto();

                modeloCanasta.addRow(columna);
            }
        } else {
            JOptionPane.showInputDialog("Numero de factura NO valido Desea salir (S)");
        }

    }

    /**
     * Trae los datos del cliente de la factura seleccionada por el numero de
     * serie
     *
     * @param serialFactura
     * @return
     */
    public ArrayList llenarDatosClienteFacturaHistorico(String serialFactura) {

        ArrayList<FacturaVO> listaFacturas = new ArrayList();
        String consulta = "SELECT *FROM  factura WHERE idfactura = " + "'" + serialFactura + "'";
        System.out.println("la consulta para invocar los datos del cliente desde el historico son: " + consulta);

        try {

            listaFacturas = objFacturaDAO.listarFacturasDAO(consulta);

        } catch (Exception e) {
            System.out.println("Problemas invocando el metodo de listarFacturasDAO ");
        }

        return listaFacturas;

    }
    /**
     * 
     * @param nit
     * @return 
     */
    public ArrayList obtener_id_Factura_apartir_del_nit(String nit) {

        
        ArrayList<String> listaFacturas = new ArrayList();
        String consulta = "SELECT idfactura FROM  factura WHERE idcliente = " + "'" + nit + "'";
        System.out.println("la consulta para invocar los datos del serial de la factura a partir de la factura son: " + consulta);

        try {

            listaFacturas = objConsultas.arregloBD(consulta);

        } catch (Exception e) {
            System.out.println("NO se pudo realizar la busqueda sencilla para obtener el numero de nit de facturas con ese cliente ");
        }

        return listaFacturas;

    }
    
     /**
     * 
     * @param nombre
     * @return 
     */
    public ArrayList obtener_id_Factura_apartir_del_Nombre(String nombre) {
        
        ArrayList<String> listaFacturas = new ArrayList();
        String consulta = "SELECT idfactura FROM factura WHERE idcliente in\n" +
                          "(SELECT ced_nit_cliente FROM clientes WHERE nombrecliente LIKE UPPER ( " + "'%" + nombre + "%'))";
        System.out.println("la consulta para invocar los datos del serial de la factura a partir del nombre del cliente de la factura son: " + consulta);

        try {

            listaFacturas = objConsultas.arregloBD(consulta);

        } catch (Exception e) {
            System.out.println("NO se pudo realizar la busqueda sencilla para obtener el numero de facturas con ese cliente ");
        }

        return listaFacturas;

    }
    
    public ArrayList obtenerFacturasTodas() {
        
        ArrayList<String> listaFacturas = new ArrayList();
        String consulta = "SELECT idfactura FROM  factura ";
                          
        System.out.println("la consulta para invocar todas las facturas: " + consulta);

        try {

            listaFacturas = objConsultas.arregloBD(consulta);

        } catch (Exception e) {
            System.out.println("NO se pudo realizar la busqueda sencilla para obtener el numero de facturas con ese cliente ");
        }

        return listaFacturas;

    }
    
    
    

    //************************************************************************************************************
    /**
     * Crea un nuevo cliente en la base de datos, agregando una tupla completa a
     * la base de datos
     *
     * @param arrayClienteNuevo
     */
    public void crearCliente(ArrayList<String> arrayClienteNuevo) {

        String nom = arrayClienteNuevo.get(0);
        String idClie = arrayClienteNuevo.get(1);
        String dire = arrayClienteNuevo.get(2);
        String tel = arrayClienteNuevo.get(3);
        String ciu = arrayClienteNuevo.get(4);
        String email = arrayClienteNuevo.get(5);
        String publicidad;
        publicidad = arrayClienteNuevo.get(6);

        String respuestaRegistro = objClientesDAO.insertarCliente(nom, idClie, dire, tel, ciu, email, publicidad);
        
    }

    /**
     * Crea el producto en la base de datos con los valores que se envia desde
     * la clase que los toma en txField
     *
     * @param arregloProductos
     */
    public void crearProducto(ArrayList<String> arregloProductos) {

        String prod = arregloProductos.get(0);
        String codProd = arregloProductos.get(1);
        float cant;
        cant = Float.parseFloat(arregloProductos.get(2));
        float valcom;
        valcom = Float.parseFloat(arregloProductos.get(3));
        float valVen;
        valVen = Float.parseFloat(arregloProductos.get(4));
        String prov = arregloProductos.get(5);
        String descrip = arregloProductos.get(6);

        objProductoDAO.insertarProducto(prod, codProd, cant, valcom, valVen, prov, descrip);

        

    }

    /**
     * Crea una tupla de tipo empleado en la base de datos
     *
     * @param arregloEmpleados
     */
      public void crearEmpleado(ArrayList<String> arregloEmpleados) {
        
        ImageIcon icono = new ImageIcon("imagenes\\Iconos\\check.png");
        String emp = arregloEmpleados.get(0);
        String ced = arregloEmpleados.get(1);
        String usuario = arregloEmpleados.get(2);
        String clave = arregloEmpleados.get(3);
        String direccion = arregloEmpleados.get(4);
        String tel = arregloEmpleados.get(5);
        String tipo = arregloEmpleados.get(6);

        objEmpleadoDAO.insertarEmpleado(emp, ced, usuario, clave, direccion, tel, tipo);
        
        }

    /**
     * adiciona un proveedor en la base de datos
     *
     * @param arregloProveedor
     */
    public void crearProveedor(ArrayList<String> arregloProveedor) {

        String nom = arregloProveedor.get(0);
        String nit = arregloProveedor.get(1);
        String dir = arregloProveedor.get(2);
        String tel = arregloProveedor.get(3);
        String ciud = arregloProveedor.get(4);
        String email = arregloProveedor.get(5);

        objProveedorDAO.insertarProveedor(nom, nit, dir, tel, ciud, email);

    }

    /**
     * Adiciona una factura a la base de datos a partir de un arreglo que se
     * envia desde la clase canasta compras
     *
     * @param arregloFactura
     */
    public void crearFactura(ArrayList<String> arregloFactura) {

        String numFactura = arregloFactura.get(0);
        String idCliente = arregloFactura.get(1);
        String idEmpleado = arregloFactura.get(2);
        String hora = arregloFactura.get(3);
        String fecha = arregloFactura.get(4);

        objFacturaDAO.insertarFactura(numFactura, idCliente, idEmpleado, hora, fecha, sumaValorTotal);

    }

    /**
     * Termina de llenar el arrylist de detalle de la factura para luego
     * enviarlo a la base de datos este arraylist de detalle producto esta
     * amarrado a la factura por el serial
     *
     * @param cantidadVendida
     * @param serialFactura
     */
    public void creaDetalleFactura(int[] cantidadVendida, String[] serialFactura) {

        String nomProducto;
        String codProducto;
        float precioProducto;
        int cantidadProductos;
        String serieFactura;

        int numRegistros = getArregloProductosVendidos().size();
        int cantVendida;
        String serial;

        for (int i = 0; i < numRegistros; i++) {

            cantVendida = cantidadVendida[i];
            serial = serialFactura[i];
            arregloProductosVendidos.get(i).setCantidad(cantVendida);
            arregloProductosVendidos.get(i).setSerialFactura(serial);

        }

        for (int i = 0; i < numRegistros; i++) {

            nomProducto = arregloProductosVendidos.get(i).getNombreProducto();
            codProducto = arregloProductosVendidos.get(i).getCodigoProducto();
            precioProducto = arregloProductosVendidos.get(i).getPrecioProducto();
            cantidadProductos = arregloProductosVendidos.get(i).getCantidad();
            serieFactura = arregloProductosVendidos.get(i).getSerialFactura();

            System.out.print(arregloProductosVendidos.get(i).getNombreProducto() + "\t");
            System.out.print(arregloProductosVendidos.get(i).getCodigoProducto() + "\t");
            System.out.print(arregloProductosVendidos.get(i).getPrecioProducto() + "\t");
            System.out.print(arregloProductosVendidos.get(i).getCantidad() + "\t");
            System.out.print(arregloProductosVendidos.get(i).getSerialFactura() + "\n");

            objDetalleFacturaDAO.insertarDetalleFactura(nomProducto, codProducto, precioProducto, cantidadProductos, serieFactura);
            
            restaProductosInventario(codProducto, cantidadProductos);
        }

    }

    //************************************************************************************************
    //              ACTUALIZACIONES
    public void actualizarProducto(ArrayList<String> arregloProductos) {

        String prod = arregloProductos.get(0);
        String codProd = arregloProductos.get(1);
        float cant;
        cant = Float.parseFloat(arregloProductos.get(2));
        float valcom;
        valcom = Float.parseFloat(arregloProductos.get(3));
        float valVen;
        valVen = Float.parseFloat(arregloProductos.get(4));
        String prov = arregloProductos.get(5);
        String descrip = arregloProductos.get(6);

        objProductoDAO.actualizarProducto(prod, codProd, cant, valcom, valVen, prov, descrip);       
        
    }

    public void actualizarProveedor(ArrayList<String> arregloProveedor) {

        String nom = arregloProveedor.get(0);
        String nit = arregloProveedor.get(1);
        String dir = arregloProveedor.get(2);
        String tel = arregloProveedor.get(3);
        String ciud = arregloProveedor.get(4);
        String email = arregloProveedor.get(5);

        objProveedorDAO.actualizarProveedor(nom, nit, dir, tel, ciud, email);
        
    }

    public void actualizarCliente(ArrayList<String> arrayClienteNuevo) {

        String nom = arrayClienteNuevo.get(0);
        String idClie = arrayClienteNuevo.get(1);
        String dire = arrayClienteNuevo.get(2);
        String tel = arrayClienteNuevo.get(3);
        String ciu = arrayClienteNuevo.get(4);
        String email = arrayClienteNuevo.get(5);
        String publicidad;
        publicidad = arrayClienteNuevo.get(6);

        String respuestaRegistro = objClientesDAO.actualizarCliente(nom, idClie, dire, tel, ciu, email, publicidad);

//        if (respuestaRegistro != null) {
//            JOptionPane.showMessageDialog(null, "Cliente Actualizado");
//        } else {
//            JOptionPane.showMessageDialog(null, "Registro Erroneo");
//        }
    }

    public void actualizarEmpleado(ArrayList<String> arregloEmpleados) {

        String emp = arregloEmpleados.get(0);
        String ced = arregloEmpleados.get(1);
        String usuario = arregloEmpleados.get(2);
        String clave = arregloEmpleados.get(3);
        String direccion = arregloEmpleados.get(4);
        String tel = arregloEmpleados.get(5);
        String tipo = arregloEmpleados.get(6);

        objEmpleadoDAO.actualizarEmpleado(emp, ced, usuario, clave, direccion, tel, tipo);

    }

    //******************  ELIMINACIONES  ***********************************************************************************
    public void eliminarProducto(String idProducto) {

        objProductoDAO.eliminarProducto(idProducto);
    }

    public void eliminarProveedor(String nitProveedor) {

        objProveedorDAO.eliminarProveedor(nitProveedor);
    }

    public void eliminarCliente(String idCliente) {

        objClientesDAO.eliminarCliente(idCliente);
    }

    public void eliminarEmpleado(String cedulaEmpleado) {
        String mensaje = "";
        objEmpleadoDAO.eliminarEmpleado(cedulaEmpleado);
        
    }

    //***********************************************************************************************
    /**
     * valida que el usuario y la contraseña de la persona que se este
     * registrando esten creados en la BD
     *
     * @param usuario
     * @param clave
     * @return
     */
    public String[] login(String usuario, String clave) {

        boolean aceptado = false;
        ArrayList<String> arregloSalida = new ArrayList<>();
        String[] arregloLogin = new String[2];
        String user = "vacio";
        String password = "vacio";
        String claveEncriptada = DigestUtils.md5Hex(clave);

        System.out.println("Usuario: " + user + "     password   " + claveEncriptada);
        try {

            String consulta = "SELECT nombreempleado, cedula, usuario,clave,tipoempleado FROM empleado "
                    + "  WHERE usuario = " + "'" + usuario + "' AND clave = " + " '" + claveEncriptada + "'";

            arregloSalida = objConsultas.devuelteArreglo(consulta, 5);

            if (!arregloSalida.isEmpty()) {
                nombreEmpleado = arregloSalida.get(0);
                cedulaEmpleado = arregloSalida.get(1);
                user = arregloSalida.get(2);
                password = arregloSalida.get(3);
                tipoEmpleado = arregloSalida.get(4);

                System.out.println(nombreEmpleado + user + password + tipoEmpleado);

                if (password.equalsIgnoreCase(claveEncriptada) && user.equalsIgnoreCase(usuario)) {
                    System.out.println("FELICIDADES  ****" + arregloSalida.get(0));
                    aceptado = true;
                    arregloLogin[0] = "true";
                    arregloLogin[1] = tipoEmpleado;

                }
            } else {

                int reply = JOptionPane.showConfirmDialog(null, "Desea Salir", "Contraseña No Valida", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                //Cuando Cancela        
                if (reply == JOptionPane.OK_CANCEL_OPTION) {

                } //Cuando Aprueba
                else if (reply == JOptionPane.OK_OPTION) {
                    System.exit(0);

                }

            }

        } catch (Exception e) {

        }

        System.out.println("El valor del booleano es: " + aceptado);
        return arregloLogin;
    }

    //
    public ArrayList buscarEmpleados(String consulta) {

        ArrayList<String> arregloSalida = new ArrayList<>();

        arregloSalida = objConsultas.devuelteArreglo(consulta, 2);
        return arregloSalida;

    }
    /**
     * 
     * @param consulta
     * @return 
     */
    public ArrayList buscarIDclientes(String consulta) {

        ArrayList<String> arregloSalida = new ArrayList<>();

        arregloSalida = objConsultas.devuelteArreglo(consulta, 1);
        return arregloSalida;

    }

    /**
     * Metodo que busca en la base de datos productos que tengan existencias
     * menores a un dato ingresado por el usuario
     *
     * @param existencias
     * @param tabla
     */
    public void consultas(int existencias, JTable tabla) {

        ArrayList<String> arregloConsultaExistencias = new ArrayList<>();
        String consulta;

        // consulta = "SELECT producto.nombreproducto, producto.codproducto,cantidad FROM producto WHERE cantidad >" +existencias;
        consulta = "SELECT * FROM producto WHERE cantidad <" + existencias;

        arregloConsultaExistencias = objConsultas.devuelteArreglo(consulta, 3);

        llenarTablaProductos(tabla, consulta);

    }

    public void totalDineroInventario(JLabel total) {

        String valorTotal;
        String consulta;
        DecimalFormat formatea = new DecimalFormat("###,###.##"); ////Coloca puntos decimales 
        float numero;     
       
        consulta = "SELECT SUM( valorcompraproducto * cantidad) FROM producto";

        valorTotal = objConsultas.consultaString(consulta); 
        System.out.println("total dinero inventario " + valorTotal);
        
        valorTotal = valorTotal.substring(0, valorTotal.length() - 3); //linea para quitar ceros adicionales a la derecha
        numero = Float.valueOf(valorTotal);
        
        total.setText(formatea.format(numero));
    }

    public void ganancia(JLabel lbGanancia) {

        String ganancia;
        DecimalFormat formatea = new DecimalFormat("###,###.##"); ////Coloca puntos decimales 
        float numero;
        String consulta = "SELECT  SUM((valorventaproducto * cantidad)-(valorcompraproducto * cantidad) ) suma\n"
                + "FROM producto";
        
        
        ganancia = objConsultas.consultaString(consulta);
        System.out.println("ganancia " + ganancia);
        
        ganancia = ganancia.substring(0, ganancia.length() - 4); //linea para quitar ceros adicionales a la derecha
        numero = Float.valueOf(ganancia);
        lbGanancia.setText(formatea.format(numero));

    }

    public void totalProductos(JLabel lbProducto) {

        String total;
        DecimalFormat formatea = new DecimalFormat("###,###"); //Coloca puntos decimales 
        float prueba ;
        
        String consulta = "SELECT  SUM(cantidad) suma\n"
                + "              FROM producto";

        total = objConsultas.consultaString(consulta);
        System.out.println("Total Productos " + total);
        
        total = total.substring(0, total.length() - 3); //linea para quitar ceros adicionales a la derecha
        prueba = Float.valueOf(total);
        
        lbProducto.setText(""+formatea.format(prueba));

    }

    ///*****************************************************************************************************************
    ////                METODOS DE LA CLASE VENTAS
    //*****************************************************************************************************************
    /**
     * Valida si un cliente esta creado en la base de datos
     *
     * @param labelInformacionVentas
     * @param txID_cliente_ventas
     */
    public boolean consultarIdCliente(JLabel labelInformacionVentas, String txID_cliente_ventas) {

        boolean cliente = false;

        arregloClienteFactura = objClientesDAO.listarClienteFactura(txID_cliente_ventas);

        if (arregloClienteFactura.isEmpty() || arregloClienteFactura == null) {
           // JOptionPane.showInputDialog(this, "No hay datos para Mostrar");
            labelInformacionVentas.setText("NO hay datos para Mostrar, cliente no creado");

        } else {

            String nombre = arregloClienteFactura.get(0).getNombreCliente();

            System.out.println("El nombre es: " + nombre);

            labelInformacionVentas.setText("Cliente Encontrado:  " + arregloClienteFactura.get(0).getNombreCliente());
            cliente = true;

            System.out.println(arregloClienteFactura.get(0).getNombreCliente());
            System.out.println(arregloClienteFactura.get(0).getIdCliente());
            System.out.println(arregloClienteFactura.get(0).getDireccion());
            System.out.println(arregloClienteFactura.get(0).getTelefono());

        }
        return cliente;
    }

    /**
     * LLena el combobox en la clase ventas para hacer limitar la busqueda
     *
     * @param cBoxMostrarProductosVentas
     */
    public void llenarComboboxVentas(JComboBox cBoxMostrarProductosVentas) {

        //btMostrarInformacionTablas.setEnabled(false);
        ArrayList<String> arregloEntrada = new ArrayList<String>();
        String sacaTabla = "SELECT nombreproducto FROM producto";
        arregloEntrada = objConsultas.arregloBD(sacaTabla);
        Iterator<String> nombreIterator = arregloEntrada.iterator();

        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();

        }

        for (int i = 0; i < arregloEntrada.size(); i++) {
            String tipo = (String) arregloEntrada.get(i);
            cBoxMostrarProductosVentas.addItem(tipo);
        }
    }

    /**
     * Adiciona un elemento seleccionado de la venta y pasa a la variable global
     * arregloProductoVendidos que es consultado por otros metodos de esta
     * clase.
     *
     * @param arregloProductos
     */
    public void mostrarProductos(ArrayList<DetalleFacturaVO> arregloProductos) {

        arregloProductosVendidos = arregloProductos;
        for (int i = 0; i < arregloProductos.size(); i++) {
            System.out.println(arregloProductos.get(i).getNombreProducto());
            System.out.println(arregloProductos.get(i).getCodigoProducto());
            System.out.println(arregloProductos.get(i).getPrecioProducto());
        }

    }

    /**
     * LLena la tabla que aparece en la canasta de compras con los productos
     * seleccionados en el frame ventas para agregarles la cantidad
     *
     * @param tablaD
     */
    public void llenarTablaCanasta(JTable tablaD) {
        //DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(modeloCanasta);
        ((DefaultTableModel) tablaD.getModel()).setRowCount(0); //Limpia las filas de la tabla para que no se sumen elementos
        ((DefaultTableModel) tablaD.getModel()).setColumnCount(0); //Limpia las columnas de la tabla para que no se sumen elementos
        modeloCanasta.addColumn("CANT");
        modeloCanasta.addColumn("Codigo");
        modeloCanasta.addColumn("Nombre Producto");
        modeloCanasta.addColumn("Valor Producto");
        modeloCanasta.addColumn("V. total");

        Object[] columna = new Object[5];// Numero de Columnas

        int numRegistros = arregloProductosVendidos.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[1] = arregloProductosVendidos.get(i).getCodigoProducto();
            columna[2] = arregloProductosVendidos.get(i).getNombreProducto();
            columna[3] = formatea.format(arregloProductosVendidos.get(i).getPrecioProducto());

            modeloCanasta.addRow(columna);
        }

    }

    /**
     * Calcula los datos de la factura a partir de la seleccion que se hacen en
     * la vista de ventas
     *
     * @param tablaD
     * @param labelIva
     * @param labelTotal
     */
    public Boolean operaDatosTablaVentas(JTable tablaD, JLabel labelIva, JLabel labelTotal) {
        
        
        Boolean calculado = false;
        sumaValorTotal = 0;
        tablaD.setModel(modeloCanasta);
        float valorTotalProducto;
        Double iva;
        iva = 0.0;
        System.out.println("Entro a la funcion opera datos ");
        int numRegistros = getArregloProductosVendidos().size();

        System.out.println("tamaño del arreglo:  " + numRegistros);

        float[] cantidadFloat = new float[numRegistros];
        float[] valorFloat = new float[numRegistros];

        try {

            for (int i = 0; i < numRegistros; i++) {

                cantidadFloat[i] = Float.parseFloat(String.valueOf(modeloCanasta.getValueAt(i, 0)));  // Se uso el casting String.valueOf ya que el (String) solo produjo errores                  

                valorFloat[i] = sacarPrecioProducto(String.valueOf(modeloCanasta.getValueAt(i, 1)));  // Se uso el casting String.valueOf ya que el (String) solo produjo errores

                valorTotalProducto = cantidadFloat[i] * valorFloat[i]; // multiplica el valor por la cantidad de productos
                sumaValorTotal += valorTotalProducto;

                tablaD.setValueAt(formatea.format(valorTotalProducto), i, 4);          //seta el total del valor de cada producto en la tabla

            }
            System.out.println("el valor de la suma es" + sumaValorTotal);
            iva = sumaValorTotal * 0.19;
            labelIva.setText(formatea.format(iva) + "");
            labelTotal.setText(formatea.format(sumaValorTotal) + "");
            calculado = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Agregue Cantidades a los Productos","Recuerde",JOptionPane.WARNING_MESSAGE);
        }
        //arregloProductosVendidos.clear();  //LIMPIA EL ARREGLO PARA QUE NO INTERFIERA CON HISTORICO DE FACTURA
        return calculado;
    }

    /**
     * Como el numero de la factura es una atributo de tipo serial se ira
     * incrementando, es por eso que sacamos el maximo del id y con esto
     * obtendriamos el numero de la ultima factura y en otro metodo le sumamos
     * uno para crear el consecutivo
     *
     * @return
     */
    public String asignarNuevoNumFactura() {

        String consulta = "SELECT MAX(idfactura)FROM factura";
        String ultimoNumeroFactura = objConsultas.consultaString(consulta);

        if (ultimoNumeroFactura == null) {  // Al inicio del programa cuando no exista ningun serial se asigna 0 por defecto
            ultimoNumeroFactura = "0";
        }

        return ultimoNumeroFactura;

    }

    public ArrayList getDatosClienteCanasta() {

        System.out.println(arregloClienteFactura.get(0).getNombreCliente());
        System.out.println(arregloClienteFactura.get(0).getIdCliente());
        System.out.println(arregloClienteFactura.get(0).getDireccion());
        System.out.println(arregloClienteFactura.get(0).getTelefono());

        return arregloClienteFactura;

    }
    
    public Float sacarPrecioProducto(String codProducto) {
        
        String consulta = "SELECT valorventaproducto FROM producto WHERE codproducto = '" + codProducto + "'";
        String precioProducto =objConsultas.consultaString(consulta);
        
        System.out.println("El valor del producto de la base de datos es: " + precioProducto); 
        float valorProducto = 0;
        String valor;
        try {
        //  valorProducto = ((float)tablaVentasProductos.getValueAt(row, 3));
           // valor = String.valueOf(consulta);
            valorProducto = Float.valueOf(precioProducto);
            System.out.println("El valor del producto el metodo sacar prooducto es" + valorProducto);

        } catch (Exception e) {
            System.out.println("Imposible realizar la conversion" + e);
        }
        return valorProducto;
    }
    
    
    public void restaProductosInventario(String codProducto, int cantidad){
        
       
        String consulta = "UPDATE producto SET  cantidad = cantidad - " + cantidad +" WHERE codProducto = '" + codProducto+"'";
        String resultado = objConsultas.consultaString(consulta);
    }

    //****************************************************************************************
    //****************************************************************************************
   
    public String empleadoSesionAbierta() {

        return nombreEmpleado;
    }

    public String getTipoEmpleadoSesionAbierta() {

        return tipoEmpleado;
    }

    public String cedulaEmpleadoSesionAbierta() {

        return cedulaEmpleado;
    }

    public ArrayList getArregloProductosVendidos() {
        return arregloProductosVendidos;
    }

    public void setArregloProductosVendidos(ArrayList arregloVendidos) {
        arregloProductosVendidos = arregloVendidos;
    }

    public void generarReportesGraficos(String titulo, String nomColumnaY, String nomColumnaX) {

        ArrayList<String> arregloNombre;
        arregloNombre = new ArrayList<>();
        ArrayList<Integer> arregloTotalProductos = new ArrayList<>();

        ArrayList<String> arregloSalida = new ArrayList<>();
        

        String consulta = "select  nombreproducto, sum(cantidad) as total from detallefactura group by\n"
                + "nombreproducto order by total desc limit 5";

        arregloSalida = objConsultas.devuelteArreglo(consulta, 2);

        int numRegistros = arregloSalida.size();

//        System.out.println("Tamannio arreglo de productos " + numRegistros);

        Iterator<String> nombreIterator = arregloSalida.iterator();
//        while (nombreIterator.hasNext()) {
//            String elemento = nombreIterator.next();
//            System.out.println(elemento);
//        }       
 
        for (int i = 0; i < numRegistros; i++) {
            if (i % 2 == 0) {

                arregloNombre.add(arregloSalida.get(i));

            }
        }
        
        for (int i = 0; i < numRegistros; i++) {
            if (i % 2 != 0) {

                arregloTotalProductos.add(Integer.parseInt(arregloSalida.get(i)));

            }
        }
        


        int cantidad1 = arregloTotalProductos.get(0);
        int cantidad2 = arregloTotalProductos.get(1);
        int cantidad3 = arregloTotalProductos.get(2);
        int cantidad4 = arregloTotalProductos.get(3);
        int cantidad5 = arregloTotalProductos.get(4);

        String producto1 = arregloNombre.get(0);
        String producto2 = arregloNombre.get(1);
        String producto3 = arregloNombre.get(2);
        String producto4 = arregloNombre.get(3);
        String producto5 = arregloNombre.get(4);

        try {
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            ds.addValue(cantidad1, producto1, "");
            ds.addValue(cantidad2, producto2, "");
            ds.addValue(cantidad3, producto3, "");
            ds.addValue(cantidad4, producto4, "");
            ds.addValue(cantidad5, producto5, "");

            JFreeChart ConfiguracionGrafico = ChartFactory.createBarChart3D(titulo, nomColumnaX,
                    nomColumnaY, ds, PlotOrientation.VERTICAL, true, true, true);

            ChartFrame f = new ChartFrame("Reportes Gráficos", ConfiguracionGrafico);
            f.setSize(900, 600);// x, y
            f.setLocationRelativeTo(null);
            f.setVisible(true);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

}//Fin de la clase
