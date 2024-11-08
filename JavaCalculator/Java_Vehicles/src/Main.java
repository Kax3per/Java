//Opis Zadania:
//
//Stwórz hierarchię klas reprezentujących różne
//typy pojazdów (np. Pojazd, Samochod, Motocykl).
//Klasa bazowa Pojazd powinna zawierać wspólne cechy,
//takie jak maksymalna prędkość czy marka,
//a klasy pochodne powinny dodawać specyficzne atrybuty i metody.
//Napisz program testujący działanie tych klas,
//tworząc różne instancje pojazdów i wyświetlając ich informacje.



 class Pojazd{
    int maksymalnaPredkosc;
    String markaPojazdu;

    public Pojazd(){
        int maksymalnaPredkosc ;
        String markaPojazdu;
    }

    Pojazd(int maksymalnaPredkosc, String markaPojazdu){
        this.maksymalnaPredkosc = maksymalnaPredkosc;
        this.markaPojazdu = markaPojazdu;
    }
}

class Samochod extends Pojazd{
    String model = "A5";
    int iloscMiejsc = 5;
    int maksymalnaPredkosc = 240;
    String markaPojazdu = "Audi";

    void wypiszSamochod(){
        System.out.println("Marka pojazdu: " + " " + markaPojazdu);
        System.out.println("Model pojazdu: " + model);
        System.out.println("Prędkośc pokazdu wynoi: " + maksymalnaPredkosc);
        System.out.println("Ilosc miejsc: " + iloscMiejsc);

    }
}


class Motor extends Pojazd{
    String markaPojazdu = "Yamaha";
    String model = "mt 07";
    int maksymalnaPredkosc = 280;
    int ilocKol = 2;

    void wypiszMotor(){
        System.out.println("Marka pojazdu: " + " " + markaPojazdu);
        System.out.println("Model pojazdu: " + model);
        System.out.println("Prędkośc pokazdu wynoi: " + maksymalnaPredkosc);
        System.out.println("Ilośc kół: " + ilocKol);
    }

}


public class Main {

    public static void main(String[] args) {
        Samochod samochod;
        samochod = new Samochod();
        samochod.wypiszSamochod();
        System.out.println("\n");
        Motor motor;
        motor = new Motor();
        motor.wypiszMotor();
    }
}