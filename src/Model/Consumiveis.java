package Model;

import Enum.*;

public class Consumiveis extends Produto {
    public double quantidade;
    public EnumUtilidade utilidade;
    public EnumMedida medida;

    Consumiveis(String nome, double preco, int quantidadeEmEstoque, double quantidade, EnumUtilidade utilidade, EnumMedida medida){
        super(nome, preco, quantidadeEmEstoque);
        this.quantidade = quantidade;
        this.utilidade = utilidade;
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Consumiveis" + '\'' +
                "Nome= " + nome + '\'' +
                "Preço= " + preco + '\'' +
                "Medida= " + medida + '\'' +
                "Utilidade= " + utilidade + '\'' +
                "Quantidade= " + quantidade + '\'' +
                "Quantidade em Estoque= " + quantidadeEmEstoque;
    }
}
