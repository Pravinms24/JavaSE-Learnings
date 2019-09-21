package MathematicalPrograms;

import java.util.Scanner;

/* writing a program to get a number and check if it is odd number 
 * num=num/2. if it is even do num=3num+1.
 */
class oddeven
{
	int ans(int count)
	{
		
		int num=0;
	while(num>0)
	{
		if(num==1)
		{
			count++;
			break;
		}
		if(num%2==0)
		{
			num=num/2;
			count++;
		}
		if(num%2!=0)
		{
			num=(3*num)+1;
			count++;
		}
	}
	//System.out.println(count);
	return count;
	
}
	
}

public class JobForEvenAndOdd {

	public static void main(String[] args) {
		oddeven obj=new oddeven();
		System.out.println(obj.ans(4));
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number");
		//int n=sc.nextInt();	
		//System.out.println(count);
		
		

	}

}

