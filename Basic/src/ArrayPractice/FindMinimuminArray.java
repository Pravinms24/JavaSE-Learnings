package ArrayPractice;

public class FindMinimuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,7,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Minimum value of an array is :"+min);

	}

}
