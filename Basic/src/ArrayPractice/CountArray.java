package ArrayPractice;

public class CountArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,7,8,9,12,15,7,3,7};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==7)
			count=count+1;
		}
		System.out.println(count);

	}

}
