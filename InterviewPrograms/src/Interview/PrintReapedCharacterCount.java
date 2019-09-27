package Interview;
public class PrintReapedCharacterCount {
	public static void main(String[] args) {
	String s="aaabbccd";
	char s1=' ';
	int count=0;
	
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		count=0;
		for(int j=0;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				count++;
			}
			s1=c[i];
		}
		System.out.println(s1+" "+count);
	}
	
	

	}

}
