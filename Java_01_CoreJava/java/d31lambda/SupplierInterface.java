package d31lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.

        //Supplier<Double> randomSupplier = () -> Math.random();
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random number : " + randomSupplier.get()); //Random number : 0.20487531302425666

        //Sabit bir sayi dondurmek icin
        Supplier<Integer> constantNumber = () -> 42;
        System.out.println(constantNumber.get()); //42

        Supplier<Boolean> constantBoolean = () -> true;
        System.out.println(constantBoolean.get()); //true


    }
}
