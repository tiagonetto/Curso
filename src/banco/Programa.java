/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author FACULDADE
 */
public class Programa {
    
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        /*Caso não utilizar new ficaria somente com uma instância, utilizando 
          mesma referência...*/
        
        conta1.dono = "João";
        conta1.saldo = 1000.00;
        
        conta2.dono = "Maria";
        conta2.saldo = 0.00;
        
        System.out.println("");
        System.out.println("Esxtrao...........");
        System.out.println(conta1.dono);
        System.out.println(conta1.saldo);
        
        System.out.println(conta2.dono);
        System.out.println(conta2.saldo);
        
        /*
        if (conta1.saca(100.00)){
            System.out.println("Sucesso");
        }else
        {
            System.out.println("sem grana");
        }
        */
        
        if(conta1.tranfere(conta2, 50000000.00)){
            System.out.println("Sucesso");
        } else
        {
            System.out.println("sem grana");
        }
        
        System.out.println("");
        System.out.println("Esxtrao...........");
        System.out.println(conta1.dono);
        System.out.println(conta1.saldo);
        
        System.out.println(conta2.dono);
        System.out.println(conta2.saldo);
        
    }
}
