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
public class Servico {
    
    private int id;
    private String desmatamento;
    private String suporte;
    private float valor;

    //construtor inicio

    public Servico(int id, String desmatamento, String suporte, float valor) {
        this.id = id;
        this.desmatamento = desmatamento;
        this.suporte = suporte;
        this.valor = valor;
    }
    //construtor fim


    public String getDesmatamento() {
        return desmatamento;
    }

    public void setDesmatamento(String desmatamento) {
        this.desmatamento = desmatamento;
    }

    public String getSuporte() {
        return suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
