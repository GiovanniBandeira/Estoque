package Model;

import Enum.EnumMedida;

public class Consumivel extends Produto {
   public double quantidade;
   public EnumMedida medida;

   public Consumivel(String nome, double preco, int quantidadeEmEstoque, double quantidade, EnumMedida medida) {
      super(nome, preco, quantidadeEmEstoque);
      this.quantidade = quantidade;
      this.medida = medida;
   }

   @Override
   public String toString() {
      return "Consumiveis" +
      "Nome= " + nome +
      "Quantidade= " + quantidade + medida +
      "Preço= " + preco +
      "Quantidade em estoque= " + quantidadeEmEstoque + "Medida= " + medida;
   }      
}
