/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import pages.Login;
import pages.Homepage;

/**
 *
 * @author Jhonatan
 */
public class LoginController {
    private final Login pages;
    private LoginHelper helper;

    public LoginController(Login pages) {
        this.pages = pages;
        this.helper = new LoginHelper(pages);
    }
    
    public void EntrarNoSistema(){
        
        //pegar usuario da pages
       Usuario usuario = helper.obterModelo();
       
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
    
       if(usuarioAutenticado != null){
           Homepage home = new Homepage();
           home.setVisible(true);
           this.pages.dispose();
           
       }else{
           pages.exibeMensagem("Usuario ou senha invalidos");
       }
    }
    
     public void MeioAmbiente(){
        System.out.println("Busquei algo do Banco de dados");
        
        this.pages.exibeMensagem("Executei");
        
    }
    
    
}