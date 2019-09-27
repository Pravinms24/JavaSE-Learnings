package Interview;
import java.util.*;
public class MultiplicationOfNPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0,prime=0,mul=1;
		while(true)
		{
			for(int i=2;i<=100;i++)
			{
				prime=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						prime++;
					}
				}
				if(prime==2)
				{
					count++;
					mul*=i;
				}
				if(count==n)
				{
					System.out.println("multiple of "+n+" prime is "+mul);
					
					break;
				}
			}
			sc.close();
		}
		
		
	}

}
