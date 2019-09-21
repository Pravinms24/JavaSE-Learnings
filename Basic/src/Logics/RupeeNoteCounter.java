package Logics;
import java.util.*;
public class RupeeNoteCounter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Rupee :");
	int amount=sc.nextInt();
	int twoThousand,fiveHundred,twoHundred,hundred,fifty,twenty,ten,five,two,one;
	twoThousand=fiveHundred=twoHundred=hundred=fifty=twenty=ten=five=two=one=0;
	while(amount>0)
	{
		if(amount>=2000)
		{
			amount-=2000;
			twoThousand++;
		}
		else if(amount>=500)
		{
			amount-=500;
			fiveHundred++;
		}
		else if(amount>=200)
		{
			amount-=200;
			twoHundred++;
		}
		else if(amount>=100)
		{
			amount-=100;
			hundred++;
		}
		else if(amount>=50)
		{
			amount-=50;
			fifty++;
		}
		else if(amount>=20)
		{
			amount-=20;
			twenty++;
		}
		else if(amount>=10)
		{
			amount-=10;
			ten++;
		}
		else if(amount>=5)
		{
			amount-=5;
			five++;
		}
		else if(amount>=2)
		{
			amount-=2;
			two++;
		}
		else if(amount>=1)
		{
			amount-=1;
			one++;
		}
		
	}
	System.out.println("Two thousand rupee note is "+twoThousand);
	System.out.println("Five Hundred rupee note is "+fiveHundred);
	System.out.println("Two Hundred rupee note is "+twoHundred);	
	System.out.println("Hundred rupee note is "+hundred);	
	System.out.println("Fifty rupee note is "+fifty);
	System.out.println("Twenty rupee note is "+twenty);
	System.out.println("Ten rupee note is "+ten);
	System.out.println("Five rupee is "+five);
	System.out.println("Two rupee is "+two);
	System.out.println("One rupee is "+one);
	}

}
