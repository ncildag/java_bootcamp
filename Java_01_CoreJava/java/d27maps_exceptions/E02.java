package d27maps_exceptions;

public class E02 {

    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s = "1234a";
        convertStringToInt(s);


    } //main disi

    public static void convertStringToInt(String s) {

        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1);

        } catch (NumberFormatException e) {

            System.out.println("Donusum icin rakam disi karakter kullanmayiniz : " + e.getMessage());
            //Donusum icin rakam disi karakter kullanmayiniz : For input string: "1234a"
        }

    }

    //ARASTIRMA ODEVI: Java’da alınan hatayı (exception) konsola yazdırmanın yanı sıra, bu hatayı bir dosyaya yazdırmak,
    // bir veritabanına kaydetmek veya bir ağ üzerinden disari göndermek mumkun mu?


}
