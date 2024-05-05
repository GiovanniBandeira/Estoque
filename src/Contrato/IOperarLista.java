package Contrato;

import Model.Produto;

public interface IOperarLista {

    void listarProdutos();

    void criarProduto(Produto novoProduto);

    void excluirProduto(Produto produtoRetirado);
}
