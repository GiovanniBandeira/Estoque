package Model;

abstract public class Empresa {
    public String cnpj;
    public String nome;
    public Data dataCriacao;

    Empresa(){}

    Empresa(String cnpj, String nome, Data dataCriacao){
        this.cnpj = cnpj;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                ", nome='" + nome + '\'' +
                ", dataCriacao=" + dataCriacao +
                '}';
    }
}
