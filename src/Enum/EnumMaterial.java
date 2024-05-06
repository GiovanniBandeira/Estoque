package Enum;

public enum EnumMaterial {
    Bronze("Bronze"),
    Aluminio("Aluminio"),
    Ferro("Ferro"),
    Cobre("Cobre");

    String material;

    EnumMaterial(String material){
        this.material = material;
    }
}
