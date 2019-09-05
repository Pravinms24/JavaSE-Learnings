package CollectionPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetBasic {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("orange");
	hs.add("apple");
	hs.add(124);
	hs.add(1);
	hs.add('c');
	hs.add(1222);
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println("------");
	
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("orange");
	lhs.add("apple");
	lhs.add(1);
	lhs.add('c');
	lhs.add(1222);
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.contains("orange"));
	System.out.println(lhs.remove("mango"));
	System.out.println(lhs.size());
	
	System.out.println("----");
	TreeSet ts=new TreeSet();
	ts.add("orange");
	ts.add("apple");
	ts.add(1);
	ts.add('c');
	ts.add(1222);
	System.out.println(ts);
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	System.out.println(ts.contains("orange"));
	System.out.println(ts.remove("mango"));
	System.out.println(ts.size());
	
	
}
}

