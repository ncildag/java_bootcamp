package d22oop;

public class ParentClass {

    //Super cagrisi ve override ile ust (parent) class’taki bir metodu genişletmek için, alt (child) class’ta metodu
    // override ederken parent class’in metodunu çağırıp ona ek işlevsellik ekleyebilirsiniz.
    // Bu, super anahtar kelimesi kullanılarak yapılır.

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }


}
