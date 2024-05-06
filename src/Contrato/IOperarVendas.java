package Contrato;

import Model.ControleEstoque.Produto;
import Model.ControleTransacao.Cliente;

public interface IOperarVendas {

    void vender(Produto produto);

    void associarVenda(Cliente cliente, Produto produto);
}
