package d22oop;

public class ChildClass extends ParentClass{

        @Override
        public Integer multiply(Integer a, Integer b) {
            //Parent class'taki multiply metodunu cagiralim
            Integer sonuc = super.multiply(a, b);

            //Ek islevsellik katalim: Sonuca 10 katalim
            return sonuc + 10;
        }

}
