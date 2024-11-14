//Classes and Objects

//Exercises 1
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println(name + " have " + age + " years old.");
    }
}

//Exercises 2
class Book{
    String title;
    String author;
    int yearPublished;

    Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    void displayDetalist(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nYear Published: " + yearPublished);
    }
}

//Exercises 3
class Car{
    String model;
    int year;
    int sittingPlaces;

    Car(String model, int year, int sittingPlaces){
        this.model = model;
        this.year = year;
        this.sittingPlaces = sittingPlaces;
    }

    void carDetails(){
        System.out.println("Model: " + model +"\nYear: " + year + "\nSitting Places: " + sittingPlaces);
    }
}


public class Main {
    public static void main(String[] args) {

        Person newPerson = new Person("John Doe", 25);
        newPerson.introduce();
            System.out.println("\n");
        Book newBook = new Book("Harry Potter", "J.K.Rowling",2000);
        newBook.displayDetalist();
            System.out.println("\n");
        Car newCar = new Car("Audi",2022,5);
        newCar.carDetails();
    }
}