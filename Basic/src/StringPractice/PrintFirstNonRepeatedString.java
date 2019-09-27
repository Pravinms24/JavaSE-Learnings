package StringPractice;
//print the first non repeated string
import java.util.*;
public class PrintFirstNonRepeatedString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character");
	String s=sc.next();
	//String s="abcadb";
	char c[]=s.toCharArray();
	int repeat=0;
	for(int i=0;i<c.length;i++)
	{
		repeat=0;
		for(int j=0;j<c.length;j++)
		{
			if((i!=j)&&(c[i]==c[j]))
			{
				repeat=1;
				break;
			}
		}
		if(repeat==0)
		{
			System.out.println("First non repeated charater is "+c[i]);
			break;
		}
	}
	sc.close();
	}

}
