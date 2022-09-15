import java.util.Scanner;






public class Calculator {
    public static void main (String[] args) {

        // Variables
        char operator;
        double num1;
        double num2;
        double result;

        // Scanner 
        Scanner input = new Scanner(System.in);

        // Get operator from user
        System.out.println("Choose Operator: +, -, *, or /");
        operator = input.next().charAt(0);
        // Get num1 from user
        System.out.println("Choose first number: ");
        num1 = input.nextDouble();

        // Ger num2 from user
        System.out.println("Choose second number: ");
        num2 = input.nextDouble();

        // switch statement to run through operators
        switch (operator){
            case '+':
            result = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println(num1 + "*" + num2 + "=" + result);
            break;

            case '/':
            result = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + result);
            break;

            default:
                System.out.println("Invalid Operator");
                break;


        }
    


        System.out.println("DONE RUNNING");
    }
}

