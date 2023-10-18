import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputValue = input.nextInt();
		
		System.out.println("Valoarea citita de la tastatura este: " + inputValue); 
		
		int maxInt = Integer.MAX_VALUE;
		
		System.out.println(maxInt + 1);
		
		/* int minInt = Integer.MIN_VALUE;
		System.out.println(minInt - 1);
		
		double maxFloat = Double.MAX_VALUE;
		System.out.println(maxFloat * 3); */
		
		try {
			System.out.println(maxInt / inputValue);
		}
		catch(ArithmeticException exception) {
			System.out.println("Hei, ai introdus o valoare gresita! Introdu o alta valoare.");
			inputValue = input.nextInt();
		}
		System.out.println("Noua valoare " + inputValue);
		
	}

}
