package Interview;

public class IntegerStringPalindrome {

	public static void main(String[] args) {
		//Integer Palindrome without method
		int n=727,n1=n,pal=0,rem=0;
		while(n>0)
		{
			rem=n%10;
			pal=(pal*10)+rem;
			n=n/10;
		}
		if(pal==n1)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		//String Palindrome with method
		String s="545";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
