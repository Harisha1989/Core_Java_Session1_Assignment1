import java.util.Scanner;
public class SumOfTwo {

	public static void main(String[] args) {
		// Objective is to ADD 2 numbers without using "+" operator
		System.out.print("Enter Number 1: "); // Input number 1
		Scanner sc= new Scanner(System.in); // Scanner is a class
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: "); //Input number 2
		int num2 = sc.nextInt();
		System.out.println("Number 1= "+num1);
		System.out.println("Number 2= "+num2);
		int num3 = num1 - (-num2);
		System.out.println("Sum of 2 numbers = "+num3);
		sc.close();
	}

}
