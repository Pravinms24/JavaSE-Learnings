package ArrayPractice;

public class SunOfOddArray {

	public static void main(String[] args) {
		int a[]= {3,4,6,1};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
