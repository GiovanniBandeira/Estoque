package Model.ControleTransacao;

abstract public class Pessoa {
    private String cpf;
    public String nome;
    public Data dataNascimento;
    public String contato;

    Pessoa(){}

    Pessoa(String cpf, String nome, Data dataNascimento, String contato){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa" + '\'' +
                "Nome" + nome + '\'' +
                "Data de Nascimento" + dataNascimento + '\'' +
                "Contato" + contato;
    }
}
