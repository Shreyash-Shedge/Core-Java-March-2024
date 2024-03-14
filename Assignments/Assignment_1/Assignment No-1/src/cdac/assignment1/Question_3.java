package cdac.assignment1;

import java.util.Scanner;
public class Question_3 {
	public static void main(String[] args) {
		
		Scanner calci = new Scanner(System.in);
		System.out.println("Enter the number : ");
		double num1 = calci.nextDouble();
		
		System.out.println("Enter the number : ");
		double num2 = calci.nextDouble();	
		
		 System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = calci.next().charAt(0);

	        double result = 0;
	        
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid operator");
	                return;   
	                
	        }

	        System.out.println("Result: " + result);	
  }
}
