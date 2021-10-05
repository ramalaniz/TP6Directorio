/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtp6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author rataq
 */
public class Directorio {
   private TreeMap<String, Cliente> agenda = new TreeMap<>();
   
   public boolean agregarCliente(String tel, Cliente abonado){
       if(agenda.put(tel, abonado)==null){
       }
       return false;
   }
   
   public Cliente buscarCliente(String tel){
       return agenda.get(tel);
   }
   
   public List<String> buscarTelefono(String apellido){
       ArrayList<String> buscarNumTel = new ArrayList<>();
       
       Set<String> clavesTel = agenda.keySet();
       
       for(String clave : clavesTel){
           Cliente abonado = agenda.get(clave);
            if(abonado.getApellido().equals(apellido)){
            buscarNumTel.add(clave);
            }
       }
      return buscarNumTel;
   }
   
   public List<Cliente> buscarClientes(String ciudad){
       ArrayList<Cliente> clientes = new ArrayList<>();
       
       Set<String> clavesCli = agenda.keySet();
       
       for(String clave: clavesCli){
           Cliente abonado = agenda.get(clave);
            if(abonado.getCiudad().equals(ciudad)){
            clientes.add(agenda.get(ciudad));
            }
       }
      return clientes;
   }
   
   public TreeMap<String, Cliente> borrarCliente(String dni){
       TreeMap<String, Cliente> borrarAbonado = new TreeMap<>();
        
        Set<String> clavesCli = agenda.keySet();
        
        for(String clave: clavesCli){
            Cliente abonado = agenda.get(clave);
            if(abonado.getDni().equals(dni)){
            borrarAbonado.put(clave, abonado);
                agenda.remove(clave);
                return borrarAbonado;
            }
        }
        return null;
   }
    
}
