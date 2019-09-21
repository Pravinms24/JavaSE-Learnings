package StringPractice;

public class GetByteS {

	public static void main(String[] args) {
		String s="pravin";
		byte b[]=s.getBytes();
		char c[]=s.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
	}

}
