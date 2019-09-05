package Logics;

import java.util.Scanner;

public class GetNumberUntilZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n!=0)
		{
			System.out.println("Enter the number");
			n=sc.nextInt();			
		}
		System.out.println("Stopped");

	}

}
