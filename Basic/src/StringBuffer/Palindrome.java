package StringBuffer;

public class Palindrome {

	public static void main(String[] args) {
		int num=551,sum=0,div=0;
		while(num>0)
		{
			div=num%10;
			sum+=div;
			num=num/10;
		}
System.out.println(sum);
	}

}
