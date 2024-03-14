package in.assign3.cdac;

public class ques_3 {
public static void main(String[] args) {
	
	int num = 30;
	double num1 = 20.25;
	float num2 = 40.255f;

	System.out.println("The addition is : "+(num+num1+num2)); // Automatically converted to Double
	System.out.println("The difference is : "+(num-num1-num2));
	System.out.println("The product is : "+(num*num1*num2));
	System.out.println("The division is : "+(num/num1/num2));
	 
	// Now using ( int & double) and ( double & float) and ( int & float) combination
	System.out.println("The addition is : "+(num+num1));  // int + double = double.
	
	
	System.out.println("The division is : "+(num1/num2)); // double/float = double.
	
	
	System.out.println("The product  is : "+(num*num2)); // int/float = float.
}
}
