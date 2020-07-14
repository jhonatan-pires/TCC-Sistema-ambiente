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
public class Cliente extends Pessoa{

    private String endereco;      
    private String cpf;

    public Cliente(String nome, String email, float telefone, int id, String cpf) {
        super(nome, email, telefone, id, cpf);
    }

    public Cliente(String endereco, String cpf, String nome, int id) {
        super(nome, id);
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
      public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
   

