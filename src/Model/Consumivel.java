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
      return "Consumiveis" + "\n" +
      "Nome= " + nome + "\n" +
      "Quantidade= " + quantidade + medida + "\n" +
      "Preço= " + preco + "\n" +
      "Quantidade em estoque= " + quantidadeEmEstoque + "\n";
   }      
}
