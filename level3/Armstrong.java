import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=0,rem,cube;
		int n2=n;
		while(n!=0)
		{
			rem=n%10;
			cube=rem*rem*rem;
			sum+=cube;
			n/=10;
		}
		if(sum==n2)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}
}