package Logics;

import java.util.ArrayList;
import java.util.Scanner;

public class GetCharactersUntilQentered {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Characters :");
		String n=sc.next();
		try
		{
		while(!n.equals("q"))
		{
			Integer i=Integer.parseInt(n);
			al.add(i);
			System.out.println("Enter Characers :");
			n=sc.next();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("stopped");
		System.out.println(al);

	}

}
