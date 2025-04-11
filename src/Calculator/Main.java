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
        int choice;

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        result = num1 * num2;
        System.out.println("Result of multiplication: " + result);
               
        input.close();
    }
}
