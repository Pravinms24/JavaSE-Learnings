package MathematicalPrograms;

import java.util.Scanner;

public class StrongNumberWithUserInput {

	public static void main(String[] args) {
		Scanner strong=new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int num=strong.nextInt(),numcopy=num;
		int total =0;
		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			for(int no=rem;no>0;no--)
			{
				fact=fact*no;
			}
			total=total+fact;
			num=num/10;
		}
		if(numcopy==total)
			System.out.println("Given is strong number");
		else
			System.out.println("Given is not strong number");
		strong.close();
		

	}

}
