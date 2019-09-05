package ArrayPractice;

import java.util.Scanner;

public class OddorEvenSimple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of an array :");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" index value");
			a[i]=sc.nextInt();
		}
		System.out.println("Odd number of an array is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)//odd number logic			
				System.out.println(a[i]);				
		}
		System.out.println("Even number of an array is :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)//even number logic
				System.out.println(a[i]);
		}
		sc.close();
		
	}

}
