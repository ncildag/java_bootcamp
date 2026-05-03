package javaminibank;

public class MiniJavaBankApp {

    public static void main(String[] args) {
        MiniJavaBankApp app = new MiniJavaBankApp();
        app.start();
    }

    public void start(){
        // start the app from here..
        BankService service = new BankServiceImplementation();

        if (service.login()){
            service.showMenu();
        }
    }



}
