package Interview;
import java.util.*;
public class PrintRepeatedEfficient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String s=sc.next().toLowerCase();
		int c[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				c[s.charAt(i)-97]++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>0)
			{
				System.out.print((char)(i+97)+""+c[i]);
			}
		}
		sc.close();
	}

}
