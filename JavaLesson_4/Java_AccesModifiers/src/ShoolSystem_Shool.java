import java.util.ArrayList;
import java.util.Scanner;

public class ShoolSystem_Shool {
    // Klasa wewnętrzna reprezentująca pojedynczego studenta
    class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " " + grade;
        }
    }

    // Lista przechowująca wszystkich studentów
    private ArrayList<Student> students = new ArrayList<>();

    // Metoda dodająca nowego studenta
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        students.add(new Student(name, grade));
        System.out.println("Student added successfully.\n");
    }

    public void showStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void calculateAverageGrade() {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average grade.");
            return;
        }

        int totalGrade = 0;
        for (Student student : students) {
            totalGrade += student.grade;
        }
        int averageGrade = totalGrade / students.size();
        System.out.println("Average grade: " + averageGrade);
    }
}
