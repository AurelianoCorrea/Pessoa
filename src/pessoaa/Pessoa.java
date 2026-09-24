package pessoaa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {
        this.nome = "Não informado";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void alterarDados(String novoNome, int novaIdade, String novoCpf) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.cpf = novoCpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | CPF: " + cpf);
    }
}