package MathematicalPrograms;
class area
{
	int x=1;
	int areaofsqure()
	{
		int area=x*x;
		System.out.println(area);
		return x;
	}
}

public class AreaOfSqureUsingMethosCalling {

	public static void main(String[] args) {
		area a=new area();
		a.areaofsqure();
		a.x=2;
		a.areaofsqure();
		System.out.println(a.x);
		area b=new area();
		b.areaofsqure();
		System.out.println(b.x=2);
		b.areaofsqure();
	}

}
