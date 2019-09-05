package ArrayPractice;

public class FactorsOfThreeNumberOfAnArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,10,12};
		int f[]=new int[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]*3;
			f[i]=sum;			
		}
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
		

	}

}
