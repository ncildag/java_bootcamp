package d12loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //-------------------------
        //1- 0 ile 100 arasinda rastgele bir sayi uretiyoruz.
        // (101 yazinca, 0 ve 100 dahil ratgele bir sayi uretir)
        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?
        int rastgeleSayi = random.nextInt(101);

        //-------------------------
        //2- Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturuyoruz
        int denemeSayisi = 0;

        //-------------------------
        //3- Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturuyoruz.
        int tahminEdilen;

        //-------------------------
        //4- Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturuyoruz
        boolean tahminDogrumu = false;

        //-------------------------
        //5- Oyunun aciklamasini yazdiriyoruz
        System.out.println("0-100 arasinda bir sayiyi tahmin etmeye calisin");

        //-------------------------
        //6- Dogru tahmin yapilincaya kadar dongumuzu devam ettirelim

        do {

            System.out.println("Tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();

            denemeSayisi++; //Sayaci bir artirdik

            //Tahmini kontrol edelim

            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha buyuk");

            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha kucuk");

            } else {
                tahminDogrumu = true;
                System.out.println("Tebrikler, dogru tahmin!");
                System.out.println("Deneme Sayisi : " + denemeSayisi);
            }

        } while (!tahminDogrumu); //Dogru tahmin yapilincaya kadar dongu devam edecek


    }
}
