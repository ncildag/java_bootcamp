package d21oop;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cats meow...");
    }

    //Herkes Cat class'ta feedWithMilk() methodunu override etsin?
    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babies with milk");
    }


}
