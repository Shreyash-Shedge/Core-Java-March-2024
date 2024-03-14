package cdac.assignment1;

import java.util.Scanner;
public class que_5 {
public static void main(String[] args) {

	Scanner ch = new Scanner(System.in);
	System.out.println("Enter the character : ");
	char input = ch.next().charAt(0);
	
	if   ( (input == 'a') || (input == 'e') || (input == 'i') || (input == 'o') || (input == 'u') ) 
	{
		System.out.println("It is a Vowel");	
    }
	else 
	{
		System.out.println("It is a Consonant");
	}
	ch.close();
   }
}

