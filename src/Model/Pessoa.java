package Model;

abstract public class Pessoa {
    private String cpf;
    public String nome;
    public Data dataNascimento;

    Pessoa(String cpf, String nome, Data dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa" + '\n' +
                "Nome: " + nome + '\n' +
                "Data de Nascimento: " + dataNascimento; 
    }
}
