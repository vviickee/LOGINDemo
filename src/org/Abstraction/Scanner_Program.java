package org.Abstraction;
import java.util.Scanner;
public class Scanner_Program {

	public static void main(String[] args) {
		 {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        int num1 = scanner.nextInt();

	        System.out.println("Enter operator (+, -, *, /):");
	        char operator = scanner.next().charAt(0);

	        System.out.println("Enter second number:");
	        int num2 = scanner.nextInt();

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator");
	        }

	        scanner.close();
	    }
		
		
		
		
		
		
		
	}

}
