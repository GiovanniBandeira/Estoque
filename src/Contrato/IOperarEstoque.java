package Contrato;

public interface IOperarEstoque {

    boolean abrirEstoque();

    boolean fecharEstoque();

    int adicionarProduto(int quantidade);

    int retirarProduto(int quantidade);

    String pesquisar(String nome);

}
