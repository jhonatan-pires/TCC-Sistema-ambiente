/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jhonatan
 */
public class Usuario extends Pessoa{
    
    protected String senha;
    protected String nivelAcesso;   

    public Usuario(int id, String nome, String senha) {
        super(nome, id);
        this.senha = senha;
    }

    public Usuario(int id, String nome, String senha, String nivelAcesso, String email, float telefone, String cpf) {
        super(nome, email, telefone, id, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
  
    
    
}
