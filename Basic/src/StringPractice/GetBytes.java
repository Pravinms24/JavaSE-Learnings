package StringPractice;

public class GetBytes {

	public static void main(String[] args) {
		String s="jabcdef";
		System.out.println("first method (String)");
		for(int i=0;i<s.length();i++)
		{
			System.out.println((int)s.charAt(i));
		}
		//make it array and get ascii value
		char c[]=s.toCharArray();
		System.out.println("through array method");
		for(int j=0;j<c.length;j++)
		{
			System.out.println((int)c[j]);
		}

	}

}
