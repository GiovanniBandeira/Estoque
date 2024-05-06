package Model;

import Enum.*;

public class Mercadoria extends Produto{
    public EnumMercadoria mercadorias;
    public double diametro;

    Mercadoria(String nome, double preco, int quantidadeEmEstoque, EnumMercadoria mercadorias, double diametro){
        super(nome, preco, quantidadeEmEstoque);
        this.mercadorias = mercadorias;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Mercadoria" + '\'' +
                "Nome= " + mercadorias + " " + nome + '\'' +
                "Preço= " + preco + '\'' +
                "Diametro= " + diametro + '\'' +
                "Quantidade em estoque= " + quantidadeEmEstoque;
    }
}
