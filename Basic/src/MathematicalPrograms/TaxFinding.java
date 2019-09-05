package MathematicalPrograms;

import java.util.Scanner;

public class TaxFinding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary :");
		double salary=sc.nextDouble();
		double tax;
		switch(1)
		{
		case 1:
			if(salary>0&&salary<=500000)
			{
				tax=salary*0;
				System.out.println("tax amout for your salary rs."+salary+" is rs. "+tax);
			}
		case 2:
			if(salary>=500001&&salary<=1000000)
			{
				tax=(salary*5)/100;
				System.out.println("tax is 5 %");
				System.out.println("tax amout for your salary rs."+salary+" is rs. "+tax);
			}
		case 3:
			if(salary>=1000001)
			{
				tax=(salary*10)/100;
				System.out.println("tax is 10 %");
				System.out.println("tax amout for your salary rs."+salary+" is rs. "+tax);
			}
			sc.close();
		}

	}

}
