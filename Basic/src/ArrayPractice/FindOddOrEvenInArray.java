package ArrayPractice;

import java.util.Scanner;

public class FindOddOrEvenInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" index value ");
			a[i]=sc.nextInt();
		}
		System.out.println("Odd Number in Array is :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println("\nEven number in array is :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
