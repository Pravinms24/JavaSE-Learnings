package MathematicalPrograms;

public class SpyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int sum=0,product=1;
		System.out.println("Breaked Number of "+num+" is :");
		while(num>0)
		{
		int rem=num%10;
		product=product*rem;
		sum=sum+rem;
		System.out.print(rem+" ");
		num=num/10;
		}
		if(sum==product)
			System.out.println("\nGiven is Spy Number");

	}

}
