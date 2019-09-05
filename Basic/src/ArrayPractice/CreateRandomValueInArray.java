package ArrayPractice;

import java.util.Scanner;

public class CreateRandomValueInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lengh of an array");
		int n=sc.nextInt();
		long a[]=new long [n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=((int)(Math.random()*10000000));
			//((long)Math.random()*100000);//don't put like this,it will throw error

			System.out.println(a[i]);
		}
	}
}
