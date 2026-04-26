package d22oop;

public class Accord extends Honda{

    //1- extends ile Honda'nin child'i yapalim
    //2- @Override ile engine() metodunu override edelim
    //3- abstract silinecek
    //4- {} body eklenecek

    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }

}
