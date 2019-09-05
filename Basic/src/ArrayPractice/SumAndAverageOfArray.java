package ArrayPractice;
import java.util.Scanner;
public class SumAndAverageOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Array Index :");
		int in=sc.nextInt();
		int arr[]=new int [in];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+" Index:");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array is : "+sum);
		System.out.println("Averrage of an array is :"+sum/arr.length);
		
sc.close();
	}

}
