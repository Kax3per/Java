import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//ARRAY
        int[] number = new int[6];
        String[] names ={"Joe","Bob","Michael"};
        int[] numbers = {12,23,34,45,56};

        System.out.println(number);
        System.out.println(names);
        System.out.println(numbers[2]); // 23

        //Modifying Elements
        System.out.println(numbers[4]); // 56
        numbers[4] = 100;
        System.out.println(numbers[4]); // 100

        //Showing all elements int array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i]);
        }

        // Length Methood
        System.out.println(numbers.length);


//LISTS
        List<String> namesList = new ArrayList<>();

        //Add
        namesList.add("Caroline");
        namesList.add("Michael");

        //Accessing
        System.out.println(namesList.get(0)); //Caroline
        System.out.println(namesList.get(1)); //Michael

        //Modifying
        namesList.set(1, "Bob");
        System.out.println(namesList.get(0));
        System.out.println(namesList.get(1));

        //Removing
        namesList.remove(1);

        //Showing all elements int Lists
        for (String name : namesList) {
            System.out.println(name);
        }

        //Size methood
        System.out.println(namesList.size()); // 1


        //Exercise List Manipulation

        //1
            int[] numbersInArray = {12,34,45,67,78};
        //2
            for (int i = 0; i < numbersInArray.length; i++) {
                System.out.println( i + 1 + " - " + numbersInArray[i]);
            } //Nie wiem czy o to chodzi
        //3
            int sumOfTheNumbers = 0;
            for (int i = 0; i < numbersInArray.length; i++) {
                sumOfTheNumbers += numbersInArray[i];
            }
            System.out.println("Sum of the all numbers equal: " + sumOfTheNumbers);
        //4
            numbersInArray[1] = 123;
            for (int i = 0; i < numbersInArray.length; i++) {
                System.out.println( i + 1 + " - " + numbersInArray[i]);
            }


        //Exercise Array Manipulation

        //1
            List<String> studentsNames = new ArrayList<>();
            studentsNames.add("Joe");
            studentsNames.add("Bob");
            studentsNames.add("Michael");
            studentsNames.add("Caroline");
            studentsNames.add("Mark");
        //2
            for (String studentName : studentsNames ) {
                System.out.println(studentName);
            }
        //3
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the index of the student to remove: ");
            int index = scanner.nextInt();

        if (index >= 0 && index < studentsNames.size()) {
            System.out.println("Removing student: " + studentsNames.get(index));
            studentsNames.remove(index);

            for (int i = 0; i < studentsNames.size(); i++) {
                System.out.println(studentsNames.get(i));
            }
        } else {
            System.out.println("Invalid index. No student removed.\n");
        }
        System.out.print("\n");

        //4
            studentsNames.add("Clark");
            studentsNames.add("Robert");
            for(String studentName : studentsNames ) {
                System.out.println(studentName);
            }



    }
}







