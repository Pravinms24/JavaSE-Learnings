package StringPractice;

public class LinearTraversing {

	public static void main(String[] args) {
		String s="India";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		char c[]=s.toCharArray();
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}

	}

}
