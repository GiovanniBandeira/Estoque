package Contrato;

import Model.Cliente;
import Model.Data;
import Model.Produto;

public interface IOperarVendas {

    void vender(Produto produto);

    void associarVenda(Cliente cliente, Produto produto);
}