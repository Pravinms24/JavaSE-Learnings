package Logics;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAndStoreNumbersUntillZero {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		while(n!=0)
		{
			al.add(n);
			System.out.println("Enter the number :");
			n=sc.nextInt();
		}
		System.out.println("Stopped");
		System.out.println(al);
		
		sc.close();
	}

}
