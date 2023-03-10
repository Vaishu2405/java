package Assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
	    Double number1, number2, result;

	    Scanner scn = new Scanner(System.in);

	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = scn.next().charAt(0);

	    System.out.println("Enter first number");
	    number1 = scn.nextDouble();

	    System.out.println("Enter second number");
	    number2 = scn.nextDouble();

	    switch (operator) {
	    
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    scn.close();
	}

}
