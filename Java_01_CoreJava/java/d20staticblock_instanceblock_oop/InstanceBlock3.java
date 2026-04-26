package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;

    //Instance blogu classtan her object uretildiginde calisir
    {
        color = "Siyah";
        fuelType = "Benzin";
    }

    //Varsayilan (default) constructor

    public InstanceBlock3() {
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakit turu : " + fuelType);
    }

    //default constructor hep Siyah ve Benzin uretir.
    // Parametreli constructor ile bu durumu degistirebiliriz.

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

}
