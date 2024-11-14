import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount newAccaunt = new BankAccount();
        ShoolSystem_Shool shool = new ShoolSystem_Shool();


        System.out.println("What do you want to open");
        System.out.println("1 - Bank Account");
        System.out.println("2 - Shool System");
        int select = scanner.nextInt();

        if (select == 1) {

            boolean programIsRunning = true;
            while (programIsRunning == true) {
                System.out.print("BANK ACCOUNT\n");
                System.out.println("What operaction do you want to perform");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance");
                System.out.println("4. Exit");
                int operaction = scanner.nextInt();
                switch (operaction) {
                    case 1:
                        newAccaunt.deposit();
                        System.out.println();
                        break;
                    case 2:
                        newAccaunt.withdraw();
                        break;
                    case 3:
                        newAccaunt.Balance();
                        break;
                    case 4:
                        System.out.println("Dou you want to exit?\n 1 - Yes\n 2 - No");
                        int Exit = scanner.nextInt();

                        if (Exit == 1) {
                            programIsRunning = false;
                        } else {
                            System.out.println("Wrong option");
                        }
                }
            }
        } else if (select == 2) {
            boolean programRunning = true;
            while (programRunning == true) {

                System.out.println("SHOOL SYSTEM");
                System.out.println("What operaction do you want to perform");
                System.out.println("1. Add student");
                System.out.println("2. Schow students");
                System.out.println("3. Calculate average grades");
                System.out.println("4. Exit");
                int opraction = scanner.nextInt();

                switch (opraction) {
                    case 1:
                        shool.addStudent();
                        break;
                    case 2:
                        shool.showStudents();
                        break;
                    case 4:
                        System.out.println("Do you want to exit?\n 1 - Yes\n 2 - No");
                        int Exit2 = scanner.nextInt();
                        if (Exit2 == 1) {
                            programRunning = false;
                        } else if (Exit2 == 2) {
                            programRunning = true;
                        } else {
                            System.out.println("Wrong option");
                        }
                }
            }

        }else{
            System.out.println("Wrong option");
        }
    }
}
