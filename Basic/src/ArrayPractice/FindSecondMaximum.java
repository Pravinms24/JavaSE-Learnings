package ArrayPractice;

public class FindSecondMaximum {

	public static void main(String[] args) {
		int arr[]= {2,1,4,7,12,43,51,4};
		int fmax=0,smax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(fmax<arr[i])
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i])
				smax=arr[i];
		}
		System.out.println("First Maximum Number is "+fmax);
		System.out.println("Second Maximum Number is "+smax);
		

	}

}
