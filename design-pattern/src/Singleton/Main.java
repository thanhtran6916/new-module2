package Singleton;

public class Main {

    public static void main(String[] args) {

        Persion persion1 = new Persion();
        Persion persion2 = new Persion();
        persion1.muonSach();
        persion1.removeBook();
        persion2.muonSach();
        System.out.println(persion2.getNameBook());


    }
}
