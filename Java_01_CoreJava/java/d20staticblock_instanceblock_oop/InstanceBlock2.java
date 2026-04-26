package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {

    public int year;

    { //instance block

        System.out.println("Herkese selam");

    }

    public InstanceBlock2 () {
        //sout'u buradan alip instance block icerisine yapistirdik
    }

    public InstanceBlock2(int year) {
        //sout'u buradan alip instance block icerisine yapistirdik
        this.year = year;
    }
}
