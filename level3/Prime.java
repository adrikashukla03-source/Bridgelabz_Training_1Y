import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			 System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}