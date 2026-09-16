/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaa;

/**
 *
 * @author User
 */
public class TestePessoa {

    public static void main(String[] args) {
        
     Pessoaa pessoaa1 = new Pessoaa("LULA", 70, "171.171.171-11");
      
     Pessoaa pessoaa2 = new Pessoaa("FLAVIO BOLSONARO", 48, "222.222.222-33");

    System.out.println("DADOS INICIAIS");
    
    System.out.println("Pessoa 1 (Parametrizado):");
    
     pessoaa1.exibirInformacoes();

    System.out.println("Pessoa 2 (Default):");
    
     pessoaa2.exibirInformacoes();

     pessoaa2.alterarDados("JAIR BOLSONARO", 25, "357.445.667.99");

    System.out.println("-DADOS APOS ALTERACAO-");
    
    System.out.println("Pessoa 2 (Apos alterarDados):");
    
     pessoaa2.exibirInformacoes();
    }
}
