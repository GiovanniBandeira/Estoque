package Model;

import Contrato.IOperarLista;

abstract public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto(String nome, int quantidadeEmEstoque){
        this.nome = nome;
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

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Produto" + '\n' +
                "Nome⭢ '" + nome + '\n' +
                "Valor⭢ " + "R$" + preco + '\n' +
                "Quantidade em estoque⭢ " + quantidadeEmEstoque + '\n';
    }
}
