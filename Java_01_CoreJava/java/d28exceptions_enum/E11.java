package d28exceptions_enum;

public class E11 {
    public static void main(String[] args) {

        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9};
        bring(c, a, b);

    } //main disi

    public static void bring(int[] c, int a, int b) {

        // Coklu finally block kullanilamaz
        //java da try + bir catch, try + birden fazla catch, try + catch + finally,
        // try + finally kullanilabilir.

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        }  finally {
            System.out.println("Database ile baglantiyi kesiniz");
        }

        System.out.println("finally sonrasi app calisiyor");

    }


}
