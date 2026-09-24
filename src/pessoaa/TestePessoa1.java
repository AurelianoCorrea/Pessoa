
package pessoaa;

public class TestePessoa1 {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Bruno Mesenga", 62, "111.222.333-44");

        Pessoa pessoa2 = new Pessoa();

        System.out.println(" ESTADO INICIAL ");
        System.out.print("Objeto 1 (Parametrizado): ");
        pessoa1.exibirDados();
        
        System.out.print("Objeto 2 (Default): ");
        pessoa2.exibirDados();

        // Alterando os valores do segundo objeto utilizando o método criado
        pessoa2.alterarDados("Carlos Silva", 35, "555.666.789-99");

        // Exibindo os valores do segundo objeto após a alteração
        System.out.println("\n--- APÓS ALTERAÇÃO DO SEGUNDO OBJETO ---");
        System.out.print("Objeto 2 (Atualizado): ");
        pessoa2.exibirDados();
    }
}