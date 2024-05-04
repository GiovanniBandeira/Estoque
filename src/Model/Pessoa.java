package Model;

abstract public class Pessoa {
    private String cpf;
    public String nome;
    public Data dataNascimento;

    Pessoa(){}

    Pessoa(String nome, Data dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
