import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaWylosowana = new Random().nextInt(10) + 1;  // Losuje liczbę od 1 do 10
        int liczbaPodana = 0;

        System.out.println("--- ZGADYWANIE LICZB ---\n");

        while (liczbaPodana != liczbaWylosowana) {
            System.out.print("Podaj liczbę od 1 do 10: ");
            liczbaPodana = scanner.nextInt();

            if (liczbaPodana != liczbaWylosowana) {
                System.out.println("Liczba podana jest błędna! Spróbuj ponownie.");
            } else {
                System.out.println("Gratulacje! Podałeś dobrą liczbę! ");
            }
        }

        scanner.close();
    }
}
