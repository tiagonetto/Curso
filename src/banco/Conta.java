/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author FACULDADE
 */
public class Conta {
    Integer numero;
    String dono;
    Double saldo;
    Double limite;
    
    boolean saca (Double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
        
    }
    
    void deposita(Double valor){
       saldo += valor;
    }
    
    /*Utilizei a classe conta pois e dela a responsabilida de manejar a conta, caso
     fosse em classe separada teria que perguntar muita coisa...
     * Ex: Caso criar uma classe separada tranferência com método transfere()
     teria que no mínimo passar conta de destino e conta atual,, e outras perguntas...
     */
    boolean tranfere(Conta contaDestino, Double valor){
        if (saca(valor))
        {
            contaDestino.saldo += valor;
            saldo -= valor;
            return true;
        }else{
            
            return false;
        }
        
    }
            
}
