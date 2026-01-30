import java.util.Scanner;
class Harshad
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int n1=n,rem,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		if(n1%sum==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not harshad number");
		}
	}
}