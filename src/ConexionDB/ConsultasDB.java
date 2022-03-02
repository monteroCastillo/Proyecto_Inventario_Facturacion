/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import ModeloDAO.*;
import ModeloVO.ProveedorVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ALLCH
 */
public class ConsultasDB {

    ConexionBD conexion;

    public ConsultasDB() {
        conexion = new ConexionBD();
    }

    public String consultaString(String consulta) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        //String consulta = "SELECT llenaTablaProveedor('" + nombreProveedor + "','" + nit + "','" + direccionProveedor + "','" + telefonoProveedor + "','" + ciudad + "','" + email  +  "')";
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                respuestaRegistro = rs.getString(1);

            }

            accesoDB.close();

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." + se);
        }

        return respuestaRegistro;
    }

    public int actualiza(String consulta) {

        int filasAfectadas = 0;
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        //String consulta = "SELECT llenaTablaProveedor('" + nombreProveedor + "','" + nit + "','" + direccionProveedor + "','" + telefonoProveedor + "','" + ciudad + "','" + email  +  "')";
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: " + consulta);

            filasAfectadas = stmt.executeUpdate(consulta);

            accesoDB.close();

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." + se);
        }

        return filasAfectadas;
    }

    /**
     *
     * @param consulta
     * @param numColums
     * @return
     */
    public ArrayList devuelteArreglo(String consulta, int numColums) {

        ArrayList<String> arregloSalida = new ArrayList<>();

        int contador = 0;
        Connection db = null;
        Statement stmt;
        System.out.println(consulta);

        try {

            try (Connection accesoDB = conexion.getConexion()) {
                stmt = accesoDB.createStatement();
      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import ModeloDAO.*;
import ModeloVO.ProveedorVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ALLCH
 */
public class ConsultasDB {

    ConexionBD conexion;

    public ConsultasDB() {
        conexion = new ConexionBD();
    }

    public String consultaString(String consulta) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        //String consulta = "SELECT llenaTablaProveedor('" + nombreProveedor + "','" + nit + "','" + direccionProveedor + "','" + telefonoProveedor + "','" + ciudad + "','" + email  +  "')";
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                respuestaRegistro = rs.getString(1);

            }

            accesoDB.close();

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." + se);
        }

        return respuestaRegistro;
    }

    public int actualiza(String consulta) {

        int filasAfectadas = 0;
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        //String consulta = "SELECT llenaTablaProveedor('" + nombreProveedor + "','" + nit + "','" + direccionProveedor + "','" + telefonoProveedor + "','" + ciudad + "','" + email  +  "')";
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: " + consulta);

            filasAfectadas = stmt.executeUpdate(consulta);

            accesoDB.close();

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." + se);
        }

        return filasAfectadas;
    }

    /**
     *
     * @param consulta
     * @param numColums
     * @return
     */
    public ArrayList devuelteArreglo(String consulta, int numColums) {

        ArrayList<String> arregloSalida = new ArrayList<>();

        int contador = 0;
        Connection db = null;
        Statement stmt;
        System.out.println(consulta);

        try {

            try (Connection accesoDB = conexion.getConexion()) {
                stmt = accesoDB.createStatement();
                ResultSet rs = stmt.executeQuery(consulta);
                while (rs.next()) {
                    ++contador;
                    for (int i = 1; i <= numColums; i++) {
                        arregloSalida.add(rs.getString(i));
                    }
                    
                    System.out.println("el valor del contador es " + contador);
                }
                /* Cerramos la conexi�n a la base de datos */
            }

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        System.out.println("El tama�o del arrayList es: " + arregloSalida.size());
        return arregloSalida;
    }

public ArrayList arregloBD(String consulta) {
        
    
        String valido = "";
        ArrayList<String> arregloSalida = new ArrayList<>();

        int contador = 0;
        Connection db = null;
        Statement stmt;
        //String consulta = "SELECT llenaTablaProveedor('" + nombreProveedor + "','" + nit + "','" + direccionProveedor + "','" + telefonoProveedor + "','" + ciudad + "','" + email  +  "')";
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            while (rs.next()) {
                arregloSalida.add(rs.getString(1)); 
                        valido = rs.getString(1);
                        System.out.println("el valor de la consulta es " +valido);
                      
            }

            /* Cerramos la conexi�n a la base de datos */
            accesoDB.close();

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        System.out.println("El tama�o del arrayList es: " + arregloSalida.size());
        return arregloSalida;
    }

    /**
     * 
     * @return 
     */

    public ArrayList<ProveedorVO> listarProveedores() {

        ArrayList listaProveedores = new ArrayList();
        ProveedorVO proveedor;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM proveedores");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                proveedor = new ProveedorVO();

                proveedor.setNombreProveedor(rs.getString(1));
                proveedor.setNit(rs.getString(2));
                proveedor.setDireccioProveedor(rs.getString(3));
                proveedor.setTelefonoProveedor(rs.getString(4));
                proveedor.setCiudad(rs.getString(5));
                proveedor.setEmail(rs.getString(6));

                listaProveedores.add(proveedor);
            }
        } catch (Exception e) {
        }

        return listaProveedores;
    }

}
