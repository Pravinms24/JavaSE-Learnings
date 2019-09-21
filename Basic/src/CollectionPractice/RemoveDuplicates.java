package CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(34);
		al.add(9);
		al.add(76);
		al.add(9);
		al.add(3);
		al.add(34);
		System.out.println("Inserted array is\n"+al);
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>(al);
		al.clear();
		al.addAll(s);
		System.out.println("Array without duplicate\n"+s);
		TreeSet <Integer> ts=new TreeSet<Integer>(al);
		al.clear();
		al.addAll(ts);
		System.out.println("Array after sorting\n"+ts);
		

	}

}
