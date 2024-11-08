//Zaprojektuj system do zarządzania pracownikami w firmie.
//Utwórz klasę bazową Pracownik z podstawowymi informacjami(np. imię, nazwisko, stanowisko).
//Następnie stwórz klasy pochodne, takie jak Manager, Programista,
//które dziedziczą z Pracownika i dodają specyficzne cechy lub metody.
//Zaimplementuj funkcje do dodawania, usuwania i wyszukiwania pracowników w tablicy.


class Pracownik{
    String imie;
    String nazwisko;
    String stanowisko;

    public Pracownik(){
        String imie;
        String nazwisko;
        String stanowisko;
    }

     Pracownik(String imie, String nazwisko, String stanowisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

}

class Menager extends Pracownik{
    int pensja = 6000;
    String imie = "John";
    String nazwisko = "Doe";
    String stanowisko = "Menager";

    void wypiszMenager(){
        System.out.println("Stanowisko: " + stanowisko);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Pensja: " + pensja);
    }
}


class Programista extends Pracownik{
    int pensja = 4000;
    String imie = "Mark";
    String nazwisko = "Toe";
    String stanowisko = "Programista";

    void wypiszProgramista(){
        System.out.println("Stanowisko: " + stanowisko);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Pensja: " + pensja);
    }
}


public class Main {
    public static void main(String[] args) {

        Menager m = new Menager();
        m.wypiszMenager();

        Programista p = new Programista();
        p.wypiszProgramista();
    }
}