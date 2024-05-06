package Enum;

public enum EnumMedida {
   ml("ml"),
   L("l"),
   g("g"),
   Kg("Kg");

   String medida;

   private EnumMedida(String medida) {
      this.medida = medida;
   }
}