package ArrayPractice;

public class FindCommonValueTwoArray {

	public static void main(String[] args) {
		int a[]= {3,5,6,7,4,6,5};
		int b[]= {2,5,6,3,9,0};
		int count=0;
		System.out.println("Duplicates in the array is :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
					count=count+1;
				}
					
			}
		}
		System.out.println("\nTotal duplicates in the array is :"+count);

	}

}
