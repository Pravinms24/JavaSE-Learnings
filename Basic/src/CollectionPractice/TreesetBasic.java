package CollectionPractice;
import java.util.TreeSet;

public class TreesetBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("orange");
		ts.add("Apple");
		ts.add("grapes");
		ts.add("mango");
		ts.add("Apple");
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("orange"));
		System.out.println(ts.remove("mango"));
		System.out.println(ts.size());

	}

}
