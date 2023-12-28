
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti pin: ");
        do {
            try
            {
                int pin = input.nextInt();
                float i = 1/pin;
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Caractere invalide");
                input.next();
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Pin-ul nu poate sa fie 0000");
                input.next();
            }
            finally{}
        }while(true);
    }
}