package Contrato;

public interface IOperarLista {

    void listarProdutos();

    void criarProduto(String nome, double preco, int quantidade);

    void excluirProduto(String nome);
}
