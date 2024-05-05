package Model;

abstract public class Empresa {
    public String cnpj;
    public String nome;
    public Data dataCriacao;
    public String contato;

    Empresa(){}

    Empresa(String cnpj, String nome, Data dataCriacao, String contato){
        this.cnpj = cnpj;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Empresa" + '\'' +
                "Nome" + nome + '\'' +
                "Data da fundação" + dataCriacao + '\'' +
                "Contato" + contato;
    }
}
