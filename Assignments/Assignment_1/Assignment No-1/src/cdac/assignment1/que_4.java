package cdac.assignment1;

import java.util.Scanner;
public class que_4 {

	public static void main(String[] args) {
		
	Scanner Day = new Scanner(System.in);
	System.out.println("Enter the day : ");
	
	int weekday = Day.nextInt();
	
	switch(weekday)
	{
	case 1 :
		System.out.println("Monday");
		break;
	case 2 :
		System.out.println("Tuesday");
		break;
	case 3 :
		System.out.println("Wednesday");
		break;
	case 4 :
		System.out.println("Thursady");
		break;
	case 5 :
		System.out.println("Friday");
		break;
	case 6 :
		System.out.println("Saturday");
		break;
	case 7 :
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Invalid input");
	}
	Day.close();
	}

}
