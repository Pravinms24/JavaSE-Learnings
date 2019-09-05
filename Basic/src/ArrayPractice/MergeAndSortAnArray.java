package ArrayPractice;

public class MergeAndSortAnArray {

	public static void main(String[] args) {
	int a[]= {0,4,6,8,1};
	int b[]= {45,67,2,3,7};
	int c[]= new int [a.length+b.length];
	//Merge two arrays
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
	//sorting an array
	int temp=0;
	for(int i=0;i<c.length;i++)
	{
		for(int k=i+1;k<c.length;k++)
		{
			if(c[i]>c[k])
			{
				temp=c[i];
				c[i]=c[k];
				c[k]=temp;
			}
		}
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
	}

}
