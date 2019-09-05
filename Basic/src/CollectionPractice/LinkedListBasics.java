package CollectionPractice;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("Apple");
		ll.add("orange");
		ll.add("grapes");
		ll.add("mango");
		ll.add("Apple");
		System.out.println(ll);
		System.out.println(ll.size());
		ll.remove("grapes");
		System.out.println(ll);
		System.out.println(ll.size());
				System.out.println(ll);
		

	}

}
