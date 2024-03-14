package cdac.assignment1;

import java.util.Scanner;

public class que_2 {

    public static void main(String[] args) {
        Scanner numYear = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = numYear.nextInt();

        if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
            System.out.println("Year is a Leap year");
        } else {
            System.out.println("Not a leap year");
        }
        numYear.close();
    }
}

