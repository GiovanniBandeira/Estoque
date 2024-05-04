package Model;

import Enum.*;

public class Materia_Prima extends Produto {
    public EnumMaterial material;
    public EnumForma forma;
    public boolean oco;
    public double diametro;

    Materia_Prima(int codigoProduto, String nome, double preco, int quantidadeEmEstoque, EnumMaterial material, EnumForma forma, boolean oco, double diametro){
        super(codigoProduto, nome, preco, quantidadeEmEstoque);
        this.material = material;
        this.forma = forma;
        this.oco = oco;
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Materia_Prima{" +
                "material=" + material +
                ", forma=" + forma +
                ", oco=" + oco +
                ", diametro=" + diametro +
                '}';
    }
}
