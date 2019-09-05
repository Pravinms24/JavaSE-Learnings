package CollectionPractice;

import java.util.ArrayList;

public class ArraylistGenerics {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add((int) 'c');
		al.add(16);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println("----");
		
		

	}

}
