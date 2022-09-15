/* Ethan McGee
 * 9-15-2022
 * Simple Calulator Exercise
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        // Variables
        char operator;
        double num1 = 0;
        double num2 = 0;
        double result;
        int loop = 1; 

        // Scanner 
        Scanner input = new Scanner(System.in);
        // Loop to run the inputs while loop == 1
        while (loop ==1){
            // try/catch used to catch exception of invalid input
            try{

                // Get operator from user
                System.out.println("Choose Operator: +, -, *, or /");
                operator = input.next().charAt(0);

                // Get num1 from user
                System.out.println("Choose first number: ");
                num1 = input.nextDouble();
        

                // Ger num2 from user*
                System.out.println("Choose second number: ");
                num2 = input.nextDouble();
        
                // switch statement to run through operators
                switch (operator){
                 case '+':
                 result = num1 + num2;
                 System.out.println(num1 + " + " + num2 + " = " + result);
                 break;

                 case '-':
                 result = num1 - num2;
                 System.out.println(num1 + " - " + num2 + " = " + result);
                 break;

                 case '*':
                 result = num1 * num2;
                 System.out.println(num1 + " * " + num2 + " = " + result);
                 break;

                 case '/':
                 result = num1 / num2;
                 System.out.println(num1 + " / " + num2 + " = " + result);
                 break;

                 default:
                 System.out.println("Invalid Operator");
                 break;


            }

            System.out.println("Press 1 to repeat or 0 to end: ");
            loop = input.nextInt(); 
    
            }   catch (InputMismatchException aException){
                System.out.println("Invalid Entry!");
                input.nextLine();

            }
        }  
        input.close();
        System.out.println("DONE RUNNING");
    }
}

