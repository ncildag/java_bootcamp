package d16arraylist_methodcreation_overloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

        /*
        Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.

        Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde
        calistirabilmek icin kullanilir.
        */

        //-------------------
        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/

/*        String s = "Java";
        s.substring(int beginIndex) ==> tek parametre almis
        s.substring(int beginIndex, int endIndex) ==> iki parametre almis*/
        add(3, 5);

        //-------------------static - non static
        String s = "Java";
        //s.substring() ==> olusturulan object uzerinden cagirilan metotlar non-static'tir

        //Math.min() ==> min() metodunu cagirirken dogrudan class ismiyle cagirdim. Bu metot static'tir


    } //main disi
    //ornek 1 : Toplama islemi yapan bir method olusturun ve sonra da overload edin.
    //example 1 : A method that performs an addition operation create and then overload

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    //-----------------------
       /* Method Overloading'de sadece parametreler degistirilir.
       Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

      Method ismi + Parametre = method signature

    Method Overloading icin;
    a) Parametre sayisini degistirebilirsiniz.
    b) Parametre data tiplerini degistirebilirsiniz.
    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
    d) Method overloading olustururken return type’in, access modifier’in,
       static veya non-static olmanin hicbir etkisi yoktur.
       */
    //-----------------------
    //Auto Widening - otomatik genisletme
    //Kucuk veri tipinden buyuk veri tipine cevirme.Java otomatik yapar.

    //Explicit Narrowing (Aciktan Daraltma)
    //Buyuk veri tipinden kucuk veri tipine cevirme.
    //Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar
    //-----------------------
    /*
    Soru 1: private method'lar overload edilebilir mi?

    Cevap 1: private method'lar overload edilebilirler cunku;
    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    ulasilabilir oldugundan overload'a engel degildir.

    Soru 2: static method'lar overload edilebilir mi?
    Cevap 2: static method'lar overload edilebilir cunku
    esasinda overload'da biz yeni method'lar olustururuz.
    */
    //-----------------------


}
