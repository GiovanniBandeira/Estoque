package Model;

import Contrato.IOperarLista;

abstract public class Produto implements IOperarLista {
    public int codigoProduto;
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    public Produto(int codigoProduto, String nome, double preco, int quantidadeEmEstoque){
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

    public void listarProdutos(){
        if (estadoEstoque){
            for (int i = 0 ;i < this.listaDeProdutos.length; i++) {
                System.out.println(this.listaDeProdutos[i]);
            }
        } else {
            System.out.println("Estoque está fechado");
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
