import java.util.Arrays;
import java.util.Scanner;
class Fizz
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0)
		{System.out.println("invalid");
		return;
		}
		String result[]=new String[num];
			for(int i=0;i<num;i++)
			{if(i%3==0&&i%5==0)
				{result[i]="FizzBuzz";}
				else if(i%3==0)
				{result[i]="Fizz";}
				else if(i%5==0)
				{result[i]="Buzz";}
			else 
			{result[i]=String.valueOf(i);}}
			for(String arr:result){
			System.out.println(arr);}
	}
}
		
