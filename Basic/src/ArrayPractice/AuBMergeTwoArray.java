package ArrayPractice;

public class AuBMergeTwoArray {

	public static void main(String[] args) {
		int a[]= {2,4,5,7,8,10};
		int b[]= {1,3,7,12,6,9};
		int c[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++)
		{
			c[i]=b[j];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		int temp=0;
		for(int i=0;i<c.length;i++)
		{
			for(int k=i+1;k<c.length;k++)
			{
				if(c[i]>c[k])
				{
					temp=c[k];
					c[k]=c[i];
					c[i]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
