package Model;

import Enum.*;

public class Mercadoria extends Produto{
    public EnumMercadoria mercadorias;
    public double diametro;

    public Mercadoria(String nome, double preco, int quantidadeEmEstoque, EnumMercadoria mercadorias, double diametro){
        super(nome, preco, quantidadeEmEstoque);
        this.mercadorias = mercadorias;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Mercadoria" + '\n' +
                "Produto= " + mercadorias + " " + nome + + diametro + '\n' +
                "Preço= " + preco + '\n' +
                "Quantidade em estoque= " + quantidadeEmEstoque;
    }
}
