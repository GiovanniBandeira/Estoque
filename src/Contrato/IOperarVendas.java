package Contrato;

import Model.Produto;

public interface IOperarVendas {

    void vender(Produto produto, int quantidade, double valor);
}
