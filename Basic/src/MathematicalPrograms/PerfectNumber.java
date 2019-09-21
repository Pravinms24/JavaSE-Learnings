package MathematicalPrograms;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6,num=n,sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(num==sum)
			System.out.println(sum+" Pefcect number");
	}

}
