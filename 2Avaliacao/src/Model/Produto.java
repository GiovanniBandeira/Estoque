package Model;

abstract public class Produto {
    public int codigoProduto;
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    Produto(int codigoProduto, String nome, double preco, int quantidadeEmEstoque){
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void aumentarQuantidade(double valor){
        quantidadeEmEstoque += valor;
    }

    public void diminuirQuantidade(double valor){
        if (valor <= quantidadeEmEstoque){
            quantidadeEmEstoque -= valor;
        }else{
            System.out.println("Não tem quantidade em estoque suficiente");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoProduto=" + codigoProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}
