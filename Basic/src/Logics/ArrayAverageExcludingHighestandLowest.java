package Logics;

public class ArrayAverageExcludingHighestandLowest {

	public static void main(String[] args) {
		int a[]= {5,8,3,2,6,9};
		int max=a[0],min=a[0],sum=0,avg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
			sum+=a[i];
		}
		avg=max+min;
		System.out.println((sum-avg)/(a.length-2));
		

	}

}
