package Contrato;

import Model.ControleEstoque.Produto;

public interface IOperarCompras {

    void comprarProduto(Produto produto);

    String ligarParaFornecedor();
}
