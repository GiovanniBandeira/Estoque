package Contrato;

import Model.Produto;

public interface IOperarCompras {

    void comprarProduto(Produto produto);

    String ligarParaFornecedor();
}
