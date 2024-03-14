package cdac.assignment1;

import java.util.Scanner;
public class que_1 {

	public static void main(String[] args) {
		Scanner numGrade = new Scanner(System.in);
		System.out.println("Enter the numerical Grade : ");
		int grade = numGrade.nextInt();
		
		if(grade >= 90 &&  grade <=100) {
			System.out.println("The Letter grade  is : A");
		}
		else if (grade >= 80 ) {
			System.out.println("The Letter grade  is : B");
		}
		else if (grade >= 60) {
			System.out.println("The Letter grade  is : C");
		}
		else if (grade >= 40) {
			System.out.println("The Letter grade  is : D");
		}
		else
		{
			System.out.println("Student has failed");
		}
numGrade.close();
}
}
