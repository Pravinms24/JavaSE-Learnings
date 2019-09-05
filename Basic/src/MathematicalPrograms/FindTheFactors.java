package MathematicalPrograms;

import java.util.Scanner;

public class FindTheFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number ");
		int fact=input.nextInt();
		System.out.println("Factors of "+fact+" is :");
		for(int i=1;i<=fact;i++)
		{
			if(fact%i==0)
				System.out.print(i+",");
		}

	}

}
