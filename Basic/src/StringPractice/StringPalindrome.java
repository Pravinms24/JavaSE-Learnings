package StringPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="appa";
		String s1="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
