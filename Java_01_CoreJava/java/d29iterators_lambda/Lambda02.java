package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 11, 10));
        //printSquareOfOddElements(nums);
        //printCubeOfDistinctOddElements(nums);
        printSumOfSquaresOfDistinctEvenElements(nums);




    } //main disi

    //----------------------------
    //ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //example 1: Create a method that takes a list of integers and prints the squares of the
    // odd numbers in the list on the same line with a space between them.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums) {

        //map(): Elemanları dönüştürmek için kullanılır.
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " ")); //9 25 121
        //map(t -> (int) Math.pow(t, 2))

        /**
         @param
         @return
         @throws
         */
    }

    //----------------------------
    //2) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //2) Create a method that prints the cubes of odd numbers in a list of integers,
    // without repeating, on the same line, with spaces between them. (Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir
        //Ornegin 1,2,2,3,3,3,4,4,5 olan akisi 1,2,3,4,5 yapar

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " ")); //27 125

    }

    //----------------------------
    //3)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //3)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.
        //Ornegin iki sayiyi toplayinca tek bir sonuc elde ederiz. 3 + 5 = 8

        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        //İlk iterasyonda:
        //t=0 (başlangıç değeri olarak belirtildiği için)
        //u=4 (ilk eleman)
        //t+u = 4

        //İkinci iterasyonda:
        //t=4 (önceki adımdan gelen sonuç)
        //u=100 (ikinci eleman)
        //t+u = 104

        int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).
                reduce(0, (t,u) -> t + u);
        System.out.println(toplam); //104


    }

}
