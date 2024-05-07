package Contrato;

public interface IOperarCompras {

    void comprarProduto(String nome, double preco, int quantidade);

    String ligarParaFornecedor();
}
