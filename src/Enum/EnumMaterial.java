package Enum;

public enum EnumMaterial {
    BRONZE("Bronze"),
    ALUMINIO("Aluminio"),
    FERRO("Ferro"),
    COBRE("Cobre");

    String material;

    EnumMaterial(String material){
        this.material = material;
    }
}
