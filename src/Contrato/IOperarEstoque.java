package Contrato;

import Model.Produto;

public interface IOperarEstoque {

    boolean abrirEstoque();

    boolean fecharEstoque();

    void acrescentarProduto(int quantidade);

    void retirarProduto(int quantidade);

    void pesquisar(String nome);

}
