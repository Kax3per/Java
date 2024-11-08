import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //KALKULATOR WIEKU - STRUKRURALNIE
//
//        System.out.println("Podaj rok urodzenia:");
//        int rok_urodzenia = scanner.nextInt();
//        int wiek = 2024 - rok_urodzenia;
//        System.out.println("Masz: " + wiek + "lat!");
//
//        // KALKULATOR WIEKU - OBIEKTOWO
//         class Kalkulator{
//            int rok_urodzenia_o;
//            int wiek;
//
//            void obliczWiek(){
//                System.out.println("Podaj rok urodzenia: ");
//                int rok_urodzenia_o = scanner.nextInt();
//                wiek = 2024 - rok_urodzenia_o;
//                System.out.println(wiek);
//            }
//        }
//        Kalkulator kalkulator = new Kalkulator();
//        kalkulator.obliczWiek();
//
//
//
//        //LICZBA PARZYSTA ALBO NIEPARZYSTA - STRUKTURALNIE
//
//        System.out.println("Podaj liczbę naturalną:");
//        int liczba = scanner.nextInt();
//        if(liczba % 2 == 0){
//            System.out.println("Liczba: " + liczba + " jest parzysta");
//        }else{
//            System.out.println("Liczba: " + liczba + " jest nieparzysta");
//
//        }
//
//        //LICZBA PARZYSTA ALBO NIEPARZYSTA - OBIEKTOWO

            class Parzysta_Nieparzysta{
                int liczba;

                void sprawdzanie_parzystosci(){
                    System.out.println("Podaj liczbę: ");
                    int liczba = scanner.nextInt();
                    if(liczba % 2 == 0){
                        System.out.println("Parzysta!");
                    }else{
                        System.out.println("Nieparzysta!");
                    }
                }
            }

            Parzysta_Nieparzysta sprawdzenie = new Parzysta_Nieparzysta();
            sprawdzenie.sprawdzanie_parzystosci();



//
//        //PROSTY KALKULARTOR
//
//        System.out.println("Podaj pierwszą liczbę: ");
//        double liczba1 = scanner.nextDouble();
//        System.out.println("Podaj drugą liczbę: ");
//        double liczba2 = scanner.nextDouble();
//        System.out.println("Podaj operację (+, -, *, /): ");
//        char operacja = scanner.next().charAt(0);
//
//        double wynik;
//        switch (operacja) {
//            case '+':
//                wynik = liczba1 + liczba2;
//                System.out.println("Wynik: " + wynik);
//                break;
//            case '-':
//                wynik = liczba1 - liczba2;
//                System.out.println("Wynik: " + wynik);
//                break;
//            case '*':
//                wynik = liczba1 * liczba2;
//                System.out.println("Wynik: " + wynik);
//                break;
//            case '/':
//                if (liczba2 != 0) {
//                    wynik = liczba1 / liczba2;
//                    System.out.println("Wynik: " + wynik);
//                } else {
//                    System.out.println("Błąd: Nie można dzielić przez zero.");
//                }
//                break;
//            default:
//                System.out.println("Błąd: Nieznana operacja.");
//        }
//
//
//
//        //n PIERWSZYCH LICZB PARZYSTYCH
//
//        System.out.println("Podaj ile liczb parzystych wypisać: ");
//        int ilosc_liczba = scanner.nextInt();
//        int liczba3 = 0;
//        for (int i = 0; i < ilosc_liczba; i++) {
//            System.out.println("Liczba: " + liczba3);
//            liczba3 += 2;
//        }
//
//        //CELSJIUSZ NA FAHRENHEIT
//
//        System.out.println("Podaj temperature w stopniach Celcjusza: ");
//        double stopnie_c = scanner.nextDouble();
//        double stopnie_f = (stopnie_c * 9 / 5) + 32;
//        System.out.println(stopnie_c + " stopni Celcjusza to " + stopnie_f + " stopni Fahrenheita");
//

    }
}