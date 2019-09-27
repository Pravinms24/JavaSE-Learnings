package Interview;

import java.util.*;
public class UserInputDiamondPattern {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the shape number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for(int l=1;l<i;l++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int m=1;m<=n;m++)
	{
		for(int o=1;o<=m;o++)
		{
			System.out.print(" ");
		}
		for(int p=n;p>m;p--)
		{
			System.out.print("*");
		}
		for(int q=n-1;q>m;q--)
		{
			System.out.print("*");
		}
		System.out.println();
	}sc.close();
	}
}
