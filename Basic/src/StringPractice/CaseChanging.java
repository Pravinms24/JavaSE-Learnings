package StringPractice;

public class CaseChanging {

	public static void main(String[] args) {
		String s="java";
		byte c[]=s.getBytes();
		for(int i=0;i<c.length;i++)
		{
			if(!(c[i]>=65&&c[i]<=90))
				System.out.println((char)(c[i]-32));
		}
		
	}

}
