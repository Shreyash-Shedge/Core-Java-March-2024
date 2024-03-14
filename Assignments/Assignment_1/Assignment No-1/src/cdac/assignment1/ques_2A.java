package cdac.assignment1;

import java.util.Scanner;
public class ques_2A {
public static void main(String[] args) {
	
	Scanner YEAR = new Scanner(System.in);
	System.out.println("Enter the year : ");
	int year = YEAR.nextInt();
	int checkyear = 0;
	
	if  (( (year % 100 !=0) && (year%4 ==0) ) || (year%400 ==0))
	{
		checkyear =1;
	}
	else
	{
		checkyear =2;
	}
	switch(checkyear)
	{
	case 1 :
		System.out.println("Leap year");
		break;
	case 2 :
		System.out.println("Not a leap year");
		break;
	default :
		System.out.println("Invalid");
	}
	YEAR.close();	
}
}
