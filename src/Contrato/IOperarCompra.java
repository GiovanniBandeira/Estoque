package Contrato;

import Model.Produto;

public interface IOperarCompra {

    void comprarProduto(Produto novoProduto);

    String fazerEncomenda(Produto produtoEncomendado);

}
