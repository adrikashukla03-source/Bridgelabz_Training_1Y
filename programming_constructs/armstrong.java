import java.util.Scanner;
public class armstrong
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num");
	{
		int num=sc.nextInt;
		int original_Num=num;
		int  result=0;
	
		while(num!=0)
		{
			int digit=num%10;
			result+=digit*digit*digit;
			num=num/10;
		}
		if(original_Num==num)
		{
		System.out.println("armstrong");}
		else
		{System.out.println("Nott a armstrong");}
	}
}
	