/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author 62821
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        int choice = 0;

        System.out.println("=== Simple Calculator ===");

        while (choice != 1 && choice != 2) {
            System.out.println("Choose an operation:");
            System.out.println("1. Multiply");
            System.out.println("2. Divide");
            System.out.print("Enter your choice (1 or 2): ");
            choice = input.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please try again.\n");
            }
        }

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        if (choice == 1) {
            result = num1 * num2;
            System.out.println("Result of multiplication: " + result);
        } else {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result of division: " + result);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }
        }
        input.close();
    }
}
