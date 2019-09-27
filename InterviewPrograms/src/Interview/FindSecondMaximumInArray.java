package Interview;

public class FindSecondMaximumInArray {

	public static void main(String[] args) {
		int a[]= {41,2,34,1,9,12,7};
		int fmax=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i])
			{
				smax=a[i];
			}
		}
		System.out.println("Second largest number in array is "+smax);
		
		

	}

}
