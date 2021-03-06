?PNG

   IHDR   <   <   :??r  ?IDATh??????0@)?,?,??C??p??CJ??_?%X?%x?KJ??????C?L?̾???2?Lĸ?eAAD?VG??
? ?'?`?x-?>?%?D+A`[?=?V.?-?>lU??:z??8~ӫ???`;???????Wx??őX?3	?pz?0	?*?	?p??H?0	?*?	?p??	Jiv?UB?@`7̟?S??<&?*̃??Ia???6P?n??/???>??,??A???&	?~k:????cf{G?'???s?x?y?rta?0?7??a9????p.?p?ȟm??f瓷a??\?>yqOR??fgk?	}?????St?,sn??tV{????᫐?p??'?L???dm'?d??̶??????e???ǠI	??[a\5L??&0Λ???9?pHH??CG????U?t?N????<?N?|b?????7[~σ	4>??/<?&Ʉ?g???
s&Z????%?2? ?H?_O????-A    IEND?B`?/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
import ConexionDB.ConexionBD;
import ModeloVO.ClientesVO;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ALLCH
 */
public class ClientesDAO {
    
    ConexionBD conexion;

    public ClientesDAO() {
        conexion = new ConexionBD();
    }
    /**
     * 
     * @param nombreCliente
     * @param apellidos
     * @param idCliente
     * @param direccion
     * @param telefono
     * @param ciudad
     * @param email
     * @param publicidad
     * @return 
     */
    public String insertarCliente(String nombreCliente,  String idCliente,
            String direccion, String telefono, String ciudad, String email, String publicidad) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = ("SELECT llenaTablaClientes ('" + nombreCliente  + "','" + idCliente + "','" + direccion + "','" + telefono + "','" + ciudad + "','" + email + "','" + publicidad + "')");
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: ");

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");
            
            respuestaRegistro = "Cliente Creado Exitosamente";

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." + se);
        }

        return respuestaRegistro;
    }
    
    /**
     * 
     * @return 
     */
    
    public ArrayList<ClientesVO> listarClientes(){
        
        ArrayList listaClientes = new ArrayList();
        ClientesVO clientes;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM clientes");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                clientes = new ClientesVO();
                
                clientes.setNombreCliente(rs.getString(1));                
                clientes.setIdCliente(rs.getString(2));
                clientes.setDireccion(rs.getString(3));
                clientes.setTelefono(rs.getString(4));
                clientes.setCiudad(rs.getString(5));
                clientes.setEmail(rs.getString(6));
                clientes.setPublicidad(rs.getString(7));
                
                listaClientes.add(clientes);
            }
        } catch (Exception e) {
            System.out.println("listar clientes" + e);
        }
        
        return listaClientes;
    }
    
    public String actualizarCliente(String nombreCliente,  String idCliente,
            String direccion, String telefono, String ciudad, String email, String publicidad) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "UPDATE clientes SET  nombreCliente = '" + nombreCliente + "', ced_nit_cliente= '" + idCliente 
                + "',direccioncliente= '" + direccion + "', telefonocliente ='" + telefono + "', ciudad ='" + ciudad + 
                            "', email= '" + email + "', publicidad= '" + publicidad + "' WHERE ced_nit_cliente = '" + idCliente +"'";
        System.out.println(consulta);

        try {

            try (Connection accesoDB = conexion.getConexion()) {
                stmt = accesoDB.createStatement();
                
                ResultSet rs = stmt.executeQuery(consulta);
            }

            System.out.println("Base de datos cerrada");
            
            respuestaRegistro = "Cliente Creado Exitosamente";

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." +se);
        }

        return respuestaRegistro;
    }
    
    public String eliminarCliente(String idCliente){

        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "DELETE FROM clientes WHERE ced_nit_cliente = '" + idCliente+"';";
                
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: ");

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base." + se.getMessage());
        }

        return respuestaRegistro;
    }
    
    
    
    /**
     * consulta los datos de un cliente a partir de la cedula o nit
     * @param consulta
     * @return 
     */
    public ArrayList<ClientesVO> listarClienteFactura(String consulta){
        
        ArrayList listaClientes = new ArrayList();
       
        ClientesVO clientes;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM clientes WHERE ced_nit_cliente = '" + consulta +"'" );
            System.out.println("La sentencia es: " +ps);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                clientes = new ClientesVO();
                
                clientes.setNombreCliente(rs.getString(1));
               
                clientes.setIdCliente(rs.getString(2));
                clientes.setDireccion(rs.getString(3));
                clientes.setTelefono(rs.getString(4));
                clientes.setCiudad(rs.getString(5));
                clientes.setEmail(rs.getString(6));
                clientes.setPublicidad(rs.getString(7));
                
                listaClientes.add(clientes);
            }
        } catch (Exception e) {
            System.out.println("No se ha podido cerrar la base." + e);
        }
        
        return listaClientes;
    }
    
    
    
}
    

