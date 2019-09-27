package Logics;
import java.util.*;

public class AnagramArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first character");
		String s1=sc.next();
		System.out.println("Enter secons string");
		String s2=sc.next();
		s1 = s1.replaceAll("\\s", "").toLowerCase();//study this
		s2 = s2.replaceAll("\\s", "").toLowerCase();
/*String word = s1.replace ("\\s", "");
 * It replaces "\\s" character with "" , 
 * so it returns a String object which looks like this- "JavaisRobust".
 * Note: Since "\\s" means s single space in unicode 
 * hence it replaces every single space with "" which means nothing.
		 */
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			ArrayList<Character>al1=new ArrayList<Character>();
			ArrayList<Character>al2=new ArrayList<Character>();
			for(int i=0;i<s1.length();i++)
			{
				al1.add(s1.charAt(i));
			}
			for(int j=0;j<s2.length();j++)
			{
				al2.add(s2.charAt(j));
			}
			Collections.sort(al1);
			Collections.sort(al2);
			if(al1.equals(al2))
			{
				System.out.println("Both are Anagrams");
			}
			else
				System.out.println("not anagrams");
		}
sc.close();
	}

}
