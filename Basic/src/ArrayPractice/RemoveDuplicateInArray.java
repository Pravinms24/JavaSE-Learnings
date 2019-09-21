package ArrayPractice;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		int array[]= {2,4,5,77,88,33,5,77,5};
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					array[j]=0;		
					count++;
				}
			}
		}
		System.out.println("count "+count);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
				System.out.println(array[i]);
		}
		

	}

}
