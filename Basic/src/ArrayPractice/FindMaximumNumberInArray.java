package ArrayPractice;

public class FindMaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,7,45,7,34,12,45,45};
		int maximum=0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(maximum<arr[i])
			{
				maximum=arr[i];
				count++;
			}
				
		}

		System.out.println("Maximum Number in Given Array is :"+maximum);
		System.out.println(count);
	}

}
