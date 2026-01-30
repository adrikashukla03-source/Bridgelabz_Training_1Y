import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double n1=sc.nextDouble();
		System.out.println("enter second number");
		double n2=sc.nextDouble();
		System.out.println("enter operator");
		String s=sc.next();
		double result;
		switch(s)
		{
			case "+":
			result=n1+n2;
			System.out.println("addition="+result);
			break;
			case "-":
			result=n1-n2;
			System.out.println("subtraction="+result);
			break;
			case "*":
			result=n1*n2;
			System.out.println("multiplication="+result);
			break;
			case "/":
			result=n1/n2;
			System.out.println("division="+result);
			break;
			default :
			System.out.println("invalid operator");
			break;
		}
	}
}