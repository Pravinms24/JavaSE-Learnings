package ArrayPractice;

public class CharArraySwapping {

	public static void main(String[] args) {
		char arr[]={'p','r','a','v','i','n'};
		char temp=' ';
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
