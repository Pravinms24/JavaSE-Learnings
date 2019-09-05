package MathematicalPrograms;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//scanner class to get input from user
		System.out.println("Enter the number to calculate factorial :");
		long num=sc.nextInt();//store the input value received from the user
		// int num=5;
		long fact=1;
		for(long i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		sc.close();

	}

}
