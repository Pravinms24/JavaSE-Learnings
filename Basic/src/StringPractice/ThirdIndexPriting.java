package StringPractice;
/*check if the string has 9 digits
 * if it has 9 digits print the 3rd 6th 9th index value
 * else print the string
 */
import java.util.Scanner;
public class ThirdIndexPriting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word :");
		String s=sc.next();
		//String s="elephants";
		char c[]=s.toCharArray();
		if(c.length%3!=0)
		{
			System.out.println(s);
		}
		else
			for(int i=2;i<c.length;i=i+3)
			{
				System.out.print(c[i]+" ");
			}
			
		

	}

}
