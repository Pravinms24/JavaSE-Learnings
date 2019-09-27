package ArrayPractice;

public class FindSecondMaximum {

	public static void main(String[] args) {
		int arr[]= {2,1,4,7,12,43,51,4};
		int fmax=0,smax=0,tmax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(fmax<arr[i])
			{
				tmax=smax;
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i])
			{
				tmax=smax;
				smax=arr[i];
			}
				else if(tmax<arr[i])
					tmax=arr[i];
		}
		System.out.println("First Maximum Number is "+fmax);
		System.out.println("Second Maximum Number is "+smax);
		System.out.println(tmax);
		

	}

}
