package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        //s.age; ulasamayiz cunku variable private
        //s.successful; ulasamayiz cunku variable private

        System.out.println(s.getAge()); //13
        System.out.println(s.isSuccessful()); //true

        s.setAge(25);
        System.out.println(s.getAge()); //25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false

        //Encapsulation'da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.
        //getter ve setter metodlarına sahip class’lar sıkça JavaBeans olarak da adlandırılır.
        // (Java bean aslinda ozel bir class turudur.)

        //ODEV: encapsulation’da set ile verileri degistirebiliyoruz.
        // constructorlar ile de degistirebiliyoruz. Farki nedir?

        //ODEV: encapsulation da private ile gizlenen bir veri baska bir
        // package'dan set method ile degistirilebilir mi?

    }
}
