import java.util.Scanner;
class Leapyear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int y=sc.nextInt();
		if(y>=1582)
		{
			if(y%400==0)
			{
				System.out.println("leap year");
			}
			else if(y%100==0)
			{
				System.out.println("not leap year");
			}
			else if(y%4==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("enter year is smaller the 1582");
			}
		}
	}
}