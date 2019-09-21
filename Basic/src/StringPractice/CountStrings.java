package StringPractice;

public class CountStrings {

	public static void main(String[] args) {
		String s="indianA";
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
				count=count+1;
		}
System.out.println(count);
	}

}
