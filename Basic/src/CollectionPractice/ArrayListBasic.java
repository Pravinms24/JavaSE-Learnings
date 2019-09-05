package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Apple");
		al.add("orange");
		al.add("grapes");
		al.add("mango");
		al.add("Apple");
		System.out.println(al);
		System.out.println(al.size());
		al.remove("mango");
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("-------------");
		Collections.sort(al);
		al.add(5);
		al.add('a');
		al.add(true);
		//Collections.sort(al);
		System.out.println(al);
	
		
	
		

	}

}
