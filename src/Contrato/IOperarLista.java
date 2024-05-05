package Contrato;

import Model.Produto;

public interface IOperarLista {

    void listarProdutos();

    String pesquisar(String nome);

    void criarProduto(Produto novoProduto);

    void excluirProduto(Produto produtoRetirado);
}
