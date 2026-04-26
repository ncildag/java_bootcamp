package d27maps_exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //selectChar(s, 2);
        selectChar(s, 5); //HATA


    } //main disi

    public static void selectChar(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch); //v
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index'leri kullanmayiniz : " + e.getMessage());
            e.printStackTrace(); //calismayi durdurmaz, exception firlatmaz
        }
        System.out.println("App calisiyor");
    }

}
