/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoaa;

/**
 *
 * @author User
 */
public class Pessoaa {

    private String nome;
    private int idade;
    private String cpf;

    public Pessoaa() {
      this.nome = "Sem nome";
      this.idade = 0;
      this.cpf = "000.000.000-00";
    }

    public Pessoaa(String nome, int idade, String cpf) {
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
    }
    public void alterarDados(String nome, int idade, String cpf) {
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public int getIdade() {
      return idade;
    }
    public void setIdade(int idade) {
      this.idade = idade;
    }
    public String getCpf() {
      return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("CPF: " + cpf);
        System.out.println("-----------------------------");
    }
}
