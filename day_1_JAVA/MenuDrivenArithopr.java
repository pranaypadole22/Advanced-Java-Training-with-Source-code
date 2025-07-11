package day_1_JAVA;
//MENU DRIVEN TO PERFORM ARITHMETIC OPR's.
import java.util.Scanner;

public class MenuDrivenArithopr {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;
            double num1, num2, result;
            do {
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Modulus (%)");
                System.out.println("6. Exit");
                System.out.print("Enter your choice (1-6): ");
                choice = sc.nextInt();

                if (choice >= 1 && choice <=5) {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                } else {
                    num1 = num2 = 0;
                }

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            result = num1 % num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Modulus by zero is not allowed.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting program. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter between 1 to 6.");
                }

            } while (choice != 6);
        }
    }

