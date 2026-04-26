package d5scanner_increment_decrement_if;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        /*Ornek 2: Yeni Satir Karakteri (‘\n’) Hatasi: Ardışık olarak birden fazla Scanner objesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/

        //Aciklama: Bu kodda, nextInt() çağrısından sonra nextLine() hemen çağrılır.
        // Ancak, kullanıcının yaşını girdikten sonra Enter tuşuna basmasıyla oluşan
        // yeni satır karakteri (\n) girdi akışında kalır. nextInt() yalnızca sayısal değeri okur
        // ve yeni satır karakterini okumaz(akista kalir). Bu yüzden, program nextLine()'a ulaştığında,
        // hâlâ okunmamış bir yeni satır karakteri bulur ve bunu boş bir satır olarak yorumlar,
        // böylece kullanıcıdan adını almak için beklemeksizin hemen ilerler.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yasinizi giriniz");
        int age = scanner.nextInt(); //Sayisal bir girdi aldik

        scanner.nextLine(); //Kullanilmayan yeni satir karakterini okuyup atar

        System.out.println("Adinizi ve soyadinizi giriniz");
        String name = scanner.nextLine();

        //ARASTIRMA ODEVI: Yeni Satir Karakteri (‘\n’) hatasini duzeltmenin baska yollari var mi? Neler?

    }

}
