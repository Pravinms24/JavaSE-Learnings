package ArrayPractice;
//checking
public class DivisionOfArray {

	public static void main(String[] args) {
		int ar[]= {2,4,5,7,8,9};
		double div[]=new double[ar.length];
		double division=0.0;
		for(int i=0;i<ar.length;i++)
		{
			division=ar[i]/2;
			div[i]=division;
			System.out.println(div[i]);
		}

	}

}
