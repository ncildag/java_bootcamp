package d19stringbuilder_buffer_accessmodifier_static;

public class StaticBlock {

    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price'i alacak
    // ve class'in heryerinde bu degeri kullanacak.
    //Scenario: There will be a discount on prices in February. The class will get the price automatically when called
    // and will use this value everywhere in the class


    //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
    static double pi;

    static { //static block
        pi = 3.14; //static bloklar içinde değişkenler tanımlanamaz ama deger atanir
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {

        /*“static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını
        veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
         Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
         Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
         bir şekilde hazır olmasını sağlar.*/

        System.out.println(pi);
        System.out.println("main metot ici");

    }



}
