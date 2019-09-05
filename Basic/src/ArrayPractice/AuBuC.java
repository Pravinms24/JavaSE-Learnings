package ArrayPractice;

public class AuBuC {

	public static void main(String[] args) {
		int a[]= {2,8,6,9,43};
		int b[]= {3,84,23,72};
		int c[]= {12,43,65,12,4446};
		int d[]= new int [a.length+b.length];
		int e[]=new int[d.length+c.length];
		
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<d.length;i++)
		{
			d[i]=b[j];
			j++;
		}
		for(int i=0;i<d.length;i++)
		{
			e[i]=d[i];
		}
		int k=0;
		for(int i=d.length;i<e.length;i++)
		{
			e[i]=c[k];
			k++;
		}
		System.out.println("Merged Array is");
		for(int i=0;i<e.length;i++)
		{
			System.out.print(e[i]+" ");
		}

	}

}
