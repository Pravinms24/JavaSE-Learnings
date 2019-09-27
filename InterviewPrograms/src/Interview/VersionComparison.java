package Interview;
import java.util.*;
public class VersionComparison {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Version");
	String s=sc.next();
	System.out.println("Enter the version you want to compare");
	String s1=sc.next();
	byte b[]=s.getBytes();
	byte b1[]=s1.getBytes();
	int total=0,total1=0;
	for(int i=0;i<s.length();i++)
	{
		total+=b[i];
	}
	for(int j=0;j<s1.length();j++)
	{
		total1+=b1[j];
	}
		if(total>total1)
		{
			System.out.println(s+"is latest version.");
		}
		else if(total<total1)
		{
			System.out.println(s1+"is latest version.");
		}
		else if(total==total1)
		{
			System.out.println("both versions are same.");
		}
		System.out.println("Thank You..!");
		sc.close();
	}
	
}
