package Contrato;

import Model.ControleEstoque.Produto;

public interface IOperarEstoque {

    boolean abrirEstoque();

    boolean fecharEstoque();

    void acrescentarProduto(Produto produto, int quantidade);

    void retirarProduto(String produto ,int quantidade);

    void pesquisar(String nome);

}
