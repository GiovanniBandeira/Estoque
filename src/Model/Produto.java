package Model;

import Enum.*;

abstract public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    //==============================================================================================================
    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto(String nome, int quantidadeEmEstoque){
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    //==============================================================================================================

    @Override
    public String toString() {
        return "Produto" + '\n' +
                "Nome⭢ '" + nome + '\n' +
                "Valor⭢ " + "R$" + preco + '\n' +
                "Quantidade em estoque⭢ " + quantidadeEmEstoque + '\n';
    }
}
