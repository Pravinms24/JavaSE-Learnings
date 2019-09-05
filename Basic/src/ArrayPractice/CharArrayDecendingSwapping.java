package ArrayPractice;

public class CharArrayDecendingSwapping {

	public static void main(String[] args) {
		char des[]={'p','r','a','v','i','n'};
		char temp;
		for(int i=0;i<des.length;i++)
		{
			for(int j=i+1;j<des.length;j++) 
			{
				if(des[j]>des[i])
				{
					temp=des[i];
					des[i]=des[j];
					des[j]=temp;					
				}
			}
		}
		for(int i=0;i<des.length;i++)
		{
			System.out.println(des[i]);
		}

	}

}
