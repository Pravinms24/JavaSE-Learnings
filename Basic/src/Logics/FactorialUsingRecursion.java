package Logics;
class test
{
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*fact(n-1));
	}
}
public class FactorialUsingRecursion {

	public static void main(String[] args) {
		test t=new test();
		int num=t.fact(6);
		System.out.println(num);

	}

}
