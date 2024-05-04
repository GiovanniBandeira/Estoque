package Model;

import Enum.*;

public class Consumiveis extends Produto {
    public double quantidade;
    public EnumUtilidade utilidade;
    public EnumMedida medida;

    Consumiveis(int codigoProduto, String nome, double preco, int quantidadeEmEstoque, double quantidade, EnumUtilidade utilidade, EnumMedida medida){
        super(codigoProduto, nome, preco, quantidadeEmEstoque);
        this.quantidade = quantidade;
        this.utilidade = utilidade;
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Consumiveis{" +
                "utilidade=" + utilidade +
                ", medida=" + medida +
                '}';
    }
}
