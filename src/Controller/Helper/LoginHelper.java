/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import pages.Login;

/**
 *
 * @author Jhonatan
 */
public class LoginHelper {
    
    private final Login pages;

    public LoginHelper(Login pages) {
        this.pages = pages;
    }
    
    public Usuario obterModelo(){
        
        String nome = pages.getLocalEmail().getText();
        String senha = pages.getLocalSenha().getText();
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        pages.getLocalEmail().setText(nome);
        pages.getLocalSenha().setText(senha);
        
    }
    
    
        public void LimparTela(){
            pages.getLocalEmail().setText("");
            pages.getLocalSenha().setText("");
        }
    
    
}
