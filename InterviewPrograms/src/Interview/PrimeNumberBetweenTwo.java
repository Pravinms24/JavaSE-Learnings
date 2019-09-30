package Interview;
import java.util.*;
public class PrimeNumberBetweenTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("prime number between"+(n+1)+"and"+((2*n)-1)+"is ");
		int count1=0;
		for(int i=n;i<(2*n);i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				count1++;
			}
		}
		System.out.println("the count of prime number between"+(n+1)+"and"+((2*n)-1)+"is "+count1);
	}

}
