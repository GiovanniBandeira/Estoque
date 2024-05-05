package Contrato;

import Model.*;

public interface IOperarVenda {

    void venderProduto(int quantidade, Cliente nome);

    void precificar(Produto produto);


}
