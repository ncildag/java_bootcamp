package d12loops;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.

            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
            bir String dizisi sadece String değerler saklayabilir.

            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.

            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir

            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.

            6)Array’ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
        */

        //Array olusturmak

        String[] stdNames1 = new String[3];

        //String stdNames2[] = new String[4];

        System.out.println(stdNames1); //Array'leri dogrudan yazdiramazsiniz. 3fee733d

        System.out.println(Arrays.toString(stdNames1)); //[null, null, null]

        //-------------------
        //ornek 1: 5 elemanli notes adinda, int bir array olusturunuz ve console’a yazdiriniz
        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); //[0, 0, 0, 0, 0]

        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
        //[null, null, null, null, null, null, null, null, null, null]

        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz



    }
}
