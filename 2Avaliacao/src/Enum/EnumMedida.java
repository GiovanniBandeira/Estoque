package Enum;

public enum EnumMedida {
    LITRO_ML("ml"),
    LITRO_L("l"),
    PESO_G("g"),
    PESO_KG("Kg");

    String medida;

    EnumMedida(String medida){
        this.medida = medida;
    }

}