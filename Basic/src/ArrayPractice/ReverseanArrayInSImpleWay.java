package ArrayPractice;
import java.util.Scanner;

public class ReverseanArrayInSImpleWay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index of an array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" Value :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReverses Array is: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
