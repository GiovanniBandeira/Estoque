package Model;

import Enum.*;
import Model.ControleEstoque.Produto;

public class Materia_Prima extends Produto {
    public EnumMaterial material;
    public EnumForma forma;
    public double diametro;

    Materia_Prima(String nome, double preco, int quantidadeEmEstoque, EnumMaterial material, EnumForma forma, double diametro){
        super(nome, preco, quantidadeEmEstoque);
        this.material = material;
        this.forma = forma;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Materia_Prima{" + '\'' +
                "Nome= " + nome + " " +
                material + " " +
                forma + " " +
                diametro + '\'' +
                "Preco= " + preco + '\'' +
                "Quantidade em estoque= " + quantidadeEmEstoque;
    }
}
