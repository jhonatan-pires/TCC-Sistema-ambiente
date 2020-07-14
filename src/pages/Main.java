/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import Model.Cliente;
import Model.Registro;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Jhonatan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String nome = "Jhonatan";
        System.out.println(nome);
        
        Servico servico = new Servico(2, "desmatamento", "eita", 0527);
        
        System.out.println(servico.getDesmatamento());
        System.out.println(servico.getValor());
        int id = 0;
        
        Cliente cliente = new Cliente("1213213112", "wkencwen", "teste", 2);
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "jhon", "alves");
        System.out.println(usuario.getNome());
        
        Registro registro = new Registro(cliente, servico, id);
        System.out.println(registro.getCliente().getNome());
    }
    
}
