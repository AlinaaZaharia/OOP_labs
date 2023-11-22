import java.awt.Color;

public class MainClass {
	public static void main(String[] args) {
	Autovehicul auto = new Autovehicul("Maserati", 350, 100, 6, 3, Color.BLACK);
	System.out.println(auto);
	auto.accelerare(40);
	System.out.println(auto);
	auto.decelerare(120);
	System.out.println(auto);
	}
}
