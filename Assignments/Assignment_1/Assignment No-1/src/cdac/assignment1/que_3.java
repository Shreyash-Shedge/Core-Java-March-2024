package cdac.assignment1;

import java.util.Scanner;
public class que_3 {

	public static void main (String[] args) {
		Scanner calci = new Scanner(System.in);
		System.out.println("Enter the number : ");
		double num1 = calci.nextDouble();
		
		System.out.println("Enter the number : ");
		double num2 = calci.nextDouble();
		
		System.out.println("Enter the operator : ");
		char ch = calci.next().charAt(0);
		
		switch(ch)
		{
		case '+':
			double addition = num1 + num2;
			System.out.println("The addition is : " +addition);
			break;
		case '-':
			double difference = num1 - num2;
			System.out.println("The Subtraction is : " +difference);
			break;
		case '*':
			double product = num1 * num2;
			System.out.println("The Product is : " +product);
			break;
		case '/':
			double division = num1 / num2;
			System.out.println("The Division is : " +division);
			break;
		default :
			System.out.println("Invalid Operator");
			break;
		}
		calci.close();
	}
}