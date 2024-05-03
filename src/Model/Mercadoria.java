package Model;

import Enum.*;

public class Mercadoria extends Produto{
    public EnumMercadoria mercadorias;
    public double diametro;

    Mercadoria(int codigoProduto, String nome, double preco, int quantidadeEmEstoque, EnumMercadoria mercadorias, double diametro){
        super(codigoProduto, nome, preco, quantidadeEmEstoque);
        this.mercadorias = mercadorias;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Mercadoria{" +
                "mercadorias=" + mercadorias +
                ", diametro=" + diametro +
                '}';
    }
}
