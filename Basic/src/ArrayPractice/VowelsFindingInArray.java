package ArrayPractice;

import java.util.Scanner;

public class VowelsFindingInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Index of array :");
		int c=sc.nextInt();
		char a[]=new char [c];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Characters:");
			a[i]=sc.next().charAt(0);
		}
		char b[]= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(b[j]);
					count++;
				}
			}
		}
		System.out.println(count+" times present");
		sc.close();
	}

}
