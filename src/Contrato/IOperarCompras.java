package Contrato;

import Model.Produto;

public interface IOperarCompras {

    void comprarProduto(Produto produto, double preco, int quantidade);

    String ligarParaFornecedor();
}
