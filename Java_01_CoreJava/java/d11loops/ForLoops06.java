package d11loops;

public class ForLoops06 {
    public static void main(String[] args) {

        outerLoop:
        for (int i = 1; i <= 3; i++) {


            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    continue outerLoop; //Dis donguye don
                }

                System.out.println("i = " + i + ", j = " + j);

            }
        }

    }
}
