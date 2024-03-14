package cdac.assignment1;

import java.util.Scanner;
public class quest_6 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the weight in kg : ");
		double weight = num.nextDouble();
		
		System.out.println("Enter the Height in meter : ");
		double height = num.nextDouble();
		
		double BMI = (double)(weight)  / ( height * height);
		System.out.println("BMI is : " +BMI);
		
		if    ( ( BMI >= 18.5 ) && (BMI <=24.9) )
		{
			System.out.println("Normal weight");
		}
		else if  ( (BMI <=	30 )&&(BMI >=25) )
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Underweight");
		}
		num.close();
	}

}
