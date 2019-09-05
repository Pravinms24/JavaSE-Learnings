package MathematicalPrograms;

public class PrimeBetweenTwoNumbers {
	public static void main(String[] args) {
	for(int i=1;i<=100;i++)
	{
		int count=0;
		for(int num=1;num<=i;num++)
		{
			if(i%num==0)
				count=count+1;
		}
		if(count==2)
			System.out.println(i+" is prime");
		else
			System.out.println(i+" is not prime");
	}
	}
}
