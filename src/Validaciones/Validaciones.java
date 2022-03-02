
package Validaciones;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ALLCH
 */
public class Validaciones {

    public ArrayList validarCamposVacios(ArrayList variable) {

        //Boolean valido = false;
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < variable.size(); i++) {
            //if (variable.get(i) == 0)
            if (variable.get(i).equals("")) {
                System.out.println("Carpeta validaciones - vacio " + i);
                resultado.add(i);
            }

        }

        return resultado;

    }
    
    public Boolean validarUnCampoVacio(String variable) {

        Boolean valido = true;
        ArrayList<Integer> resultado = new ArrayList<>();

        
           
            if (variable.equalsIgnoreCase("")) {
                
                valido = false;
            }

        

        return valido;

    }
    
    public Boolean validarDatoNumerico(String valor) {

        try {
            if (valor != null) {
                Float.parseFl
package Validaciones;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ALLCH
 */
public class Validaciones {

    public ArrayList validarCamposVacios(ArrayList variable) {

        //Boolean valido = false;
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < variable.size(); i++) {
            //if (variable.get(i) == 0)
            if (variable.get(i).equals("")) {
                System.out.println("Carpeta validaciones - vacio " + i);
                resultado.add(i);
            }

        }

        return resultado;

    }
    
    public Boolean validarUnCampoVacio(String variable) {

        Boolean valido = true;
        ArrayList<Integer> resultado = new ArrayList<>();

        
           
            if (variable.equalsIgnoreCase("")) {
                
                valido = false;
            }

        

        return valido;

    }
    
    public Boolean validarDatoNumerico(String valor) {

        try {
            if (valor != null) {
                Float.parseFloat(valor);
                Double.parseDouble(valor);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("la validadacion del dato numerico dio false");
            return false;
        }
        System.out.println("la validadacion del dato numerico dio True");
        return true;
    }
    
    //metodo para validar correo electronio
    public boolean emailCorrecto(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        } else {
            return false;
        }
    }

}
    


