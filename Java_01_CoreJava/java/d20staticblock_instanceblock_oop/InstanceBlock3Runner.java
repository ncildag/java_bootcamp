package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakit turu : Benzin

        InstanceBlock3 car2 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakit turu : Benzin

        InstanceBlock3 car1000 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakit turu : Benzin

        //Parametreli Constructor ile default durumu degistirelim

        InstanceBlock3 car1001 = new InstanceBlock3("Kirmizi", "Dizel");
        System.out.println("Araba rengi : " + car1001.color);
        System.out.println("Araba yakit turu: " + car1001.fuelType);
        //Araba rengi : Kirmizi
        //Araba yakit turu: Dizel


    }
}
