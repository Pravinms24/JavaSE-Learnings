package ArrayPractice;

public class StorePrimeNumberInArray {
	public static void main(String[] args) {
		int count,counter=0;
		for(int prime=10;prime<=30;prime++)
		{
			count=0;
			for(int div=1;div<=prime;div++)
			{
				if(prime%div==0)
					count=count+1;
			}
			if(count==2)//doubt ask sankar
			{
				System.out.println(prime);
			counter=counter+1;
			}
		}
		int a[]=new int[counter];
		int j=0;
		for(int prime=10;prime<=30;prime++)
		{
			count=0;
			for(int div=1;div<=prime;div++)
			{
				if(prime%div==0)
					count=count+1;
			}
			if(count==2)
			{
				a[j]=prime;
				j=j+1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Prime num is"+a[i]);
		}
		
	}

}
