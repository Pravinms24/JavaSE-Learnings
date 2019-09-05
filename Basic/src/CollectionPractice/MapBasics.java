package CollectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapBasics {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap <Integer,String>();
		hm.put(900, "mani");
		hm.put(10, "sujin");
		hm.put(10, "sujin");
		hm.put(11, "sujin");
		hm.put(89246, "Sri");
		System.out.println(hm);
		System.out.println("----------");
		TreeMap <Integer,String> tm=new TreeMap <Integer,String>();
		tm.put(102, "pravin");
		tm.put(1, "ting");
		tm.put(13, "pravin");
		tm.put(102, "pravin");
		System.out.println(tm);
		System.out.println("----------");
		LinkedHashMap <Integer, String> lm=new LinkedHashMap <Integer, String>();
		
		
		
		

	}

}
