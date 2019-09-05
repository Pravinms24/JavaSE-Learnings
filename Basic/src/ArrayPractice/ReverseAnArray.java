package ArrayPractice;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		//int a[]= {2,3,6,8,4,8,9,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Index of an array :");
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" index value :");
			a[i]=sc.nextInt();
		}
		System.out.println("Orginal Array is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int temp=0;
		for(int i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println("\nReversed Array is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
		

	}

}
