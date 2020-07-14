
package Model.DAO;

import Model.Registro;
import java.util.ArrayList;



public class RegistroDAO {
    
    
    public void insert(Registro registro){
          
        if(registro.getValor()== 0){
            registro.setValor(proximoId());
            Banco.registro.add(registro);
        }
        
        
    }
   
    public boolean update(Registro registro){
        
        for (int i = 0; i < Banco.registro.size(); i++) {
            if(idSaoIguais(Banco.registro.get(i),registro)){
                Banco.registro.set(i, registro);
                return true;
            }
        }
        return false;      

    }
    
   
    public boolean delete(Registro registro){
        for (Registro registroLista : Banco.registro) {
            if(idSaoIguais(registroLista,registro)){
                Banco.registro.remove(registroLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Registro> selectAll(){
        return Banco.registro;
    }
    
    
    private boolean idSaoIguais(Registro registro, Registro registroAComparar) {
        return registro.getValor()==  registroAComparar.getValor();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Registro registro : Banco.registro) {           
           int id = (int) registro.getValor();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
