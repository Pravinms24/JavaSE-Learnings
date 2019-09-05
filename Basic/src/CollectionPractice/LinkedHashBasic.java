package CollectionPractice;
import java.util.LinkedHashSet;
public class LinkedHashBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("orange");
		lhs.add("Apple");
		lhs.add("grapes");
		lhs.add("mango");
		lhs.add("Apple");
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains("orange"));
		System.out.println(lhs.remove("mango"));
		System.out.println(lhs.size());

	}

}
