package StringPractice;
import java.util.Scanner;

public class ZigZagProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		//String s="payilagam";
		char b[]=s.toCharArray();
		System.out.println("\nZig Zag String is :");
		for(int i=0;i<s.length();i++)
		{
			if((i==0)||(i%2==0))
			{
				System.out.print(b[i]+" ");
			}
		}
		System.out.println();
		for(int j=0;j<b.length;j++)
		{
			if(j%2!=0)
				System.out.print(" "+b[j]);
		}

	}

}
