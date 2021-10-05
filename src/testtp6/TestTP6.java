/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtp6;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rataq
 */
public class TestTP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente r = new Cliente("28926408", "Rama", "Alaniz", "San Luis", "Av C C 1821");
        Cliente v = new Cliente("31542776", "Vicky", "Romero", "Mendoza", "Junin 1559");
        Cliente f = new Cliente("37822390", "Flor", "Munoz", "San Luis", "Retamo Viejo 10");
        
        String tel1 = "2664639132";
        String tel2 = "2664371791";
        String tel3 = "2664650907";
        
        Directorio agenda = new Directorio();
        
        if(agenda.agregarCliente(tel1, r)){
            JOptionPane.showMessageDialog(null, "Agregado Correctamente");
        }
        if(agenda.agregarCliente(tel2, v)){
            JOptionPane.showMessageDialog(null, "Agregado Correctamente");
        }
        if(agenda.agregarCliente(tel3, f)){
            JOptionPane.showMessageDialog(null, "Agregado Correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "No Agregado");
        }
        
        List<Cliente> listado = agenda.buscarClientes("San Luis");
        for (Cliente it:listado){
            /*System.out.println(it.getNombre());
            System.out.println(it.getApellido());
            System.out.println(it.getDni());
            System.out.println(it.getDireccion());*/
        }
    }

}
