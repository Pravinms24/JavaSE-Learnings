package Logics;
import java.util.*;

public class NotesCounterUsingArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Rupee ");
	int amount=sc.nextInt();
	int note[]=new int[]{2000,500,200,100,50,20,10,5,2,1};
	int noteindex[]=new int[note.length];
	for(int i=0;i<note.length;i++)
	{
		if(amount>=note[i])
		{
			noteindex[i]=amount/note[i];
			amount=amount-noteindex[i]*note[i];
		}
	}
	for(int j=0;j<note.length;j++)
	{
		System.out.println(note[j]+" rs rupee note count is : "+noteindex[j]);
	}
	
	sc.close();
	}

}
