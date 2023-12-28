import java.awt.Color;

public class MainClass {

    public static void main(String[] args) {

        Autovehicul a = new Autovehicul("BMW", 270, 60, 6, 3, Color.ORANGE);
        a.setViteza(30);
        System.out.println(a.getViteza());
        a.accelerare(40);
        System.out.println(a.getViteza());
    }

}