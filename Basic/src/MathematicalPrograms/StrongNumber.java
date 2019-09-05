package MathematicalPrograms;
//to find the given number is strong
//145 is strong number,1!+2!+3!=145(sum of its digit's factorial is equal to number itself)
public class StrongNumber {

	public static void main(String[] args) {
		int num=145,numcopy=num;
		int total=0;
		while(num>0)
		{
			int rev=num%10;
			int fact=1;
			for(int no=rev;no>0;no--)
			{
				fact=fact*no;
			}
			total=total+fact;
			num=num/10;
		}
		if(total==numcopy)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");

	}

}
