package StringPractice;

public class PrintWordInReverse {

	public static void main(String[] args) {
		String s="java";
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
		//alternative way to do it
		System.out.println("\nalternative way\n");
		String s1="";
		for(int j=s.length()-1;j>=0;j--)
		{
			s1+=s.charAt(j);
		}
		System.out.println(s1);
		/*
		 * reverse the words 
		 */
		System.out.println("\nword reverse\n");
		String word="i love tamil";
		String st []=word.split(" ", 3);
		for(int k=st.length-1;k>=0;k--)
		{
			System.out.println(st[k]);
		}

	}

}
