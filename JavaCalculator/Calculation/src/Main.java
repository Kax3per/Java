import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("FIRST NUMBER: ");
        int firstNumber = scanner.nextInt();
        System.out.println("SECOND NUMBER: ");
        int secondNumber = scanner.nextInt();
        System.out.println("SELECT OPERATION (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + " + " + secondNumber + " equal: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println(firstNumber + " - " + secondNumber + " equal: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println(firstNumber + " * " + secondNumber + " equal: " + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println(firstNumber + " / " + secondNumber + " equal: " +(firstNumber / secondNumber));
                break;
        }
    }
}