package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.Period;

public class DateTime03 {
    public static void main(String[] args) {

        //ornek 1: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 1: Write the code that calculates the difference between two given dates.

        //Java'da Period class’i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period objesi olarak döndürür.

        LocalDate date1 = LocalDate.of(2024, 5, 28);
        LocalDate date2 = LocalDate.of(2022, 12, 24);

        Period difference = Period.between(date2, date1);
        System.out.println(difference); //P1Y5M4D
        // P: Periyod (zaman aralığı), 1Y: 1 yil, 5M: 5 ay, 4D: 4 gün

        //Ayri ayri gorelim

        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasindaki fark :");

        System.out.println("Yil : " + yearDifference);
        System.out.println("Ay : " + monthDifference);
        System.out.println("Gun : " + dayDifference);

        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html

    }
}
