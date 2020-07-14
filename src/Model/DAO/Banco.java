/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Registro;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Registro> registro;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        registro = new ArrayList<Registro>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(2, "adm", "serio");
        Usuario usuario2 = new Usuario(1, "admin", "senha");
         
        Cliente cliente1 = new Cliente(null, null, 222222, 1, null);
        Cliente cliente2 = new Cliente(null, null, 555555, 0, null);
  
        Servico servico1 = new Servico(55, null, null, 88888);
        Servico servico2 = new Servico(1, null, null, 88888);
 

        Registro registro1 = new Registro(cliente2, servico2, 33);
     
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
       
        
        servico.add(servico1);
        servico.add(servico2);
      
        
        registro.add(registro1);
        
        
    }

    public static void inicial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
